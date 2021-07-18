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

import net.mcreator.wildfarmcraft.entity.HampshireRamEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class HampshireRamRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(HampshireRamEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelHampshireRam(), 0.7f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("wildfarmcraft:textures/hampshireram.png");
					}
				};
			});
		}
	}

	/**
	 * HampshireRam - Matheus Created using Tabula 7.1.0
	 */
	public static class ModelHampshireRam extends EntityModel<Entity> {
		public ModelRenderer Body;
		public ModelRenderer ANIMATEHEAD;
		public ModelRenderer Tail;
		public ModelRenderer BodyWool;
		public ModelRenderer FrontRightLeg;
		public ModelRenderer FrontLeftLeg;
		public ModelRenderer BackRightLeg;
		public ModelRenderer BackLeftLeg;
		public ModelRenderer FrontRightLeg2;
		public ModelRenderer FrontLeftLeg2;
		public ModelRenderer BackRightLeg2;
		public ModelRenderer BackRightLeg2_1;
		public ModelRenderer Neck;
		public ModelRenderer Head1;
		public ModelRenderer NeckWOOL;
		public ModelRenderer Head2;
		public ModelRenderer Head3;
		public ModelRenderer Mouth;
		public ModelRenderer RightEar;
		public ModelRenderer LeftEar;
		public ModelRenderer Head4;
		public ModelRenderer RightHorn1;
		public ModelRenderer LeftHorn1;
		public ModelRenderer RightHorn2;
		public ModelRenderer RightHorn3;
		public ModelRenderer RightHorn4;
		public ModelRenderer LeftHorn2;
		public ModelRenderer LeftHorn3;
		public ModelRenderer LeftHorn4;
		public ModelHampshireRam() {
			this.textureWidth = 128;
			this.textureHeight = 128;
			this.Body = new ModelRenderer(this, 77, 41);
			this.Body.setRotationPoint(-4.0F, 7.0F, -7.0F);
			this.Body.addBox(0.0F, 0.0F, 0.0F, 8, 8, 16, 0.0F);
			this.FrontLeftLeg2 = new ModelRenderer(this, 0, 85);
			this.FrontLeftLeg2.setRotationPoint(-2.0F, 0.0F, -1.7F);
			this.FrontLeftLeg2.addBox(0.0F, 0.0F, 0.0F, 3, 7, 4, 0.0F);
			this.LeftHorn4 = new ModelRenderer(this, 0, 45);
			this.LeftHorn4.setRotationPoint(2.1F, 0.6F, -0.5F);
			this.LeftHorn4.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
			this.setRotateAngle(LeftHorn4, 0.0F, -0.2792526803190927F, -0.767944870877505F);
			this.BackRightLeg2_1 = new ModelRenderer(this, 0, 70);
			this.BackRightLeg2_1.setRotationPoint(-2.0F, -0.5F, -2.2F);
			this.BackRightLeg2_1.addBox(0.0F, 0.0F, 0.0F, 3, 8, 4, 0.0F);
			this.RightHorn4 = new ModelRenderer(this, 0, 45);
			this.RightHorn4.setRotationPoint(2.1F, 0.6F, -0.5F);
			this.RightHorn4.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
			this.setRotateAngle(RightHorn4, 0.0F, 0.2792526803190927F, -0.767944870877505F);
			this.RightHorn2 = new ModelRenderer(this, 0, 27);
			this.RightHorn2.setRotationPoint(-3.0F, -1.0F, -0.2F);
			this.RightHorn2.addBox(-3.0F, 0.0F, -0.5F, 3, 2, 1, 0.0F);
			this.setRotateAngle(RightHorn2, 0.0F, 0.2617993877991494F, -0.890117918517108F);
			this.FrontRightLeg = new ModelRenderer(this, 0, 51);
			this.FrontRightLeg.mirror = true;
			this.FrontRightLeg.setRotationPoint(1.75F, 3.5F, 2.0F);
			this.FrontRightLeg.addBox(-1.5F, 2.5F, -1.5F, 2, 11, 3, 0.0F);
			this.Head2 = new ModelRenderer(this, 0, 0);
			this.Head2.setRotationPoint(-0.5F, 1.0F, -4.9F);
			this.Head2.addBox(-2.0F, 1.33F, -5.5F, 4, 3, 5, 0.0F);
			this.LeftHorn3 = new ModelRenderer(this, 0, 40);
			this.LeftHorn3.setRotationPoint(-1.8F, 0.9F, -0.05F);
			this.LeftHorn3.addBox(0.0F, -0.5F, -0.5F, 3, 2, 1, 0.0F);
			this.setRotateAngle(LeftHorn3, 0.0F, 0.0F, 2.199114857512855F);
			this.FrontRightLeg2 = new ModelRenderer(this, 0, 85);
			this.FrontRightLeg2.mirror = true;
			this.FrontRightLeg2.setRotationPoint(-2.0F, 0.0F, -1.7F);
			this.FrontRightLeg2.addBox(0.0F, 0.0F, 0.0F, 3, 7, 4, 0.0F);
			this.LeftHorn1 = new ModelRenderer(this, 0, 34);
			this.LeftHorn1.setRotationPoint(1.0F, 0.5F, -3.9F);
			this.LeftHorn1.addBox(-3.0F, -1.0F, -1.0F, 3, 2, 2, 0.0F);
			this.setRotateAngle(LeftHorn1, 0.0F, 2.6179938779914944F, -0.6806784082777886F);
			this.FrontLeftLeg = new ModelRenderer(this, 0, 51);
			this.FrontLeftLeg.setRotationPoint(7.25F, 3.5F, 2.0F);
			this.FrontLeftLeg.addBox(-1.5F, 2.5F, -1.5F, 2, 11, 3, 0.0F);
			this.LeftHorn2 = new ModelRenderer(this, 0, 27);
			this.LeftHorn2.setRotationPoint(-3.0F, -1.0F, 0.1F);
			this.LeftHorn2.addBox(-3.0F, 0.0F, -0.5F, 3, 2, 1, 0.0F);
			this.setRotateAngle(LeftHorn2, 0.0F, -0.2617993877991494F, -0.890117918517108F);
			this.Tail = new ModelRenderer(this, 30, 68);
			this.Tail.setRotationPoint(3.5F, 1.3F, 14.5F);
			this.Tail.addBox(-0.5F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
			this.setRotateAngle(Tail, 0.5888740896228869F, -0.0F, 0.0F);
			this.NeckWOOL = new ModelRenderer(this, 77, 80);
			this.NeckWOOL.setRotationPoint(-3.5F, -4.5F, -4.5F);
			this.NeckWOOL.addBox(0.0F, 0.0F, 0.0F, 6, 6, 9, 0.0F);
			this.ANIMATEHEAD = new ModelRenderer(this, 0, 120);
			this.ANIMATEHEAD.setRotationPoint(0.0F, 9.4F, -5.5F);
			this.ANIMATEHEAD.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
			this.RightHorn3 = new ModelRenderer(this, 0, 40);
			this.RightHorn3.setRotationPoint(-1.9F, 0.9F, 0.05F);
			this.RightHorn3.addBox(0.0F, -0.5F, -0.5F, 3, 2, 1, 0.0F);
			this.setRotateAngle(RightHorn3, 0.0F, 0.0F, 2.199114857512855F);
			this.Head1 = new ModelRenderer(this, 36, 0);
			this.Head1.setRotationPoint(0.0F, -6.0F, -5.9F);
			this.Head1.addBox(-3.0F, 0.0F, -7.0F, 5, 6, 5, 0.0F);
			this.setRotateAngle(Head1, 1.117010721276371F, 0.0F, 0.0F);
			this.RightEar = new ModelRenderer(this, 0, 31);
			this.RightEar.setRotationPoint(-2.5F, 0.1F, -3.8F);
			this.RightEar.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
			this.setRotateAngle(RightEar, 0.0F, -0.0F, -0.08726646259971647F);
			this.BackLeftLeg = new ModelRenderer(this, 0, 51);
			this.BackLeftLeg.setRotationPoint(7.25F, 3.5F, 14.4F);
			this.BackLeftLeg.addBox(-1.5F, 2.5F, -1.5F, 2, 11, 3, 0.0F);
			this.Head4 = new ModelRenderer(this, 67, 5);
			this.Head4.setRotationPoint(0.5F, -0.6F, -6.0F);
			this.Head4.addBox(-3.0F, 0.0F, -0.0F, 4, 1, 3, 0.0F);
			this.setRotateAngle(Head4, 0.06981317007977318F, -0.0F, 0.0F);
			this.Mouth = new ModelRenderer(this, 41, 19);
			this.Mouth.setRotationPoint(1.0F, 5.1F, -10.0F);
			this.Mouth.addBox(-3.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F);
			this.setRotateAngle(Mouth, 0.06981317007977318F, -0.0F, 0.0F);
			this.BodyWool = new ModelRenderer(this, 70, 100);
			this.BodyWool.setRotationPoint(-0.5F, -0.5F, -0.5F);
			this.BodyWool.addBox(0.0F, 0.0F, 0.0F, 9, 9, 17, 0.0F);
			this.BackRightLeg2 = new ModelRenderer(this, 0, 70);
			this.BackRightLeg2.mirror = true;
			this.BackRightLeg2.setRotationPoint(-2.0F, -0.5F, -2.2F);
			this.BackRightLeg2.addBox(0.0F, 0.0F, 0.0F, 3, 8, 4, 0.0F);
			this.RightHorn1 = new ModelRenderer(this, 0, 34);
			this.RightHorn1.setRotationPoint(-1.9F, 0.4F, -4.0F);
			this.RightHorn1.addBox(-3.0F, -1.0F, -1.0F, 3, 2, 2, 0.0F);
			this.setRotateAngle(RightHorn1, 0.0F, 0.5235987755982988F, 0.6806784082777886F);
			this.Head3 = new ModelRenderer(this, 19, 22);
			this.Head3.setRotationPoint(1.0F, 2.4F, -10.3F);
			this.Head3.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
			this.setRotateAngle(Head3, 0.5585053606381855F, 0.0F, 0.0F);
			this.LeftEar = new ModelRenderer(this, 0, 22);
			this.LeftEar.setRotationPoint(4.5F, 0.3F, -3.8F);
			this.LeftEar.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
			this.setRotateAngle(LeftEar, 0.0F, 0.0F, 0.08726646259971647F);
			this.BackRightLeg = new ModelRenderer(this, 0, 51);
			this.BackRightLeg.mirror = true;
			this.BackRightLeg.setRotationPoint(1.75F, 3.5F, 14.4F);
			this.BackRightLeg.addBox(-1.5F, 2.5F, -1.5F, 2, 11, 3, 0.0F);
			this.Neck = new ModelRenderer(this, 30, 29);
			this.Neck.setRotationPoint(0.5F, 0.1F, -2.0F);
			this.Neck.addBox(-2.5F, -4.0F, -6.0F, 4, 5, 10, 0.0F);
			this.setRotateAngle(Neck, -0.9773843811168246F, 0.0F, 0.0F);
			this.FrontLeftLeg.addChild(this.FrontLeftLeg2);
			this.LeftHorn3.addChild(this.LeftHorn4);
			this.BackLeftLeg.addChild(this.BackRightLeg2_1);
			this.RightHorn3.addChild(this.RightHorn4);
			this.RightHorn1.addChild(this.RightHorn2);
			this.Body.addChild(this.FrontRightLeg);
			this.Head1.addChild(this.Head2);
			this.LeftHorn2.addChild(this.LeftHorn3);
			this.FrontRightLeg.addChild(this.FrontRightLeg2);
			this.Head1.addChild(this.LeftHorn1);
			this.Body.addChild(this.FrontLeftLeg);
			this.LeftHorn1.addChild(this.LeftHorn2);
			this.Body.addChild(this.Tail);
			this.Neck.addChild(this.NeckWOOL);
			this.RightHorn2.addChild(this.RightHorn3);
			this.Neck.addChild(this.Head1);
			this.Head1.addChild(this.RightEar);
			this.Body.addChild(this.BackLeftLeg);
			this.Head1.addChild(this.Head4);
			this.Head1.addChild(this.Mouth);
			this.Body.addChild(this.BodyWool);
			this.BackRightLeg.addChild(this.BackRightLeg2);
			this.Head1.addChild(this.RightHorn1);
			this.Head1.addChild(this.Head3);
			this.Head1.addChild(this.LeftEar);
			this.Body.addChild(this.BackRightLeg);
			this.ANIMATEHEAD.addChild(this.Neck);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			this.Body.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.ANIMATEHEAD.render(ms, vb, i1, i2, f1, f2, f3, f4);
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
			this.FrontLeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.ANIMATEHEAD.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.ANIMATEHEAD.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.BackRightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.FrontRightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.BackLeftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
