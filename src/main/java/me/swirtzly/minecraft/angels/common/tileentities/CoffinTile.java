package me.swirtzly.minecraft.angels.common.tileentities;

import me.swirtzly.minecraft.angels.common.WAObjects;
import me.swirtzly.minecraft.angels.utils.AngelUtils;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;

public class CoffinTile extends TileEntity implements ITickableTileEntity {

    private Coffin coffin = null;
    private boolean isOpen = false;
    private float openAmount = 0.0F;

    public Coffin getCoffin() {
        return coffin;
    }

    public void setCoffin(Coffin coffin) {
        this.coffin = coffin;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public float getOpenAmount() {
        return openAmount;
    }

    public CoffinTile() {
        super(WAObjects.Tiles.COFFIN.get());
    }

    @Override
    public void onDataPacket(NetworkManager net, SUpdateTileEntityPacket pkt) {
        super.onDataPacket(net, pkt);
        handleUpdateTag(getBlockState(), pkt.getNbtCompound());
    }

    @Override
    public void onLoad() {
        if (coffin == null) {
            coffin = AngelUtils.randomCoffin();
            markDirty();
        }
    }

    @Override
    public void tick() {
        if (isOpen) {
            this.openAmount += 0.1F;
        } else {
            this.openAmount -= 0.1F;
        }

        if (this.openAmount > 1.0F) {
            this.openAmount = 1.0F;
        }

        if (this.openAmount < 0.0F) {
            this.openAmount = 0.0F;
        }
    }

    @Override
    public SUpdateTileEntityPacket getUpdatePacket() {
        return new SUpdateTileEntityPacket(pos, 3, getUpdateTag());
    }


    @Override
    public CompoundNBT getUpdateTag() {
        return write(new CompoundNBT());
    }

    public void sendUpdates() {
        if (world != null && getBlockState() != null && getBlockState().getBlock() != null) {
            world.updateComparatorOutputLevel(pos, getBlockState().getBlock());
            world.notifyBlockUpdate(pos, world.getBlockState(pos), world.getBlockState(pos), 3);
        }
        markDirty();
    }

    @Override
    public void read(BlockState state, CompoundNBT nbt) {
        coffin = getCorrectCoffin(nbt.getString("coffin_type"));
        isOpen = nbt.getBoolean("isOpen");
        openAmount = nbt.getFloat("openAmount");
        super.read(state, nbt);
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        if (coffin == null) {
            coffin = AngelUtils.randomCoffin();
        }
        compound.putString("coffin_type", coffin.name());
        compound.putBoolean("isOpen", isOpen);
        compound.putFloat("openAmount", openAmount);
        return super.write(compound);
    }

    public Coffin getCorrectCoffin(String coffin) {
        for (Coffin value : Coffin.values()) {
            if (value.name().equals(coffin)) {
                return value;
            }
        }

        return Coffin.HEAVILY_WEATHERED;
    }

    public enum Coffin {
        NEW, WEATHERED, SLIGHTLY_WEATHERED, HEAVILY_WEATHERED
    }
}