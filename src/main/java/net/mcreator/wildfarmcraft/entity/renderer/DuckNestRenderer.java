package net.mcreator.wildfarmcraft.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.wildfarmcraft.entity.DuckNestEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DuckNestRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DuckNestEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelnest(), 0f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("wildfarmcraft:textures/nest.png");
					}
				};
			});
		}
	}

	/**
	 * nest - Matheus Created using Tabula 7.1.0
	 */
	public static class Modelnest extends EntityModel<Entity> {
		public ModelRenderer straw1;
		public ModelRenderer straw2;
		public ModelRenderer straw3;
		public ModelRenderer straw4;
		public ModelRenderer straw5;
		public ModelRenderer egg1;
		public ModelRenderer egg2;
		public ModelRenderer egg3;
		public ModelRenderer egg12;
		public ModelRenderer egg22;
		public ModelRenderer egg32;
		public Modelnest() {
			this.textureWidth = 64;
			this.textureHeight = 64;
			this.straw5 = new ModelRenderer(this, 36, 8);
			this.straw5.setRotationPoint(4.0F, 21.1F, -4.01F);
			this.straw5.addBox(0.0F, 0.0F, 0.0F, 2, 3, 8, 0.0F);
			this.setRotateAngle(straw5, 0.0F, 0.0F, 0.6457718232379019F);
			this.straw4 = new ModelRenderer(this, 24, 5);
			this.straw4.setRotationPoint(-5.6F, 22.3F, -4.01F);
			this.straw4.addBox(0.0F, 0.0F, 0.0F, 2, 3, 8, 0.0F);
			this.setRotateAngle(straw4, 0.0F, 0.0F, -0.6457718232379019F);
			this.egg32 = new ModelRenderer(this, 50, 0);
			this.egg32.setRotationPoint(0.5F, -0.3F, 0.5F);
			this.egg32.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
			this.egg22 = new ModelRenderer(this, 46, 0);
			this.egg22.setRotationPoint(0.5F, -0.3F, 0.5F);
			this.egg22.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
			this.straw2 = new ModelRenderer(this, 24, 0);
			this.straw2.setRotationPoint(-4.01F, 22.3F, -5.7F);
			this.straw2.addBox(0.0F, 0.0F, 0.0F, 8, 3, 2, 0.0F);
			this.setRotateAngle(straw2, 0.6457718232379019F, 0.0F, 0.0F);
			this.egg12 = new ModelRenderer(this, 42, 0);
			this.egg12.setRotationPoint(0.5F, -0.3F, 0.5F);
			this.egg12.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
			this.straw1 = new ModelRenderer(this, 0, 0);
			this.straw1.setRotationPoint(0.0F, 23.0F, 0.0F);
			this.straw1.addBox(-4.0F, 0.0F, -4.0F, 8, 1, 8, 0.0F);
			this.straw3 = new ModelRenderer(this, 42, 3);
			this.straw3.setRotationPoint(-4.01F, 21.1F, 4.0F);
			this.straw3.addBox(0.0F, 0.0F, 0.0F, 8, 3, 2, 0.0F);
			this.setRotateAngle(straw3, -0.6457718232379019F, 0.0F, 0.0F);
			this.egg1 = new ModelRenderer(this, 0, 0);
			this.egg1.setRotationPoint(0.9F, 20.9F, 0.6F);
			this.egg1.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
			this.setRotateAngle(egg1, -0.24434609527920614F, 0.0F, 0.0F);
			this.egg3 = new ModelRenderer(this, 48, 8);
			this.egg3.setRotationPoint(-2.6F, 21.8F, -1.3F);
			this.egg3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
			this.setRotateAngle(egg3, 0.13962634015954636F, -0.19198621771937624F, -0.5061454830783556F);
			this.egg2 = new ModelRenderer(this, 36, 6);
			this.egg2.setRotationPoint(1.3F, 21.4F, -3.5F);
			this.egg2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
			this.setRotateAngle(egg2, 0.08726646259971647F, -0.5235987755982988F, 0.41887902047863906F);
			this.egg3.addChild(this.egg32);
			this.egg2.addChild(this.egg22);
			this.egg1.addChild(this.egg12);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			this.straw5.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.straw4.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.straw2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.straw1.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.straw3.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.egg1.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.egg3.render(ms, vb, i1, i2, f1, f2, f3, f4);
			this.egg2.render(ms, vb, i1, i2, f1, f2, f3, f4);
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
		}
	}
}
