//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 28.11.2024 - 12:18:57
// Last changed on: 28.11.2024 - 12:18:57

package com.flansmod.client.model.YourPackage; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelYourClassName extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelYourClassName() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[36];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 19
		bodyModel[13] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 20
		bodyModel[14] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 21
		bodyModel[15] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 22
		bodyModel[16] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 23
		bodyModel[17] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 24
		bodyModel[18] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 25
		bodyModel[19] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 31
		bodyModel[20] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 33
		bodyModel[21] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 34
		bodyModel[22] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 35
		bodyModel[23] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 36
		bodyModel[24] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 37
		bodyModel[25] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 38
		bodyModel[26] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 39
		bodyModel[27] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 40
		bodyModel[28] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 41
		bodyModel[29] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 42
		bodyModel[30] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 43
		bodyModel[31] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 44
		bodyModel[32] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 45
		bodyModel[33] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 46
		bodyModel[34] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 47
		bodyModel[35] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 49

		bodyModel[0].addBox(0F, 0F, 0F, 4, 16, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-2F, -6F, -2F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 46, 3, 0F); // Box 1
		bodyModel[1].setRotationPoint(-1.5F, -52F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-2F, -7F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 1, 22, 0F); // Box 3
		bodyModel[3].setRotationPoint(-0.5F, -37F, 2F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 4
		bodyModel[4].setRotationPoint(-0.5F, -37F, -22F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 5
		bodyModel[5].setRotationPoint(-2F, -37F, -2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 6
		bodyModel[6].setRotationPoint(-2F, -50F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 0, 1, 21, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -13.5F, 1.5F, 0F, -13.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F); // Box 7
		bodyModel[7].setRotationPoint(0F, -50F, 1.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-0.5F, -37F, 22.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-0.5F, -37F, -21.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-0.5F, -37F, -2.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 12
		bodyModel[11].setRotationPoint(-0.5F, -37F, 1.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 1F, 0F, -0.4F, 1F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -1.8F, 0F, -0.4F, -1.8F, 0F); // Box 19
		bodyModel[12].setRotationPoint(-0.5F, -34.6F, -16.1F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F); // Box 20
		bodyModel[13].setRotationPoint(-0.45F, -34.2F, -15.45F);
		bodyModel[13].rotateAngleY = -1.57079633F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0.1F, -0.8F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, -0.8F, -0.4F, -0.8F, -0.8F); // Box 21
		bodyModel[14].setRotationPoint(-0.1F, -34.4F, -15.45F);
		bodyModel[14].rotateAngleY = -1.57079633F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F); // Box 22
		bodyModel[15].setRotationPoint(-8.3F, -34.2F, -15.45F);
		bodyModel[15].rotateAngleY = -1.57079633F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, -0.8F, -0.4F, 0.4F, -0.8F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, -0.8F, -0.4F, -0.8F, -0.8F); // Box 23
		bodyModel[16].setRotationPoint(-8.05F, -34.4F, -15.45F);
		bodyModel[16].rotateAngleY = -1.57079633F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F); // Box 24
		bodyModel[17].setRotationPoint(7.3F, -34.2F, -15.45F);
		bodyModel[17].rotateAngleY = -1.57079633F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, -0.8F, -0.4F, 0.4F, -0.8F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, -0.8F, -0.4F, -0.8F, -0.8F); // Box 25
		bodyModel[18].setRotationPoint(7.85F, -34.4F, -15.45F);
		bodyModel[18].rotateAngleY = -1.57079633F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 0, 1, 19, 0F,0F, -13.5F, 1.5F, 0F, -13.5F, 1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[19].setRotationPoint(0F, -50F, -20.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 33
		bodyModel[20].setRotationPoint(-0.5F, -37F, -16.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 34
		bodyModel[21].setRotationPoint(-0.5F, -36F, -11.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F); // Box 35
		bodyModel[22].setRotationPoint(-8F, -38F, -16F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[23].setRotationPoint(0F, -38F, -16F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F); // Box 37
		bodyModel[24].setRotationPoint(-8.3F, -34.2F, 16.55F);
		bodyModel[24].rotateAngleY = -1.57079633F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, -0.8F, -0.4F, 0.4F, -0.8F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, -0.8F, -0.4F, -0.8F, -0.8F); // Box 38
		bodyModel[25].setRotationPoint(-8.05F, -34.4F, 16.55F);
		bodyModel[25].rotateAngleY = -1.57079633F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F); // Box 39
		bodyModel[26].setRotationPoint(-8F, -38F, 16F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 40
		bodyModel[27].setRotationPoint(-0.5F, -37F, 15.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[28].setRotationPoint(0F, -38F, 16F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, -0.8F, -0.4F, 0.4F, -0.8F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, -0.8F, -0.4F, -0.8F, -0.8F); // Box 42
		bodyModel[29].setRotationPoint(7.85F, -34.4F, 16.55F);
		bodyModel[29].rotateAngleY = -1.57079633F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F); // Box 43
		bodyModel[30].setRotationPoint(7.3F, -34.2F, 16.55F);
		bodyModel[30].rotateAngleY = -1.57079633F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0.1F, -0.8F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, -0.8F, -0.4F, -0.8F, -0.8F); // Box 44
		bodyModel[31].setRotationPoint(-0.1F, -34.4F, 16.55F);
		bodyModel[31].rotateAngleY = -1.57079633F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F); // Box 45
		bodyModel[32].setRotationPoint(-0.45F, -34.2F, 16.55F);
		bodyModel[32].rotateAngleY = -1.57079633F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 1F, 0F, -0.4F, 1F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -1.8F, 0F, -0.4F, -1.8F, 0F); // Box 46
		bodyModel[33].setRotationPoint(-0.5F, -34.6F, 15.9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 47
		bodyModel[34].setRotationPoint(-0.5F, -36F, 20.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F); // Box 49
		bodyModel[35].setRotationPoint(-2F, -52.4F, -2F);
	}
}