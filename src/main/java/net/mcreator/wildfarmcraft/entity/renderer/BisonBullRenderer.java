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

import net.mcreator.wildfarmcraft.entity.BisonBullEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BisonBullRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BisonBullEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelBisonBull(), 0.9f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("wildfarmcraft:textures/bisonbull.png");
					}
				};
			});
		}
	}

	/**
	 * BisonBull - Matheus Created using Tabula 7.1.0
	 */
	public static class ModelBisonBull extends EntityModel<Entity> {
		public ModelRenderer ANIMATEHEAD;
		public ModelRenderer Neck;
		public ModelRenderer Head1;
		public ModelRenderer Neck2;
		public ModelRenderer Head2;
		public ModelRenderer Head3;
		public ModelRenderer Mouth;
		public ModelRenderer RightHorn1;
		public ModelRenderer LeftEar;
		public ModelRenderer Head4;
		public ModelRenderer RightEar;
		public ModelRenderer LeftHorn1;
		public ModelRenderer beard;
		public ModelRenderer RightHorn2;
		public ModelRenderer LeftHorn2;
		public ModelRenderer Body2;
		public ModelRenderer Body1;
		public ModelRenderer Body3;
		public ModelRenderer Body5;
		public ModelRenderer FrontLeftLeg;
		public ModelRenderer FrontRightLeg;
		public ModelRenderer Body4;
		public ModelRenderer Fur;
		public ModelRenderer furlegleft;
		public ModelRenderer furlegright;
		public ModelRenderer BackRightLeg;
		public ModelRenderer BackLeftLeg;
		public ModelRenderer Tail1;
		public ModelRenderer Tail2;
		public ModelRenderer Tail3;
		public ModelRenderer furlag;
		public ModelBisonBull() {
			this.textureWidth = 128;
			this.textureHeight = 128;
			this.Body4 = new ModelRenderer(this, 51, 66);
			this.Body4.setRotationPoint(1.0F, -3.0F, 0.0F);
			this.Body4.addBox(0.0F, 0.0F, 0.0F, 10, 3, 7, 0.0F);
			this.setRotateAngle(Body4, -0.03490658503988659F, 0.0F, 0.0F);
			this.Mouth = new ModelRenderer(this, 41, 19);
			this.Mouth.setRotationPoint(1.5F, 7.1F, -10.8F);
			this.Mouth.addBox(-3.0F, 0.0F, 0.0F, 4, 1, 6, 0.0F);
			this.setRotateAngle(Mouth, 0.06981317007977318F, -0.0F, 0.0F);
			this.RightEar = new ModelRenderer(this, 0, 31);
			this.RightEar.setRotationPoint(-2.0F, 0.8F, -2.8F);
			this.RightEar.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
			this.setRotateAngle(RightEar, 0.0F, -0.0F, -0.03490658503988659F);
			this.Tail3 = new ModelRenderer(this, 5, 77);
			this.Tail3.setRotationPoint(-0.5F, 6.0F, -0.5F);
			this.Tail3.addBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
			this.FrontRightLeg = new ModelRenderer(this, 0, 50);
			this.FrontRightLeg.setRotationPoint(2.0F, 12.4F, 4.0F);
			this.FrontRightLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 14, 4, 0.0F);
			this.LeftHorn1 = new ModelRenderer(this, 0, 34);
			this.LeftHorn1.setRotationPoint(3.0F, 1.0F, -4.4F);
			this.LeftHorn1.addBox(-3.0F, -1.0F, -1.0F, 3, 2, 1, 0.0F);
			this.setRotateAngle(LeftHorn1, 0.0F, -3.141592653589793F, -0.5235987755982988F);
			this.RightHorn2 = new ModelRenderer(this, 0, 27);
			this.RightHorn2.setRotationPoint(-2.2F, -0.2F, -0.5F);
			this.RightHorn2.addBox(-3.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F);
			this.setRotateAngle(RightHorn2, 0.0F, -0.24434609527920614F, 0.4970697709679851F);
			this.furlag = new ModelRenderer(this, 0, 0);
			this.furlag.setRotationPoint(0.0F, 0.0F, 0.0F);
			this.furlag.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
			this.ANIMATEHEAD = new ModelRenderer(this, 0, 0);
			this.ANIMATEHEAD.setRotationPoint(-1.0F, 1.9F, -8.0F);
			this.ANIMATEHEAD.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
			this.BackRightLeg = new ModelRenderer(this, 0, 50);
			this.BackRightLeg.setRotationPoint(2.0F, 12.4F, 4.0F);
			this.BackRightLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 14, 4, 0.0F);
			this.LeftEar = new ModelRenderer(this, 0, 22);
			this.LeftEar.setRotationPoint(6.0F, 0.8F, -2.8F);
			this.LeftEar.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
			this.setRotateAngle(LeftEar, 0.0F, 0.0F, 0.03490658503988659F);
			this.Body1 = new ModelRenderer(this, 14, 44);
			this.Body1.setRotationPoint(-0.5F, -0.2F, -6.5F);
			this.Body1.addBox(0.0F, 0.0F, 0.0F, 12, 14, 8, 0.0F);
			this.Neck = new ModelRenderer(this, 30, 30);
			this.Neck.setRotationPoint(0.0F, -2.3F, 6.4F);
			this.Neck.addBox(-3.0F, -7.0F, -10.0F, 8, 7, 5, 0.0F);
			this.setRotateAngle(Neck, 0.3665191429188092F, -0.0F, 0.0F);
			this.furlegleft = new ModelRenderer(this, 90, 100);
			this.furlegleft.setRotationPoint(-2.01F, 0.0F, -2.5F);
			this.furlegleft.addBox(0.0F, 0.0F, 0.0F, 4, 5, 5, 0.0F);
			this.Body2 = new ModelRenderer(this, 77, 0);
			this.Body2.setRotationPoint(-5.5F, -2.1F, -2.5F);
			this.Body2.addBox(0.0F, 0.0F, 0.0F, 11, 13, 14, 0.0F);
			this.beard = new ModelRenderer(this, 0, 90);
			this.beard.setRotationPoint(-1.5F, 0.0F, 1.0F);
			this.beard.addBox(0.0F, 0.0F, 0.0F, 1, 5, 4, 0.0F);
			this.RightHorn1 = new ModelRenderer(this, 0, 34);
			this.RightHorn1.setRotationPoint(-2.0F, 1.0F, -3.4F);
			this.RightHorn1.addBox(-3.0F, -1.0F, -1.0F, 3, 2, 1, 0.0F);
			this.setRotateAngle(RightHorn1, 0.0F, -0.0F, 0.5235987755982988F);
			this.Fur = new ModelRenderer(this, 12, 92);
			this.Fur.setRotationPoint(-0.5F, -3.5F, -0.5F);
			this.Fur.addBox(0.0F, 0.0F, 0.0F, 13, 18, 9, 0.0F);
			this.Tail2 = new ModelRenderer(this, 0, 74);
			this.Tail2.setRotationPoint(0.5F, 2.3F, 1.0F);
			this.Tail2.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
			this.setRotateAngle(Tail2, -0.33510321638291124F, -0.0F, 0.0F);
			this.Head1 = new ModelRenderer(this, 36, 0);
			this.Head1.setRotationPoint(0.5F, -7.0F, -8.5F);
			this.Head1.addBox(-3.0F, 0.0F, -7.0F, 7, 8, 7, 0.0F);
			this.setRotateAngle(Head1, -0.12217304763960307F, 0.0F, 0.0F);
			this.FrontLeftLeg = new ModelRenderer(this, 0, 50);
			this.FrontLeftLeg.mirror = true;
			this.FrontLeftLeg.setRotationPoint(10.0F, 12.4F, 4.0F);
			this.FrontLeftLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 14, 4, 0.0F);
			this.Body5 = new ModelRenderer(this, 51, 77);
			this.Body5.setRotationPoint(1.0F, -2.7F, -0.2F);
			this.Body5.addBox(0.0F, 0.0F, 0.0F, 9, 3, 16, 0.0F);
			this.setRotateAngle(Body5, -0.16231562043547265F, 0.0F, 0.0F);
			this.furlegright = new ModelRenderer(this, 90, 100);
			this.furlegright.setRotationPoint(-2.01F, 0.0F, -2.5F);
			this.furlegright.addBox(0.0F, 0.0F, 0.0F, 4, 5, 5, 0.0F);
			this.Body3 = new ModelRenderer(this, 65, 44);
			this.Body3.setRotationPoint(-0.5F, -0.2F, 13.5F);
			this.Body3.addBox(0.0F, 0.0F, 0.0F, 12, 14, 7, 0.0F);
			this.Head4 = new ModelRenderer(this, 65, 0);
			this.Head4.setRotationPoint(0.5F, -1.5F, -7.7F);
			this.Head4.addBox(-3.0F, 0.0F, 0.0F, 6, 2, 7, 0.0F);
			this.setRotateAngle(Head4, 0.017453292519943295F, 0.0F, 0.0F);
			this.Head3 = new ModelRenderer(this, 15, 18);
			this.Head3.setRotationPoint(1.5F, 3.4F, -11.1F);
			this.Head3.addBox(-3.0F, 0.0F, 0.0F, 4, 3, 7, 0.0F);
			this.setRotateAngle(Head3, 0.6981317007977318F, 0.0F, 0.0F);
			this.Neck2 = new ModelRenderer(this, 94, 68);
			this.Neck2.setRotationPoint(-2.0F, -1.8F, -6.0F);
			this.Neck2.addBox(0.0F, 0.0F, 0.0F, 6, 7, 9, 0.0F);
			this.setRotateAngle(Neck2, -1.2915436464758039F, 0.0F, 0.0F);
			this.Tail1 = new ModelRenderer(this, 0, 68);
			this.Tail1.setRotationPoint(5.0F, 0.9F, 5.1F);
			this.Tail1.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
			this.setRotateAngle(Tail1, 0.4886921905584123F, -0.0F, 0.0F);
			this.Head2 = new ModelRenderer(this, 0, 0);
			this.Head2.setRotationPoint(0.0F, 2.0F, -5.9F);
			this.Head2.addBox(-2.0F, 1.33F, -5.5F, 5, 4, 6, 0.0F);
			this.BackLeftLeg = new ModelRenderer(this, 0, 50);
			this.BackLeftLeg.mirror = true;
			this.BackLeftLeg.setRotationPoint(10.0F, 12.4F, 4.0F);
			this.BackLeftLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 14, 4, 0.0F);
			this.LeftHorn2 = new ModelRenderer(this, 0, 27);
			this.LeftHorn2.setRotationPoint(-2.4F, -0.2F, -0.6F);
			this.LeftHorn2.addBox(-3.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F);
			this.setRotateAngle(LeftHorn2, 0.0F, 0.24434609527920614F, 0.4970697709679851F);
			this.Body1.addChild(this.Body4);
			this.Head1.addChild(this.Mouth);
			this.Head1.addChild(this.RightEar);
			this.Tail2.addChild(this.Tail3);
			this.Body1.addChild(this.FrontRightLeg);
			this.Head1.addChild(this.LeftHorn1);
			this.RightHorn1.addChild(this.RightHorn2);
			this.Body5.addChild(this.furlag);
			this.Body3.addChild(this.BackRightLeg);
			this.Head1.addChild(this.LeftEar);
			this.Body2.addChild(this.Body1);
			this.ANIMATEHEAD.addChild(this.Neck);
			this.FrontLeftLeg.addChild(this.furlegleft);
			this.Mouth.addChild(this.beard);
			this.Head1.addChild(this.RightHorn1);
			this.Body1.addChild(this.Fur);
			this.Tail1.addChild(this.Tail2);
			this.Neck.addChild(this.Head1);
			this.Body1.addChild(this.FrontLeftLeg);
			this.Body2.addChild(this.Body5);
			this.FrontRightLeg.addChild(this.furlegright);
			this.Body2.addChild(this.Body3);
			this.Head1.addChild(this.Head4);
			this.Head1.addChild(this.Head3);
			this.Neck.addChild(this.Neck2);
			this.Body3.addChild(this.Tail1);
			this.Head1.addChild(this.Head2);
			this.Body3.addChild(this.BackLeftLeg);
			this.LeftHorn1.addChild(this.LeftHorn2);
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
