package net.mcreator.wildfarmcraft.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.wildfarmcraft.entity.JunglefowlMaleEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class JunglefowlMaleRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(JunglefowlMaleEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelLeghornRooster(), 0.4f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("wildfarmcraft:textures/junglefowlmale.png");
					}
				};
			});
		}
	}

	/**
	 * LeghornRooster - Matheus Created using Tabula 7.1.0
	 */
	public static class ModelLeghornRooster extends EntityModel<Entity> {
		public ModelRenderer Body1;
		public ModelRenderer animatehead;
		public ModelRenderer LeftLeg2;
		public ModelRenderer RightLeg2;
		public ModelRenderer Body3;
		public ModelRenderer RightWing;
		public ModelRenderer LeftWing;
		public ModelRenderer Body4;
		public ModelRenderer Body5;
		public ModelRenderer Tailfeathers1;
		public ModelRenderer Tailfeathers2;
		public ModelRenderer Tailfeathers3;
		public ModelRenderer Body2;
		public ModelRenderer Neck;
		public ModelRenderer Head;
		public ModelRenderer Beak1;
		public ModelRenderer Beak2;
		public ModelRenderer Crest;
		public ModelRenderer Crest2;
		public ModelRenderer LeftLeg1;
		public ModelRenderer LeftLeg3;
		public ModelRenderer RightLeg1;
		public ModelRenderer RightLeg3;
		public ModelLeghornRooster() {
			this.textureWidth = 64;
			this.textureHeight = 32;
			this.LeftWing = new ModelRenderer(this, 54, 0);
			this.LeftWing.setRotationPoint(1.5F, -4.8F, -3.0F);
			this.LeftWing.addBox(0.0F, -0.13F, -1.0F, 1, 3, 4, 0.0F);
			this.setRotateAngle(LeftWing, 0.10471975511965977F, 0.13962634015954636F, 0.0F);
			this.LeftLeg2 = new ModelRenderer(this, 12, 27);
			this.LeftLeg2.setRotationPoint(1.25F, 21.0F, 0.0F);
			this.LeftLeg2.addBox(-0.5F, -2.0F, -1.47F, 2, 3, 2, 0.0F);
			this.Body2 = new ModelRenderer(this, 46, 11);
			this.Body2.setRotationPoint(0.0F, 0.2F, 1.4F);
			this.Body2.addBox(-2.5F, -3.13F, -4.0F, 4, 5, 4, 0.0F);
			this.setRotateAngle(Body2, -0.5061454830783556F, -0.0F, 0.0F);
			this.Body5 = new ModelRenderer(this, 24, 5);
			this.Body5.setRotationPoint(0.0F, 1.2F, -0.5F);
			this.Body5.addBox(-1.5F, -0.13F, 4.5F, 2, 1, 3, 0.0F);
			this.setRotateAngle(Body5, 0.5410520681182421F, -0.0F, 0.0F);
			this.Tailfeathers1 = new ModelRenderer(this, 23, 12);
			this.Tailfeathers1.setRotationPoint(-0.5F, 0.0F, 0.0F);
			this.Tailfeathers1.addBox(0.0F, -8.13F, 4.5F, 0, 6, 7, 0.0F);
			this.setRotateAngle(Tailfeathers1, 0.13962634015954636F, -0.0F, 0.0F);
			this.LeftLeg1 = new ModelRenderer(this, 20, 26);
			this.LeftLeg1.setRotationPoint(0.0F, -0.3F, 0.0F);
			this.LeftLeg1.addBox(0.0F, -1.47F, -1.0F, 1, 5, 1, 0.0F);
			this.setRotateAngle(LeftLeg1, -0.15707963267948966F, -0.0F, 0.0F);
			this.RightLeg3 = new ModelRenderer(this, 0, 29);
			this.RightLeg3.setRotationPoint(0.0F, 0.1F, 1.0F);
			this.RightLeg3.addBox(-1.0F, 3.0F, -4.0F, 3, 0, 3, 0.0F);
			this.setRotateAngle(RightLeg3, 0.15707963267948966F, -0.0F, 0.0F);
			this.Beak2 = new ModelRenderer(this, 0, 10);
			this.Beak2.setRotationPoint(0.0F, 0.3F, -0.03F);
			this.Beak2.addBox(-0.5F, -1.2F, -3.6F, 1, 1, 2, 0.0F);
			this.Head = new ModelRenderer(this, 0, 13);
			this.Head.setRotationPoint(0.0F, -1.8F, -3.5F);
			this.Head.addBox(-1.5F, -2.87F, -2.0F, 3, 4, 3, 0.0F);
			this.setRotateAngle(Head, 1.239183768915974F, -0.0F, 0.0F);
			this.LeftLeg3 = new ModelRenderer(this, 0, 29);
			this.LeftLeg3.setRotationPoint(0.0F, 0.1F, 1.0F);
			this.LeftLeg3.addBox(-1.0F, 3.0F, -4.0F, 3, 0, 3, 0.0F);
			this.setRotateAngle(LeftLeg3, 0.15707963267948966F, -0.0F, 0.0F);
			this.Tailfeathers3 = new ModelRenderer(this, 23, 12);
			this.Tailfeathers3.setRotationPoint(-0.5F, 0.0F, 0.0F);
			this.Tailfeathers3.addBox(0.0F, -8.13F, 4.5F, 0, 6, 7, 0.0F);
			this.setRotateAngle(Tailfeathers3, -0.017453292519943295F, 0.17453292519943295F, 0.0F);
			this.Crest = new ModelRenderer(this, 0, 0);
			this.Crest.setRotationPoint(0.0F, 0.3F, 0.47F);
			this.Crest.addBox(0.0F, -5.07F, -2.87F, 0, 3, 4, 0.0F);
			this.setRotateAngle(Crest, 0.24434609527920614F, -0.0F, 0.0F);
			this.Body3 = new ModelRenderer(this, 36, 0);
			this.Body3.setRotationPoint(0.0F, 0.0F, -0.5F);
			this.Body3.addBox(-2.5F, -4.13F, 1.03F, 4, 4, 4, 0.0F);
			this.setRotateAngle(Body3, 0.5410520681182421F, -0.0F, 0.0F);
			this.Crest2 = new ModelRenderer(this, 7, 0);
			this.Crest2.setRotationPoint(0.0F, 0.1F, -0.03F);
			this.Crest2.addBox(0.0F, -0.73F, -2.87F, 0, 2, 1, 0.0F);
			this.RightWing = new ModelRenderer(this, 54, 0);
			this.RightWing.mirror = true;
			this.RightWing.setRotationPoint(-2.5F, -4.8F, -3.0F);
			this.RightWing.addBox(-1.0F, -0.13F, -1.0F, 1, 3, 4, 0.0F);
			this.setRotateAngle(RightWing, 0.10471975511965977F, -0.13962634015954636F, 0.0F);
			this.RightLeg1 = new ModelRenderer(this, 20, 26);
			this.RightLeg1.setRotationPoint(0.0F, -0.3F, 0.0F);
			this.RightLeg1.addBox(0.0F, -1.47F, -1.0F, 1, 5, 1, 0.0F);
			this.setRotateAngle(RightLeg1, -0.15707963267948966F, -0.0F, 0.0F);
			this.Body4 = new ModelRenderer(this, 22, 0);
			this.Body4.setRotationPoint(0.0F, 1.0F, 0.0F);
			this.Body4.addBox(-2.0F, -4.13F, 4.5F, 3, 2, 3, 0.0F);
			this.setRotateAngle(Body4, 0.12217304763960307F, -0.0F, 0.0F);
			this.Body1 = new ModelRenderer(this, 40, 20);
			this.Body1.setRotationPoint(0.5000000000000001F, 22.0F, 0.0F);
			this.Body1.addBox(-3.0F, -5.53F, -4.0F, 5, 5, 6, 0.0F);
			this.setRotateAngle(Body1, -0.19198621771937624F, 0.0F, 0.0F);
			this.RightLeg2 = new ModelRenderer(this, 12, 27);
			this.RightLeg2.setRotationPoint(-2.25F, 21.0F, 0.0F);
			this.RightLeg2.addBox(-0.5F, -2.0F, -1.47F, 2, 3, 2, 0.0F);
			this.Beak1 = new ModelRenderer(this, 0, 10);
			this.Beak1.setRotationPoint(0.01F, 0.3F, -0.03F);
			this.Beak1.addBox(-0.5F, -2.07F, -3.2F, 1, 1, 2, 0.0F);
			this.setRotateAngle(Beak1, 0.24434609527920614F, -0.0F, 0.0F);
			this.Tailfeathers2 = new ModelRenderer(this, 23, 12);
			this.Tailfeathers2.setRotationPoint(-0.5F, 0.0F, 0.0F);
			this.Tailfeathers2.addBox(0.0F, -8.13F, 4.5F, 0, 6, 7, 0.0F);
			this.setRotateAngle(Tailfeathers2, -0.017453292519943295F, -0.17453292519943295F, 0.0F);
			this.Neck = new ModelRenderer(this, 0, 20);
			this.Neck.mirror = true;
			this.Neck.setRotationPoint(-0.52F, 1.0F, -3.23F);
			this.Neck.addBox(-2.0F, -3.13F, -3.27F, 4, 4, 3, 0.0F);
			this.setRotateAngle(Neck, -0.6108652381980153F, -0.0F, 0.0F);
			this.animatehead = new ModelRenderer(this, 0, 0);
			this.animatehead.setRotationPoint(0.5000000000000001F, 19.0F, -3.0F);
			this.animatehead.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
			this.Body1.addChild(this.LeftWing);
			this.animatehead.addChild(this.Body2);
			this.Body3.addChild(this.Body5);
			this.Body3.addChild(this.Tailfeathers1);
			this.LeftLeg2.addChild(this.LeftLeg1);
			this.RightLeg1.addChild(this.RightLeg3);
			this.Head.addChild(this.Beak2);
			this.Neck.addChild(this.Head);
			this.LeftLeg1.addChild(this.LeftLeg3);
			this.Body3.addChild(this.Tailfeathers3);
			this.Head.addChild(this.Crest);
			this.Body1.addChild(this.Body3);
			this.Head.addChild(this.Crest2);
			this.Body1.addChild(this.RightWing);
			this.RightLeg2.addChild(this.RightLeg1);
			this.Body3.addChild(this.Body4);
			this.Head.addChild(this.Beak1);
			this.Body3.addChild(this.Tailfeathers2);
			this.Body2.addChild(this.Neck);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			this.LeftLeg2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.Body1.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.RightLeg2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.animatehead.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		/**
		 * This is a helper function from Tabula to set the rotation of model parts
		 */
		public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.RightLeg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.LeftLeg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.animatehead.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.animatehead.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}
}
