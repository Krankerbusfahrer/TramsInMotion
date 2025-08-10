//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 04.05.2025 - 19:32:05
// Last changed on: 04.05.2025 - 19:32:05

package td1138.tramsinmotion.models.rollingstock; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;


public class ModelGT8NCDUMiddle extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelGT8NCDUMiddle() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[133];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 113, 179, textureX, textureY); // Box 376
		bodyModel[1] = new ModelRendererTurbo(this, 113, 179, textureX, textureY); // Box 341
		bodyModel[2] = new ModelRendererTurbo(this, 96, 159, textureX, textureY); // Box 243
		bodyModel[3] = new ModelRendererTurbo(this, 168, 187, textureX, textureY); // Box 249
		bodyModel[4] = new ModelRendererTurbo(this, 96, 201, textureX, textureY); // Box 265
		bodyModel[5] = new ModelRendererTurbo(this, 98, 205, textureX, textureY); // Box 267
		bodyModel[6] = new ModelRendererTurbo(this, 178, 187, textureX, textureY); // Box 431
		bodyModel[7] = new ModelRendererTurbo(this, 188, 187, textureX, textureY); // Box 432
		bodyModel[8] = new ModelRendererTurbo(this, 197, 187, textureX, textureY); // Box 433
		bodyModel[9] = new ModelRendererTurbo(this, 125, 187, textureX, textureY); // Box 428
		bodyModel[10] = new ModelRendererTurbo(this, 135, 187, textureX, textureY); // Box 429
		bodyModel[11] = new ModelRendererTurbo(this, 145, 187, textureX, textureY); // Box 430
		bodyModel[12] = new ModelRendererTurbo(this, 156, 187, textureX, textureY); // Box 431
		bodyModel[13] = new ModelRendererTurbo(this, 42, 226, textureX, textureY); // Box 447
		bodyModel[14] = new ModelRendererTurbo(this, 2, 244, textureX, textureY); // Box 420
		bodyModel[15] = new ModelRendererTurbo(this, 17, 238, textureX, textureY); // Box 430
		bodyModel[16] = new ModelRendererTurbo(this, 20, 187, textureX, textureY); // Box 146
		bodyModel[17] = new ModelRendererTurbo(this, 7, 190, textureX, textureY); // Box 456
		bodyModel[18] = new ModelRendererTurbo(this, 107, 209, textureX, textureY); // Box 466
		bodyModel[19] = new ModelRendererTurbo(this, 26, 181, textureX, textureY); // Box 107
		bodyModel[20] = new ModelRendererTurbo(this, 26, 189, textureX, textureY); // Box 377
		bodyModel[21] = new ModelRendererTurbo(this, 4, 172, textureX, textureY); // Box 378
		bodyModel[22] = new ModelRendererTurbo(this, 4, 206, textureX, textureY); // Box 379
		bodyModel[23] = new ModelRendererTurbo(this, 13, 165, textureX, textureY); // Box 513
		bodyModel[24] = new ModelRendererTurbo(this, 60, 225, textureX, textureY); // Box 266
		bodyModel[25] = new ModelRendererTurbo(this, 108, 232, textureX, textureY); // Box 267
		bodyModel[26] = new ModelRendererTurbo(this, 19, 225, textureX, textureY); // Box 268
		bodyModel[27] = new ModelRendererTurbo(this, 88, 232, textureX, textureY); // Box 269
		bodyModel[28] = new ModelRendererTurbo(this, 7, 225, textureX, textureY); // Box 274
		bodyModel[29] = new ModelRendererTurbo(this, 1, 215, textureX, textureY); // Box 282
		bodyModel[30] = new ModelRendererTurbo(this, 1, 218, textureX, textureY); // Box 283
		bodyModel[31] = new ModelRendererTurbo(this, 2, 187, textureX, textureY); // Box 285
		bodyModel[32] = new ModelRendererTurbo(this, 1, 183, textureX, textureY); // Box 286
		bodyModel[33] = new ModelRendererTurbo(this, 13, 219, textureX, textureY); // Box 282
		bodyModel[34] = new ModelRendererTurbo(this, 14, 215, textureX, textureY); // Box 286
		bodyModel[35] = new ModelRendererTurbo(this, 129, 215, textureX, textureY); // Box 245
		bodyModel[36] = new ModelRendererTurbo(this, 164, 215, textureX, textureY); // Box 334
		bodyModel[37] = new ModelRendererTurbo(this, 200, 215, textureX, textureY); // Box 335
		bodyModel[38] = new ModelRendererTurbo(this, 233, 215, textureX, textureY); // Box 336
		bodyModel[39] = new ModelRendererTurbo(this, 295, 218, textureX, textureY); // Box 337
		bodyModel[40] = new ModelRendererTurbo(this, 295, 215, textureX, textureY); // Box 338
		bodyModel[41] = new ModelRendererTurbo(this, 295, 187, textureX, textureY); // Box 339
		bodyModel[42] = new ModelRendererTurbo(this, 295, 183, textureX, textureY); // Box 340
		bodyModel[43] = new ModelRendererTurbo(this, 161, 168, textureX, textureY); // Box 68
		bodyModel[44] = new ModelRendererTurbo(this, 188, 194, textureX, textureY); // Box 167
		bodyModel[45] = new ModelRendererTurbo(this, 238, 195, textureX, textureY); // Box 326
		bodyModel[46] = new ModelRendererTurbo(this, 227, 196, textureX, textureY); // Box 327
		bodyModel[47] = new ModelRendererTurbo(this, 227, 204, textureX, textureY); // Box 328
		bodyModel[48] = new ModelRendererTurbo(this, 238, 204, textureX, textureY); // Box 329
		bodyModel[49] = new ModelRendererTurbo(this, 122, 247, textureX, textureY); // Box 273
		bodyModel[50] = new ModelRendererTurbo(this, 279, 217, textureX, textureY); // Box 177
		bodyModel[51] = new ModelRendererTurbo(this, 268, 243, textureX, textureY); // Box 180
		bodyModel[52] = new ModelRendererTurbo(this, 270, 246, textureX, textureY); // Box 181
		bodyModel[53] = new ModelRendererTurbo(this, 280, 244, textureX, textureY); // Box 143
		bodyModel[54] = new ModelRendererTurbo(this, 269, 217, textureX, textureY); // Box 144
		bodyModel[55] = new ModelRendererTurbo(this, 211, 187, textureX, textureY); // Box 457
		bodyModel[56] = new ModelRendererTurbo(this, 179, 225, textureX, textureY); // Box 255
		bodyModel[57] = new ModelRendererTurbo(this, 7, 190, textureX, textureY); // Box 355
		bodyModel[58] = new ModelRendererTurbo(this, 188, 194, textureX, textureY); // Box 356
		bodyModel[59] = new ModelRendererTurbo(this, 227, 196, textureX, textureY); // Box 357
		bodyModel[60] = new ModelRendererTurbo(this, 227, 204, textureX, textureY); // Box 358
		bodyModel[61] = new ModelRendererTurbo(this, 238, 204, textureX, textureY); // Box 359
		bodyModel[62] = new ModelRendererTurbo(this, 238, 195, textureX, textureY); // Box 360
		bodyModel[63] = new ModelRendererTurbo(this, 179, 225, textureX, textureY); // Box 361
		bodyModel[64] = new ModelRendererTurbo(this, 311, 217, textureX, textureY); // Box 362
		bodyModel[65] = new ModelRendererTurbo(this, 313, 241, textureX, textureY); // Box 363
		bodyModel[66] = new ModelRendererTurbo(this, 303, 244, textureX, textureY); // Box 364
		bodyModel[67] = new ModelRendererTurbo(this, 301, 242, textureX, textureY); // Box 365
		bodyModel[68] = new ModelRendererTurbo(this, 302, 217, textureX, textureY); // Box 366
		bodyModel[69] = new ModelRendererTurbo(this, 341, 247, textureX, textureY); // Box 19
		bodyModel[70] = new ModelRendererTurbo(this, 341, 247, textureX, textureY); // Box 21
		bodyModel[71] = new ModelRendererTurbo(this, 328, 242, textureX, textureY); // Box 129
		bodyModel[72] = new ModelRendererTurbo(this, 330, 244, textureX, textureY); // Box 130
		bodyModel[73] = new ModelRendererTurbo(this, 330, 244, textureX, textureY); // Box 131
		bodyModel[74] = new ModelRendererTurbo(this, 330, 244, textureX, textureY); // Box 412
		bodyModel[75] = new ModelRendererTurbo(this, 328, 242, textureX, textureY); // Box 413
		bodyModel[76] = new ModelRendererTurbo(this, 330, 244, textureX, textureY); // Box 414
		bodyModel[77] = new ModelRendererTurbo(this, 342, 250, textureX, textureY); // Box 320
		bodyModel[78] = new ModelRendererTurbo(this, 341, 250, textureX, textureY); // Box 321
		bodyModel[79] = new ModelRendererTurbo(this, 341, 250, textureX, textureY); // Box 323
		bodyModel[80] = new ModelRendererTurbo(this, 341, 250, textureX, textureY); // Box 324
		bodyModel[81] = new ModelRendererTurbo(this, 341, 250, textureX, textureY); // Box 325
		bodyModel[82] = new ModelRendererTurbo(this, 341, 250, textureX, textureY); // Box 327
		bodyModel[83] = new ModelRendererTurbo(this, 341, 250, textureX, textureY); // Box 334
		bodyModel[84] = new ModelRendererTurbo(this, 341, 250, textureX, textureY); // Box 335
		bodyModel[85] = new ModelRendererTurbo(this, 329, 249, textureX, textureY); // Box 423
		bodyModel[86] = new ModelRendererTurbo(this, 329, 249, textureX, textureY); // Box 424
		bodyModel[87] = new ModelRendererTurbo(this, 341, 250, textureX, textureY); // Box 432
		bodyModel[88] = new ModelRendererTurbo(this, 341, 250, textureX, textureY); // Box 435
		bodyModel[89] = new ModelRendererTurbo(this, 19, 225, textureX, textureY); // Box 387
		bodyModel[90] = new ModelRendererTurbo(this, 88, 232, textureX, textureY); // Box 388
		bodyModel[91] = new ModelRendererTurbo(this, 60, 225, textureX, textureY); // Box 389
		bodyModel[92] = new ModelRendererTurbo(this, 108, 232, textureX, textureY); // Box 390
		bodyModel[93] = new ModelRendererTurbo(this, 19, 225, textureX, textureY); // Box 391
		bodyModel[94] = new ModelRendererTurbo(this, 88, 232, textureX, textureY); // Box 392
		bodyModel[95] = new ModelRendererTurbo(this, 60, 225, textureX, textureY); // Box 393
		bodyModel[96] = new ModelRendererTurbo(this, 108, 232, textureX, textureY); // Box 394
		bodyModel[97] = new ModelRendererTurbo(this, 20, 200, textureX, textureY); // Box 303
		bodyModel[98] = new ModelRendererTurbo(this, 44, 200, textureX, textureY); // Box 304
		bodyModel[99] = new ModelRendererTurbo(this, 321, 225, textureX, textureY); // Box 87
		bodyModel[100] = new ModelRendererTurbo(this, 321, 234, textureX, textureY); // Box 88
		bodyModel[101] = new ModelRendererTurbo(this, 7, 225, textureX, textureY); // Box 102
		bodyModel[102] = new ModelRendererTurbo(this, 107, 209, textureX, textureY); // Box 103
		bodyModel[103] = new ModelRendererTurbo(this, 42, 226, textureX, textureY); // Box 104
		bodyModel[104] = new ModelRendererTurbo(this, 60, 225, textureX, textureY); // Box 105
		bodyModel[105] = new ModelRendererTurbo(this, 60, 225, textureX, textureY); // Box 106
		bodyModel[106] = new ModelRendererTurbo(this, 108, 232, textureX, textureY); // Box 107
		bodyModel[107] = new ModelRendererTurbo(this, 108, 232, textureX, textureY); // Box 108
		bodyModel[108] = new ModelRendererTurbo(this, 19, 225, textureX, textureY); // Box 109
		bodyModel[109] = new ModelRendererTurbo(this, 19, 225, textureX, textureY); // Box 110
		bodyModel[110] = new ModelRendererTurbo(this, 88, 232, textureX, textureY); // Box 111
		bodyModel[111] = new ModelRendererTurbo(this, 88, 232, textureX, textureY); // Box 112
		bodyModel[112] = new ModelRendererTurbo(this, 19, 225, textureX, textureY); // Box 113
		bodyModel[113] = new ModelRendererTurbo(this, 88, 232, textureX, textureY); // Box 114
		bodyModel[114] = new ModelRendererTurbo(this, 60, 225, textureX, textureY); // Box 115
		bodyModel[115] = new ModelRendererTurbo(this, 108, 232, textureX, textureY); // Box 116
		bodyModel[116] = new ModelRendererTurbo(this, 17, 238, textureX, textureY); // Box 117
		bodyModel[117] = new ModelRendererTurbo(this, 2, 244, textureX, textureY); // Box 118
		bodyModel[118] = new ModelRendererTurbo(this, 42, 226, textureX, textureY); // Box 119
		bodyModel[119] = new ModelRendererTurbo(this, 42, 226, textureX, textureY); // Box 120
		bodyModel[120] = new ModelRendererTurbo(this, 7, 225, textureX, textureY); // Box 121
		bodyModel[121] = new ModelRendererTurbo(this, 7, 225, textureX, textureY); // Box 122
		bodyModel[122] = new ModelRendererTurbo(this, 7, 190, textureX, textureY); // Box 123
		bodyModel[123] = new ModelRendererTurbo(this, 7, 190, textureX, textureY); // Box 124
		bodyModel[124] = new ModelRendererTurbo(this, 20, 187, textureX, textureY); // Box 125
		bodyModel[125] = new ModelRendererTurbo(this, 7, 190, textureX, textureY); // Box 126
		bodyModel[126] = new ModelRendererTurbo(this, 7, 190, textureX, textureY); // Box 127
		bodyModel[127] = new ModelRendererTurbo(this, 20, 187, textureX, textureY); // Box 128
		bodyModel[128] = new ModelRendererTurbo(this, 20, 187, textureX, textureY); // Box 129
		bodyModel[129] = new ModelRendererTurbo(this, 7, 190, textureX, textureY); // Box 130
		bodyModel[130] = new ModelRendererTurbo(this, 7, 190, textureX, textureY); // Box 131
		bodyModel[131] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 256
		bodyModel[132] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 257

		bodyModel[0].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 376
		bodyModel[0].setRotationPoint(-6F, 6.5F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 341
		bodyModel[1].setRotationPoint(-6F, 6.5F, 6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 10, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 243
		bodyModel[2].setRotationPoint(-5F, 3.5F, -6F);

		bodyModel[3].addShapeBox(0F, 0F, -0.5F, 3, 21, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 249
		bodyModel[3].setRotationPoint(-5.5F, -14.5F, -9.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.23F, 0F, 0F, -0.23F); // Box 265
		bodyModel[4].setRotationPoint(-5F, -16.5F, 9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[5].setRotationPoint(-5F, -16.5F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, -0.5F, 3, 21, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 431
		bodyModel[6].setRotationPoint(-3F, -14.5F, -9.5F);

		bodyModel[7].addShapeBox(0F, 0F, -0.5F, 3, 21, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 432
		bodyModel[7].setRotationPoint(-0.5F, -14.5F, -9.5F);

		bodyModel[8].addShapeBox(0F, 0F, -0.5F, 3, 21, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 433
		bodyModel[8].setRotationPoint(2F, -14.5F, -9.5F);

		bodyModel[9].addShapeBox(0F, 0F, -0.5F, 3, 21, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 428
		bodyModel[9].setRotationPoint(-5.5F, -14.5F, 9.5F);

		bodyModel[10].addShapeBox(0F, 0F, -0.5F, 3, 21, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 429
		bodyModel[10].setRotationPoint(-3F, -14.5F, 9.5F);

		bodyModel[11].addShapeBox(0F, 0F, -0.5F, 3, 21, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 430
		bodyModel[11].setRotationPoint(-0.5F, -14.5F, 9.5F);

		bodyModel[12].addShapeBox(0F, 0F, -0.5F, 3, 21, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 431
		bodyModel[12].setRotationPoint(2F, -14.5F, 9.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 12, 14, 0F,0F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, -6.75F, 0F, -0.5F, -6.75F, 0F, -6F, 0F, -0.6F, -6F, 0F, -0.6F, -6F, -6.5F, 0F, -6F, -6.5F); // Box 447
		bodyModel[13].setRotationPoint(-5.5F, -5.5F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 420
		bodyModel[14].setRotationPoint(-17F, 0.5F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 3, 7, 0F); // Box 430
		bodyModel[15].setRotationPoint(-8.2F, 0.5F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 146
		bodyModel[16].setRotationPoint(-13F, -2.7F, 8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 456
		bodyModel[17].setRotationPoint(13.5F, -2F, 8.4F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 12, 9, 0F,0F, -0.5F, -0.25F, -0.6F, -0.5F, -0.25F, -0.6F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, -6F, 0F, -0.6F, -6F, 0F, -0.6F, -6F, -5F, 0F, -6F, -5F); // Box 466
		bodyModel[18].setRotationPoint(-5.5F, -5.5F, 5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 107
		bodyModel[19].setRotationPoint(-19F, -17.5F, 8.55F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 40, 1, 5, 0F,0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[20].setRotationPoint(-20F, -18.5F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 40, 1, 5, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 378
		bodyModel[21].setRotationPoint(-20F, -18.5F, 3F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 40, 1, 6, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[22].setRotationPoint(-20F, -18.5F, -3F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		bodyModel[23].setRotationPoint(-19F, -17.5F, -9.55F);

		bodyModel[24].addShapeBox(0F, 0F, -4F, 9, 4, 8, 0F,0F, 0F, -4F, -6F, 0.2F, -4F, -6F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -4F, -6F, -3.5F, -4F, -6F, -3.5F, -0.5F, 0F, -3F, -0.5F); // Box 266
		bodyModel[24].setRotationPoint(-16.7F, -0.100000000000001F, 5.3F);

		bodyModel[25].addShapeBox(0F, -5F, -4F, 1, 10, 8, 0F,-0.5F, -4.95F, -4.5F, -0.2F, -4.95F, -4.5F, -0.2F, -4.95F, 0F, -0.5F, -4.95F, 0F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 267
		bodyModel[25].setRotationPoint(-17.7F, -5F, 4.8F);

		bodyModel[26].addShapeBox(0F, 0F, -4F, 9, 4, 8, 0F,-6F, 0.2F, -4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -6F, 0.2F, -0.5F, -6F, -3.5F, -4F, 0F, -3F, -4F, 0F, -3F, -0.5F, -6F, -3.5F, -0.5F); // Box 268
		bodyModel[26].setRotationPoint(-15F, -0.100000000000001F, 5.3F);

		bodyModel[27].addShapeBox(0F, -5F, -4F, 1, 10, 8, 0F,-0.2F, -4.95F, -4.5F, -0.5F, -4.95F, -4.5F, -0.5F, -4.95F, 0F, -0.2F, -4.95F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[27].setRotationPoint(-6F, -5F, 4.8F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 274
		bodyModel[28].setRotationPoint(-8.2F, 0.5F, 6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.35F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.2F, 0F, 0F, 0.05F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 282
		bodyModel[29].setRotationPoint(19F, -17.5F, -9.55F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.2F); // Box 283
		bodyModel[30].setRotationPoint(19F, -16.5F, -9.75F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.25F); // Box 285
		bodyModel[31].setRotationPoint(19F, -16.5F, 8.75F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.05F, 0F, 0F, 0.2F); // Box 286
		bodyModel[32].setRotationPoint(19F, -17.5F, 8.55F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0.5F, 0F, -0.7F, 0.5F, 0F, -0.7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 282
		bodyModel[33].setRotationPoint(-19F, -18.5F, 6.55F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.7F, 0.5F, 0F, -0.7F); // Box 286
		bodyModel[34].setRotationPoint(-19F, -18.5F, -7.55F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 14, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 245
		bodyModel[35].setRotationPoint(-19F, -16.5F, 8.75F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 14, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 334
		bodyModel[36].setRotationPoint(5F, -16.5F, 8.75F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 14, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 335
		bodyModel[37].setRotationPoint(-19F, -16.5F, -9.75F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 14, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 336
		bodyModel[38].setRotationPoint(5F, -16.5F, -9.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, 0.1F, 0F, 0F, 0.25F, 0F, 0F, -0.2F, 0F, 0F, -0.9F); // Box 337
		bodyModel[39].setRotationPoint(-20F, -16.5F, -9.75F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.35F, 0F, -0.2F, -0.2F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 338
		bodyModel[40].setRotationPoint(-20F, -17.5F, -9.55F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.9F, 0F, 0F, -0.2F, 0F, 0F, 0.25F, 0F, 0F, 0.1F); // Box 339
		bodyModel[41].setRotationPoint(-20F, -16.5F, 8.75F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.35F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.05F); // Box 340
		bodyModel[42].setRotationPoint(-20F, -17.5F, 8.55F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 38, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[43].setRotationPoint(-19F, -17.5F, -8.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 9, 1, 18, 0F); // Box 167
		bodyModel[44].setRotationPoint(5F, 3.5F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 326
		bodyModel[45].setRotationPoint(16F, 3.5F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 327
		bodyModel[46].setRotationPoint(14F, 3.5F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[47].setRotationPoint(14F, 3.5F, 4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[48].setRotationPoint(16F, 3.5F, 6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 49, 1, 5, 0F,0F, 0F, -2.5F, -13F, 0F, -2.5F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -13F, 0F, -2.5F, -13F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[49].setRotationPoint(-18F, -16.5F, -4F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 20, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 177
		bodyModel[50].setRotationPoint(17.75F, -16.5F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0.5F, 0F, -2.5F, 0F, 0F, -2F, 0F); // Box 180
		bodyModel[51].setRotationPoint(17.75F, -16.65F, -6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F); // Box 181
		bodyModel[52].setRotationPoint(17.75F, -16.65F, -4F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -1.25F, 0.5F, 0F, -1F, 0F); // Box 143
		bodyModel[53].setRotationPoint(17.75F, -16.65F, 4F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 20, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[54].setRotationPoint(17.75F, -16.5F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 457
		bodyModel[55].setRotationPoint(-18F, -16.5F, -0.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0.35F, 0F, -0.6F, 0.35F, 0F, -0.6F, 0.35F, 0F, -0.6F, 0.35F); // Box 255
		bodyModel[56].setRotationPoint(19F, -17.5F, -8.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 355
		bodyModel[57].setRotationPoint(8.5F, -2F, 8.4F);

		bodyModel[58].addBox(0F, 0F, 0F, 9, 1, 18, 0F); // Box 356
		bodyModel[58].setRotationPoint(-14F, 3.5F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 357
		bodyModel[59].setRotationPoint(-16F, 3.5F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[60].setRotationPoint(-16F, 3.5F, 4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[61].setRotationPoint(-19F, 3.5F, 6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 360
		bodyModel[62].setRotationPoint(-19F, 3.5F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0.35F, 0F, -0.6F, 0.35F, 0F, -0.6F, 0.35F, 0F, -0.6F, 0.35F); // Box 361
		bodyModel[63].setRotationPoint(-20F, -17.5F, -8.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 20, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 362
		bodyModel[64].setRotationPoint(-18.75F, -16.5F, -9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.5F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F); // Box 363
		bodyModel[65].setRotationPoint(-18.75F, -16.65F, -6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F); // Box 364
		bodyModel[66].setRotationPoint(-18.75F, -16.65F, -4F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0.5F); // Box 365
		bodyModel[67].setRotationPoint(-18.75F, -16.65F, 4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 20, 3, 0F,0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[68].setRotationPoint(-18.75F, -16.5F, 6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[69].setRotationPoint(6F, -19.5F, -5.25F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[70].setRotationPoint(6F, -19.5F, 4.25F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 129
		bodyModel[71].setRotationPoint(6.5F, -32.2F, -5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[72].setRotationPoint(6.5F, -32.2F, -6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 131
		bodyModel[73].setRotationPoint(6.5F, -32.2F, 5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[74].setRotationPoint(9.5F, -32.2F, -6F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 413
		bodyModel[75].setRotationPoint(9.5F, -32.2F, -5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 414
		bodyModel[76].setRotationPoint(9.5F, -32.2F, 5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,2F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 5F, 0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F, 0F); // Box 320
		bodyModel[77].setRotationPoint(-1F, -20F, -5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,2F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, -4F, 0F, 2F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 2F, 4F, 0F); // Box 321
		bodyModel[78].setRotationPoint(-1F, -29.25F, -5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,0F, 0F, 0F, 2F, 5F, 0F, 2F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F, 0F, 2F, -5F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[79].setRotationPoint(11F, -20F, -5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 2F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 2F, 4F, 0F, 2F, 4F, 0F, 0F, -2F, 0F); // Box 324
		bodyModel[80].setRotationPoint(10F, -29.25F, -5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,0F, 0F, 0F, 2F, 5F, 0F, 2F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F, 0F, 2F, -5F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[81].setRotationPoint(11F, -20F, 5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 2F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 2F, 4F, 0F, 2F, 4F, 0F, 0F, -2F, 0F); // Box 327
		bodyModel[82].setRotationPoint(10F, -29.25F, 5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,2F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 5F, 0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F, 0F); // Box 334
		bodyModel[83].setRotationPoint(-1F, -20F, 5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,2F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, -4F, 0F, 2F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 2F, 4F, 0F); // Box 335
		bodyModel[84].setRotationPoint(-1F, -29.25F, 5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[85].setRotationPoint(7F, -31.5F, -5.25F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[86].setRotationPoint(7F, -31.5F, 4.25F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,2F, -4.25F, 0F, 0F, 1.75F, -10F, 0F, 1.75F, 10F, 2F, -4.25F, 0F, 2F, 3.75F, 0F, 0F, -2.25F, -10F, 0F, -2.25F, 10F, 2F, 3.75F, 0F); // Box 432
		bodyModel[87].setRotationPoint(-1F, -29.25F, -5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,2F, 4.75F, 0F, 0F, -0.25F, -10F, 0F, -0.25F, 10F, 2F, 4.75F, 0F, 2F, -5.25F, 0F, 0F, -0.25F, -10F, 0F, -0.25F, 10F, 2F, -5.25F, 0F); // Box 435
		bodyModel[88].setRotationPoint(-1F, -20F, -5F);

		bodyModel[89].addShapeBox(0F, 0F, -4F, 9, 4, 8, 0F,-6F, 0.2F, -4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -6F, 0.2F, -0.5F, -6F, -3.5F, -4F, 0F, -3F, -4F, 0F, -3F, -0.5F, -6F, -3.5F, -0.5F); // Box 387
		bodyModel[89].setRotationPoint(-15F, -0.100000000000001F, -5F);

		bodyModel[90].addShapeBox(0F, -5F, -4F, 1, 10, 8, 0F,-0.2F, -4.95F, -4.5F, -0.5F, -4.95F, -4.5F, -0.5F, -4.95F, 0F, -0.2F, -4.95F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[90].setRotationPoint(-6F, -5F, -5.5F);

		bodyModel[91].addShapeBox(0F, 0F, -4F, 9, 4, 8, 0F,0F, 0F, -4F, -6F, 0.2F, -4F, -6F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -4F, -6F, -3.5F, -4F, -6F, -3.5F, -0.5F, 0F, -3F, -0.5F); // Box 389
		bodyModel[91].setRotationPoint(-16.7F, -0.100000000000001F, -5F);

		bodyModel[92].addShapeBox(0F, -5F, -4F, 1, 10, 8, 0F,-0.5F, -4.95F, -4.5F, -0.2F, -4.95F, -4.5F, -0.2F, -4.95F, 0F, -0.5F, -4.95F, 0F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 390
		bodyModel[92].setRotationPoint(-17.7F, -5F, -5.5F);

		bodyModel[93].addShapeBox(0F, 0F, -4F, 9, 4, 8, 0F,-6F, 0.2F, -4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -6F, 0.2F, -0.5F, -6F, -3.5F, -4F, 0F, -3F, -4F, 0F, -3F, -0.5F, -6F, -3.5F, -0.5F); // Box 391
		bodyModel[93].setRotationPoint(-15F, -0.100000000000001F, -8.7F);

		bodyModel[94].addShapeBox(0F, -5F, -4F, 1, 10, 8, 0F,-0.2F, -4.95F, -4.5F, -0.5F, -4.95F, -4.5F, -0.5F, -4.95F, 0F, -0.2F, -4.95F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[94].setRotationPoint(-6F, -5F, -9.2F);

		bodyModel[95].addShapeBox(0F, 0F, -4F, 9, 4, 8, 0F,0F, 0F, -4F, -6F, 0.2F, -4F, -6F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -4F, -6F, -3.5F, -4F, -6F, -3.5F, -0.5F, 0F, -3F, -0.5F); // Box 393
		bodyModel[95].setRotationPoint(-16.7F, -0.100000000000001F, -8.7F);

		bodyModel[96].addShapeBox(0F, -5F, -4F, 1, 10, 8, 0F,-0.5F, -4.95F, -4.5F, -0.2F, -4.95F, -4.5F, -0.2F, -4.95F, 0F, -0.5F, -4.95F, 0F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 394
		bodyModel[96].setRotationPoint(-17.7F, -5F, -9.2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.225F, 0F, -0.75F, -0.225F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 303
		bodyModel[97].setRotationPoint(-5F, -14.5F, -10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.225F, 0F, -0.75F, -0.225F); // Box 304
		bodyModel[98].setRotationPoint(-5F, -14.5F, 9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 36, 3, 3, 0F,0F, 0F, -0.27F, 0F, 0F, -0.27F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.27F, 0F, -1F, -1.27F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 87
		bodyModel[99].setRotationPoint(-18.5F, -16.5F, 6F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 36, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.27F, 0F, 0F, -0.27F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1.27F, 0F, -1F, -1.27F); // Box 88
		bodyModel[100].setRotationPoint(-18.5F, -16.5F, -9F);

		bodyModel[101].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 102
		bodyModel[101].setRotationPoint(-18.2F, 0.5F, 6F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 12, 9, 0F,0F, -0.5F, -5F, -0.6F, -0.5F, -5F, -0.6F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -6F, -5F, -0.6F, -6F, -5F, -0.6F, -6F, 0F, 0F, -6F, 0F); // Box 103
		bodyModel[102].setRotationPoint(5.5F, -5.5F, -14F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 12, 14, 0F,0F, -0.5F, -6.75F, -0.6F, -0.5F, -6.75F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6F, -6.5F, -0.6F, -6F, -6.5F, -0.6F, -6F, 0F, 0F, -6F, 0F); // Box 104
		bodyModel[103].setRotationPoint(5.5F, -5.5F, -5F);

		bodyModel[104].addShapeBox(0F, 0F, -4F, 9, 4, 8, 0F,0F, 0F, -4F, -6F, 0.2F, -4F, -6F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -4F, -6F, -3.5F, -4F, -6F, -3.5F, -0.5F, 0F, -3F, -0.5F); // Box 105
		bodyModel[104].setRotationPoint(6.3F, -0.100000000000001F, 5F);

		bodyModel[105].addShapeBox(0F, 0F, -4F, 9, 4, 8, 0F,0F, 0F, -4F, -6F, 0.2F, -4F, -6F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -4F, -6F, -3.5F, -4F, -6F, -3.5F, -0.5F, 0F, -3F, -0.5F); // Box 106
		bodyModel[105].setRotationPoint(6.3F, -0.100000000000001F, 1.3F);

		bodyModel[106].addShapeBox(0F, -5F, -4F, 1, 10, 8, 0F,-0.5F, -4.95F, -4.5F, -0.2F, -4.95F, -4.5F, -0.2F, -4.95F, 0F, -0.5F, -4.95F, 0F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 107
		bodyModel[106].setRotationPoint(5.3F, -5F, 0.800000000000001F);

		bodyModel[107].addShapeBox(0F, -5F, -4F, 1, 10, 8, 0F,-0.5F, -4.95F, -4.5F, -0.2F, -4.95F, -4.5F, -0.2F, -4.95F, 0F, -0.5F, -4.95F, 0F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 108
		bodyModel[107].setRotationPoint(5.3F, -5F, 4.5F);

		bodyModel[108].addShapeBox(0F, 0F, -4F, 9, 4, 8, 0F,-6F, 0.2F, -4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -6F, 0.2F, -0.5F, -6F, -3.5F, -4F, 0F, -3F, -4F, 0F, -3F, -0.5F, -6F, -3.5F, -0.5F); // Box 109
		bodyModel[108].setRotationPoint(8F, -0.100000000000001F, 5F);

		bodyModel[109].addShapeBox(0F, 0F, -4F, 9, 4, 8, 0F,-6F, 0.2F, -4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -6F, 0.2F, -0.5F, -6F, -3.5F, -4F, 0F, -3F, -4F, 0F, -3F, -0.5F, -6F, -3.5F, -0.5F); // Box 110
		bodyModel[109].setRotationPoint(8F, -0.100000000000001F, 1.3F);

		bodyModel[110].addShapeBox(0F, -5F, -4F, 1, 10, 8, 0F,-0.2F, -4.95F, -4.5F, -0.5F, -4.95F, -4.5F, -0.5F, -4.95F, 0F, -0.2F, -4.95F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[110].setRotationPoint(17F, -5F, 0.800000000000001F);

		bodyModel[111].addShapeBox(0F, -5F, -4F, 1, 10, 8, 0F,-0.2F, -4.95F, -4.5F, -0.5F, -4.95F, -4.5F, -0.5F, -4.95F, 0F, -0.2F, -4.95F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[111].setRotationPoint(17F, -5F, 4.5F);

		bodyModel[112].addShapeBox(0F, 0F, -4F, 9, 4, 8, 0F,-6F, 0.2F, -4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -6F, 0.2F, -0.5F, -6F, -3.5F, -4F, 0F, -3F, -4F, 0F, -3F, -0.5F, -6F, -3.5F, -0.5F); // Box 113
		bodyModel[112].setRotationPoint(8F, -0.100000000000001F, -8.7F);

		bodyModel[113].addShapeBox(0F, -5F, -4F, 1, 10, 8, 0F,-0.2F, -4.95F, -4.5F, -0.5F, -4.95F, -4.5F, -0.5F, -4.95F, 0F, -0.2F, -4.95F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[113].setRotationPoint(17F, -5F, -9.2F);

		bodyModel[114].addShapeBox(0F, 0F, -4F, 9, 4, 8, 0F,0F, 0F, -4F, -6F, 0.2F, -4F, -6F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -4F, -6F, -3.5F, -4F, -6F, -3.5F, -0.5F, 0F, -3F, -0.5F); // Box 115
		bodyModel[114].setRotationPoint(6.3F, -0.100000000000001F, -8.7F);

		bodyModel[115].addShapeBox(0F, -5F, -4F, 1, 10, 8, 0F,-0.5F, -4.95F, -4.5F, -0.2F, -4.95F, -4.5F, -0.2F, -4.95F, 0F, -0.5F, -4.95F, 0F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 116
		bodyModel[115].setRotationPoint(5.3F, -5F, -9.2F);

		bodyModel[116].addBox(0F, 0F, 0F, 3, 3, 7, 0F); // Box 117
		bodyModel[116].setRotationPoint(5.6F, 0.5F, 2F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[117].setRotationPoint(14F, 0.5F, 2F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 12, 14, 0F,0F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, -6.75F, 0F, -0.5F, -6.75F, 0F, -6F, 0F, -0.6F, -6F, 0F, -0.6F, -6F, -6.5F, 0F, -6F, -6.5F); // Box 119
		bodyModel[118].setRotationPoint(-17.5F, -5.5F, -9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 12, 14, 0F,0F, -0.5F, -6.75F, -0.6F, -0.5F, -6.75F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6F, -6.5F, -0.6F, -6F, -6.5F, -0.6F, -6F, 0F, 0F, -6F, 0F); // Box 120
		bodyModel[119].setRotationPoint(17.5F, -5.5F, -5F);

		bodyModel[120].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 121
		bodyModel[120].setRotationPoint(14.6F, 0.5F, -9F);

		bodyModel[121].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 122
		bodyModel[121].setRotationPoint(5.6F, 0.5F, -9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 123
		bodyModel[122].setRotationPoint(-15F, -2F, 8.4F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 124
		bodyModel[123].setRotationPoint(-10F, -2F, 8.4F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F); // Box 125
		bodyModel[124].setRotationPoint(-13F, -2.7F, -9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 126
		bodyModel[125].setRotationPoint(-15F, -2F, -9.4F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 127
		bodyModel[126].setRotationPoint(-10F, -2F, -9.4F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 128
		bodyModel[127].setRotationPoint(10.5F, -2.7F, 8F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F); // Box 129
		bodyModel[128].setRotationPoint(10.5F, -2.7F, -9F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 130
		bodyModel[129].setRotationPoint(13.5F, -2F, -9.4F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 131
		bodyModel[130].setRotationPoint(8.5F, -2F, -9.4F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 19, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[131].setRotationPoint(-6F, 4.5F, -10.1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 19, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[132].setRotationPoint(5F, 4.5F, -10.1F);
	}
}