
package mythicalAccessories.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDragonCrown extends ModelBiped
{
	//fields
	ModelRenderer Shape8;
	ModelRenderer Shape11;
	ModelRenderer Shape13;
	ModelRenderer Shape15;
	ModelRenderer Shape17;
	ModelRenderer Shape19;
	ModelRenderer Shape21;
	ModelRenderer Shape23;
	ModelRenderer Shape25;
	ModelRenderer Shape27;
	ModelRenderer Shape29;
	ModelRenderer Shape34;
	ModelRenderer Shape39;
	ModelRenderer Shape44;
	ModelRenderer Shape46;
	ModelRenderer Shape48;
	ModelRenderer Shape50;
	ModelRenderer Shape2;

	public ModelDragonCrown(float scale)
	{
		super(scale, 0, 64, 64);
		textureWidth = 64;
		textureHeight = 32;

		Shape8 = new ModelRenderer(this, 0, 0);
		Shape8.addBox(-3F, -2F, -5F, 1, 1, 1);
		Shape8.setRotationPoint(0F, 0F, 0F);
		Shape8.setTextureSize(64, 32);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		Shape11 = new ModelRenderer(this, 0, 0);
		Shape11.addBox(-4F, -5F, -5F, 1, 3, 1);
		Shape11.setRotationPoint(0F, 0F, 0F);
		Shape11.setTextureSize(64, 32);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0F);
		Shape13 = new ModelRenderer(this, 0, 0);
		Shape13.addBox(2F, -2F, -5F, 1, 1, 1);
		Shape13.setRotationPoint(0F, 0F, 0F);
		Shape13.setTextureSize(64, 32);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, 0F);
		Shape15 = new ModelRenderer(this, 0, 0);
		Shape15.addBox(3F, -5F, -5F, 1, 3, 1);
		Shape15.setRotationPoint(0F, 0F, 0F);
		Shape15.setTextureSize(64, 32);
		Shape15.mirror = true;
		setRotation(Shape15, 0F, 0F, 0F);
		Shape17 = new ModelRenderer(this, 0, 0);
		Shape17.addBox(-4F, -8F, -5F, 2, 3, 1);
		Shape17.setRotationPoint(0F, 0F, 0F);
		Shape17.setTextureSize(64, 32);
		Shape17.mirror = true;
		setRotation(Shape17, 0F, 0F, 0F);
		Shape19 = new ModelRenderer(this, 0, 0);
		Shape19.addBox(2F, -8F, -5F, 2, 3, 1);
		Shape19.setRotationPoint(0F, 0F, 0F);
		Shape19.setTextureSize(64, 32);
		Shape19.mirror = true;
		setRotation(Shape19, 0F, 0F, 0F);
		Shape21 = new ModelRenderer(this, 0, 0);
		Shape21.addBox(-2F, -7F, -5F, 4, 2, 1);
		Shape21.setRotationPoint(0F, 0F, 0F);
		Shape21.setTextureSize(64, 32);
		Shape21.mirror = true;
		setRotation(Shape21, 0F, 0F, 0F);
		Shape23 = new ModelRenderer(this, 0, 0);
		Shape23.addBox(-5F, -8F, -5F, 1, 1, 1);
		Shape23.setRotationPoint(0F, 0F, 0F);
		Shape23.setTextureSize(64, 32);
		Shape23.mirror = true;
		setRotation(Shape23, 0F, 0F, 0F);
		Shape25 = new ModelRenderer(this, 0, 0);
		Shape25.addBox(-4F, -9F, -5F, 1, 1, 1);
		Shape25.setRotationPoint(0F, 0F, 0F);
		Shape25.setTextureSize(64, 32);
		Shape25.mirror = true;
		setRotation(Shape25, 0F, 0F, 0F);
		Shape27 = new ModelRenderer(this, 0, 0);
		Shape27.addBox(4F, -8F, -5F, 1, 1, 1);
		Shape27.setRotationPoint(0F, 0F, 0F);
		Shape27.setTextureSize(64, 32);
		Shape27.mirror = true;
		setRotation(Shape27, 0F, 0F, 0F);
		Shape29 = new ModelRenderer(this, 0, 0);
		Shape29.addBox(3F, -9F, -5F, 1, 1, 1);
		Shape29.setRotationPoint(0F, 0F, 0F);
		Shape29.setTextureSize(64, 32);
		Shape29.mirror = true;
		setRotation(Shape29, 0F, 0F, 0F);
		Shape34 = new ModelRenderer(this, 0, 0);
		Shape34.addBox(-5F, -6F, -4F, 1, 4, 8);
		Shape34.setRotationPoint(0F, 0F, 0F);
		Shape34.setTextureSize(64, 32);
		Shape34.mirror = true;
		setRotation(Shape34, 0F, 0F, 0F);
		Shape39 = new ModelRenderer(this, 0, 0);
		Shape39.addBox(4F, -6F, -4F, 1, 4, 8);
		Shape39.setRotationPoint(0F, 0F, 0F);
		Shape39.setTextureSize(64, 32);
		Shape39.mirror = true;
		setRotation(Shape39, 0F, 0F, 0F);
		Shape44 = new ModelRenderer(this, 0, 0);
		Shape44.addBox(-4F, -1F, -5F, 1, 1, 1);
		Shape44.setRotationPoint(0F, 0F, 0F);
		Shape44.setTextureSize(64, 32);
		Shape44.mirror = true;
		setRotation(Shape44, 0F, 0F, 0F);
		Shape46 = new ModelRenderer(this, 0, 0);
		Shape46.addBox(3F, -1F, -5F, 1, 1, 1);
		Shape46.setRotationPoint(0F, 0F, 0F);
		Shape46.setTextureSize(64, 32);
		Shape46.mirror = true;
		setRotation(Shape46, 0F, 0F, 0F);
		Shape48 = new ModelRenderer(this, 0, 0);
		Shape48.addBox(-2F, -1F, -5F, 4, 1, 1);
		Shape48.setRotationPoint(0F, 0F, 0F);
		Shape48.setTextureSize(64, 32);
		Shape48.mirror = true;
		setRotation(Shape48, 0F, 0F, 0F);
		Shape50 = new ModelRenderer(this, 0, 0);
		Shape50.addBox(-3F, 0F, -4F, 6, 1, 1);
		Shape50.setRotationPoint(0F, 0F, 0F);
		Shape50.setTextureSize(64, 32);
		Shape50.mirror = true;
		setRotation(Shape50, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 0);
		Shape2.addBox(-4F, -6F, 4F, 8, 4, 1);
		Shape2.setRotationPoint(0F, 0F, 0F);
		Shape2.setTextureSize(64, 32);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		/*
		Shape8.render(f5);
		Shape11.render(f5);
		Shape13.render(f5);
		Shape15.render(f5);
		Shape17.render(f5);
		Shape19.render(f5);
		Shape21.render(f5);
		Shape23.render(f5);
		Shape25.render(f5);
		Shape27.render(f5);
		Shape29.render(f5);
		Shape34.render(f5);
		Shape39.render(f5);
		Shape44.render(f5);
		Shape46.render(f5);
		Shape48.render(f5);
		Shape50.render(f5);
		Shape2.render(f5);*/
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}