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

import net.mcreator.wildfarmcraft.entity.BisonCalfEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BisonCalfRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BisonCalfEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelBisonCalf(), 0.9f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("wildfarmcraft:textures/bisonbaby.png");
					}
				};
			});
		}
	}

	/**
	 * BisonCalf - Matheus Created using Tabula 7.1.0
	 */
	public static class ModelBisonCalf extends EntityModel<Entity> {
		public ModelRenderer Body;
		public ModelRenderer ANIMATEHEAD;
		public ModelRenderer BackRightLeg;
		public ModelRenderer BackLeftLeg;
		public ModelRenderer FrontLeftLeg;
		public ModelRenderer FrontRightLeg;
		public ModelRenderer Tail1;
		public ModelRenderer body2;
		public ModelRenderer Tail2;
		public ModelRenderer Neck;
		public ModelRenderer Head1;
		public ModelRenderer Neck2;
		public ModelRenderer Head2;
		public ModelRenderer Head3;
		public ModelRenderer Head4;
		public ModelRenderer Mouth;
		public ModelRenderer RightEar;
		public ModelRenderer LeftEar;
		public ModelBisonCalf() {
			this.textureWidth = 128;
			this.textureHeight = 128;
			this.RightEar = new ModelRenderer(this, 0, 31);
			this.RightEar.setRotationPoint(-2.5F, 0.1F, -3.8F);
			this.RightEar.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
			this.setRotateAngle(RightEar, 0.0F, -0.0F, -0.20943951023931953F);
			this.Neck = new ModelRenderer(this, 30, 30);
			this.Neck.setRotationPoint(0.0F, -1.1F, 1.1F);
			this.Neck.addBox(-2.5F, -4.0F, -4.0F, 5, 5, 4, 0.0F);
			this.setRotateAngle(Neck, 0.3665191429188092F, 0.0F, 0.0F);
			this.Neck2 = new ModelRenderer(this, 30, 45);
			this.Neck2.setRotationPoint(-2.0F, 0.0F, -1.5F);
			this.Neck2.addBox(0.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F);
			this.setRotateAngle(Neck2, -1.2915436464758039F, 0.0F, 0.0F);
			this.BackRightLeg = new ModelRenderer(this, 0, 51);
			this.BackRightLeg.mirror = true;
			this.BackRightLeg.setRotationPoint(1.75F, 7.5F, 12.0F);
			this.BackRightLeg.addBox(-1.5F, 0.0F, -1.5F, 2, 9, 3, 0.0F);
			this.Body = new ModelRenderer(this, 77, 41);
			this.Body.setRotationPoint(-4.0F, 7.5F, -7.0F);
			this.Body.addBox(0.0F, 0.0F, 0.0F, 8, 8, 14, 0.0F);
			this.Tail2 = new ModelRenderer(this, 0, 68);
			this.Tail2.setRotationPoint(0.0F, 2.5F, 0.1F);
			this.Tail2.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
			this.setRotateAngle(Tail2, -0.33510321638291124F, 0.0F, -0.03490658503988659F);
			this.ANIMATEHEAD = new ModelRenderer(this, 0, 120);
			this.ANIMATEHEAD.setRotationPoint(0.0F, 11.0F, -6.0F);
			this.ANIMATEHEAD.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
			this.Mouth = new ModelRenderer(this, 41, 19);
			this.Mouth.setRotationPoint(1.5F, 5.1F, -9.5F);
			this.Mouth.addBox(-3.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F);
			this.setRotateAngle(Mouth, 0.06981317007977318F, -0.0F, 0.0F);
			this.body2 = new ModelRenderer(this, 80, 20);
			this.body2.setRotationPoint(0.5F, -1.5F, 0.5F);
			this.body2.addBox(0.0F, 0.0F, 0.0F, 7, 2, 13, 0.0F);
			this.setRotateAngle(body2, -0.12217304763960307F, 0.0F, 0.0F);
			this.Head3 = new ModelRenderer(this, 19, 22);
			this.Head3.setRotationPoint(1.5F, 2.4F, -9.9F);
			this.Head3.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
			this.setRotateAngle(Head3, 0.5759586531581287F, 0.0F, 0.0F);
			this.Tail1 = new ModelRenderer(this, 5, 68);
			this.Tail1.setRotationPoint(3.5F, 0.6F, 13.1F);
			this.Tail1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
			this.setRotateAngle(Tail1, 0.4363323129985824F, -0.0F, 0.0F);
			this.Head2 = new ModelRenderer(this, 0, 0);
			this.Head2.setRotationPoint(-0.0F, 1.0F, -4.5F);
			this.Head2.addBox(-2.0F, 1.33F, -5.5F, 4, 3, 5, 0.0F);
			this.LeftEar = new ModelRenderer(this, 0, 22);
			this.LeftEar.setRotationPoint(5.4F, 0.7F, -3.8F);
			this.LeftEar.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
			this.setRotateAngle(LeftEar, 0.0F, 0.0F, 0.20943951023931953F);
			this.FrontLeftLeg = new ModelRenderer(this, 0, 51);
			this.FrontLeftLeg.setRotationPoint(7.25F, 7.5F, 2.5F);
			this.FrontLeftLeg.addBox(-1.5F, 0.0F, -1.5F, 2, 9, 3, 0.0F);
			this.FrontRightLeg = new ModelRenderer(this, 0, 51);
			this.FrontRightLeg.mirror = true;
			this.FrontRightLeg.setRotationPoint(1.75F, 7.5F, 2.5F);
			this.FrontRightLeg.addBox(-1.5F, 0.0F, -1.5F, 2, 9, 3, 0.0F);
			this.Head4 = new ModelRenderer(this, 67, 5);
			this.Head4.setRotationPoint(1.0F, -0.9F, -6.0F);
			this.Head4.addBox(-3.0F, 0.0F, -0.0F, 4, 1, 4, 0.0F);
			this.BackLeftLeg = new ModelRenderer(this, 0, 51);
			this.BackLeftLeg.setRotationPoint(7.25F, 7.5F, 12.0F);
			this.BackLeftLeg.addBox(-1.5F, 0.0F, -1.5F, 2, 9, 3, 0.0F);
			this.Head1 = new ModelRenderer(this, 36, 0);
			this.Head1.setRotationPoint(0.0F, -4.7F, -0.4F);
			this.Head1.addBox(-3.0F, 0.0F, -7.0F, 6, 6, 6, 0.0F);
			this.setRotateAngle(Head1, -0.15707963267948966F, 0.0F, 0.0F);
			this.Head1.addChild(this.RightEar);
			this.ANIMATEHEAD.addChild(this.Neck);
			this.Neck.addChild(this.Neck2);
			this.Body.addChild(this.BackRightLeg);
			this.Tail1.addChild(this.Tail2);
			this.Head1.addChild(this.Mouth);
			this.Body.addChild(this.body2);
			this.Head1.addChild(this.Head3);
			this.Body.addChild(this.Tail1);
			this.Head1.addChild(this.Head2);
			this.Head1.addChild(this.LeftEar);
			this.Body.addChild(this.FrontLeftLeg);
			this.Body.addChild(this.FrontRightLeg);
			this.Head1.addChild(this.Head4);
			this.Body.addChild(this.BackLeftLeg);
			this.Neck.addChild(this.Head1);
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
			this.BackLeftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.FrontLeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.ANIMATEHEAD.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.ANIMATEHEAD.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.BackRightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.FrontRightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
