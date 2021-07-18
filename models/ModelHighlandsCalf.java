
/**
 * HighlandsCalf - Matheus Created using Tabula 7.1.0
 */
public static class ModelHighlandsCalf extends ModelBase {
	public ModelRenderer Body;
	public ModelRenderer ANIMATEHEAD;
	public ModelRenderer BackRightLeg;
	public ModelRenderer BackLeftLeg;
	public ModelRenderer FrontLeftLeg;
	public ModelRenderer FrontRightLeg;
	public ModelRenderer Tail1;
	public ModelRenderer fur;
	public ModelRenderer Tail2;
	public ModelRenderer Tail3;
	public ModelRenderer Neck;
	public ModelRenderer Head1;
	public ModelRenderer Head2;
	public ModelRenderer Head3;
	public ModelRenderer Head4;
	public ModelRenderer Mouth;
	public ModelRenderer RightEar;
	public ModelRenderer LeftEar;
	public ModelRenderer headfur;

	public ModelHighlandsCalf() {
		this.textureWidth = 128;
		this.textureHeight = 128;
		this.Head3 = new ModelRenderer(this, 19, 22);
		this.Head3.setRotationPoint(1.5F, 2.4F, -8.9F);
		this.Head3.addBox(-3.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
		this.setRotateAngle(Head3, 0.3490658503988659F, 0.0F, 0.0F);
		this.Head1 = new ModelRenderer(this, 36, 0);
		this.Head1.setRotationPoint(0.0F, -5.2F, -4.9F);
		this.Head1.addBox(-3.0F, 0.0F, -7.0F, 6, 6, 6, 0.0F);
		this.setRotateAngle(Head1, 0.9075712110370513F, 0.0F, 0.0F);
		this.fur = new ModelRenderer(this, 70, 70);
		this.fur.setRotationPoint(-0.5F, -0.5F, -0.5F);
		this.fur.addBox(0.0F, 0.0F, 0.0F, 9, 10, 15, 0.0F);
		this.headfur = new ModelRenderer(this, 90, 0);
		this.headfur.setRotationPoint(-3.51F, -0.2F, -7.5F);
		this.headfur.addBox(0.0F, 0.0F, 0.0F, 7, 5, 6, 0.0F);
		this.Neck = new ModelRenderer(this, 30, 26);
		this.Neck.setRotationPoint(0.0F, 1.1F, 0.0F);
		this.Neck.addBox(-2.5F, -4.0F, -6.0F, 5, 6, 6, 0.0F);
		this.setRotateAngle(Neck, -0.767944870877505F, 0.0F, 0.0F);
		this.Mouth = new ModelRenderer(this, 41, 19);
		this.Mouth.setRotationPoint(1.5F, 5.1F, -9.5F);
		this.Mouth.addBox(-3.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F);
		this.setRotateAngle(Mouth, 0.06981317007977318F, -0.0F, 0.0F);
		this.Tail3 = new ModelRenderer(this, 5, 77);
		this.Tail3.setRotationPoint(-0.01F, 4.8F, -0.0F);
		this.Tail3.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
		this.ANIMATEHEAD = new ModelRenderer(this, 0, 120);
		this.ANIMATEHEAD.setRotationPoint(0.0F, 11.0F, -5.5F);
		this.ANIMATEHEAD.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
		this.FrontRightLeg = new ModelRenderer(this, 0, 51);
		this.FrontRightLeg.mirror = true;
		this.FrontRightLeg.setRotationPoint(1.75F, 6.5F, 2.5F);
		this.FrontRightLeg.addBox(-1.5F, 0.0F, -1.5F, 2, 9, 3, 0.0F);
		this.Body = new ModelRenderer(this, 77, 41);
		this.Body.setRotationPoint(-4.0F, 8.5F, -7.0F);
		this.Body.addBox(0.0F, 0.0F, 0.0F, 8, 7, 14, 0.0F);
		this.BackRightLeg = new ModelRenderer(this, 0, 51);
		this.BackRightLeg.mirror = true;
		this.BackRightLeg.setRotationPoint(1.75F, 6.5F, 12.0F);
		this.BackRightLeg.addBox(-1.5F, 0.0F, -1.5F, 2, 9, 3, 0.0F);
		this.Tail2 = new ModelRenderer(this, 0, 68);
		this.Tail2.mirror = true;
		this.Tail2.setRotationPoint(0.01F, 2.0F, 0.3F);
		this.Tail2.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
		this.setRotateAngle(Tail2, -0.47472955654245763F, 0.0F, -0.03490658503988659F);
		this.FrontLeftLeg = new ModelRenderer(this, 0, 51);
		this.FrontLeftLeg.setRotationPoint(7.25F, 6.5F, 2.5F);
		this.FrontLeftLeg.addBox(-1.5F, 0.0F, -1.5F, 2, 9, 3, 0.0F);
		this.RightEar = new ModelRenderer(this, 0, 31);
		this.RightEar.setRotationPoint(-2.0F, 0.1F, -3.8F);
		this.RightEar.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
		this.setRotateAngle(RightEar, 0.0F, -0.0F, 0.20943951023931953F);
		this.Tail1 = new ModelRenderer(this, 10, 68);
		this.Tail1.setRotationPoint(3.0F, 1.3F, 12.1F);
		this.Tail1.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(Tail1, 0.6806784082777886F, -0.0F, 0.0F);
		this.Head2 = new ModelRenderer(this, 0, 0);
		this.Head2.setRotationPoint(-0.0F, 1.0F, -4.5F);
		this.Head2.addBox(-2.0F, 1.33F, -5.5F, 4, 3, 5, 0.0F);
		this.LeftEar = new ModelRenderer(this, 0, 22);
		this.LeftEar.setRotationPoint(5.0F, -0.6F, -3.8F);
		this.LeftEar.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
		this.setRotateAngle(LeftEar, 0.0F, 0.0F, -0.20943951023931953F);
		this.BackLeftLeg = new ModelRenderer(this, 0, 51);
		this.BackLeftLeg.setRotationPoint(7.25F, 6.5F, 12.0F);
		this.BackLeftLeg.addBox(-1.5F, 0.0F, -1.5F, 2, 9, 3, 0.0F);
		this.Head4 = new ModelRenderer(this, 67, 5);
		this.Head4.setRotationPoint(1.0F, -0.6F, -6.0F);
		this.Head4.addBox(-3.0F, 0.0F, -0.0F, 4, 1, 4, 0.0F);
		this.setRotateAngle(Head4, 0.06981317007977318F, -0.0F, 0.0F);
		this.Head1.addChild(this.Head3);
		this.Neck.addChild(this.Head1);
		this.Body.addChild(this.fur);
		this.Head1.addChild(this.headfur);
		this.ANIMATEHEAD.addChild(this.Neck);
		this.Head1.addChild(this.Mouth);
		this.Tail2.addChild(this.Tail3);
		this.Body.addChild(this.FrontRightLeg);
		this.Body.addChild(this.BackRightLeg);
		this.Tail1.addChild(this.Tail2);
		this.Body.addChild(this.FrontLeftLeg);
		this.Head1.addChild(this.RightEar);
		this.Body.addChild(this.Tail1);
		this.Head1.addChild(this.Head2);
		this.Head1.addChild(this.LeftEar);
		this.Body.addChild(this.BackLeftLeg);
		this.Head1.addChild(this.Head4);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.ANIMATEHEAD.render(f5);
		this.Body.render(f5);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.BackLeftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.FrontLeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.ANIMATEHEAD.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.ANIMATEHEAD.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.BackRightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.FrontRightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}
