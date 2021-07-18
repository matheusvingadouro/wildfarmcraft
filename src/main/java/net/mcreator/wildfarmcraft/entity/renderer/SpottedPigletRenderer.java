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

import net.mcreator.wildfarmcraft.entity.SpottedPigletEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SpottedPigletRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SpottedPigletEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelPigBaby(), 0.6f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("wildfarmcraft:textures/spottedpigbaby.png");
					}
				};
			});
		}
	}

	/**
	 * PigBaby - Matheus Created using Tabula 7.1.0
	 */
	public static class ModelPigBaby extends EntityModel<Entity> {
		public ModelRenderer Tail;
		public ModelRenderer body;
		public ModelRenderer BackRightLeg;
		public ModelRenderer BackLeftLeg;
		public ModelRenderer FrontRightLeg;
		public ModelRenderer FrontLeftLeg;
		public ModelRenderer ANIMATEHEAD;
		public ModelRenderer Tail2;
		public ModelRenderer neck;
		public ModelRenderer head;
		public ModelRenderer head2;
		public ModelRenderer head3;
		public ModelRenderer head4;
		public ModelRenderer leftear;
		public ModelRenderer rightear;
		public ModelRenderer leftear2;
		public ModelRenderer rightear2;
		public ModelPigBaby() {
			this.textureWidth = 128;
			this.textureHeight = 128;
			this.head2 = new ModelRenderer(this, 50, 1);
			this.head2.setRotationPoint(-2.0F, -0.9F, -9.2F);
			this.head2.addBox(-1.0F, -1.0F, 1.0F, 2, 2, 3, 0.0F);
			this.setRotateAngle(head2, 0.45378560551852565F, -0.0F, 0.0F);
			this.BackRightLeg = new ModelRenderer(this, 65, 11);
			this.BackRightLeg.mirror = true;
			this.BackRightLeg.setRotationPoint(-1.48F, 19.0F, 3.9F);
			this.BackRightLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
			this.head4 = new ModelRenderer(this, 35, 0);
			this.head4.setRotationPoint(-2.5F, -2.5F, -10.3F);
			this.head4.addBox(-1.0F, 0.0F, 1.0F, 3, 2, 3, 0.0F);
			this.BackLeftLeg = new ModelRenderer(this, 65, 11);
			this.BackLeftLeg.setRotationPoint(1.48F, 19.0F, 3.9F);
			this.BackLeftLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
			this.head3 = new ModelRenderer(this, 50, 1);
			this.head3.setRotationPoint(-2.0F, 0.01F, -9.7F);
			this.head3.addBox(-1.0F, -1.0F, 1.0F, 2, 1, 3, 0.0F);
			this.rightear2 = new ModelRenderer(this, 18, 3);
			this.rightear2.setRotationPoint(-0.3F, 0.4F, -1.2F);
			this.rightear2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
			this.setRotateAngle(rightear2, 0.0F, -0.9599310885968813F, 0.0F);
			this.body = new ModelRenderer(this, 28, 8);
			this.body.setRotationPoint(1.5F, 14.3F, -3.8F);
			this.body.addBox(-4.0F, 0.0F, 0.0F, 5, 5, 9, 0.0F);
			this.Tail = new ModelRenderer(this, 14, 17);
			this.Tail.mirror = true;
			this.Tail.setRotationPoint(-0.5F, 14.8F, 5.2F);
			this.Tail.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
			this.setRotateAngle(Tail, -1.0471975511965976F, -0.0F, 0.0F);
			this.FrontLeftLeg = new ModelRenderer(this, 65, 20);
			this.FrontLeftLeg.setRotationPoint(1.48F, 19.0F, -2.0F);
			this.FrontLeftLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
			this.ANIMATEHEAD = new ModelRenderer(this, 0, 0);
			this.ANIMATEHEAD.setRotationPoint(0.0F, 16.0F, -2.0F);
			this.ANIMATEHEAD.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
			this.neck = new ModelRenderer(this, 0, 25);
			this.neck.setRotationPoint(0.0F, 2.0F, 1.2F);
			this.neck.addBox(-1.5F, -3.0F, -5.0F, 3, 5, 4, 0.0F);
			this.setRotateAngle(neck, -0.5759586531581287F, 0.0F, 0.0F);
			this.Tail2 = new ModelRenderer(this, 18, 22);
			this.Tail2.mirror = true;
			this.Tail2.setRotationPoint(0.5F, -3.0F, 0.2F);
			this.Tail2.addBox(0.0F, 0.0F, 0.0F, 0, 5, 5, 0.0F);
			this.leftear2 = new ModelRenderer(this, 18, 3);
			this.leftear2.setRotationPoint(1.1F, 0.4F, 0.5F);
			this.leftear2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
			this.setRotateAngle(leftear2, 0.0F, 0.9599310885968813F, 0.0F);
			this.FrontRightLeg = new ModelRenderer(this, 65, 20);
			this.FrontRightLeg.mirror = true;
			this.FrontRightLeg.setRotationPoint(-1.48F, 19.0F, -2.0F);
			this.FrontRightLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
			this.leftear = new ModelRenderer(this, 15, 0);
			this.leftear.setRotationPoint(-0.9F, -5.0F, -5.0F);
			this.leftear.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
			this.setRotateAngle(leftear, 0.0F, -0.0F, -0.45378560551852565F);
			this.rightear = new ModelRenderer(this, 15, 0);
			this.rightear.mirror = true;
			this.rightear.setRotationPoint(-5.1F, -5.9F, -5.0F);
			this.rightear.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
			this.setRotateAngle(rightear, 0.0F, -0.0F, 0.45378560551852565F);
			this.head = new ModelRenderer(this, 0, 0);
			this.head.setRotationPoint(2.0F, -0.9F, 0.2F);
			this.head.addBox(-4.0F, -5.0F, -7.0F, 4, 5, 4, 0.0F);
			this.setRotateAngle(head, 0.593411945678072F, 0.0F, 0.0F);
			this.head.addChild(this.head2);
			this.head.addChild(this.head4);
			this.head.addChild(this.head3);
			this.rightear.addChild(this.rightear2);
			this.ANIMATEHEAD.addChild(this.neck);
			this.Tail.addChild(this.Tail2);
			this.leftear.addChild(this.leftear2);
			this.head.addChild(this.leftear);
			this.head.addChild(this.rightear);
			this.neck.addChild(this.head);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			this.BackRightLeg.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.BackLeftLeg.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.body.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.Tail.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.FrontLeftLeg.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.ANIMATEHEAD.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.FrontRightLeg.render(ms, vb, i1, i2, f1, f2, f3, f4);
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
