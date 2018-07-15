package me.sub.angels.client.renders.entities;

import me.sub.angels.WeepingAngels;
import me.sub.angels.client.models.entity.ModelAngel;
import me.sub.angels.client.models.entity.ModelAngelChild;
import me.sub.angels.client.models.entity.ModelAngelEd;
import me.sub.angels.client.renders.entities.layers.LayerCrack;
import me.sub.angels.common.entities.EntityWeepingAngel;
import me.sub.angels.common.misc.AngelEnums;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderWeepingAngel extends RenderLiving<EntityWeepingAngel> {

    private ResourceLocation TEXTURE_ONE = new ResourceLocation(WeepingAngels.MODID, "textures/entities/angel.png");
    private ResourceLocation TEXTURE_TWO = new ResourceLocation(WeepingAngels.MODID, "textures/entities/angel_2.png");
    private ResourceLocation TEXTURE_CHILD = new ResourceLocation(WeepingAngels.MODID, "textures/entities/angel_child.png");

    private ModelBase modelOne = new ModelAngel();
    private ModelBase modelTwo = new ModelAngelEd();
    private ModelAngelChild modelChild = new ModelAngelChild();

    public RenderWeepingAngel() {
        super(Minecraft.getMinecraft().getRenderManager(), new ModelAngelEd(), 0.0F);
        mainModel = modelTwo;
        addLayer(new LayerCrack(this));
        addLayer(new LayerHeldItem(this));
    }

    private static void bindAngelTex(ResourceLocation loc) {
        Minecraft.getMinecraft().getTextureManager().bindTexture(loc);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityWeepingAngel entity) {
        return null;
    }

    @Override
    protected boolean setBrightness(EntityWeepingAngel angel, float partialTicks, boolean combineTextures) {
        return true;
    }

    /**
     * Renders the model in RenderLiving
     */
    @Override
    protected void renderModel(EntityWeepingAngel angel, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
        GlStateManager.pushMatrix();
        RenderHelper.enableStandardItemLighting();
        if (angel.getHealth() > 0.0F) {

            if (angel.isChild()) {
                bindAngelTex(TEXTURE_CHILD);
                modelChild.render(angel, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
            } else {

                if (angel.getType() == AngelEnums.AngelType.ANGEL_ONE.getId()) {
                    bindAngelTex(TEXTURE_ONE);
                    modelOne.render(angel, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
                }

                if (angel.getType() == AngelEnums.AngelType.ANGEL_TWO.getId()) {
                    bindAngelTex(TEXTURE_TWO);
                    modelTwo.render(angel, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
                }
            }
        }
        RenderHelper.disableStandardItemLighting();
        GlStateManager.popMatrix();
    }

}