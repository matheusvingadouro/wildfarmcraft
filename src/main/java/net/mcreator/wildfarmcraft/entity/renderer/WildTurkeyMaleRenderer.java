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

import net.mcreator.wildfarmcraft.entity.WildTurkeyMaleEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WildTurkeyMaleRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WildTurkeyMaleEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelTurkeyWildMale(), 0.4f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("wildfarmcraft:textures/turkeywildmale.png");
					}
				};
			});
		}
	}

	/**
	 * TurkeyWildMale - Matheus Created using Tabula 7.1.0
	 */
	public static class ModelTurkeyWildMale extends EntityModel<Entity> {
		public ModelRenderer body2;
		public ModelRenderer animatehead;
		public ModelRenderer chestfeather;
		public ModelRenderer neck;
		public ModelRenderer head;
		public ModelRenderer beak;
		public ModelRenderer beak2;
		public ModelRenderer beak3;
		public ModelRenderer body;
		public ModelRenderer body3;
		public ModelRenderer wing1;
		public ModelRenderer wing2;
		public ModelRenderer Tail1;
		public ModelRenderer Tail2;
		public ModelRenderer Tail3;
		public ModelRenderer Tail4;
		public ModelRenderer Tail5;
		public ModelRenderer LeftLeg2;
		public ModelRenderer RightLeg2;
		public ModelRenderer fantail;
		public ModelRenderer LeftLeg1;
		public ModelRenderer LeftLeg3;
		public ModelRenderer RightLeg1;
		public ModelRenderer RightLeg3;
		public ModelTurkeyWildMale() {
			this.textureWidth = 128;
			this.textureHeight = 64;
			this.wing1 = new ModelRenderer(this, 94, 13);
			this.wing1.setRotationPoint(-3.0F, 12.7F, -2.0F);
			this.wing1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 7, 0.0F);
			this.setRotateAngle(wing1, -0.04258603374866164F, -0.2937389131106456F, 0.14590952546672595F);
			this.Tail4 = new ModelRenderer(this, 16, 0);
			this.Tail4.setRotationPoint(-5.0F, 8.7F, 10.0F);
			this.Tail4.addBox(0.0F, 0.0F, 0.0F, 2, 8, 0, 0.0F);
			this.setRotateAngle(Tail4, -0.5235987755982988F, -0.0F, -0.41887902047863906F);
			this.RightLeg2 = new ModelRenderer(this, 52, 11);
			this.RightLeg2.setRotationPoint(-2.5F, 18.3F, 1.5F);
			this.RightLeg2.addBox(0.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
			this.LeftLeg2 = new ModelRenderer(this, 52, 11);
			this.LeftLeg2.setRotationPoint(0.5F, 18.3F, 1.5F);
			this.LeftLeg2.addBox(0.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
			this.RightLeg1 = new ModelRenderer(this, 0, 16);
			this.RightLeg1.setRotationPoint(2.5F, 2.3F, 1.3F);
			this.RightLeg1.addBox(-2.0F, 0.0F, -1.5F, 1, 4, 1, 0.0F);
			this.setRotateAngle(RightLeg1, -0.33161255787892263F, -0.0F, 0.0F);
			this.chestfeather = new ModelRenderer(this, 90, 0);
			this.chestfeather.setRotationPoint(2.5F, 1.5F, 1.3F);
			this.chestfeather.addBox(0.0F, 0.0F, 0.0F, 0, 3, 5, 0.0F);
			this.setRotateAngle(chestfeather, -0.5759586531581287F, 0.0F, 0.0F);
			this.beak3 = new ModelRenderer(this, 30, 0);
			this.beak3.setRotationPoint(-2.7F, -2.67F, -7.5F);
			this.beak3.addBox(0.0F, -1.0F, 0.0F, 1, 3, 1, 0.0F);
			this.LeftLeg3 = new ModelRenderer(this, 7, 17);
			this.LeftLeg3.setRotationPoint(-3.0F, 4.6F, -3.5F);
			this.LeftLeg3.addBox(0.0F, 0.0F, 0.0F, 3, 0, 5, 0.0F);
			this.setRotateAngle(LeftLeg3, 0.33161255787892263F, 0.0F, 0.0F);
			this.beak = new ModelRenderer(this, 35, 0);
			this.beak.setRotationPoint(-2.0F, -2.1F, -9.5F);
			this.beak.addBox(-1.0F, -1.0F, 1.0F, 1, 1, 3, 0.0F);
			this.body3 = new ModelRenderer(this, 67, 14);
			this.body3.setRotationPoint(-2.5F, 14.5F, 1.7F);
			this.body3.addBox(0.0F, 0.0F, 0.0F, 5, 4, 5, 0.0F);
			this.setRotateAngle(body3, 0.20943951023931953F, -0.0F, 0.0F);
			this.head = new ModelRenderer(this, 0, 0);
			this.head.setRotationPoint(2.5F, 4.9F, 1.8F);
			this.head.addBox(-4.0F, -5.0F, -7.0F, 3, 3, 3, 0.0F);
			this.setRotateAngle(head, -1.3416345960080411F, -0.0F, 0.0F);
			this.animatehead = new ModelRenderer(this, 0, 0);
			this.animatehead.setRotationPoint(0.0F, 14.0F, -4.0F);
			this.animatehead.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
			this.beak2 = new ModelRenderer(this, 35, 0);
			this.beak2.setRotationPoint(-2.01F, -1.7F, -9.5F);
			this.beak2.addBox(-1.0F, -1.0F, 1.0F, 1, 1, 3, 0.0F);
			this.setRotateAngle(beak2, 0.3384193419617005F, -0.0F, 0.0F);
			this.Tail2 = new ModelRenderer(this, 16, 0);
			this.Tail2.setRotationPoint(5.7F, 10.4F, 10.5F);
			this.Tail2.addBox(0.0F, 0.0F, 0.0F, 2, 8, 0, 0.0F);
			this.setRotateAngle(Tail2, -0.47123889803846897F, -0.0F, 0.7853981633974483F);
			this.RightLeg3 = new ModelRenderer(this, 7, 17);
			this.RightLeg3.setRotationPoint(-3.0F, 4.6F, -3.5F);
			this.RightLeg3.addBox(0.0F, 0.0F, 0.0F, 3, 0, 5, 0.0F);
			this.setRotateAngle(RightLeg3, 0.33161255787892263F, 0.0F, 0.0F);
			this.fantail = new ModelRenderer(this, 0, 35);
			this.fantail.setRotationPoint(-3.5F, 3.5F, 4.5F);
			this.fantail.addBox(0.0F, 0.0F, 0.0F, 12, 11, 0, 0.0F);
			this.setRotateAngle(fantail, 2.6179938779914944F, 0.0F, 0.0F);
			this.wing2 = new ModelRenderer(this, 94, 13);
			this.wing2.mirror = true;
			this.wing2.setRotationPoint(2.0F, 13.0F, -2.0F);
			this.wing2.addBox(0.0F, 0.0F, 0.0F, 1, 5, 7, 0.0F);
			this.setRotateAngle(wing2, -0.04258603374866164F, 0.2937389131106456F, -0.14590952546672595F);
			this.Tail5 = new ModelRenderer(this, 16, 0);
			this.Tail5.setRotationPoint(-7.1F, 11.7F, 10.5F);
			this.Tail5.addBox(0.0F, 0.0F, 0.0F, 2, 8, 0, 0.0F);
			this.setRotateAngle(Tail5, -0.47123889803846897F, -0.0F, -0.7853981633974483F);
			this.neck = new ModelRenderer(this, 0, 23);
			this.neck.setRotationPoint(0.0F, -0.6F, 0.8F);
			this.neck.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 5, 0.0F);
			this.setRotateAngle(neck, 1.4311699866353502F, 0.0F, 0.0F);
			this.body2 = new ModelRenderer(this, 67, 2);
			this.body2.setRotationPoint(-2.5F, 12.0F, -2.5F);
			this.body2.addBox(0.0F, 0.0F, 0.0F, 5, 4, 5, 0.0F);
			this.setRotateAngle(body2, -0.9644689446520665F, -0.0F, 0.0F);
			this.LeftLeg1 = new ModelRenderer(this, 0, 16);
			this.LeftLeg1.setRotationPoint(2.5F, 2.3F, 1.3F);
			this.LeftLeg1.addBox(-2.0F, 0.0F, -1.5F, 1, 4, 1, 0.0F);
			this.setRotateAngle(LeftLeg1, -0.33161255787892263F, -0.0F, 0.0F);
			this.body = new ModelRenderer(this, 28, 8);
			this.body.setRotationPoint(1.0F, 12.0F, -2.8F);
			this.body.addBox(-4.0F, 0.0F, 0.0F, 6, 7, 9, 0.0F);
			this.setRotateAngle(body, -0.07435102613495843F, -0.0F, 0.0F);
			this.Tail1 = new ModelRenderer(this, 16, 0);
			this.Tail1.setRotationPoint(-1.0F, 7.0F, 10.0F);
			this.Tail1.addBox(0.0F, 0.0F, 0.0F, 2, 8, 0, 0.0F);
			this.setRotateAngle(Tail1, -0.5235987755982988F, -0.0F, -0.017453292519943295F);
			this.Tail3 = new ModelRenderer(this, 16, 0);
			this.Tail3.setRotationPoint(3.0F, 8.0F, 9.8F);
			this.Tail3.addBox(0.0F, 0.0F, 0.0F, 2, 8, 0, 0.0F);
			this.setRotateAngle(Tail3, -0.5235987755982988F, -0.0F, 0.3141592653589793F);
			this.RightLeg2.addChild(this.RightLeg1);
			this.body2.addChild(this.chestfeather);
			this.head.addChild(this.beak3);
			this.LeftLeg1.addChild(this.LeftLeg3);
			this.head.addChild(this.beak);
			this.neck.addChild(this.head);
			this.head.addChild(this.beak2);
			this.RightLeg1.addChild(this.RightLeg3);
			this.body3.addChild(this.fantail);
			this.animatehead.addChild(this.neck);
			this.LeftLeg2.addChild(this.LeftLeg1);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			this.wing1.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.Tail4.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.RightLeg2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.LeftLeg2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.body3.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.animatehead.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.Tail2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.wing2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.Tail5.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.body2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.body.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.Tail1.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.Tail3.render(ms, vb, i1, i2, f1, f2, f3, f4);
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
			this.RightLeg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.LeftLeg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.animatehead.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.animatehead.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}
}
