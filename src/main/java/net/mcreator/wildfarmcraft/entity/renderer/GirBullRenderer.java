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

import net.mcreator.wildfarmcraft.entity.GirBullEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GirBullRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GirBullEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelGirBull(), 0.9f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("wildfarmcraft:textures/girbull.png");
					}
				};
			});
		}
	}

	/**
	 * GirBull - Matheus Created using Tabula 7.1.0
	 */
	public static class ModelGirBull extends EntityModel<Entity> {
		public ModelRenderer ANIMATEHEAD;
		public ModelRenderer Neck;
		public ModelRenderer Neck2;
		public ModelRenderer Head1;
		public ModelRenderer NoseRing;
		public ModelRenderer Head2;
		public ModelRenderer Head3;
		public ModelRenderer Head4;
		public ModelRenderer Mouth;
		public ModelRenderer RightEar;
		public ModelRenderer LeftEar;
		public ModelRenderer RightHorn1;
		public ModelRenderer LeftHorn1;
		public ModelRenderer RightHorn2;
		public ModelRenderer RightHorn3;
		public ModelRenderer LeftHorn2;
		public ModelRenderer LeftHorn3;
		public ModelRenderer Body2;
		public ModelRenderer Body1;
		public ModelRenderer Body3;
		public ModelRenderer FrontLeftLeg;
		public ModelRenderer FrontRightLeg;
		public ModelRenderer Body4;
		public ModelRenderer BackRightLeg;
		public ModelRenderer BackLeftLeg;
		public ModelRenderer Tail1;
		public ModelRenderer Tail2;
		public ModelRenderer Tail3;
		public ModelGirBull() {
			this.textureWidth = 128;
			this.textureHeight = 128;
			this.FrontRightLeg = new ModelRenderer(this, 0, 51);
			this.FrontRightLeg.mirror = true;
			this.FrontRightLeg.setRotationPoint(2.0F, 13.4F, 4.0F);
			this.FrontRightLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 11, 4, 0.0F);
			this.Head4 = new ModelRenderer(this, 67, 5);
			this.Head4.setRotationPoint(0.5F, -1.1F, -6.0F);
			this.Head4.addBox(-3.0F, 0.0F, -0.0F, 6, 2, 5, 0.0F);
			this.setRotateAngle(Head4, 0.06981317007977318F, 0.0F, 0.0F);
			this.Body3 = new ModelRenderer(this, 50, 66);
			this.Body3.setRotationPoint(-0.5F, -0.3F, 10.5F);
			this.Body3.addBox(0.0F, 0.0F, 0.0F, 12, 14, 7, 0.0F);
			this.NoseRing = new ModelRenderer(this, 0, 120);
			this.NoseRing.setRotationPoint(-2.0F, 6.3F, -13.9F);
			this.NoseRing.addBox(0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F);
			this.setRotateAngle(NoseRing, 1.7453292519943295F, 0.0F, 0.012291054537353359F);
			this.LeftHorn2 = new ModelRenderer(this, 0, 27);
			this.LeftHorn2.setRotationPoint(-4.1F, -0.1F, -0.4F);
			this.LeftHorn2.addBox(-3.0F, 0.0F, -0.5F, 3, 1, 2, 0.0F);
			this.setRotateAngle(LeftHorn2, 0.0F, -0.3490658503988659F, 0.4970697709679851F);
			this.LeftHorn1 = new ModelRenderer(this, 0, 36);
			this.LeftHorn1.setRotationPoint(3.0F, 0.2F, -3.4F);
			this.LeftHorn1.addBox(-5.0F, -1.0F, -1.0F, 5, 2, 2, 0.0F);
			this.setRotateAngle(LeftHorn1, 0.0F, -3.141592653589793F, 0.6981317007977318F);
			this.LeftEar = new ModelRenderer(this, 0, 22);
			this.LeftEar.setRotationPoint(5.6F, 2.5F, -3.0F);
			this.LeftEar.addBox(-3.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F);
			this.setRotateAngle(LeftEar, 0.0F, 0.0F, 0.9599310885968813F);
			this.Body1 = new ModelRenderer(this, 14, 44);
			this.Body1.setRotationPoint(-0.5F, -0.3F, -6.5F);
			this.Body1.addBox(0.0F, 0.0F, 0.0F, 12, 14, 7, 0.0F);
			this.Tail3 = new ModelRenderer(this, 5, 77);
			this.Tail3.setRotationPoint(-0.5F, 9.0F, -0.5F);
			this.Tail3.addBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
			this.LeftHorn3 = new ModelRenderer(this, 0, 40);
			this.LeftHorn3.setRotationPoint(-4.5F, 0.5F, 0.0F);
			this.LeftHorn3.addBox(-2.0F, 0.5F, -0.5F, 3, 1, 1, 0.0F);
			this.setRotateAngle(LeftHorn3, 0.0F, 0.3490658503988659F, -2.548180707911721F);
			this.RightHorn3 = new ModelRenderer(this, 0, 40);
			this.RightHorn3.setRotationPoint(-4.6F, 0.4F, 1.0F);
			this.RightHorn3.addBox(-2.0F, 0.5F, -0.5F, 3, 1, 1, 0.0F);
			this.setRotateAngle(RightHorn3, 0.0F, -0.3490658503988659F, -2.5497515042385164F);
			this.Mouth = new ModelRenderer(this, 41, 19);
			this.Mouth.setRotationPoint(1.5F, 6.1F, -10.8F);
			this.Mouth.addBox(-3.0F, 0.0F, 0.0F, 4, 1, 6, 0.0F);
			this.setRotateAngle(Mouth, 0.06981317007977318F, -0.0F, 0.0F);
			this.RightHorn2 = new ModelRenderer(this, 0, 27);
			this.RightHorn2.setRotationPoint(-4.3F, -0.2F, -0.5F);
			this.RightHorn2.addBox(-3.0F, 0.0F, -0.5F, 3, 1, 2, 0.0F);
			this.setRotateAngle(RightHorn2, 0.0F, 0.3490658503988659F, 0.4970697709679851F);
			this.FrontLeftLeg = new ModelRenderer(this, 0, 51);
			this.FrontLeftLeg.setRotationPoint(10.0F, 13.4F, 4.0F);
			this.FrontLeftLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 11, 4, 0.0F);
			this.Tail2 = new ModelRenderer(this, 0, 74);
			this.Tail2.setRotationPoint(0.5F, 2.3F, 1.0F);
			this.Tail2.addBox(0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F);
			this.setRotateAngle(Tail2, -0.33510321638291124F, -0.0F, 0.0F);
			this.Head1 = new ModelRenderer(this, 36, 0);
			this.Head1.setRotationPoint(-0.5F, -7.5F, -9.5F);
			this.Head1.addBox(-3.0F, 0.0F, -7.0F, 7, 7, 7, 0.0F);
			this.setRotateAngle(Head1, 0.7853981633974483F, 0.0F, 0.0F);
			this.Head2 = new ModelRenderer(this, 0, 0);
			this.Head2.setRotationPoint(0.0F, 1.0F, -5.9F);
			this.Head2.addBox(-2.0F, 1.33F, -5.5F, 5, 4, 6, 0.0F);
			this.Body4 = new ModelRenderer(this, 0, 87);
			this.Body4.setRotationPoint(2.0F, -4.4F, 1.7F);
			this.Body4.addBox(0.0F, 0.0F, 0.0F, 8, 6, 8, 0.0F);
			this.setRotateAngle(Body4, -0.2617993877991494F, 0.0F, 0.0F);
			this.ANIMATEHEAD = new ModelRenderer(this, 3, 120);
			this.ANIMATEHEAD.setRotationPoint(-1.0F, 4.0F, -7.0F);
			this.ANIMATEHEAD.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
			this.RightHorn1 = new ModelRenderer(this, 0, 36);
			this.RightHorn1.setRotationPoint(-2.0F, 0.3F, -3.4F);
			this.RightHorn1.addBox(-5.0F, -1.0F, -1.0F, 5, 2, 2, 0.0F);
			this.setRotateAngle(RightHorn1, 0.0F, -0.0F, -0.6981317007977318F);
			this.BackLeftLeg = new ModelRenderer(this, 0, 51);
			this.BackLeftLeg.setRotationPoint(10.0F, 13.4F, 4.0F);
			this.BackLeftLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 11, 4, 0.0F);
			this.Body2 = new ModelRenderer(this, 83, 41);
			this.Body2.setRotationPoint(-5.5F, 0.0F, -2.5F);
			this.Body2.addBox(0.0F, 0.0F, 0.0F, 11, 13, 11, 0.0F);
			this.Tail1 = new ModelRenderer(this, 0, 68);
			this.Tail1.setRotationPoint(4.5F, 0.9F, 5.1F);
			this.Tail1.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
			this.setRotateAngle(Tail1, 0.4886921905584123F, -0.0F, 0.0F);
			this.Neck = new ModelRenderer(this, 30, 26);
			this.Neck.setRotationPoint(1.0F, 5.0F, 0.0F);
			this.Neck.addBox(-3.0F, -7.0F, -10.0F, 6, 8, 10, 0.0F);
			this.setRotateAngle(Neck, -0.5585053606381855F, -0.0F, 0.0F);
			this.Neck2 = new ModelRenderer(this, 26, 89);
			this.Neck2.setRotationPoint(-0.5F, -4.9F, -6.8F);
			this.Neck2.addBox(0.0F, 0.0F, 0.0F, 1, 6, 13, 0.0F);
			this.setRotateAngle(Neck2, -0.6632251157578453F, 0.0F, 0.0F);
			this.Head3 = new ModelRenderer(this, 19, 22);
			this.Head3.setRotationPoint(1.5F, 2.6F, -10.3F);
			this.Head3.addBox(-3.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F);
			this.setRotateAngle(Head3, 0.2617993877991494F, 0.0F, 0.0F);
			this.BackRightLeg = new ModelRenderer(this, 0, 51);
			this.BackRightLeg.mirror = true;
			this.BackRightLeg.setRotationPoint(2.0F, 13.4F, 4.0F);
			this.BackRightLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 11, 4, 0.0F);
			this.RightEar = new ModelRenderer(this, 0, 31);
			this.RightEar.setRotationPoint(-5.8F, 4.3F, -3.0F);
			this.RightEar.addBox(-3.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F);
			this.setRotateAngle(RightEar, 0.0F, -0.0F, -0.9599310885968813F);
			this.Body1.addChild(this.FrontRightLeg);
			this.Head1.addChild(this.Head4);
			this.Body2.addChild(this.Body3);
			this.Neck.addChild(this.NoseRing);
			this.LeftHorn1.addChild(this.LeftHorn2);
			this.Head1.addChild(this.LeftHorn1);
			this.Head1.addChild(this.LeftEar);
			this.Body2.addChild(this.Body1);
			this.Tail2.addChild(this.Tail3);
			this.LeftHorn2.addChild(this.LeftHorn3);
			this.RightHorn2.addChild(this.RightHorn3);
			this.Head1.addChild(this.Mouth);
			this.RightHorn1.addChild(this.RightHorn2);
			this.Body1.addChild(this.FrontLeftLeg);
			this.Tail1.addChild(this.Tail2);
			this.Neck.addChild(this.Head1);
			this.Head1.addChild(this.Head2);
			this.Body1.addChild(this.Body4);
			this.Head1.addChild(this.RightHorn1);
			this.Body3.addChild(this.BackLeftLeg);
			this.Body3.addChild(this.Tail1);
			this.ANIMATEHEAD.addChild(this.Neck);
			this.Neck.addChild(this.Neck2);
			this.Head1.addChild(this.Head3);
			this.Body3.addChild(this.BackRightLeg);
			this.Head1.addChild(this.RightEar);
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
