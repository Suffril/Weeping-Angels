package com.github.reallysub.angels.common.events;

import com.github.reallysub.angels.common.WAObjects;
import com.github.reallysub.angels.common.WorldGenArms;
import com.github.reallysub.angels.common.capability.CapabilityAngelSickness;
import com.github.reallysub.angels.main.AngelUtils;
import com.github.reallysub.angels.main.WeepingAngels;
import com.github.reallysub.angels.main.config.Config;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraftforge.common.ForgeVersion;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@Mod.EventBusSubscriber
public class CommonEvents {
	
	/*
	 * Update checker thing, tells the player that the mods out of date if they're on a old build
	 */
	@SubscribeEvent
	public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent e) {
		EntityPlayer player = e.player;
		if (!player.world.isRemote) {
			ForgeVersion.CheckResult version = ForgeVersion.getResult(Loader.instance().activeModContainer());
			if (version.status == ForgeVersion.Status.OUTDATED) {
				player.sendMessage(new TextComponentString(TextFormatting.GOLD + "You are running an outdated build of Weeping Angels! :("));
				TextComponentString url = new TextComponentString(TextFormatting.GOLD + "Click me to download the updated version at curse.com");
				url.getStyle().setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://minecraft.curseforge.com/projects/weeping-angels-mod"));
				url.getStyle().setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new TextComponentString("Open URL")));
				player.sendMessage(url);
			}
		}
	}
	
	/*
	 * Checking for the angels & applying sickness to players
	 */
	@SubscribeEvent
	public void onEntityUpdate(LivingEvent.LivingUpdateEvent event) {
		
		//Player
		if (event.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getEntity();
			AngelUtils.getAllAngelsPlayer(player, 40, 40);
			
			
//			if (player.world.rand.nextInt(20) == 5 && !player.isCreative() && Config.infection) {
//				if (AngelUtils.getViewedTicks(player) >= 2050 * 4) {
//					player.sendStatusMessage(new TextComponentTranslation("message.look_away"), true);
//				}
//				if (AngelUtils.getViewedTicks(player) >= 3050 * 4) {
//					player.sendStatusMessage(new TextComponentTranslation("message.infected"), true);
//					player.addPotionEffect(new PotionEffect(MobEffects.WITHER, 600, 1));
//				}
//			}
			
			
		}
	}
	
	/*
	 * Spawning arms in snow biomes
	 */
	@SubscribeEvent
	public static void decorBiomeEvent(DecorateBiomeEvent e) {
		if (e.getWorld().getBiome(e.getPos()).isSnowyBiome()) {
			WorldGenArms arms = new WorldGenArms(WAObjects.angelArm);
			
			if (e.getRand().nextInt(30) <= 10) {
				arms.generate(e.getWorld(), e.getRand(), e.getPos());
			}
		}
	}
	
	/*
	 * Capability stuff below here
	 */
	@SubscribeEvent
	public void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
		if (!(event.getObject() instanceof EntityPlayer) || event.getObject().hasCapability(CapabilityAngelSickness.CAP, null)) return;
		event.addCapability(new ResourceLocation(WeepingAngels.MODID, "angelsickness"), new CapabilityAngelSickness.CapabilityAngelSicknessProvider(new CapabilityAngelSickness((EntityPlayer) event.getObject())));
	}
	
	@SubscribeEvent
	public void onPlayerStartTracking(net.minecraftforge.event.entity.player.PlayerEvent.StartTracking event) {
		if (event.getTarget().hasCapability(CapabilityAngelSickness.CAP, null)) {
			event.getTarget().getCapability(CapabilityAngelSickness.CAP, null).sync();
		}
	}
	
	@SubscribeEvent
	public void onPlayerClone(net.minecraftforge.event.entity.player.PlayerEvent.Clone event) {
		NBTTagCompound nbt = (NBTTagCompound) CapabilityAngelSickness.CAP.getStorage().writeNBT(CapabilityAngelSickness.CAP, event.getOriginal().getCapability(CapabilityAngelSickness.CAP, null), null);
		CapabilityAngelSickness.CAP.getStorage().readNBT(CapabilityAngelSickness.CAP, event.getEntityPlayer().getCapability(CapabilityAngelSickness.CAP, null), null, nbt);
	}
	
}