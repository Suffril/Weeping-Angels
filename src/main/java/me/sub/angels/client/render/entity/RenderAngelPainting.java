package me.sub.angels.client.render.entity;

import me.sub.angels.common.entities.EntityAngelPainting;
import me.sub.angels.main.WeepingAngels;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderAngelPainting extends Render<EntityAngelPainting> {
	private static final ResourceLocation PAINTING_TEXTURE = new ResourceLocation(WeepingAngels.MODID, "textures/entities/paintings_angels.png");

    public RenderAngelPainting() {
        super(Minecraft.getMinecraft().getRenderManager());
	}
	
	/**
	 * Renders the desired {@code T} type Entity.
	 */
	@Override
	public void doRender(EntityAngelPainting painting, double x, double y, double z, float entityYaw, float partialTicks) {
		
		GlStateManager.pushMatrix();
		GlStateManager.translate(x, y, z);
		GlStateManager.rotate(180.0F - entityYaw, 0.0F, 1.0F, 0.0F);
		GlStateManager.enableRescaleNormal();
		this.bindEntityTexture(painting);
		EntityAngelPainting.EnumArt enumArt = painting.art;
		GlStateManager.scale(0.0625F, 0.0625F, 0.0625F);
		
		if (this.renderOutlines) {
			GlStateManager.enableColorMaterial();
			GlStateManager.enableOutlineMode(this.getTeamColor(painting));
		}

		this.renderPainting(painting, enumArt.sizeX, enumArt.sizeY, enumArt.offsetX, enumArt.offsetY);
		
		if (this.renderOutlines) {
			GlStateManager.disableOutlineMode();
			GlStateManager.disableColorMaterial();
		}
		
		GlStateManager.disableRescaleNormal();
		GlStateManager.popMatrix();
		super.doRender(painting, x, y, z, entityYaw, partialTicks);
	}
	
	/**
	 * Returns the location of an painting's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	@Override
	protected ResourceLocation getEntityTexture(EntityAngelPainting painting) {
		return PAINTING_TEXTURE;
	}
	
	private void renderPainting(EntityAngelPainting painting, int width, int height, int textureU, int textureV) {
		float f = (float) (-width) / 2.0F;
		float f1 = (float) (-height) / 2.0F;
		
		for (int i = 0; i < width / 16; ++i) {
			for (int j = 0; j < height / 16; ++j) {
				float f15 = f + (float) ((i + 1) * 16);
				float f16 = f + (float) (i * 16);
				float f17 = f1 + (float) ((j + 1) * 16);
				float f18 = f1 + (float) (j * 16);
				this.setLightmap(painting, (f15 + f16) / 2.0F, (f17 + f18) / 2.0F);
				float f19 = (float) (textureU + width - i * 16) / 256.0F;
				float f20 = (float) (textureU + width - (i + 1) * 16) / 256.0F;
				float f21 = (float) (textureV + height - j * 16) / 256.0F;
				float f22 = (float) (textureV + height - (j + 1) * 16) / 256.0F;
				Tessellator tessellator = Tessellator.getInstance();
				BufferBuilder bufferbuilder = tessellator.getBuffer();
				bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX_NORMAL);
				bufferbuilder.pos((double) f15, (double) f18, -0.5D).tex((double) f20, (double) f21).normal(0.0F, 0.0F, -1.0F).endVertex();
				bufferbuilder.pos((double) f16, (double) f18, -0.5D).tex((double) f19, (double) f21).normal(0.0F, 0.0F, -1.0F).endVertex();
				bufferbuilder.pos((double) f16, (double) f17, -0.5D).tex((double) f19, (double) f22).normal(0.0F, 0.0F, -1.0F).endVertex();
				bufferbuilder.pos((double) f15, (double) f17, -0.5D).tex((double) f20, (double) f22).normal(0.0F, 0.0F, -1.0F).endVertex();
				bufferbuilder.pos((double) f15, (double) f17, 0.5D).tex(0.75D, 0.0D).normal(0.0F, 0.0F, 1.0F).endVertex();
				bufferbuilder.pos((double) f16, (double) f17, 0.5D).tex(0.8125D, 0.0D).normal(0.0F, 0.0F, 1.0F).endVertex();
				bufferbuilder.pos((double) f16, (double) f18, 0.5D).tex(0.8125D, 0.0625D).normal(0.0F, 0.0F, 1.0F).endVertex();
				bufferbuilder.pos((double) f15, (double) f18, 0.5D).tex(0.75D, 0.0625D).normal(0.0F, 0.0F, 1.0F).endVertex();
				bufferbuilder.pos((double) f15, (double) f17, -0.5D).tex(0.75D, 0.001953125D).normal(0.0F, 1.0F, 0.0F).endVertex();
				bufferbuilder.pos((double) f16, (double) f17, -0.5D).tex(0.8125D, 0.001953125D).normal(0.0F, 1.0F, 0.0F).endVertex();
				bufferbuilder.pos((double) f16, (double) f17, 0.5D).tex(0.8125D, 0.001953125D).normal(0.0F, 1.0F, 0.0F).endVertex();
				bufferbuilder.pos((double) f15, (double) f17, 0.5D).tex(0.75D, 0.001953125D).normal(0.0F, 1.0F, 0.0F).endVertex();
				bufferbuilder.pos((double) f15, (double) f18, 0.5D).tex(0.75D, 0.001953125D).normal(0.0F, -1.0F, 0.0F).endVertex();
				bufferbuilder.pos((double) f16, (double) f18, 0.5D).tex(0.8125D, 0.001953125D).normal(0.0F, -1.0F, 0.0F).endVertex();
				bufferbuilder.pos((double) f16, (double) f18, -0.5D).tex(0.8125D, 0.001953125D).normal(0.0F, -1.0F, 0.0F).endVertex();
				bufferbuilder.pos((double) f15, (double) f18, -0.5D).tex(0.75D, 0.001953125D).normal(0.0F, -1.0F, 0.0F).endVertex();
				bufferbuilder.pos((double) f15, (double) f17, 0.5D).tex(0.751953125D, 0.0D).normal(-1.0F, 0.0F, 0.0F).endVertex();
				bufferbuilder.pos((double) f15, (double) f18, 0.5D).tex(0.751953125D, 0.0625D).normal(-1.0F, 0.0F, 0.0F).endVertex();
				bufferbuilder.pos((double) f15, (double) f18, -0.5D).tex(0.751953125D, 0.0625D).normal(-1.0F, 0.0F, 0.0F).endVertex();
				bufferbuilder.pos((double) f15, (double) f17, -0.5D).tex(0.751953125D, 0.0D).normal(-1.0F, 0.0F, 0.0F).endVertex();
				bufferbuilder.pos((double) f16, (double) f17, -0.5D).tex(0.751953125D, 0.0D).normal(1.0F, 0.0F, 0.0F).endVertex();
				bufferbuilder.pos((double) f16, (double) f18, -0.5D).tex(0.751953125D, 0.0625D).normal(1.0F, 0.0F, 0.0F).endVertex();
				bufferbuilder.pos((double) f16, (double) f18, 0.5D).tex(0.751953125D, 0.0625D).normal(1.0F, 0.0F, 0.0F).endVertex();
				bufferbuilder.pos((double) f16, (double) f17, 0.5D).tex(0.751953125D, 0.0D).normal(1.0F, 0.0F, 0.0F).endVertex();
				tessellator.draw();
			}
		}
	}
	
	private void setLightmap(EntityAngelPainting painting, float p_77008_2_, float p_77008_3_) {
		int i = MathHelper.floor(painting.posX);
		int j = MathHelper.floor(painting.posY + (double) (p_77008_3_ / 16.0F));
		int k = MathHelper.floor(painting.posZ);
		EnumFacing enumfacing = painting.facingDirection;
		
		if (enumfacing == EnumFacing.NORTH) {
			i = MathHelper.floor(painting.posX + (double) (p_77008_2_ / 16.0F));
		}
		
		if (enumfacing == EnumFacing.WEST) {
			k = MathHelper.floor(painting.posZ - (double) (p_77008_2_ / 16.0F));
		}
		
		if (enumfacing == EnumFacing.SOUTH) {
			i = MathHelper.floor(painting.posX - (double) (p_77008_2_ / 16.0F));
		}
		
		if (enumfacing == EnumFacing.EAST) {
			k = MathHelper.floor(painting.posZ + (double) (p_77008_2_ / 16.0F));
		}
		
		int l = this.renderManager.world.getCombinedLight(new BlockPos(i, j, k), 0);
		int i1 = l % 65536;
		int j1 = l / 65536;
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) i1, (float) j1);
		GlStateManager.color(1.0F, 1.0F, 1.0F);
	}
}
