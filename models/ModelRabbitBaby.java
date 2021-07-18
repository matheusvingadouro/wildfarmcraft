
/**
 * RabbitBaby - Matheus Created using Tabula 7.1.0
 */
public static class ModelRabbitBaby extends ModelBase {
	public ModelRenderer ANIMATEHEAD;
	public ModelRenderer neck;
	public ModelRenderer head;
	public ModelRenderer beak;
	public ModelRenderer beak2;
	public ModelRenderer ear1;
	public ModelRenderer ear2;
	public ModelRenderer body;
	public ModelRenderer RightFrontLeg;
	public ModelRenderer LeftFrontLeg;
	public ModelRenderer RightBackLeg;
	public ModelRenderer LeftBackLeg;
	public ModelRenderer Tail;
	public ModelRenderer RightBackLeg2;
	public ModelRenderer LeftBackLeg2;

	public ModelRabbitBaby() {
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.beak2 = new ModelRenderer(this, 18, 0);
		this.beak2.setRotationPoint(-1.49F, -1.8F, -3.7F);
		this.beak2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
		this.setRotateAngle(beak2, 0.19198621771937624F, 0.0F, 0.0F);
		this.RightBackLeg2 = new ModelRenderer(this, 0, 2);
		this.RightBackLeg2.setRotationPoint(0.1F, 2.0F, -0.5F);
		this.RightBackLeg2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(RightBackLeg2, 0.10471975511965977F, 0.0F, 0.0F);
		this.body = new ModelRenderer(this, 27, 0);
		this.body.setRotationPoint(-1.5F, 19.0F, -1.5F);
		this.body.addBox(0.0F, 0.0F, 0.0F, 3, 3, 5, 0.0F);
		this.setRotateAngle(body, -0.26633724385433466F, 0.0F, 0.0F);
		this.LeftBackLeg2 = new ModelRenderer(this, 18, 2);
		this.LeftBackLeg2.setRotationPoint(-0.1F, 2.0F, -0.5F);
		this.LeftBackLeg2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(LeftBackLeg2, 0.10471975511965977F, 0.0F, 0.0F);
		this.neck = new ModelRenderer(this, 4, 0);
		this.neck.setRotationPoint(0.0F, 0.3F, -0.9F);
		this.neck.addBox(-1.0F, -1.5F, -1.5F, 2, 2, 2, 0.0F);
		this.setRotateAngle(neck, -1.156455162371443F, 0.0F, 0.0F);
		this.Tail = new ModelRenderer(this, 50, 0);
		this.Tail.setRotationPoint(1.0F, 0.4F, 5.0F);
		this.Tail.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.ear1 = new ModelRenderer(this, 24, 0);
		this.ear1.setRotationPoint(0.6F, -2.6F, -2.3F);
		this.ear1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.setRotateAngle(ear1, 0.17453292519943295F, 0.0F, -2.8797932657906435F);
		this.ear2 = new ModelRenderer(this, 28, 0);
		this.ear2.mirror = true;
		this.ear2.setRotationPoint(-0.6F, -2.85F, -2.3F);
		this.ear2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.setRotateAngle(ear2, 0.13962634015954636F, 0.0F, 2.8797932657906435F);
		this.RightFrontLeg = new ModelRenderer(this, 38, 0);
		this.RightFrontLeg.setRotationPoint(-1.6F, 22.0F, -1.7F);
		this.RightFrontLeg.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.beak = new ModelRenderer(this, 10, 0);
		this.beak.setRotationPoint(-1.01F, -1.8F, -3.7F);
		this.beak.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(beak, 0.890117918517108F, 0.0F, 0.0F);
		this.LeftBackLeg = new ModelRenderer(this, 52, 0);
		this.LeftBackLeg.setRotationPoint(0.7F, 21.0F, 1.3F);
		this.LeftBackLeg.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
		this.ANIMATEHEAD = new ModelRenderer(this, 0, 0);
		this.ANIMATEHEAD.setRotationPoint(0.0F, 20.6F, -1.0F);
		this.ANIMATEHEAD.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
		this.head = new ModelRenderer(this, 12, 0);
		this.head.setRotationPoint(0.51F, -1.5F, 0.9F);
		this.head.addBox(-1.5F, -3.0F, -3.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(head, 1.1344640137963142F, 0.0F, 0.0F);
		this.RightBackLeg = new ModelRenderer(this, 46, 0);
		this.RightBackLeg.setRotationPoint(-1.7F, 21.0F, 1.3F);
		this.RightBackLeg.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
		this.LeftFrontLeg = new ModelRenderer(this, 42, 0);
		this.LeftFrontLeg.setRotationPoint(0.6F, 22.0F, -1.7F);
		this.LeftFrontLeg.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.head.addChild(this.beak2);
		this.RightBackLeg.addChild(this.RightBackLeg2);
		this.LeftBackLeg.addChild(this.LeftBackLeg2);
		this.ANIMATEHEAD.addChild(this.neck);
		this.body.addChild(this.Tail);
		this.head.addChild(this.ear1);
		this.head.addChild(this.ear2);
		this.head.addChild(this.beak);
		this.neck.addChild(this.head);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.body.render(f5);
		this.RightFrontLeg.render(f5);
		this.LeftBackLeg.render(f5);
		this.ANIMATEHEAD.render(f5);
		this.RightBackLeg.render(f5);
		this.LeftFrontLeg.render(f5);
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
		this.ANIMATEHEAD.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.ANIMATEHEAD.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LeftFrontLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.LeftBackLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.RightFrontLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.RightBackLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}
