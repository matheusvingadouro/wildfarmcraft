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

import net.mcreator.wildfarmcraft.entity.MouflonLambEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MouflonLambRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MouflonLambEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelHampshireLamb(), 0.6f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("wildfarmcraft:textures/mouflonlamb.png");
					}
				};
			});
		}
	}

	/**
	 * HampshireLamb - Matheus Created using Tabula 7.1.0
	 */
	public static class ModelHampshireLamb extends EntityModel<Entity> {
		public ModelRenderer Tail;
		public ModelRenderer body;
		public ModelRenderer BackRightLeg;
		public ModelRenderer BackLeftLeg;
		public ModelRenderer FrontRightLeg;
		public ModelRenderer FrontLeftLeg;
		public ModelRenderer ANIMATEHEAD;
		public ModelRenderer neck;
		public ModelRenderer head;
		public ModelRenderer head2;
		public ModelRenderer head3;
		public ModelRenderer head4;
		public ModelRenderer head5;
		public ModelRenderer ear1;
		public ModelRenderer ear2;
		public ModelHampshireLamb() {
			this.textureWidth = 128;
			this.textureHeight = 128;
			this.ANIMATEHEAD = new ModelRenderer(this, 0, 0);
			this.ANIMATEHEAD.setRotationPoint(0.0F, 14.5F, -3.4F);
			this.ANIMATEHEAD.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
			this.head3 = new ModelRenderer(this, 50, 1);
			this.head3.setRotationPoint(0.0F, 4.5F, -5.2F);
			this.head3.addBox(-1.0F, -1.0F, 1.0F, 2, 1, 3, 0.0F);
			this.setRotateAngle(head3, 0.17453292519943295F, 0.0F, 0.0F);
			this.body = new ModelRenderer(this, 28, 8);
			this.body.setRotationPoint(-2.5F, 13.5F, -3.799999952316284F);
			this.body.addBox(0.0F, 0.0F, 0.0F, 5, 5, 9, 0.0F);
			this.BackLeftLeg = new ModelRenderer(this, 65, 11);
			this.BackLeftLeg.setRotationPoint(0.52F, 18.0F, 4.0F);
			this.BackLeftLeg.addBox(0.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
			this.head = new ModelRenderer(this, 0, 0);
			this.head.setRotationPoint(0.0F, -1.8F, -5.5F);
			this.head.addBox(-2.0F, 0.0F, -3.0F, 4, 4, 3, 0.0F);
			this.setRotateAngle(head, 0.9599310885968813F, 0.0F, 0.0F);
			this.head4 = new ModelRenderer(this, 0, 8);
			this.head4.setRotationPoint(-1.5F, -0.5F, -2.5F);
			this.head4.addBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F);
			this.Tail = new ModelRenderer(this, 14, 17);
			this.Tail.setRotationPoint(-0.5F, 13.7F, 5.0F);
			this.Tail.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
			this.setRotateAngle(Tail, -1.0122909661567112F, 0.0F, 0.0F);
			this.FrontRightLeg = new ModelRenderer(this, 65, 11);
			this.FrontRightLeg.mirror = true;
			this.FrontRightLeg.setRotationPoint(-2.52F, 18.0F, -2.5F);
			this.FrontRightLeg.addBox(0.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
			this.head2 = new ModelRenderer(this, 61, 1);
			this.head2.setRotationPoint(0.0F, 3.4F, -4.7F);
			this.head2.addBox(-1.0F, -1.0F, 1.0F, 2, 2, 3, 0.0F);
			this.setRotateAngle(head2, 0.8377580409572781F, 0.0F, 0.0F);
			this.head5 = new ModelRenderer(this, 35, 0);
			this.head5.setRotationPoint(-0.5F, 2.0F, -5.9F);
			this.head5.addBox(-1.0F, 0.0F, 1.0F, 3, 2, 3, 0.0F);
			this.setRotateAngle(head5, 0.08726646259971647F, 0.0F, 0.0F);
			this.ear1 = new ModelRenderer(this, 18, 0);
			this.ear1.setRotationPoint(3.3F, -0.3F, -2.0F);
			this.ear1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
			this.setRotateAngle(ear1, 0.08726646259971647F, 0.0F, 1.3089969389957472F);
			this.BackRightLeg = new ModelRenderer(this, 65, 11);
			this.BackRightLeg.mirror = true;
			this.BackRightLeg.setRotationPoint(-2.52F, 18.0F, 4.0F);
			this.BackRightLeg.addBox(0.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
			this.FrontLeftLeg = new ModelRenderer(this, 65, 11);
			this.FrontLeftLeg.setRotationPoint(0.52F, 18.0F, -2.5F);
			this.FrontLeftLeg.addBox(0.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
			this.ear2 = new ModelRenderer(this, 18, 0);
			this.ear2.setRotationPoint(-3.7F, 0.6F, -2.0F);
			this.ear2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
			this.setRotateAngle(ear2, 0.08726646259971647F, 0.0F, -1.3089969389957472F);
			this.neck = new ModelRenderer(this, 0, 25);
			this.neck.setRotationPoint(0.0F, 2.0F, 1.1F);
			this.neck.addBox(-1.5F, -1.5F, -6.0F, 3, 3, 6, 0.0F);
			this.setRotateAngle(neck, -1.0471975511965976F, 0.0F, 0.0F);
			this.head.addChild(this.head3);
			this.neck.addChild(this.head);
			this.head.addChild(this.head4);
			this.head.addChild(this.head2);
			this.head.addChild(this.head5);
			this.head.addChild(this.ear1);
			this.head.addChild(this.ear2);
			this.ANIMATEHEAD.addChild(this.neck);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			this.ANIMATEHEAD.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.body.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.BackLeftLeg.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.Tail.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.FrontRightLeg.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.BackRightLeg.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.FrontLeftLeg.render(ms, vb, i1, i2, f1, f2, f3, f4);
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
