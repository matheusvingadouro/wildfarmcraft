
/**
 * TurkeyDomesticMale - Matheus Created using Tabula 7.1.0
 */
public static class ModelTurkeyDomesticMale extends ModelBase {
	public ModelRenderer animatehead;
	public ModelRenderer neck;
	public ModelRenderer head;
	public ModelRenderer beak;
	public ModelRenderer beak2;
	public ModelRenderer beak3;
	public ModelRenderer body;
	public ModelRenderer body2;
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
	public ModelRenderer chestfeather;
	public ModelRenderer fantail;
	public ModelRenderer LeftLeg1;
	public ModelRenderer LeftLeg3;
	public ModelRenderer LeftLeg1_1;
	public ModelRenderer LeftLeg3_1;

	public ModelTurkeyDomesticMale() {
		this.textureWidth = 128;
		this.textureHeight = 64;
		this.animatehead = new ModelRenderer(this, 0, 0);
		this.animatehead.setRotationPoint(0.0F, 13.0F, -4.0F);
		this.animatehead.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
		this.beak3 = new ModelRenderer(this, 30, 0);
		this.beak3.setRotationPoint(-2.7F, -2.77F, -7.5F);
		this.beak3.addBox(0.0F, -1.0F, 0.0F, 1, 3, 1, 0.0F);
		this.body2 = new ModelRenderer(this, 67, 2);
		this.body2.setRotationPoint(-2.5F, 11.0F, -2.5F);
		this.body2.addBox(0.0F, 0.0F, 0.0F, 5, 5, 6, 0.0F);
		this.setRotateAngle(body2, -0.9644688963890076F, -0.0F, 0.0F);
		this.wing2 = new ModelRenderer(this, 94, 13);
		this.wing2.mirror = true;
		this.wing2.setRotationPoint(2.5F, 12.3F, -2.0F);
		this.wing2.addBox(0.0F, 0.0F, 0.0F, 1, 5, 7, 0.0F);
		this.setRotateAngle(wing2, -0.04258603374866164F, 0.2937389131106456F, -0.14590952546672595F);
		this.Tail1 = new ModelRenderer(this, 16, 0);
		this.Tail1.setRotationPoint(-1.0F, 7.0F, 10.0F);
		this.Tail1.addBox(0.0F, 0.0F, 0.0F, 2, 8, 0, 0.0F);
		this.setRotateAngle(Tail1, -0.5235987755982988F, -0.0F, -0.017453292519943295F);
		this.body = new ModelRenderer(this, 28, 8);
		this.body.setRotationPoint(0.5F, 11.0F, -2.799999952316284F);
		this.body.addBox(-4.0F, 0.0F, 0.0F, 7, 8, 9, 0.0F);
		this.setRotateAngle(body, -0.07435102760791779F, -0.0F, 0.0F);
		this.Tail4 = new ModelRenderer(this, 16, 0);
		this.Tail4.setRotationPoint(-5.0F, 8.7F, 10.0F);
		this.Tail4.addBox(0.0F, 0.0F, 0.0F, 2, 8, 0, 0.0F);
		this.setRotateAngle(Tail4, -0.5235987755982988F, -0.0F, -0.41887902047863906F);
		this.fantail = new ModelRenderer(this, 0, 35);
		this.fantail.setRotationPoint(-3.0F, 3.5F, 5.5F);
		this.fantail.addBox(0.0F, 0.0F, 0.0F, 12, 11, 0, 0.0F);
		this.setRotateAngle(fantail, 2.6179938779914944F, 0.0F, 0.0F);
		this.wing1 = new ModelRenderer(this, 94, 13);
		this.wing1.setRotationPoint(-3.5F, 12.0F, -2.0F);
		this.wing1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 7, 0.0F);
		this.setRotateAngle(wing1, -0.04252383473219923F, -0.29373195908274496F, 0.1459178648350035F);
		this.LeftLeg3 = new ModelRenderer(this, 7, 17);
		this.LeftLeg3.setRotationPoint(-3.0F, 4.6F, -3.5F);
		this.LeftLeg3.addBox(0.0F, 0.0F, 0.0F, 3, 0, 5, 0.0F);
		this.setRotateAngle(LeftLeg3, 0.33161255787892263F, 0.0F, 0.0F);
		this.head = new ModelRenderer(this, 0, 0);
		this.head.setRotationPoint(2.5F, 4.7F, 4.0F);
		this.head.addBox(-4.0F, -5.0F, -7.0F, 3, 3, 3, 0.0F);
		this.setRotateAngle(head, -1.2543681334083245F, -0.0F, 0.0F);
		this.beak2 = new ModelRenderer(this, 35, 0);
		this.beak2.setRotationPoint(-2.01F, -1.7F, -9.5F);
		this.beak2.addBox(-1.0F, -1.0F, 1.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(beak2, 0.3384193419617005F, -0.0F, 0.0F);
		this.LeftLeg3_1 = new ModelRenderer(this, 7, 17);
		this.LeftLeg3_1.setRotationPoint(-3.0F, 4.6F, -3.5F);
		this.LeftLeg3_1.addBox(0.0F, 0.0F, 0.0F, 3, 0, 5, 0.0F);
		this.setRotateAngle(LeftLeg3_1, 0.33161255787892263F, 0.0F, 0.0F);
		this.Tail5 = new ModelRenderer(this, 16, 0);
		this.Tail5.setRotationPoint(-7.1F, 11.7F, 10.5F);
		this.Tail5.addBox(0.0F, 0.0F, 0.0F, 2, 8, 0, 0.0F);
		this.setRotateAngle(Tail5, -0.47123889803846897F, -0.0F, -0.7853981633974483F);
		this.chestfeather = new ModelRenderer(this, 90, 0);
		this.chestfeather.setRotationPoint(2.5F, 2.4F, 1.0F);
		this.chestfeather.addBox(0.0F, 0.0F, 0.0F, 0, 3, 5, 0.0F);
		this.setRotateAngle(chestfeather, -0.5759586531581287F, 0.0F, 0.0F);
		this.Tail3 = new ModelRenderer(this, 16, 0);
		this.Tail3.setRotationPoint(3.0F, 8.0F, 9.8F);
		this.Tail3.addBox(0.0F, 0.0F, 0.0F, 2, 8, 0, 0.0F);
		this.setRotateAngle(Tail3, -0.5235987755982988F, -0.0F, 0.3141592653589793F);
		this.LeftLeg1_1 = new ModelRenderer(this, 0, 16);
		this.LeftLeg1_1.setRotationPoint(2.5F, 2.3F, 1.3F);
		this.LeftLeg1_1.addBox(-2.0F, 0.0F, -1.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(LeftLeg1_1, -0.33161255787892263F, -0.0F, 0.0F);
		this.neck = new ModelRenderer(this, 0, 23);
		this.neck.setRotationPoint(0.0F, 1.0F, 0.0F);
		this.neck.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 6, 0.0F);
		this.setRotateAngle(neck, 1.2915436464758039F, 0.0F, 0.0F);
		this.body3 = new ModelRenderer(this, 67, 14);
		this.body3.setRotationPoint(-3.0F, 14.0F, 1.0F);
		this.body3.addBox(0.0F, 0.0F, 0.0F, 6, 5, 6, 0.0F);
		this.setRotateAngle(body3, 0.2094395160675048F, -0.0F, 0.0F);
		this.Tail2 = new ModelRenderer(this, 16, 0);
		this.Tail2.setRotationPoint(5.7F, 10.4F, 10.5F);
		this.Tail2.addBox(0.0F, 0.0F, 0.0F, 2, 8, 0, 0.0F);
		this.setRotateAngle(Tail2, -0.47123889803846897F, -0.0F, 0.7853981633974483F);
		this.LeftLeg1 = new ModelRenderer(this, 0, 16);
		this.LeftLeg1.setRotationPoint(2.5F, 2.3F, 1.3F);
		this.LeftLeg1.addBox(-2.0F, 0.0F, -1.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(LeftLeg1, -0.33161255787892263F, -0.0F, 0.0F);
		this.LeftLeg2 = new ModelRenderer(this, 52, 11);
		this.LeftLeg2.setRotationPoint(1.0F, 18.3F, 1.5F);
		this.LeftLeg2.addBox(0.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
		this.beak = new ModelRenderer(this, 35, 0);
		this.beak.setRotationPoint(-2.0F, -2.1F, -9.5F);
		this.beak.addBox(-1.0F, -1.0F, 1.0F, 1, 1, 3, 0.0F);
		this.RightLeg2 = new ModelRenderer(this, 52, 11);
		this.RightLeg2.setRotationPoint(-3.0F, 18.3F, 1.5F);
		this.RightLeg2.addBox(0.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
		this.head.addChild(this.beak3);
		this.body3.addChild(this.fantail);
		this.LeftLeg1.addChild(this.LeftLeg3);
		this.neck.addChild(this.head);
		this.head.addChild(this.beak2);
		this.LeftLeg1_1.addChild(this.LeftLeg3_1);
		this.body2.addChild(this.chestfeather);
		this.RightLeg2.addChild(this.LeftLeg1_1);
		this.animatehead.addChild(this.neck);
		this.LeftLeg2.addChild(this.LeftLeg1);
		this.head.addChild(this.beak);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.animatehead.render(f5);
		this.body2.render(f5);
		this.wing2.render(f5);
		this.Tail1.render(f5);
		this.body.render(f5);
		this.Tail4.render(f5);
		this.wing1.render(f5);
		this.Tail5.render(f5);
		this.Tail3.render(f5);
		this.body3.render(f5);
		this.Tail2.render(f5);
		this.LeftLeg2.render(f5);
		this.RightLeg2.render(f5);
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
		this.RightLeg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.LeftLeg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.animatehead.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.animatehead.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}
