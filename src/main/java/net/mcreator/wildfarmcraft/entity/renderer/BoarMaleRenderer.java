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

import net.mcreator.wildfarmcraft.entity.BoarMaleEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BoarMaleRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BoarMaleEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelBoarMale(), 0.7f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("wildfarmcraft:textures/boarmale.png");
					}
				};
			});
		}
	}

	/**
	 * BoarMale - Matheus Created using Tabula 7.1.0
	 */
	public static class ModelBoarMale extends EntityModel<Entity> {
		public ModelRenderer ANIMATEHEAD;
		public ModelRenderer neck;
		public ModelRenderer head;
		public ModelRenderer neck2;
		public ModelRenderer head2;
		public ModelRenderer head3;
		public ModelRenderer head4;
		public ModelRenderer rightear;
		public ModelRenderer leftear;
		public ModelRenderer head5;
		public ModelRenderer teethright;
		public ModelRenderer teethleft;
		public ModelRenderer rightear2;
		public ModelRenderer leftear2;
		public ModelRenderer body;
		public ModelRenderer tail;
		public ModelRenderer FrontRightLeg;
		public ModelRenderer FrontLeftLeg;
		public ModelRenderer BackRighttLeg;
		public ModelRenderer BackLeftLeg;
		public ModelRenderer body2;
		public ModelRenderer tail2;
		public ModelRenderer FrontRightLeg2;
		public ModelRenderer FrontLeftLeg2;
		public ModelRenderer BackRightLeg2;
		public ModelRenderer BackLeftLeg2;
		public ModelBoarMale() {
			this.textureWidth = 128;
			this.textureHeight = 128;
			this.FrontLeftLeg2 = new ModelRenderer(this, 0, 85);
			this.FrontLeftLeg2.setRotationPoint(-2.0F, -0.2F, -1.7F);
			this.FrontLeftLeg2.addBox(0.0F, 0.0F, 0.0F, 3, 7, 4, 0.0F);
			this.teethleft = new ModelRenderer(this, 0, 15);
			this.teethleft.setRotationPoint(2.5F, -3.5F, -3.5F);
			this.teethleft.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
			this.setRotateAngle(teethleft, 0.0F, 0.0F, 0.5410520681182421F);
			this.teethright = new ModelRenderer(this, 0, 15);
			this.teethright.setRotationPoint(-3.4F, -3.0F, -3.5F);
			this.teethright.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
			this.setRotateAngle(teethright, 0.0F, 0.0F, -0.5410520681182421F);
			this.leftear2 = new ModelRenderer(this, 25, 10);
			this.leftear2.setRotationPoint(3.7F, 0.6F, 0.0F);
			this.leftear2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
			this.FrontLeftLeg = new ModelRenderer(this, 12, 51);
			this.FrontLeftLeg.setRotationPoint(3.75F, 12.0F, -4.5F);
			this.FrontLeftLeg.addBox(-1.5F, 4.0F, -1.5F, 2, 8, 3, 0.0F);
			this.leftear = new ModelRenderer(this, 25, 0);
			this.leftear.mirror = true;
			this.leftear.setRotationPoint(-0.9F, -3.23F, -5.0F);
			this.leftear.addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
			this.setRotateAngle(leftear, 0.15707963267948966F, 0.576482251933727F, -0.6841690667817772F);
			this.body = new ModelRenderer(this, 28, 54);
			this.body.setRotationPoint(0.5F, 16.9F, -7.5F);
			this.body.addBox(-5.0F, -10.0F, 0.0F, 9, 9, 17, 0.0F);
			this.setRotateAngle(body, -0.03490658503988659F, -0.0F, 0.0F);
			this.BackLeftLeg = new ModelRenderer(this, 0, 51);
			this.BackLeftLeg.setRotationPoint(3.75F, 10.0F, 7.4F);
			this.BackLeftLeg.addBox(-1.5F, 3.0F, -1.5F, 2, 11, 3, 0.0F);
			this.tail = new ModelRenderer(this, 44, 0);
			this.tail.setRotationPoint(2.0F, 9.5F, 10.6F);
			this.tail.addBox(-2.5F, 0.0F, -2.0F, 1, 1, 4, 0.0F);
			this.setRotateAngle(tail, -1.1344640137963142F, -0.0F, 0.0F);
			this.BackRightLeg2 = new ModelRenderer(this, 0, 70);
			this.BackRightLeg2.mirror = true;
			this.BackRightLeg2.setRotationPoint(-2.0F, 0.0F, -2.2F);
			this.BackRightLeg2.addBox(0.0F, 0.0F, 0.0F, 3, 8, 4, 0.0F);
			this.neck2 = new ModelRenderer(this, 0, 36);
			this.neck2.setRotationPoint(-1.5F, -6.8F, -4.8F);
			this.neck2.addBox(0.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F);
			this.tail2 = new ModelRenderer(this, 56, 0);
			this.tail2.setRotationPoint(-2.4F, 0.0F, 1.8F);
			this.tail2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
			this.setRotateAngle(tail2, -0.3490658503988659F, -0.0F, 0.0F);
			this.ANIMATEHEAD = new ModelRenderer(this, 0, 0);
			this.ANIMATEHEAD.setRotationPoint(0.0F, 9.5F, -5.0F);
			this.ANIMATEHEAD.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
			this.head5 = new ModelRenderer(this, 18, 20);
			this.head5.setRotationPoint(-2.5F, -5.0F, -7.0F);
			this.head5.addBox(0.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F);
			this.rightear2 = new ModelRenderer(this, 25, 10);
			this.rightear2.setRotationPoint(-0.9F, 0.6F, -0.1F);
			this.rightear2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
			this.head4 = new ModelRenderer(this, 78, 37);
			this.head4.setRotationPoint(-1.0F, 3.0F, -6.3F);
			this.head4.addBox(-1.5F, -1.0F, -5.0F, 3, 1, 5, 0.0F);
			this.setRotateAngle(head4, 0.06981317007977318F, -0.0F, 0.0F);
			this.rightear = new ModelRenderer(this, 25, 0);
			this.rightear.mirror = true;
			this.rightear.setRotationPoint(-4.0F, -5.53F, -7.4F);
			this.rightear.addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
			this.setRotateAngle(rightear, 0.15707963267948966F, -0.576482251933727F, 0.6841690667817772F);
			this.FrontRightLeg = new ModelRenderer(this, 12, 51);
			this.FrontRightLeg.mirror = true;
			this.FrontRightLeg.setRotationPoint(-2.75F, 12.0F, -4.5F);
			this.FrontRightLeg.addBox(-1.5F, 4.0F, -1.5F, 2, 8, 3, 0.0F);
			this.head3 = new ModelRenderer(this, 55, 37);
			this.head3.setRotationPoint(1.0F, 3.0F, -4.0F);
			this.head3.addBox(-4.0F, -4.0F, -8.0F, 4, 3, 6, 0.0F);
			this.setRotateAngle(head3, 0.08726646259971647F, -0.0F, 0.0F);
			this.BackLeftLeg2 = new ModelRenderer(this, 0, 70);
			this.BackLeftLeg2.setRotationPoint(-2.0F, 0.0F, -2.2F);
			this.BackLeftLeg2.addBox(0.0F, 0.0F, 0.0F, 3, 8, 4, 0.0F);
			this.head2 = new ModelRenderer(this, 37, 37);
			this.head2.setRotationPoint(1.5F, -2.5F, -2.5F);
			this.head2.addBox(-4.0F, -4.0F, -8.0F, 3, 3, 6, 0.0F);
			this.setRotateAngle(head2, 0.7504915783575618F, 0.0F, 0.0F);
			this.neck = new ModelRenderer(this, 70, 17);
			this.neck.setRotationPoint(0.0F, 3.6F, 0.0F);
			this.neck.addBox(-3.5F, -6.0F, -5.0F, 7, 8, 5, 0.0F);
			this.setRotateAngle(neck, -0.22689280275926282F, -0.0F, 0.0F);
			this.BackRighttLeg = new ModelRenderer(this, 0, 51);
			this.BackRighttLeg.mirror = true;
			this.BackRighttLeg.setRotationPoint(-2.75F, 10.0F, 7.4F);
			this.BackRighttLeg.addBox(-1.5F, 3.0F, -1.5F, 2, 11, 3, 0.0F);
			this.body2 = new ModelRenderer(this, 0, 20);
			this.body2.setRotationPoint(-1.5F, -10.8F, 1.2F);
			this.body2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 13, 0.0F);
			this.setRotateAngle(body2, -0.06981317007977318F, 0.0F, 0.0F);
			this.FrontRightLeg2 = new ModelRenderer(this, 0, 85);
			this.FrontRightLeg2.mirror = true;
			this.FrontRightLeg2.setRotationPoint(-2.0F, -0.2F, -1.7F);
			this.FrontRightLeg2.addBox(0.0F, 0.0F, 0.0F, 3, 7, 4, 0.0F);
			this.head = new ModelRenderer(this, 0, 0);
			this.head.setRotationPoint(1.0F, -2.6F, -1.4F);
			this.head.addBox(-4.0F, -4.0F, -8.0F, 6, 7, 6, 0.0F);
			this.setRotateAngle(head, 0.2617993877991494F, 0.0F, 0.0F);
			this.FrontLeftLeg.addChild(this.FrontLeftLeg2);
			this.head4.addChild(this.teethleft);
			this.head4.addChild(this.teethright);
			this.leftear.addChild(this.leftear2);
			this.head.addChild(this.leftear);
			this.BackRighttLeg.addChild(this.BackRightLeg2);
			this.neck.addChild(this.neck2);
			this.tail.addChild(this.tail2);
			this.head.addChild(this.head5);
			this.rightear.addChild(this.rightear2);
			this.head.addChild(this.head4);
			this.head.addChild(this.rightear);
			this.head.addChild(this.head3);
			this.BackLeftLeg.addChild(this.BackLeftLeg2);
			this.head.addChild(this.head2);
			this.ANIMATEHEAD.addChild(this.neck);
			this.body.addChild(this.body2);
			this.FrontRightLeg.addChild(this.FrontRightLeg2);
			this.neck.addChild(this.head);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			this.FrontLeftLeg.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.body.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.BackLeftLeg.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.tail.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.ANIMATEHEAD.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.FrontRightLeg.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.BackRighttLeg.render(ms, vb, i1, i2, f1, f2, f3, f4);
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
			this.FrontRightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.BackLeftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.BackRighttLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}
}
