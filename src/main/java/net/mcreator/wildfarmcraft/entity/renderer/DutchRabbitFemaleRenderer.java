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

import net.mcreator.wildfarmcraft.entity.DutchRabbitFemaleEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DutchRabbitFemaleRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DutchRabbitFemaleEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelRabbitFemale(), 0.4f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("wildfarmcraft:textures/rabbitfemale.png");
					}
				};
			});
		}
	}

	/**
	 * RabbitFemale - Matheus Created using Tabula 7.1.0
	 */
	public static class ModelRabbitFemale extends EntityModel<Entity> {
		public ModelRenderer ANIMATEHEAD;
		public ModelRenderer neck;
		public ModelRenderer head;
		public ModelRenderer head2;
		public ModelRenderer head3;
		public ModelRenderer head4;
		public ModelRenderer head5;
		public ModelRenderer ear2;
		public ModelRenderer ear1;
		public ModelRenderer Tail;
		public ModelRenderer BackLeftLeg;
		public ModelRenderer Body;
		public ModelRenderer FrontRightLeg;
		public ModelRenderer BackRightLeg;
		public ModelRenderer FrontLeftLeg;
		public ModelRenderer BackRightLeg3;
		public ModelRenderer BackRightLeg2;
		public ModelRenderer BackRightLeg3_1;
		public ModelRenderer BackRightLeg2_1;
		public ModelRabbitFemale() {
			this.textureWidth = 64;
			this.textureHeight = 64;
			this.BackRightLeg2 = new ModelRenderer(this, 44, 15);
			this.BackRightLeg2.setRotationPoint(-1.1F, 2.2F, 0.8F);
			this.BackRightLeg2.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
			this.setRotateAngle(BackRightLeg2, -0.3665191429188092F, 0.0F, 0.009773843811168246F);
			this.head4 = new ModelRenderer(this, 51, 0);
			this.head4.setRotationPoint(-1.5F, -0.5F, -2.5F);
			this.head4.addBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F);
			this.BackLeftLeg = new ModelRenderer(this, 0, 8);
			this.BackLeftLeg.setRotationPoint(3.0F, 18.0F, 2.7F);
			this.BackLeftLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
			this.BackRightLeg3 = new ModelRenderer(this, 53, 12);
			this.BackRightLeg3.setRotationPoint(0.0F, -0.5F, 2.3F);
			this.BackRightLeg3.addBox(-1.0F, 5.5F, -3.7F, 2, 1, 3, 0.0F);
			this.BackRightLeg3_1 = new ModelRenderer(this, 0, 15);
			this.BackRightLeg3_1.mirror = true;
			this.BackRightLeg3_1.setRotationPoint(0.0F, -0.5F, 2.3F);
			this.BackRightLeg3_1.addBox(-1.0F, 5.5F, -3.7F, 2, 1, 3, 0.0F);
			this.head5 = new ModelRenderer(this, 51, 3);
			this.head5.setRotationPoint(-0.5F, 2.0F, -5.9F);
			this.head5.addBox(-1.0F, 0.0F, 1.0F, 3, 2, 3, 0.0F);
			this.setRotateAngle(head5, 0.08726646259971647F, 0.0F, 0.0F);
			this.neck = new ModelRenderer(this, 2, 0);
			this.neck.setRotationPoint(0.0F, 2.5F, 1.1F);
			this.neck.addBox(-1.5F, -1.5F, -6.0F, 3, 4, 4, 0.0F);
			this.setRotateAngle(neck, -1.0471975511965976F, 0.0F, 0.0F);
			this.Tail = new ModelRenderer(this, 18, 7);
			this.Tail.setRotationPoint(0.0F, 20.3F, 4.8F);
			this.Tail.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2, 0.0F);
			this.setRotateAngle(Tail, 0.2617993877991494F, 0.0F, 0.0F);
			this.head3 = new ModelRenderer(this, 44, 0);
			this.head3.setRotationPoint(0.0F, 4.5F, -5.2F);
			this.head3.addBox(-1.0F, -1.0F, 1.0F, 2, 1, 3, 0.0F);
			this.setRotateAngle(head3, 0.17453292519943295F, 0.0F, 0.0F);
			this.BackRightLeg2_1 = new ModelRenderer(this, 52, 16);
			this.BackRightLeg2_1.mirror = true;
			this.BackRightLeg2_1.setRotationPoint(-0.9F, 2.2F, 0.8F);
			this.BackRightLeg2_1.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
			this.setRotateAngle(BackRightLeg2_1, -0.3665191429188092F, 0.0F, 0.009773843811168246F);
			this.head = new ModelRenderer(this, 20, 0);
			this.head.setRotationPoint(0.0F, -2.0F, -7.5F);
			this.head.addBox(-2.0F, 0.0F, -3.0F, 4, 4, 3, 0.0F);
			this.setRotateAngle(head, 1.0471975511965976F, 0.0F, 0.0F);
			this.head2 = new ModelRenderer(this, 34, 0);
			this.head2.setRotationPoint(0.0F, 3.4F, -4.9F);
			this.head2.addBox(-1.0F, -1.0F, 1.0F, 2, 2, 3, 0.0F);
			this.setRotateAngle(head2, 0.7155849933176751F, 0.0F, 0.0F);
			this.Body = new ModelRenderer(this, 3, 12);
			this.Body.setRotationPoint(0.0F, 20.7F, 8.0F);
			this.Body.addBox(-3.0F, -2.0F, -10.0F, 6, 5, 7, 0.0F);
			this.setRotateAngle(Body, -0.2617993877991494F, 0.0F, 0.0F);
			this.FrontRightLeg = new ModelRenderer(this, 48, 8);
			this.FrontRightLeg.mirror = true;
			this.FrontRightLeg.setRotationPoint(-2.5F, 19.0F, -1.0F);
			this.FrontRightLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
			this.ear1 = new ModelRenderer(this, 32, 5);
			this.ear1.setRotationPoint(1.7F, 1.9F, -2.5F);
			this.ear1.addBox(0.0F, 0.0F, 0.0F, 1, 6, 2, 0.0F);
			this.setRotateAngle(ear1, 0.2617993877991494F, 0.0F, -2.8797932657906435F);
			this.BackRightLeg = new ModelRenderer(this, 25, 10);
			this.BackRightLeg.mirror = true;
			this.BackRightLeg.setRotationPoint(-3.0F, 18.0F, 2.7F);
			this.BackRightLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
			this.FrontLeftLeg = new ModelRenderer(this, 36, 11);
			this.FrontLeftLeg.setRotationPoint(2.5F, 19.000000000000007F, -1.0F);
			this.FrontLeftLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
			this.ANIMATEHEAD = new ModelRenderer(this, 0, 0);
			this.ANIMATEHEAD.setRotationPoint(0.0F, 19.1F, -0.4F);
			this.ANIMATEHEAD.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
			this.ear2 = new ModelRenderer(this, 42, 4);
			this.ear2.mirror = true;
			this.ear2.setRotationPoint(-0.7F, 1.5F, -2.5F);
			this.ear2.addBox(0.0F, 0.0F, 0.0F, 1, 6, 2, 0.0F);
			this.setRotateAngle(ear2, 0.2617993877991494F, 0.0F, 2.8797932657906435F);
			this.BackLeftLeg.addChild(this.BackRightLeg2);
			this.head.addChild(this.head4);
			this.BackLeftLeg.addChild(this.BackRightLeg3);
			this.BackRightLeg.addChild(this.BackRightLeg3_1);
			this.head.addChild(this.head5);
			this.ANIMATEHEAD.addChild(this.neck);
			this.head.addChild(this.head3);
			this.BackRightLeg.addChild(this.BackRightLeg2_1);
			this.neck.addChild(this.head);
			this.head.addChild(this.head2);
			this.head.addChild(this.ear1);
			this.head.addChild(this.ear2);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			this.BackLeftLeg.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.Tail.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.Body.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.FrontRightLeg.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.BackRightLeg.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.FrontLeftLeg.render(ms, vb, i1, i2, f1, f2, f3, f4);
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
			this.BackRightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.FrontRightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}
}
