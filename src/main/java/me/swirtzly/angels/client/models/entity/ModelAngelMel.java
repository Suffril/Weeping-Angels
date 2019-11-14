package me.swirtzly.angels.client.models.entity;

import me.swirtzly.angels.client.models.entity.arms.ModelArmsAngry;
import me.swirtzly.angels.client.models.entity.arms.ModelArmsCovering;
import me.swirtzly.angels.client.models.entity.arms.ModelArmsIdle;
import me.swirtzly.angels.client.models.entity.arms.ModelArmsPointing;
import me.swirtzly.angels.client.models.poses.PoseBase;
import me.swirtzly.angels.client.models.poses.PoseManager;
import me.swirtzly.angels.client.renders.entities.RenderWeepingAngel;
import me.swirtzly.angels.common.entities.EntityWeepingAngel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAngelMel extends ModelBase {

    ModelRenderer Eye1;
    ModelRenderer Eye2;
    ModelRenderer EyeBacking;
    ModelRenderer EyeMiddle;
    ModelRenderer Hair1;
    ModelRenderer Hair2;
    ModelRenderer Hair3;
    ModelRenderer Hair4;
    ModelRenderer Hair5;
    ModelRenderer Hair6;
    ModelRenderer Hair7;
    ModelRenderer Hair8;
    ModelRenderer EarLeft;
    ModelRenderer EarRight;
    ModelRenderer Nose;
    ModelRenderer HeadBack;
    ModelRenderer MouthAngle1;
    ModelRenderer MouthAngle2;
    ModelRenderer Chin;
    ModelRenderer Noselower;
    ModelRenderer MouthInner;
    ModelRenderer MouthUpper;
    ModelRenderer EyeAngle1;
    ModelRenderer EyeAngle2;
    ModelRenderer MouthUpper2;
    ModelRenderer Forehead2;
    ModelRenderer Forehead5;
    ModelRenderer MouthUpper3;
    ModelRenderer Tooth3;
    ModelRenderer Tooth1;
    ModelRenderer Tooth2;
    ModelRenderer HeadBand2;
    ModelRenderer Head2;
    ModelRenderer Headband1;
    ModelRenderer HeadBand3;
    ModelRenderer Head3;
    ModelRenderer HeadCap1;
    ModelRenderer HeadCap2;
    ModelRenderer Neck;
    ModelRenderer TorsoMain;
    ModelRenderer Dress1;
    ModelRenderer Dress2;
    ModelRenderer Dress3;
    ModelRenderer Dress4;
    ModelRenderer Dress5;
    ModelRenderer Dress6;
    ModelRenderer Dress7;
    ModelRenderer Dress8;
    ModelRenderer Dress9;
    ModelRenderer Dress10;
    ModelRenderer Dress11;
    ModelRenderer Dress12;
    ModelRenderer Dress13;
    ModelRenderer Dress14;
    ModelRenderer LeftWing1;
    ModelRenderer LeftWing2;
    ModelRenderer LeftWing3;
    ModelRenderer LeftWing4;
    ModelRenderer LeftWing5;
    ModelRenderer LeftWing6;
    ModelRenderer LeftWing7;
    ModelRenderer RightWing1;
    ModelRenderer RightWing2;
    ModelRenderer RightWing3;
    ModelRenderer RightWing4;
    ModelRenderer RightWing5;
    ModelRenderer RightWing6;
    ModelRenderer RightWing7;

    ModelArmsCovering armsCovering = new ModelArmsCovering();
    private ModelArmsIdle armsIdle = new ModelArmsIdle();
    private ModelArmsAngry armsAngry = new ModelArmsAngry();
    private ModelArmsPointing armsPoint = new ModelArmsPointing();


    public ModelAngelMel() {
        textureWidth = 128;
        textureHeight = 128;
        Eye1 = new ModelRenderer(this, 10, 17);
        Eye1.addBox(-1.5F, -4.25F, -3.1F, 1, 1, 1);
        Eye1.setRotationPoint(0F, -0.5F, 0F);
        Eye1.setTextureSize(128, 128);
        Eye1.mirror = true;
        setRotation(Eye1, 0F, 0.0872665F, 0F);
        Eye2 = new ModelRenderer(this, 10, 19);
        Eye2.addBox(0.5F, -4.25F, -3.1F, 1, 1, 1);
        Eye2.setRotationPoint(0F, -0.5F, 0F);
        Eye2.setTextureSize(128, 128);
        Eye2.mirror = true;
        setRotation(Eye2, 0F, -0.0872665F, 0F);
        EyeBacking = new ModelRenderer(this, 0, 6);
        EyeBacking.addBox(-2F, -4.5F, -2.9F, 4, 2, 1);
        EyeBacking.setRotationPoint(0F, -0.5F, 0F);
        EyeBacking.setTextureSize(128, 128);
        EyeBacking.mirror = true;
        setRotation(EyeBacking, 0F, 0F, 0F);
        EyeMiddle = new ModelRenderer(this, 0, 21);
        EyeMiddle.addBox(-0.5F, -4.5F, -3F, 1, 2, 1);
        EyeMiddle.setRotationPoint(0F, -0.5F, 0F);
        EyeMiddle.setTextureSize(128, 128);
        EyeMiddle.mirror = true;
        setRotation(EyeMiddle, 0F, 0F, 0F);
        Hair1 = new ModelRenderer(this, 30, 9);
        Hair1.addBox(-2F, -6F, -3.25F, 4, 1, 1);
        Hair1.setRotationPoint(0F, -0.5F, 0F);
        Hair1.setTextureSize(128, 128);
        Hair1.mirror = true;
        setRotation(Hair1, 0F, 0F, 0F);
        Hair2 = new ModelRenderer(this, 34, 0);
        Hair2.addBox(2.25F, -4F, -2F, 1, 1, 1);
        Hair2.setRotationPoint(0F, -0.5F, 0F);
        Hair2.setTextureSize(128, 128);
        Hair2.mirror = true;
        setRotation(Hair2, 0F, 0F, 0F);
        Hair3 = new ModelRenderer(this, 32, 2);
        Hair3.addBox(2.25F, -5F, -1F, 1, 1, 2);
        Hair3.setRotationPoint(0F, -0.5F, 0F);
        Hair3.setTextureSize(128, 128);
        Hair3.mirror = true;
        setRotation(Hair3, 0F, 0F, 0F);
        Hair4 = new ModelRenderer(this, 32, 5);
        Hair4.addBox(2.25F, -4F, 1F, 1, 3, 1);
        Hair4.setRotationPoint(0F, -0.5F, 0F);
        Hair4.setTextureSize(128, 128);
        Hair4.mirror = true;
        setRotation(Hair4, 0F, 0F, 0F);
        Hair5 = new ModelRenderer(this, 34, 0);
        Hair5.addBox(-3.25F, -4F, -2F, 1, 1, 1);
        Hair5.setRotationPoint(0F, -0.5F, 0F);
        Hair5.setTextureSize(128, 128);
        Hair5.mirror = true;
        setRotation(Hair5, 0F, 0F, 0F);
        Hair6 = new ModelRenderer(this, 32, 2);
        Hair6.addBox(-3.25F, -5F, -1F, 1, 1, 2);
        Hair6.setRotationPoint(0F, -0.5F, 0F);
        Hair6.setTextureSize(128, 128);
        Hair6.mirror = true;
        setRotation(Hair6, 0F, 0F, 0F);
        Hair7 = new ModelRenderer(this, 32, 5);
        Hair7.addBox(-3.25F, -4F, 1F, 1, 3, 1);
        Hair7.setRotationPoint(0F, -0.5F, 0F);
        Hair7.setTextureSize(128, 128);
        Hair7.mirror = true;
        setRotation(Hair7, 0F, 0F, 0F);
        Hair8 = new ModelRenderer(this, 30, 11);
        Hair8.addBox(-2F, -2F, 1.75F, 4, 1, 1);
        Hair8.setRotationPoint(0F, -0.5F, 0F);
        Hair8.setTextureSize(128, 128);
        Hair8.mirror = true;
        setRotation(Hair8, 0F, 0F, 0F);
        EarLeft = new ModelRenderer(this, 60, 0);
        EarLeft.addBox(0F, -4F, 0F, 1, 2, 2);
        EarLeft.setRotationPoint(-3F, -0.5F, -1F);
        EarLeft.setTextureSize(128, 128);
        EarLeft.mirror = true;
        setRotation(EarLeft, 0F, -0.0872665F, 0F);
        EarRight = new ModelRenderer(this, 60, 0);
        EarRight.addBox(-1F, -4F, 0F, 1, 2, 2);
        EarRight.setRotationPoint(3F, -0.5F, -1F);
        EarRight.setTextureSize(128, 128);
        EarRight.mirror = true;
        setRotation(EarRight, 0F, 0.0872665F, 0F);
        Nose = new ModelRenderer(this, 10, 2);
        Nose.addBox(-0.5F, 0F, -1F, 1, 1, 1);
        Nose.setRotationPoint(0F, -4F, -3F);
        Nose.setTextureSize(128, 128);
        Nose.mirror = true;
        setRotation(Nose, 1.396263F, 0F, 0F);
        HeadBack = new ModelRenderer(this, 0, 0);
        HeadBack.addBox(-2F, -7F, 2F, 4, 5, 1);
        HeadBack.setRotationPoint(0F, -0.5F, 0F);
        HeadBack.setTextureSize(128, 128);
        HeadBack.mirror = true;
        setRotation(HeadBack, 0F, 0F, 0F);
        MouthAngle1 = new ModelRenderer(this, 14, 2);
        MouthAngle1.addBox(-1F, 0F, -1F, 1, 1, 1);
        MouthAngle1.setRotationPoint(-0.5F, -1.5F, -2F);
        MouthAngle1.setTextureSize(128, 128);
        MouthAngle1.mirror = true;
        setRotation(MouthAngle1, 0F, 0F, 1.047198F);
        MouthAngle2 = new ModelRenderer(this, 14, 2);
        MouthAngle2.addBox(0F, 0F, -1F, 1, 1, 1);
        MouthAngle2.setRotationPoint(0.5F, -1.5F, -2F);
        MouthAngle2.setTextureSize(128, 128);
        MouthAngle2.mirror = true;
        setRotation(MouthAngle2, 0F, 0F, -1.047198F);
        Chin = new ModelRenderer(this, 10, 11);
        Chin.addBox(-1.5F, -1F, -3F, 3, 1, 1);
        Chin.setRotationPoint(0F, -0.5F, 0F);
        Chin.setTextureSize(128, 128);
        Chin.mirror = true;
        setRotation(Chin, 0F, 0F, 0F);
        Noselower = new ModelRenderer(this, 0, 10);
        Noselower.addBox(-2F, -3F, -3F, 4, 1, 1);
        Noselower.setRotationPoint(0F, -0.5F, 0F);
        Noselower.setTextureSize(128, 128);
        Noselower.mirror = true;
        setRotation(Noselower, 0F, 0F, 0F);
        MouthInner = new ModelRenderer(this, 10, 0);
        MouthInner.addBox(-1.75F, -2F, -2.7F, 3, 1, 1);
        MouthInner.setRotationPoint(0F, -0.5F, 0F);
        MouthInner.setTextureSize(128, 128);
        MouthInner.mirror = true;
        setRotation(MouthInner, 0F, 0F, 0F);
        MouthUpper = new ModelRenderer(this, 10, 9);
        MouthUpper.addBox(-1.5F, -2.5F, -3F, 3, 1, 1);
        MouthUpper.setRotationPoint(0F, -0.5F, 0F);
        MouthUpper.setTextureSize(128, 128);
        MouthUpper.mirror = true;
        setRotation(MouthUpper, 0F, 0F, 0F);
        EyeAngle1 = new ModelRenderer(this, 4, 21);
        EyeAngle1.addBox(0F, -1F, 0F, 2, 1, 1);
        EyeAngle1.setRotationPoint(-2F, -5F, -3F);
        EyeAngle1.setTextureSize(128, 128);
        EyeAngle1.mirror = true;
        setRotation(EyeAngle1, 0F, 0F, 0.0872665F);
        EyeAngle2 = new ModelRenderer(this, 4, 21);
        EyeAngle2.addBox(-2F, -1F, 0F, 2, 1, 1);
        EyeAngle2.setRotationPoint(2F, -5F, -3F);
        EyeAngle2.setTextureSize(128, 128);
        EyeAngle2.mirror = true;
        setRotation(EyeAngle2, 0F, 0F, -0.0872665F);
        MouthUpper2 = new ModelRenderer(this, 10, 6);
        MouthUpper2.addBox(1F, -2F, -3F, 1, 2, 1);
        MouthUpper2.setRotationPoint(0F, -0.5F, 0F);
        MouthUpper2.setTextureSize(128, 128);
        MouthUpper2.mirror = true;
        setRotation(MouthUpper2, 0F, 0F, 0F);
        Forehead2 = new ModelRenderer(this, 0, 19);
        Forehead2.addBox(-2F, -5.5F, -3F, 4, 1, 1);
        Forehead2.setRotationPoint(0F, -0.5F, 0F);
        Forehead2.setTextureSize(128, 128);
        Forehead2.mirror = true;
        setRotation(Forehead2, 0F, 0F, 0F);
        Forehead5 = new ModelRenderer(this, 60, 14);
        Forehead5.addBox(-2.5F, -7.5F, -2F, 5, 1, 4);
        Forehead5.setRotationPoint(0F, -0.5F, 0F);
        Forehead5.setTextureSize(128, 128);
        Forehead5.mirror = true;
        setRotation(Forehead5, 0F, 0F, 0F);
        MouthUpper3 = new ModelRenderer(this, 10, 6);
        MouthUpper3.addBox(-2F, -2F, -3F, 1, 2, 1);
        MouthUpper3.setRotationPoint(0F, -0.5F, 0F);
        MouthUpper3.setTextureSize(128, 128);
        MouthUpper3.mirror = true;
        setRotation(MouthUpper3, 0F, 0F, 0F);
        Tooth3 = new ModelRenderer(this, 14, 4);
        Tooth3.addBox(-1F, -1F, -0.8F, 1, 1, 1);
        Tooth3.setRotationPoint(0.5F, -1.8F, -2F);
        Tooth3.setTextureSize(128, 128);
        Tooth3.mirror = true;
        setRotation(Tooth3, 0F, 0F, 0.7853982F);
        Tooth1 = new ModelRenderer(this, 14, 4);
        Tooth1.addBox(-1F, -1F, -0.8F, 1, 1, 1);
        Tooth1.setRotationPoint(-0.5F, -1.8F, -2F);
        Tooth1.setTextureSize(128, 128);
        Tooth1.mirror = true;
        setRotation(Tooth1, 0F, 0F, 0.7853982F);
        Tooth2 = new ModelRenderer(this, 14, 4);
        Tooth2.addBox(-1F, -1F, -0.8F, 1, 1, 1);
        Tooth2.setRotationPoint(0F, -1.8F, -2F);
        Tooth2.setTextureSize(128, 128);
        Tooth2.mirror = true;
        setRotation(Tooth2, 0F, 0F, 0.7853982F);
        HeadBand2 = new ModelRenderer(this, 90, 0);
        HeadBand2.addBox(-3F, -5F, -5F, 6, 1, 6);
        HeadBand2.setRotationPoint(0F, -0.5F, 0F);
        HeadBand2.setTextureSize(128, 128);
        HeadBand2.mirror = true;
        setRotation(HeadBand2, -0.4363323F, 0F, 0F);
        Head2 = new ModelRenderer(this, 40, 11);
        Head2.addBox(-2.5F, -7F, -2.5F, 5, 7, 5);
        Head2.setRotationPoint(0F, -0.5F, 0F);
        Head2.setTextureSize(128, 128);
        Head2.mirror = true;
        setRotation(Head2, 0F, 0F, 0F);
        Headband1 = new ModelRenderer(this, 66, 0);
        Headband1.addBox(-2.5F, -5F, -5.5F, 5, 1, 7);
        Headband1.setRotationPoint(0F, -0.5F, 0F);
        Headband1.setTextureSize(128, 128);
        Headband1.mirror = true;
        setRotation(Headband1, -0.4363323F, 0F, 0F);
        HeadBand3 = new ModelRenderer(this, 90, 7);
        HeadBand3.addBox(-3.5F, -5F, -4.5F, 7, 1, 5);
        HeadBand3.setRotationPoint(0F, -0.5F, 0F);
        HeadBand3.setTextureSize(128, 128);
        HeadBand3.mirror = true;
        setRotation(HeadBand3, -0.4363323F, 0F, 0F);
        Head3 = new ModelRenderer(this, 40, 0);
        Head3.addBox(-3F, -7F, -2F, 6, 7, 4);
        Head3.setRotationPoint(0F, -0.5F, 0F);
        Head3.setTextureSize(128, 128);
        Head3.mirror = true;
        setRotation(Head3, 0F, 0F, 0F);
        HeadCap1 = new ModelRenderer(this, 0, 17);
        HeadCap1.addBox(-2F, -7F, -3F, 4, 1, 1);
        HeadCap1.setRotationPoint(0F, -0.5F, 0F);
        HeadCap1.setTextureSize(128, 128);
        HeadCap1.mirror = true;
        setRotation(HeadCap1, 0F, 0F, 0F);
        HeadCap2 = new ModelRenderer(this, 60, 8);
        HeadCap2.addBox(-2F, -7.5F, -2.5F, 4, 1, 5);
        HeadCap2.setRotationPoint(0F, -0.5F, 0F);
        HeadCap2.setTextureSize(128, 128);
        HeadCap2.mirror = true;
        setRotation(HeadCap2, 0F, 0F, 0F);
        Neck = new ModelRenderer(this, 0, 13);
        Neck.addBox(-2F, -1F, -1.5F, 4, 1, 3);
        Neck.setRotationPoint(0F, 0F, 0F);
        Neck.setTextureSize(128, 128);
        Neck.mirror = true;
        setRotation(Neck, 0F, 0F, 0F);
        TorsoMain = new ModelRenderer(this, 39, 25);
        TorsoMain.addBox(-3.5F, 0F, -2F, 7, 10, 4);
        TorsoMain.setRotationPoint(0F, 0F, 0F);
        TorsoMain.setTextureSize(128, 128);
        TorsoMain.mirror = true;
        setRotation(TorsoMain, 0F, 0F, 0F);
        Dress1 = new ModelRenderer(this, 42, 40);
        Dress1.addBox(-3.5F, 0F, 0F, 7, 8, 1);
        Dress1.setRotationPoint(0F, 2F, -2F);
        Dress1.setTextureSize(128, 128);
        Dress1.mirror = true;
        setRotation(Dress1, -0.0872665F, 0F, 0F);
        Dress2 = new ModelRenderer(this, 42, 40);
        Dress2.addBox(-3.5F, 0F, -1F, 7, 8, 1);
        Dress2.setRotationPoint(0F, 2F, 2F);
        Dress2.setTextureSize(128, 128);
        Dress2.mirror = true;
        setRotation(Dress2, 0.0872665F, 0F, 0F);
        Dress3 = new ModelRenderer(this, 43, 50);
        Dress3.addBox(-3F, 0F, 0F, 6, 14, 1);
        Dress3.setRotationPoint(0F, 10F, -2.5F);
        Dress3.setTextureSize(128, 128);
        Dress3.mirror = true;
        setRotation(Dress3, -0.0523599F, 0F, 0F);
        Dress4 = new ModelRenderer(this, 43, 66);
        Dress4.addBox(-3F, 9F, 1.5F, 6, 5, 1);
        Dress4.setRotationPoint(0F, 10F, -2.5F);
        Dress4.setTextureSize(128, 128);
        Dress4.mirror = true;
        setRotation(Dress4, -0.2094395F, 0F, 0F);
        Dress5 = new ModelRenderer(this, 43, 73);
        Dress5.addBox(-3F, 10F, 4F, 6, 4, 1);
        Dress5.setRotationPoint(0F, 10F, -2.5F);
        Dress5.setTextureSize(128, 128);
        Dress5.mirror = true;
        setRotation(Dress5, -0.4363323F, 0F, 0F);
        Dress6 = new ModelRenderer(this, 43, 79);
        Dress6.addBox(-2F, 0F, -2.5F, 2, 14, 5);
        Dress6.setRotationPoint(3.5F, 10F, 0F);
        Dress6.setTextureSize(128, 128);
        Dress6.mirror = true;
        setRotation(Dress6, 0F, 0F, -0.0523599F);
        Dress7 = new ModelRenderer(this, 43, 99);
        Dress7.addBox(-3.5F, 9F, -2.5F, 2, 5, 5);
        Dress7.setRotationPoint(3.5F, 10F, 0F);
        Dress7.setTextureSize(128, 128);
        Dress7.mirror = true;
        setRotation(Dress7, 0F, 0F, -0.2094395F);
        Dress8 = new ModelRenderer(this, 43, 110);
        Dress8.addBox(-6F, 10F, -2.5F, 2, 4, 5);
        Dress8.setRotationPoint(3.5F, 10F, 0F);
        Dress8.setTextureSize(128, 128);
        Dress8.mirror = true;
        setRotation(Dress8, 0F, 0F, -0.4363323F);
        Dress9 = new ModelRenderer(this, 43, 50);
        Dress9.addBox(-3F, 0F, -1F, 6, 14, 1);
        Dress9.setRotationPoint(0F, 10F, 2.5F);
        Dress9.setTextureSize(128, 128);
        Dress9.mirror = true;
        setRotation(Dress9, 0.0523599F, 0F, 0F);
        Dress10 = new ModelRenderer(this, 43, 66);
        Dress10.addBox(-3F, 9F, -2.5F, 6, 5, 1);
        Dress10.setRotationPoint(0F, 10F, 2.5F);
        Dress10.setTextureSize(128, 128);
        Dress10.mirror = true;
        setRotation(Dress10, 0.2094395F, 0F, 0F);
        Dress11 = new ModelRenderer(this, 43, 73);
        Dress11.addBox(-3F, 10F, -5F, 6, 4, 1);
        Dress11.setRotationPoint(0F, 10F, 2.5F);
        Dress11.setTextureSize(128, 128);
        Dress11.mirror = true;
        setRotation(Dress11, 0.4363323F, 0F, 0F);
        Dress12 = new ModelRenderer(this, 43, 79);
        Dress12.addBox(0F, 0F, -2.5F, 2, 14, 5);
        Dress12.setRotationPoint(-3.5F, 10F, 0F);
        Dress12.setTextureSize(128, 128);
        Dress12.mirror = true;
        setRotation(Dress12, 0F, 0F, 0.0523599F);
        Dress13 = new ModelRenderer(this, 43, 99);
        Dress13.addBox(1.5F, 9F, -2.5F, 2, 5, 5);
        Dress13.setRotationPoint(-3.5F, 10F, 0F);
        Dress13.setTextureSize(128, 128);
        Dress13.mirror = true;
        setRotation(Dress13, 0F, 0F, 0.2094395F);
        Dress14 = new ModelRenderer(this, 43, 110);
        Dress14.addBox(4F, 10F, -2.5F, 2, 4, 5);
        Dress14.setRotationPoint(-3.5F, 10F, 0F);
        Dress14.setTextureSize(128, 128);
        Dress14.mirror = true;
        setRotation(Dress14, 0F, 0F, 0.4363323F);
        LeftWing1 = new ModelRenderer(this, 8, 40);
        LeftWing1.addBox(6F, 0F, -1F, 1, 16, 1);
        LeftWing1.setRotationPoint(2F, 0F, 4F);
        LeftWing1.setTextureSize(128, 128);
        LeftWing1.mirror = true;
        setRotation(LeftWing1, 0F, -0.2617994F, 0F);
        LeftWing2 = new ModelRenderer(this, 12, 40);
        LeftWing2.addBox(5F, -1F, -1F, 1, 16, 1);
        LeftWing2.setRotationPoint(2F, 0F, 4F);
        LeftWing2.setTextureSize(128, 128);
        LeftWing2.mirror = true;
        setRotation(LeftWing2, 0F, -0.2617994F, 0F);
        LeftWing3 = new ModelRenderer(this, 16, 40);
        LeftWing3.addBox(4F, -2F, -1F, 1, 16, 1);
        LeftWing3.setRotationPoint(2F, 0F, 4F);
        LeftWing3.setTextureSize(128, 128);
        LeftWing3.mirror = true;
        setRotation(LeftWing3, 0F, -0.2617994F, 0F);
        LeftWing4 = new ModelRenderer(this, 20, 40);
        LeftWing4.addBox(3F, -2F, -1F, 1, 14, 1);
        LeftWing4.setRotationPoint(2F, 0F, 4F);
        LeftWing4.setTextureSize(128, 128);
        LeftWing4.mirror = true;
        setRotation(LeftWing4, 0F, -0.2617994F, 0F);
        LeftWing5 = new ModelRenderer(this, 24, 40);
        LeftWing5.addBox(2F, -1F, -1F, 1, 11, 1);
        LeftWing5.setRotationPoint(2F, 0F, 4F);
        LeftWing5.setTextureSize(128, 128);
        LeftWing5.mirror = true;
        setRotation(LeftWing5, 0F, -0.2617994F, 0F);
        LeftWing6 = new ModelRenderer(this, 28, 40);
        LeftWing6.addBox(0F, 1F, -1F, 2, 5, 1);
        LeftWing6.setRotationPoint(2F, 0F, 4F);
        LeftWing6.setTextureSize(128, 128);
        LeftWing6.mirror = true;
        setRotation(LeftWing6, 0F, -0.2617994F, 0F);
        LeftWing7 = new ModelRenderer(this, 34, 40);
        LeftWing7.addBox(0F, 1F, -3F, 1, 5, 3);
        LeftWing7.setRotationPoint(2F, 0F, 4F);
        LeftWing7.setTextureSize(128, 128);
        LeftWing7.mirror = true;
        setRotation(LeftWing7, 0F, 0.6108652F, 0F);
        RightWing1 = new ModelRenderer(this, 8, 40);
        RightWing1.addBox(-7F, 0F, -1F, 1, 16, 1);
        RightWing1.setRotationPoint(-2F, 0F, 4F);
        RightWing1.setTextureSize(128, 128);
        RightWing1.mirror = true;
        setRotation(RightWing1, 0F, 0.2617994F, 0F);
        RightWing2 = new ModelRenderer(this, 12, 40);
        RightWing2.addBox(-6F, -1F, -1F, 1, 16, 1);
        RightWing2.setRotationPoint(-2F, 0F, 4F);
        RightWing2.setTextureSize(128, 128);
        RightWing2.mirror = true;
        setRotation(RightWing2, 0F, 0.2617994F, 0F);
        RightWing3 = new ModelRenderer(this, 16, 40);
        RightWing3.addBox(-5F, -2F, -1F, 1, 16, 1);
        RightWing3.setRotationPoint(-2F, 0F, 4F);
        RightWing3.setTextureSize(128, 128);
        RightWing3.mirror = true;
        setRotation(RightWing3, 0F, 0.2617994F, 0F);
        RightWing4 = new ModelRenderer(this, 20, 40);
        RightWing4.addBox(-4F, -2F, -1F, 1, 14, 1);
        RightWing4.setRotationPoint(-2F, 0F, 4F);
        RightWing4.setTextureSize(128, 128);
        RightWing4.mirror = true;
        setRotation(RightWing4, 0F, 0.2617994F, 0F);
        RightWing5 = new ModelRenderer(this, 24, 40);
        RightWing5.addBox(-3F, -1F, -1F, 1, 11, 1);
        RightWing5.setRotationPoint(-2F, 0F, 4F);
        RightWing5.setTextureSize(128, 128);
        RightWing5.mirror = true;
        setRotation(RightWing5, 0F, 0.2617994F, 0F);
        RightWing6 = new ModelRenderer(this, 66, 40);
        RightWing6.addBox(-2F, 1F, -1F, 2, 5, 1);
        RightWing6.setRotationPoint(-2F, 0F, 4F);
        RightWing6.setTextureSize(128, 128);
        RightWing6.mirror = true;
        setRotation(RightWing6, 0F, 0.2617994F, 0F);
        RightWing7 = new ModelRenderer(this, 58, 40);
        RightWing7.addBox(-1F, 1F, -3F, 1, 5, 3);
        RightWing7.setRotationPoint(-2F, 0F, 4F);
        RightWing7.setTextureSize(128, 128);
        RightWing7.mirror = true;
        setRotation(RightWing7, 0F, -0.6108652F, 0F);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {

        Eye1.render(scale);
        Eye2.render(scale);
        EyeBacking.render(scale);
        EyeMiddle.render(scale);
        Hair1.render(scale);
        Hair2.render(scale);
        Hair3.render(scale);
        Hair4.render(scale);
        Hair5.render(scale);
        Hair6.render(scale);
        Hair7.render(scale);
        Hair8.render(scale);
        EarLeft.render(scale);
        EarRight.render(scale);
        Nose.render(scale);
        HeadBack.render(scale);
        MouthAngle1.render(scale);
        MouthAngle2.render(scale);
        Chin.render(scale);
        Noselower.render(scale);
        MouthInner.render(scale);
        MouthUpper.render(scale);
        EyeAngle1.render(scale);
        EyeAngle2.render(scale);
        MouthUpper2.render(scale);
        Forehead2.render(scale);
        Forehead5.render(scale);
        MouthUpper3.render(scale);
        Tooth3.render(scale);
        Tooth1.render(scale);
        Tooth2.render(scale);
        HeadBand2.render(scale);
        Head2.render(scale);
        Headband1.render(scale);
        HeadBand3.render(scale);
        Head3.render(scale);
        HeadCap1.render(scale);
        HeadCap2.render(scale);
        Neck.render(scale);
        TorsoMain.render(scale);
        Dress1.render(scale);
        Dress2.render(scale);
        Dress3.render(scale);
        Dress4.render(scale);
        Dress5.render(scale);
        Dress6.render(scale);
        Dress7.render(scale);
        Dress8.render(scale);
        Dress9.render(scale);
        Dress10.render(scale);
        Dress11.render(scale);
        Dress12.render(scale);
        Dress13.render(scale);
        Dress14.render(scale);
        LeftWing1.render(scale);
        LeftWing2.render(scale);
        LeftWing3.render(scale);
        LeftWing4.render(scale);
        LeftWing5.render(scale);
        LeftWing6.render(scale);
        LeftWing7.render(scale);
        RightWing1.render(scale);
        RightWing2.render(scale);
        RightWing3.render(scale);
        RightWing4.render(scale);
        RightWing5.render(scale);
        RightWing6.render(scale);
        RightWing7.render(scale);

        if (entityIn instanceof EntityWeepingAngel) {
            EntityWeepingAngel angel = (EntityWeepingAngel) entityIn;
            PoseBase pose = PoseManager.getPoseFromString(angel.getPose());

            //Covering Face arms render/
            if (pose == PoseManager.POSE_HIDING_FACE) {
                Minecraft.getMinecraft().getTextureManager().bindTexture(RenderWeepingAngel.TEXTURE_FOUR);
                armsCovering.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
                return;
            }

            //Idle render
            if (pose == PoseManager.POSE_IDLE) {
                Minecraft.getMinecraft().getTextureManager().bindTexture(RenderWeepingAngel.TEXTURE_FOUR);
                armsIdle.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
                return;
            }

            //Shriek render
            if (pose.getRegistryName().toLowerCase().contains("angry")) {
                Minecraft.getMinecraft().getTextureManager().bindTexture(RenderWeepingAngel.TEXTURE_FOUR);
                armsAngry.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
                return;
            }

            if (pose == PoseManager.POSE_SHY) {
                Minecraft.getMinecraft().getTextureManager().bindTexture(RenderWeepingAngel.TEXTURE_FOUR);
                armsPoint.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
                return;
            }

            armsCovering.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        } else {
            armsCovering.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        }

    }
}
