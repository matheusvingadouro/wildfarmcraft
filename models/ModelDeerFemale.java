
/**
 * DeerFemale - Matheus Created using Tabula 7.1.0
 */
public static class ModelDeerFemale extends ModelBase {
	public ModelRenderer Body;
	public ModelRenderer ANIMATEHEAD;
	public ModelRenderer Tail;
	public ModelRenderer FrontRightLeg;
	public ModelRenderer FrontLeftLeg;
	public ModelRenderer BackRightLeg;
	public ModelRenderer BackLeftLeg;
	public ModelRenderer FrontRightLeg2;
	public ModelRenderer FrontLeftLeg2;
	public ModelRenderer BackRightLeg2;
	public ModelRenderer BackRightLeg2_1;
	public ModelRenderer Neck;
	public ModelRenderer Head1;
	public ModelRenderer Head2;
	public ModelRenderer Head3;
	public ModelRenderer Mouth;
	public ModelRenderer RightEar;
	public ModelRenderer LeftEar;
	public ModelRenderer Head4;

	public ModelDeerFemale() {
		this.textureWidth = 128;
		this.textureHeight = 128;
		this.RightEar = new ModelRenderer(this, 0, 31);
		this.RightEar.setRotationPoint(-1.8F, -0.5F, -4.3F);
		this.RightEar.addBox(-3.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
		this.setRotateAngle(RightEar, 0.0F, -0.0F, 0.6981317007977318F);
		this.FrontRightLeg2 = new ModelRenderer(this, 0, 85);
		this.FrontRightLeg2.mirror = true;
		this.FrontRightLeg2.setRotationPoint(-2.0F, 1.0F, -1.7F);
		this.FrontRightLeg2.addBox(0.0F, 0.0F, 0.0F, 3, 7, 4, 0.0F);
		this.BackLeftLeg = new ModelRenderer(this, 0, 51);
		this.BackLeftLeg.setRotationPoint(7.25F, 5.5F, 17.4F);
		this.BackLeftLeg.addBox(-1.5F, 2.5F, -1.5F, 2, 12, 3, 0.0F);
		this.Head4 = new ModelRenderer(this, 67, 5);
		this.Head4.setRotationPoint(0.5F, -0.6F, -6.0F);
		this.Head4.addBox(-3.0F, 0.0F, -0.0F, 4, 1, 3, 0.0F);
		this.setRotateAngle(Head4, 0.06981317007977318F, -0.0F, 0.0F);
		this.Tail = new ModelRenderer(this, 30, 68);
		this.Tail.setRotationPoint(3.5F, 3.3F, 17.3F);
		this.Tail.addBox(-0.5F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
		this.setRotateAngle(Tail, 2.0943951023931953F, -0.0F, 0.0F);
		this.Head3 = new ModelRenderer(this, 19, 22);
		this.Head3.setRotationPoint(1.0F, 1.4F, -10.3F);
		this.Head3.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
		this.setRotateAngle(Head3, 0.2617993877991494F, 0.0F, 0.0F);
		this.Mouth = new ModelRenderer(this, 41, 19);
		this.Mouth.setRotationPoint(1.0F, 4.1F, -10.0F);
		this.Mouth.addBox(-3.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F);
		this.setRotateAngle(Mouth, 0.06981317007977318F, -0.0F, 0.0F);
		this.FrontLeftLeg = new ModelRenderer(this, 0, 51);
		this.FrontLeftLeg.setRotationPoint(7.25F, 5.5F, 2.0F);
		this.FrontLeftLeg.addBox(-1.5F, 2.5F, -1.5F, 2, 12, 3, 0.0F);
		this.FrontLeftLeg2 = new ModelRenderer(this, 0, 85);
		this.FrontLeftLeg2.setRotationPoint(-2.0F, 1.0F, -1.7F);
		this.FrontLeftLeg2.addBox(0.0F, 0.0F, 0.0F, 3, 7, 4, 0.0F);
		this.BackRightLeg2 = new ModelRenderer(this, 0, 70);
		this.BackRightLeg2.mirror = true;
		this.BackRightLeg2.setRotationPoint(-2.0F, -0.5F, -2.2F);
		this.BackRightLeg2.addBox(0.0F, 0.0F, 0.0F, 3, 8, 4, 0.0F);
		this.Head1 = new ModelRenderer(this, 36, 0);
		this.Head1.setRotationPoint(0.0F, -6.0F, -5.9F);
		this.Head1.addBox(-3.0F, 0.0F, -7.0F, 5, 5, 5, 0.0F);
		this.setRotateAngle(Head1, 1.3089969389957472F, 0.0F, 0.0F);
		this.LeftEar = new ModelRenderer(this, 0, 22);
		this.LeftEar.setRotationPoint(2.3F, -1.7F, -4.3F);
		this.LeftEar.addBox(-3.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
		this.setRotateAngle(LeftEar, 0.0F, 0.0F, -0.6981317007977318F);
		this.Head2 = new ModelRenderer(this, 0, 0);
		this.Head2.setRotationPoint(-0.5F, 0.0F, -4.9F);
		this.Head2.addBox(-2.0F, 1.33F, -5.5F, 4, 3, 5, 0.0F);
		this.FrontRightLeg = new ModelRenderer(this, 0, 51);
		this.FrontRightLeg.mirror = true;
		this.FrontRightLeg.setRotationPoint(1.75F, 5.5F, 2.0F);
		this.FrontRightLeg.addBox(-1.5F, 2.5F, -1.5F, 2, 12, 3, 0.0F);
		this.BackRightLeg = new ModelRenderer(this, 0, 51);
		this.BackRightLeg.mirror = true;
		this.BackRightLeg.setRotationPoint(1.75F, 5.5F, 17.4F);
		this.BackRightLeg.addBox(-1.5F, 2.5F, -1.5F, 2, 12, 3, 0.0F);
		this.Neck = new ModelRenderer(this, 30, 29);
		this.Neck.setRotationPoint(0.5F, -4.5F, -3.0F);
		this.Neck.addBox(-2.5F, -4.0F, -6.0F, 4, 5, 12, 0.0F);
		this.setRotateAngle(Neck, -1.0995574287564276F, 0.0F, 0.0F);
		this.BackRightLeg2_1 = new ModelRenderer(this, 0, 70);
		this.BackRightLeg2_1.setRotationPoint(-2.0F, -0.5F, -2.2F);
		this.BackRightLeg2_1.addBox(0.0F, 0.0F, 0.0F, 3, 8, 4, 0.0F);
		this.ANIMATEHEAD = new ModelRenderer(this, 0, 120);
		this.ANIMATEHEAD.setRotationPoint(0.0F, 9.4F, -5.5F);
		this.ANIMATEHEAD.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
		this.Body = new ModelRenderer(this, 73, 41);
		this.Body.setRotationPoint(-4.0F, 4.0F, -7.0F);
		this.Body.addBox(0.0F, 0.0F, 0.0F, 8, 9, 19, 0.0F);
		this.Head1.addChild(this.RightEar);
		this.FrontRightLeg.addChild(this.FrontRightLeg2);
		this.Body.addChild(this.BackLeftLeg);
		this.Head1.addChild(this.Head4);
		this.Body.addChild(this.Tail);
		this.Head1.addChild(this.Head3);
		this.Head1.addChild(this.Mouth);
		this.Body.addChild(this.FrontLeftLeg);
		this.FrontLeftLeg.addChild(this.FrontLeftLeg2);
		this.BackRightLeg.addChild(this.BackRightLeg2);
		this.Neck.addChild(this.Head1);
		this.Head1.addChild(this.LeftEar);
		this.Head1.addChild(this.Head2);
		this.Body.addChild(this.FrontRightLeg);
		this.Body.addChild(this.BackRightLeg);
		this.ANIMATEHEAD.addChild(this.Neck);
		this.BackLeftLeg.addChild(this.BackRightLeg2_1);
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
