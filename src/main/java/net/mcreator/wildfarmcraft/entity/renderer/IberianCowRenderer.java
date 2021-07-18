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

import net.mcreator.wildfarmcraft.entity.IberianCowEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class IberianCowRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(IberianCowEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelIbericCow(), 0.9f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("wildfarmcraft:textures/ibericcow.png");
					}
				};
			});
		}
	}

	/**
	 * IbericCow - Matheus Created using Tabula 7.1.0
	 */
	public static class ModelIbericCow extends EntityModel<Entity> {
		public ModelRenderer ANIMATEHEAD;
		public ModelRenderer Neck;
		public ModelRenderer Head1;
		public ModelRenderer Neck2;
		public ModelRenderer Head2;
		public ModelRenderer Head3;
		public ModelRenderer Head4;
		public ModelRenderer Mouth;
		public ModelRenderer RightEar;
		public ModelRenderer LeftEar;
		public ModelRenderer Horns;
		public ModelRenderer RightHorn1;
		public ModelRenderer LeftHorn1;
		public ModelRenderer NoseRing;
		public ModelRenderer RightHorn2;
		public ModelRenderer LeftHorn2;
		public ModelRenderer Body2;
		public ModelRenderer Body1;
		public ModelRenderer Body3;
		public ModelRenderer FrontLeftLeg;
		public ModelRenderer FrontRightLeg;
		public ModelRenderer Tail1;
		public ModelRenderer BackRightLeg;
		public ModelRenderer BackLeftLeg;
		public ModelRenderer udders;
		public ModelRenderer Tail2;
		public ModelRenderer Tail3;
		public ModelIbericCow() {
			this.textureWidth = 128;
			this.textureHeight = 128;
			this.Body1 = new ModelRenderer(this, 14, 44);
			this.Body1.setRotationPoint(-0.5F, -0.3F, -6.5F);
			this.Body1.addBox(0.0F, 0.0F, 0.0F, 11, 13, 7, 0.0F);
			this.FrontRightLeg = new ModelRenderer(this, 0, 51);
			this.FrontRightLeg.mirror = true;
			this.FrontRightLeg.setRotationPoint(2.0F, 12.4F, 4.0F);
			this.FrontRightLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 11, 4, 0.0F);
			this.Body3 = new ModelRenderer(this, 50, 44);
			this.Body3.setRotationPoint(-0.5F, -0.3F, 10.5F);
			this.Body3.addBox(0.0F, 0.0F, 0.0F, 11, 13, 7, 0.0F);
			this.ANIMATEHEAD = new ModelRenderer(this, 3, 120);
			this.ANIMATEHEAD.setRotationPoint(-1.0F, 5.0F, -7.0F);
			this.ANIMATEHEAD.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
			this.Tail1 = new ModelRenderer(this, 0, 68);
			this.Tail1.setRotationPoint(4.5F, 0.9F, 5.1F);
			this.Tail1.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
			this.setRotateAngle(Tail1, 0.4886921905584123F, -0.0F, 0.0F);
			this.Mouth = new ModelRenderer(this, 41, 19);
			this.Mouth.setRotationPoint(1.5F, 6.1F, -10.8F);
			this.Mouth.addBox(-3.0F, 0.0F, 0.0F, 4, 1, 6, 0.0F);
			this.setRotateAngle(Mouth, 0.06981317007977318F, -0.0F, 0.0F);
			this.Body2 = new ModelRenderer(this, 86, 41);
			this.Body2.setRotationPoint(-5.0F, 1.0F, -2.5F);
			this.Body2.addBox(0.0F, 0.0F, 0.0F, 10, 12, 11, 0.0F);
			this.Head1 = new ModelRenderer(this, 36, 0);
			this.Head1.setRotationPoint(-0.5F, -7.5F, -9.5F);
			this.Head1.addBox(-3.0F, 0.0F, -7.0F, 7, 7, 7, 0.0F);
			this.setRotateAngle(Head1, 0.593411945678072F, 0.0F, 0.0F);
			this.LeftHorn1 = new ModelRenderer(this, 0, 34);
			this.LeftHorn1.setRotationPoint(2.5F, 0.6F, -3.2F);
			this.LeftHorn1.addBox(-5.0F, -1.0F, -1.0F, 5, 2, 1, 0.0F);
			this.setRotateAngle(LeftHorn1, 0.0F, -2.478367537831948F, -0.41887902047863906F);
			this.Head2 = new ModelRenderer(this, 0, 0);
			this.Head2.setRotationPoint(0.0F, 1.0F, -5.9F);
			this.Head2.addBox(-2.0F, 1.33F, -5.5F, 5, 4, 6, 0.0F);
			this.NoseRing = new ModelRenderer(this, 0, 120);
			this.NoseRing.setRotationPoint(-1.5F, 6.8F, -13.5F);
			this.NoseRing.addBox(0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F);
			this.setRotateAngle(NoseRing, 0.6981317007977318F, 0.0F, 0.0F);
			this.RightEar = new ModelRenderer(this, 0, 31);
			this.RightEar.setRotationPoint(-2.0F, 0.4F, -2.8F);
			this.RightEar.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
			this.setRotateAngle(RightEar, 0.0F, -0.0F, 0.20943951023931953F);
			this.Tail2 = new ModelRenderer(this, 0, 74);
			this.Tail2.setRotationPoint(0.5F, 2.3F, 1.0F);
			this.Tail2.addBox(0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F);
			this.setRotateAngle(Tail2, -0.33510321638291124F, -0.0F, 0.0F);
			this.Tail3 = new ModelRenderer(this, 5, 77);
			this.Tail3.setRotationPoint(-0.5F, 9.0F, -0.5F);
			this.Tail3.addBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
			this.LeftHorn2 = new ModelRenderer(this, 0, 27);
			this.LeftHorn2.setRotationPoint(-4.4F, -0.2F, -0.5F);
			this.LeftHorn2.addBox(-5.0F, 0.0F, -0.5F, 5, 1, 1, 0.0F);
			this.setRotateAngle(LeftHorn2, 0.0F, 0.24434609527920614F, 0.7330382858376184F);
			this.Head3 = new ModelRenderer(this, 19, 22);
			this.Head3.setRotationPoint(1.5F, 2.6F, -10.3F);
			this.Head3.addBox(-3.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F);
			this.setRotateAngle(Head3, 0.2617993877991494F, 0.0F, 0.0F);
			this.FrontLeftLeg = new ModelRenderer(this, 0, 51);
			this.FrontLeftLeg.setRotationPoint(9.0F, 12.4F, 4.0F);
			this.FrontLeftLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 11, 4, 0.0F);
			this.BackRightLeg = new ModelRenderer(this, 0, 51);
			this.BackRightLeg.mirror = true;
			this.BackRightLeg.setRotationPoint(2.0F, 12.4F, 4.0F);
			this.BackRightLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 11, 4, 0.0F);
			this.Head4 = new ModelRenderer(this, 67, 5);
			this.Head4.setRotationPoint(1.0F, -0.6F, -5.0F);
			this.Head4.addBox(-3.0F, 0.0F, -0.0F, 5, 1, 4, 0.0F);
			this.setRotateAngle(Head4, 0.06981317007977318F, -0.0F, 0.0F);
			this.RightHorn1 = new ModelRenderer(this, 0, 34);
			this.RightHorn1.setRotationPoint(-2.0F, 0.3F, -2.4F);
			this.RightHorn1.addBox(-5.0F, -1.0F, -1.0F, 5, 2, 1, 0.0F);
			this.setRotateAngle(RightHorn1, 0.0F, -0.6632251157578453F, 0.41887902047863906F);
			this.RightHorn2 = new ModelRenderer(this, 0, 27);
			this.RightHorn2.setRotationPoint(-4.0F, 0.0F, -0.5F);
			this.RightHorn2.addBox(-5.0F, 0.0F, -0.5F, 5, 1, 1, 0.0F);
			this.setRotateAngle(RightHorn2, 0.0F, -0.24434609527920614F, 0.7330382858376184F);
			this.Neck2 = new ModelRenderer(this, 26, 89);
			this.Neck2.setRotationPoint(-0.5F, -6.7F, -4.4F);
			this.Neck2.addBox(0.0F, 0.0F, 0.0F, 1, 6, 13, 0.0F);
			this.setRotateAngle(Neck2, -0.9773843811168246F, 0.0F, 0.0F);
			this.LeftEar = new ModelRenderer(this, 0, 22);
			this.LeftEar.setRotationPoint(6.0F, -0.4F, -2.8F);
			this.LeftEar.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
			this.setRotateAngle(LeftEar, 0.0F, 0.0F, -0.20943951023931953F);
			this.BackLeftLeg = new ModelRenderer(this, 0, 51);
			this.BackLeftLeg.setRotationPoint(9.0F, 12.4F, 4.0F);
			this.BackLeftLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 11, 4, 0.0F);
			this.Neck = new ModelRenderer(this, 30, 26);
			this.Neck.setRotationPoint(1.0F, 4.0F, 2.0F);
			this.Neck.addBox(-3.0F, -7.0F, -10.0F, 6, 7, 10, 0.0F);
			this.setRotateAngle(Neck, -0.3665191429188092F, 0.0F, 0.0F);
			this.udders = new ModelRenderer(this, 86, 33);
			this.udders.setRotationPoint(4.0F, 12.0F, -1.0F);
			this.udders.addBox(0.0F, 0.0F, 0.0F, 4, 2, 6, 0.0F);
			this.Horns = new ModelRenderer(this, 68, 0);
			this.Horns.setRotationPoint(0.5F, -1.2F, -4.2F);
			this.Horns.addBox(-3.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F);
			this.setRotateAngle(Horns, 0.24434609527920614F, 0.0F, 0.0F);
			this.Body2.addChild(this.Body1);
			this.Body1.addChild(this.FrontRightLeg);
			this.Body2.addChild(this.Body3);
			this.Body3.addChild(this.Tail1);
			this.Head1.addChild(this.Mouth);
			this.Neck.addChild(this.Head1);
			this.Head1.addChild(this.LeftHorn1);
			this.Head1.addChild(this.Head2);
			this.Head1.addChild(this.NoseRing);
			this.Head1.addChild(this.RightEar);
			this.Tail1.addChild(this.Tail2);
			this.Tail2.addChild(this.Tail3);
			this.LeftHorn1.addChild(this.LeftHorn2);
			this.Head1.addChild(this.Head3);
			this.Body1.addChild(this.FrontLeftLeg);
			this.Body3.addChild(this.BackRightLeg);
			this.Head1.addChild(this.Head4);
			this.Head1.addChild(this.RightHorn1);
			this.RightHorn1.addChild(this.RightHorn2);
			this.Neck.addChild(this.Neck2);
			this.Head1.addChild(this.LeftEar);
			this.Body3.addChild(this.BackLeftLeg);
			this.ANIMATEHEAD.addChild(this.Neck);
			this.Body3.addChild(this.udders);
			this.Head1.addChild(this.Horns);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			this.ANIMATEHEAD.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.Body2.render(ms, vb, i1, i2, f1, f2, f3, f4);
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