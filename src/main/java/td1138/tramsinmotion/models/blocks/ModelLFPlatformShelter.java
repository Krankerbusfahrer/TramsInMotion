//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 12.01.2020 - 19:22:28
// Last changed on: 12.01.2020 - 19:22:28

package td1138.tramsinmotion.models.blocks; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelLFPlatformShelter extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelLFPlatformShelter() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[12];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 84, 28, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 73, 28, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 61, 54, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 106, 29, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 97, 42, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 116, 37, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 124, 3, textureX, textureY); // Box 11
		bodyModel[8] = new ModelRendererTurbo(this, 97, 56, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 162, 47, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 159, 59, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 126, 56, textureX, textureY); // Box 15

		bodyModel[0].addBox(0F, 0F, 0F, 2, 26, 2, 0F); // Box 0
		bodyModel[0].setRotationPoint(-8F, -20F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 26, 2, 0F); // Box 1
		bodyModel[1].setRotationPoint(6F, -20F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(6F, -25F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-8F, -25F, -8F);

		bodyModel[4].addBox(0F, 0F, 0F, 16, 4, 16, 0F); // Box 4
		bodyModel[4].setRotationPoint(-8F, 6F, -8F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 5
		bodyModel[5].setRotationPoint(-8F, -25F, -3F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 6
		bodyModel[6].setRotationPoint(6F, -25F, -3F);

		bodyModel[7].addBox(0F, 0F, 0F, 12, 23, 0, 0F); // Box 11
		bodyModel[7].setRotationPoint(-6F, -18F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[8].setRotationPoint(-6F, -25F, -7.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 12, 1, 9, 0F); // Box 13
		bodyModel[9].setRotationPoint(-6F, -25F, -2.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 12, 1, 2, 0F); // Box 14
		bodyModel[10].setRotationPoint(-6F, -24F, 2.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 15
		bodyModel[11].setRotationPoint(-6F, -23F, 2F);
	}
}