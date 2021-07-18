
/**
 * BisonFemale - Matheus Created using Tabula 7.1.0
 */
public static class ModelBisonFemale extends ModelBase {
	public ModelRenderer ANIMATEHEAD;
	public ModelRenderer Neck;
	public ModelRenderer Head1;
	public ModelRenderer Neck2;
	public ModelRenderer Head2;
	public ModelRenderer Head3;
	public ModelRenderer Mouth;
	public ModelRenderer RightHorn1;
	public ModelRenderer LeftEar;
	public ModelRenderer Head4;
	public ModelRenderer RightEar;
	public ModelRenderer LeftHorn1;
	public ModelRenderer beard;
	public ModelRenderer RightHorn2;
	public ModelRenderer LeftHorn2;
	public ModelRenderer Body2;
	public ModelRenderer Body1;
	public ModelRenderer Body3;
	public ModelRenderer Body5;
	public ModelRenderer FrontLeftLeg;
	public ModelRenderer FrontRightLeg;
	public ModelRenderer Body4;
	public ModelRenderer BackRightLeg;
	public ModelRenderer BackLeftLeg;
	public ModelRenderer udders;
	public ModelRenderer Tail1;
	public ModelRenderer Tail2;
	public ModelRenderer Tail3;

	public ModelBisonFemale() {
		this.textureWidth = 128;
		this.textureHeight = 128;
		this.Head2 = new ModelRenderer(this, 0, 0);
		this.Head2.setRotationPoint(0.0F, 2.0F, -5.9F);
		this.Head2.addBox(-2.0F, 1.33F, -5.5F, 5, 4, 6, 0.0F);
		this.Body4 = new ModelRenderer(this, 51, 66);
		this.Body4.setRotationPoint(1.0F, -2.5F, 0.0F);
		this.Body4.addBox(0.0F, 0.0F, 0.0F, 9, 3, 7, 0.0F);
		this.setRotateAngle(Body4, -0.03490658503988659F, 0.0F, 0.0F);
		this.FrontRightLeg = new ModelRenderer(this, 0, 51);
		this.FrontRightLeg.mirror = true;
		this.FrontRightLeg.setRotationPoint(2.0F, 12.4F, 4.0F);
		this.FrontRightLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 12, 4, 0.0F);
		this.Body2 = new ModelRenderer(this, 79, 0);
		this.Body2.setRotationPoint(-5.0F, 0.0F, -2.5F);
		this.Body2.addBox(0.0F, 0.0F, 0.0F, 10, 12, 13, 0.0F);
		this.Body1 = new ModelRenderer(this, 14, 44);
		this.Body1.setRotationPoint(-0.5F, -0.3F, -6.5F);
		this.Body1.addBox(0.0F, 0.0F, 0.0F, 11, 13, 7, 0.0F);
		this.Head4 = new ModelRenderer(this, 65, 0);
		this.Head4.setRotationPoint(0.5F, -1.5F, -7.7F);
		this.Head4.addBox(-3.0F, 0.0F, 0.0F, 6, 2, 7, 0.0F);
		this.setRotateAngle(Head4, 0.017453292519943295F, 0.0F, 0.0F);
		this.BackRightLeg = new ModelRenderer(this, 0, 51);
		this.BackRightLeg.mirror = true;
		this.BackRightLeg.setRotationPoint(2.0F, 12.4F, 4.0F);
		this.BackRightLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 12, 4, 0.0F);
		this.udders = new ModelRenderer(this, 86, 33);
		this.udders.setRotationPoint(4.0F, 11.5F, -1.0F);
		this.udders.addBox(0.0F, 0.0F, 0.0F, 4, 2, 6, 0.0F);
		this.Body3 = new ModelRenderer(this, 50, 44);
		this.Body3.setRotationPoint(-0.5F, -0.3F, 12.5F);
		this.Body3.addBox(0.0F, 0.0F, 0.0F, 11, 13, 7, 0.0F);
		this.Neck2 = new ModelRenderer(this, 94, 68);
		this.Neck2.setRotationPoint(-2.0F, -3.0F, -5.0F);
		this.Neck2.addBox(0.0F, 0.0F, 0.0F, 6, 7, 9, 0.0F);
		this.setRotateAngle(Neck2, -1.2915436464758039F, 0.0F, 0.0F);
		this.Mouth = new ModelRenderer(this, 41, 19);
		this.Mouth.setRotationPoint(1.5F, 7.1F, -10.8F);
		this.Mouth.addBox(-3.0F, 0.0F, 0.0F, 4, 1, 6, 0.0F);
		this.setRotateAngle(Mouth, 0.06981317007977318F, -0.0F, 0.0F);
		this.LeftEar = new ModelRenderer(this, 0, 22);
		this.LeftEar.setRotationPoint(6.0F, 0.4F, -2.8F);
		this.LeftEar.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
		this.setRotateAngle(LeftEar, 0.0F, 0.0F, 0.03490658503988659F);
		this.ANIMATEHEAD = new ModelRenderer(this, 0, 0);
		this.ANIMATEHEAD.setRotationPoint(-1.0F, 4.4F, -8.0F);
		this.ANIMATEHEAD.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
		this.Head3 = new ModelRenderer(this, 15, 18);
		this.Head3.setRotationPoint(1.5F, 3.4F, -11.1F);
		this.Head3.addBox(-3.0F, 0.0F, 0.0F, 4, 3, 7, 0.0F);
		this.setRotateAngle(Head3, 0.6981317007977318F, 0.0F, 0.0F);
		this.LeftHorn2 = new ModelRenderer(this, 0, 27);
		this.LeftHorn2.setRotationPoint(-2.4F, -0.2F, -0.6F);
		this.LeftHorn2.addBox(-3.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F);
		this.setRotateAngle(LeftHorn2, 0.0F, 0.24434609527920614F, 0.4970697709679851F);
		this.LeftHorn1 = new ModelRenderer(this, 0, 34);
		this.LeftHorn1.setRotationPoint(3.0F, 0.2F, -4.4F);
		this.LeftHorn1.addBox(-3.0F, -1.0F, -1.0F, 3, 2, 1, 0.0F);
		this.setRotateAngle(LeftHorn1, 0.0F, -3.141592653589793F, -0.5235987755982988F);
		this.Head1 = new ModelRenderer(this, 36, 0);
		this.Head1.setRotationPoint(0.5F, -7.0F, -8.5F);
		this.Head1.addBox(-3.0F, 0.0F, -7.0F, 7, 8, 7, 0.0F);
		this.setRotateAngle(Head1, -0.12217304763960307F, 0.0F, 0.0F);
		this.BackLeftLeg = new ModelRenderer(this, 0, 51);
		this.BackLeftLeg.setRotationPoint(9.0F, 12.4F, 4.0F);
		this.BackLeftLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 12, 4, 0.0F);
		this.Tail3 = new ModelRenderer(this, 5, 77);
		this.Tail3.setRotationPoint(-0.5F, 6.0F, -0.5F);
		this.Tail3.addBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
		this.Body5 = new ModelRenderer(this, 51, 77);
		this.Body5.setRotationPoint(1.0F, -2.2F, -0.2F);
		this.Body5.addBox(0.0F, 0.0F, 0.0F, 8, 3, 16, 0.0F);
		this.setRotateAngle(Body5, -0.13439035240356337F, 0.0F, 0.0F);
		this.Tail2 = new ModelRenderer(this, 0, 74);
		this.Tail2.setRotationPoint(0.5F, 2.3F, 1.0F);
		this.Tail2.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
		this.setRotateAngle(Tail2, -0.33510321638291124F, -0.0F, 0.0F);
		this.Neck = new ModelRenderer(this, 30, 30);
		this.Neck.setRotationPoint(0.0F, -2.3F, 6.4F);
		this.Neck.addBox(-3.0F, -7.0F, -10.0F, 8, 7, 5, 0.0F);
		this.setRotateAngle(Neck, 0.3665191429188092F, -0.0F, 0.0F);
		this.beard = new ModelRenderer(this, 0, 90);
		this.beard.setRotationPoint(-1.5F, 0.0F, 1.0F);
		this.beard.addBox(0.0F, 0.0F, 0.0F, 1, 5, 4, 0.0F);
		this.Tail1 = new ModelRenderer(this, 0, 68);
		this.Tail1.setRotationPoint(4.5F, 0.9F, 5.1F);
		this.Tail1.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(Tail1, 0.4886921905584123F, -0.0F, 0.0F);
		this.FrontLeftLeg = new ModelRenderer(this, 0, 51);
		this.FrontLeftLeg.setRotationPoint(9.0F, 12.4F, 4.0F);
		this.FrontLeftLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 12, 4, 0.0F);
		this.RightEar = new ModelRenderer(this, 0, 31);
		this.RightEar.setRotationPoint(-2.0F, 0.4F, -2.8F);
		this.RightEar.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
		this.setRotateAngle(RightEar, 0.0F, -0.0F, -0.03490658503988659F);
		this.RightHorn1 = new ModelRenderer(this, 0, 34);
		this.RightHorn1.setRotationPoint(-2.0F, 0.3F, -3.4F);
		this.RightHorn1.addBox(-3.0F, -1.0F, -1.0F, 3, 2, 1, 0.0F);
		this.setRotateAngle(RightHorn1, 0.0F, -0.0F, 0.5235987755982988F);
		this.RightHorn2 = new ModelRenderer(this, 0, 27);
		this.RightHorn2.setRotationPoint(-2.2F, -0.2F, -0.5F);
		this.RightHorn2.addBox(-3.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F);
		this.setRotateAngle(RightHorn2, 0.0F, -0.24434609527920614F, 0.4970697709679851F);
		this.Head1.addChild(this.Head2);
		this.Body1.addChild(this.Body4);
		this.Body1.addChild(this.FrontRightLeg);
		this.Body2.addChild(this.Body1);
		this.Head1.addChild(this.Head4);
		this.Body3.addChild(this.BackRightLeg);
		this.Body3.addChild(this.udders);
		this.Body2.addChild(this.Body3);
		this.Neck.addChild(this.Neck2);
		this.Head1.addChild(this.Mouth);
		this.Head1.addChild(this.LeftEar);
		this.Head1.addChild(this.Head3);
		this.LeftHorn1.addChild(this.LeftHorn2);
		this.Head1.addChild(this.LeftHorn1);
		this.Neck.addChild(this.Head1);
		this.Body3.addChild(this.BackLeftLeg);
		this.Tail2.addChild(this.Tail3);
		this.Body2.addChild(this.Body5);
		this.Tail1.addChild(this.Tail2);
		this.ANIMATEHEAD.addChild(this.Neck);
		this.Mouth.addChild(this.beard);
		this.Body3.addChild(this.Tail1);
		this.Body1.addChild(this.FrontLeftLeg);
		this.Head1.addChild(this.RightEar);
		this.Head1.addChild(this.RightHorn1);
		this.RightHorn1.addChild(this.RightHorn2);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.Body2.render(f5);
		this.ANIMATEHEAD.render(f5);
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
		this.FrontLeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.ANIMATEHEAD.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.ANIMATEHEAD.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.BackRightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.FrontRightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.BackLeftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}
