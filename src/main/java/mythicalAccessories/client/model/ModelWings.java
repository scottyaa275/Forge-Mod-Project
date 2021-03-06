// Date: 10/21/2015 8:27:43 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package mythicalAccessories.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;

public class ModelWings extends ModelBiped 
{
	//fields
	/*ModelRenderer winglefttop0;
	ModelRenderer wingleftwing0;
	ModelRenderer wingrighttop0;
	ModelRenderer wingrightwing0;
	ModelRenderer winglefttop1;
	ModelRenderer wingleftwing1;
	ModelRenderer wingrighttop1;
	ModelRenderer wingrightwing1;*/
	ModelRenderer wingLeft;
	ModelRenderer wingRight;

	public ModelWings(float scale)
	{
		super(scale, 0, 64, 64);
		textureWidth = 64;
		textureHeight = 64;
		/*
		winglefttop0 = new ModelRenderer(this, 32, 0);
		winglefttop0.addBox(1F, 0F, 2F, 6, 1, 1);
		winglefttop0.setRotationPoint(0F, 0F, 0F);
		winglefttop0.setTextureSize(64, 32);
		winglefttop0.mirror = true;
		setRotation(winglefttop0, 0F, -0.1832596F, 0F);
		wingleftwing0 = new ModelRenderer(this, 32, 2);
		wingleftwing0.addBox(1F, 1F, 2.5F, 6, 9, 0);
		wingleftwing0.setRotationPoint(0F, 0F, 0F);
		wingleftwing0.setTextureSize(64, 32);
		wingleftwing0.mirror = true;
		setRotation(wingleftwing0, 0F, -0.1832596F, 0F);
		wingrighttop0 = new ModelRenderer(this, 32, 0);
		wingrighttop0.addBox(-7F, 0F, 2F, 6, 1, 1);
		wingrighttop0.setRotationPoint(0F, 0F, 0F);
		wingrighttop0.setTextureSize(64, 32);
		wingrighttop0.mirror = true;
		setRotation(wingrighttop0, 0F, 0.1832596F, 0F);
		wingrightwing0 = new ModelRenderer(this, 32, 2);
		wingrightwing0.addBox(-7F, 1F, 2.5F, 6, 9, 0);
		wingrightwing0.setRotationPoint(0F, 0F, 0F);
		wingrightwing0.setTextureSize(64, 32);
		wingrightwing0.mirror = true;
		setRotation(wingrightwing0, 0F, 0.1832596F, 0F);
		winglefttop1 = new ModelRenderer(this, 32, 0);
		winglefttop1.addBox(6F, 1F, 1.5F, 6, 1, 1);
		winglefttop1.setRotationPoint(0F, 0F, 0F);
		winglefttop1.setTextureSize(64, 32);
		winglefttop1.mirror = true;
		setRotation(winglefttop1, 0.0349066F, -0.2617994F, -0.1832596F);
		wingleftwing1 = new ModelRenderer(this, 32, 2);
		wingleftwing1.addBox(6F, 2F, 2F, 6, 9, 0);
		wingleftwing1.setRotationPoint(0F, 0F, 0F);
		wingleftwing1.setTextureSize(64, 32);
		wingleftwing1.mirror = true;
		setRotation(wingleftwing1, 0.0349066F, -0.2617994F, -0.1832596F);
		wingrighttop1 = new ModelRenderer(this, 32, 0);
		wingrighttop1.addBox(-12F, 1F, 1.5F, 6, 1, 1);
		wingrighttop1.setRotationPoint(0F, 0F, 0F);
		wingrighttop1.setTextureSize(64, 32);
		wingrighttop1.mirror = true;
		setRotation(wingrighttop1, 0.0349066F, 0.2617994F, 0.1832596F);
		wingrightwing1 = new ModelRenderer(this, 32, 2);
		wingrightwing1.addBox(-12F, 2F, 2F, 6, 9, 0);
		wingrightwing1.setRotationPoint(0F, 0F, 0F);
		wingrightwing1.setTextureSize(64, 32);
		wingrightwing1.mirror = true;
		setRotation(wingrightwing1, 0.0349066F, 0.2617994F, 0.1832596F);

		this.bipedBody.addChild(winglefttop0);
		this.bipedBody.addChild(wingleftwing0);
		this.bipedBody.addChild(wingrighttop0);
		this.bipedBody.addChild(wingrightwing0);
		this.bipedBody.addChild(winglefttop1);
		this.bipedBody.addChild(wingleftwing1);
		this.bipedBody.addChild(wingrighttop1);
		this.bipedBody.addChild(wingrightwing1);*/
		wingLeft = new ModelRenderer(this, 0, 32);
		wingLeft.addBox(0F, 1F, 2F, 8, 16, 1);
		wingLeft.setRotationPoint(0F, 0F, 0F);
		wingLeft.setTextureSize(64, 64);
		wingLeft.mirror = true;
		setRotation(wingLeft, 0F, 0F, -0.1745329F);
		wingRight = new ModelRenderer(this, 18, 32);
		wingRight.addBox(-8F, 1F, 2F, 8, 16, 1);
		wingRight.setRotationPoint(0F, 0F, 0F);
		wingRight.setTextureSize(64, 64);
		wingRight.mirror = true;
		setRotation(wingRight, 0F, 0F, 0.1745329F);//0.1745329F

		this.bipedBody.addChild(wingLeft);
		this.bipedBody.addChild(wingRight);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		/*winglefttop0.render(f5);
		wingleftwing0.render(f5);
		wingrighttop0.render(f5);
		wingrightwing0.render(f5);
		winglefttop1.render(f5);
		wingleftwing1.render(f5);
		wingrighttop1.render(f5);
		wingrightwing1.render(f5);*/
	}

	/*public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
	{ 
		super.render(entity, f, f1, f2, f3, f4, f5); 
		setRotationAngles(f, f1, f2, f3, f4, f5, entity); 
	}*/

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	//ANIMATIONS ARE HARD
	//BUT DONE!
	/**
	 * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
	 * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
	 * "far" arms and legs can swing at most.
	 * par1 increments every time you move, par2 is the maximum
	 */
	public void setRotationAngles(float par1, float par2, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity entity)
	{
		//if(!entity.onGround)
		//{
		//this.wingLeft.rotateAngleZ = (MathHelper.cos(par1 * 0.6662F) * 1.4F * par2) / 2;
		this.wingLeft.rotateAngleZ = MathHelper.sin(par1 * 0.666F) / 2 * par2 - 0.2f;
		this.wingRight.rotateAngleZ = (MathHelper.sin(par1 * 0.666F) / 2 * par2 - 0.2f) * -1;
		//this.wingRight.rotateAngleZ = (MathHelper.cos(par1 * 0.6662F) * 1.4F * par2) / 2 *  -1;
		//this.wingRight.rotateAngleZ = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;e
		//}
	}

}
