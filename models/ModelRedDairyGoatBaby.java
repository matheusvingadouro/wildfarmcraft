
/**
 * RedDairyGoatBaby - Matheus Created using Tabula 7.1.0
 */
public static class ModelRedDairyGoatBaby extends ModelBase {
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
	public ModelRenderer horn1;
	public ModelRenderer horn2;

	public ModelRedDairyGoatBaby() {
		this.textureWidth = 128;
		this.textureHeight = 128;
		this.BackLeftLeg = new ModelRenderer(this, 65, 11);
		this.BackLeftLeg.setRotationPoint(0.52F, 18.0F, 4.0F);
		this.BackLeftLeg.addBox(0.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
		this.BackRightLeg = new ModelRenderer(this, 65, 11);
		this.BackRightLeg.mirror = true;
		this.BackRightLeg.setRotationPoint(-2.52F, 18.0F, 4.0F);
		this.BackRightLeg.addBox(0.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
		this.head4 = new ModelRenderer(this, 0, 8);
		this.head4.setRotationPoint(-1.5F, -0.5F, -2.5F);
		this.head4.addBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F);
		this.FrontLeftLeg = new ModelRenderer(this, 65, 11);
		this.FrontLeftLeg.setRotationPoint(0.52F, 18.0F, -2.5F);
		this.FrontLeftLeg.addBox(0.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
		this.head5 = new ModelRenderer(this, 35, 0);
		this.head5.setRotationPoint(-0.5F, 2.0F, -5.9F);
		this.head5.addBox(-1.0F, 0.0F, 1.0F, 3, 2, 3, 0.0F);
		this.setRotateAngle(head5, 0.08726646259971647F, 0.0F, 0.0F);
		this.ear1 = new ModelRenderer(this, 18, 0);
		this.ear1.setRotationPoint(1.2F, 0.7F, -1.5F);
		this.ear1.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
		this.setRotateAngle(ear1, 0.08726646259971647F, 0.0F, -0.5235987755982988F);
		this.FrontRightLeg = new ModelRenderer(this, 65, 11);
		this.FrontRightLeg.mirror = true;
		this.FrontRightLeg.setRotationPoint(-2.52F, 18.0F, -2.5F);
		this.FrontRightLeg.addBox(0.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
		this.head2 = new ModelRenderer(this, 61, 1);
		this.head2.setRotationPoint(0.0F, 3.4F, -4.7F);
		this.head2.addBox(-1.0F, -1.0F, 1.0F, 2, 2, 3, 0.0F);
		this.setRotateAngle(head2, 0.8377580409572781F, 0.0F, 0.0F);
		this.Tail = new ModelRenderer(this, 14, 17);
		this.Tail.setRotationPoint(-0.5F, 14.5F, 4.0F);
		this.Tail.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(Tail, 0.45378560551852565F, 0.0F, 0.0F);
		this.ANIMATEHEAD = new ModelRenderer(this, 0, 0);
		this.ANIMATEHEAD.setRotationPoint(0.0F, 14.5F, -3.4F);
		this.ANIMATEHEAD.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
		this.head3 = new ModelRenderer(this, 50, 1);
		this.head3.setRotationPoint(0.0F, 4.5F, -5.2F);
		this.head3.addBox(-1.0F, -1.0F, 1.0F, 2, 1, 3, 0.0F);
		this.setRotateAngle(head3, 0.17453292519943295F, 0.0F, 0.0F);
		this.head = new ModelRenderer(this, 0, 0);
		this.head.setRotationPoint(0.0F, -1.8F, -5.5F);
		this.head.addBox(-2.0F, 0.0F, -3.0F, 4, 4, 3, 0.0F);
		this.setRotateAngle(head, 0.9599310885968813F, 0.0F, 0.0F);
		this.horn2 = new ModelRenderer(this, 25, 0);
		this.horn2.setRotationPoint(-1.7F, -1.4F, -1.5F);
		this.horn2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.setRotateAngle(horn2, -0.3490658503988659F, 0.0F, 0.0F);
		this.neck = new ModelRenderer(this, 0, 25);
		this.neck.setRotationPoint(0.0F, 2.0F, 1.1F);
		this.neck.addBox(-1.5F, -1.5F, -6.0F, 3, 3, 6, 0.0F);
		this.setRotateAngle(neck, -1.0471975511965976F, 0.0F, 0.0F);
		this.ear2 = new ModelRenderer(this, 18, 0);
		this.ear2.setRotationPoint(-2.1F, 0.2F, -1.5F);
		this.ear2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
		this.setRotateAngle(ear2, 0.08726646259971647F, 0.0F, 0.5235987755982988F);
		this.body = new ModelRenderer(this, 28, 8);
		this.body.setRotationPoint(-2.5F, 13.5F, -3.799999952316284F);
		this.body.addBox(0.0F, 0.0F, 0.0F, 5, 5, 9, 0.0F);
		this.horn1 = new ModelRenderer(this, 25, 0);
		this.horn1.setRotationPoint(0.7F, -1.4F, -1.5F);
		this.horn1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.setRotateAngle(horn1, -0.3490658503988659F, 0.0F, 0.0F);
		this.head.addChild(this.head4);
		this.head.addChild(this.head5);
		this.head.addChild(this.ear1);
		this.head.addChild(this.head2);
		this.head.addChild(this.head3);
		this.neck.addChild(this.head);
		this.head.addChild(this.horn2);
		this.ANIMATEHEAD.addChild(this.neck);
		this.head.addChild(this.ear2);
		this.head.addChild(this.horn1);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.BackLeftLeg.render(f5);
		this.BackRightLeg.render(f5);
		this.FrontLeftLeg.render(f5);
		this.FrontRightLeg.render(f5);
		this.Tail.render(f5);
		this.ANIMATEHEAD.render(f5);
		this.body.render(f5);
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
