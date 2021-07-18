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

import net.mcreator.wildfarmcraft.entity.LeghornChickEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class LeghornChickRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(LeghornChickEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelLeghornChick(), 0.35f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("wildfarmcraft:textures/leghornchick.png");
					}
				};
			});
		}
	}

	/**
	 * LeghornChick - Matheus Created using Tabula 7.1.0
	 */
	public static class ModelLeghornChick extends EntityModel<Entity> {
		public ModelRenderer body;
		public ModelRenderer wing1;
		public ModelRenderer wing2;
		public ModelRenderer RightLeg;
		public ModelRenderer LeftLeg;
		public ModelRenderer ANIMATEHEAD;
		public ModelRenderer body2;
		public ModelRenderer RightFoot;
		public ModelRenderer LeftFoot;
		public ModelRenderer neck;
		public ModelRenderer head;
		public ModelRenderer beak;
		public ModelRenderer beak2;
		public ModelLeghornChick() {
			this.textureWidth = 64;
			this.textureHeight = 32;
			this.body = new ModelRenderer(this, 30, 9);
			this.body.setRotationPoint(-1.5F, 19.0F, -1.5F);
			this.body.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
			this.setRotateAngle(body, -0.17907078125461823F, 0.0F, 0.0F);
			this.LeftLeg = new ModelRenderer(this, 0, 16);
			this.LeftLeg.setRotationPoint(0.5999999999999996F, 22.0F, -0.5F);
			this.LeftLeg.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
			this.wing2 = new ModelRenderer(this, 28, 25);
			this.wing2.setRotationPoint(1.5F, 19.4F, -1.2F);
			this.wing2.addBox(0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F);
			this.setRotateAngle(wing2, 0.0F, 0.17453292519943295F, 0.0F);
			this.ANIMATEHEAD = new ModelRenderer(this, 0, 7);
			this.ANIMATEHEAD.setRotationPoint(0.0F, 20.4F, -1.0F);
			this.ANIMATEHEAD.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
			this.RightLeg = new ModelRenderer(this, 0, 16);
			this.RightLeg.setRotationPoint(-1.5999999999999996F, 22.0F, -0.5F);
			this.RightLeg.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
			this.head = new ModelRenderer(this, 0, 0);
			this.head.setRotationPoint(0.51F, -1.5F, 0.9F);
			this.head.addBox(-1.5F, -3.0F, -3.0F, 2, 2, 2, 0.0F);
			this.setRotateAngle(head, 1.1344640137963142F, 0.0F, 0.0F);
			this.body2 = new ModelRenderer(this, 30, 19);
			this.body2.setRotationPoint(0.5F, 0.1F, 3.0F);
			this.body2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
			this.setRotateAngle(body2, -0.7853981633974483F, 0.0F, 0.0F);
			this.beak2 = new ModelRenderer(this, 35, 0);
			this.beak2.mirror = true;
			this.beak2.setRotationPoint(-1.0F, -1.9F, -3.7F);
			this.beak2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
			this.setRotateAngle(beak2, 0.017453292519943295F, 0.0F, 0.0F);
			this.wing1 = new ModelRenderer(this, 28, 25);
			this.wing1.setRotationPoint(-1.5F, 19.4F, -1.4F);
			this.wing1.addBox(0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F);
			this.setRotateAngle(wing1, 0.0F, -0.17453292519943295F, 0.0F);
			this.beak = new ModelRenderer(this, 35, 0);
			this.beak.mirror = true;
			this.beak.setRotationPoint(-1.01F, -1.9F, -3.7F);
			this.beak.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
			this.setRotateAngle(beak, 0.3839724354387525F, 0.0F, 0.0F);
			this.LeftFoot = new ModelRenderer(this, 1, 23);
			this.LeftFoot.setRotationPoint(-0.5F, 1.9F, -1.01F);
			this.LeftFoot.addBox(0.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F);
			this.neck = new ModelRenderer(this, 18, 9);
			this.neck.setRotationPoint(0.0F, 0.3F, -0.9F);
			this.neck.addBox(-1.0F, -1.5F, -1.5F, 2, 2, 2, 0.0F);
			this.setRotateAngle(neck, -1.156455162371443F, 0.0F, 0.0F);
			this.RightFoot = new ModelRenderer(this, 1, 23);
			this.RightFoot.setRotationPoint(-0.5F, 1.9F, -1.01F);
			this.RightFoot.addBox(0.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F);
			this.neck.addChild(this.head);
			this.body.addChild(this.body2);
			this.head.addChild(this.beak2);
			this.head.addChild(this.beak);
			this.LeftLeg.addChild(this.LeftFoot);
			this.ANIMATEHEAD.addChild(this.neck);
			this.RightLeg.addChild(this.RightFoot);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			this.body.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.LeftLeg.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.wing2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.ANIMATEHEAD.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.RightLeg.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.wing1.render(ms, vb, i1, i2, f1, f2, f3, f4);
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
			this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.ANIMATEHEAD.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.ANIMATEHEAD.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
