//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 03.11.2024 - 20:05:40
// Last changed on: 03.11.2024 - 20:05:40

package td1138.tramsinmotion.models.trains; //Path where the model is located


import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelPT8Middle extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelPT8Middle() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[105];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 212, 221, textureX, textureY); // Box 271
		bodyModel[1] = new ModelRendererTurbo(this, 212, 234, textureX, textureY); // Box 272
		bodyModel[2] = new ModelRendererTurbo(this, 212, 245, textureX, textureY); // Box 273
		bodyModel[3] = new ModelRendererTurbo(this, 212, 215, textureX, textureY); // Box 274
		bodyModel[4] = new ModelRendererTurbo(this, 157, 184, textureX, textureY); // Box 275
		bodyModel[5] = new ModelRendererTurbo(this, 158, 193, textureX, textureY); // Box 276
		bodyModel[6] = new ModelRendererTurbo(this, 157, 200, textureX, textureY); // Box 277
		bodyModel[7] = new ModelRendererTurbo(this, 211, 212, textureX, textureY); // Box 278
		bodyModel[8] = new ModelRendererTurbo(this, 124, 212, textureX, textureY); // Box 279
		bodyModel[9] = new ModelRendererTurbo(this, 125, 221, textureX, textureY); // Box 280
		bodyModel[10] = new ModelRendererTurbo(this, 125, 215, textureX, textureY); // Box 281
		bodyModel[11] = new ModelRendererTurbo(this, 125, 235, textureX, textureY); // Box 282
		bodyModel[12] = new ModelRendererTurbo(this, 125, 245, textureX, textureY); // Box 283
		bodyModel[13] = new ModelRendererTurbo(this, 110, 246, textureX, textureY); // Box 284
		bodyModel[14] = new ModelRendererTurbo(this, 110, 251, textureX, textureY); // Box 285
		bodyModel[15] = new ModelRendererTurbo(this, 95, 246, textureX, textureY); // Box 286
		bodyModel[16] = new ModelRendererTurbo(this, 95, 251, textureX, textureY); // Box 287
		bodyModel[17] = new ModelRendererTurbo(this, 280, 236, textureX, textureY); // Box 288
		bodyModel[18] = new ModelRendererTurbo(this, 292, 217, textureX, textureY); // Box 289
		bodyModel[19] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 290
		bodyModel[20] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 291
		bodyModel[21] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 292
		bodyModel[22] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 293
		bodyModel[23] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 294
		bodyModel[24] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 295
		bodyModel[25] = new ModelRendererTurbo(this, 494, 236, textureX, textureY); // Box 296
		bodyModel[26] = new ModelRendererTurbo(this, 487, 248, textureX, textureY); // Box 297
		bodyModel[27] = new ModelRendererTurbo(this, 487, 243, textureX, textureY); // Box 298
		bodyModel[28] = new ModelRendererTurbo(this, 487, 238, textureX, textureY); // Box 299
		bodyModel[29] = new ModelRendererTurbo(this, 487, 231, textureX, textureY); // Box 300
		bodyModel[30] = new ModelRendererTurbo(this, 502, 236, textureX, textureY); // Box 301
		bodyModel[31] = new ModelRendererTurbo(this, 380, 224, textureX, textureY); // Box 302
		bodyModel[32] = new ModelRendererTurbo(this, 408, 232, textureX, textureY); // Box 304
		bodyModel[33] = new ModelRendererTurbo(this, 408, 216, textureX, textureY); // Box 306
		bodyModel[34] = new ModelRendererTurbo(this, 408, 221, textureX, textureY); // Box 309
		bodyModel[35] = new ModelRendererTurbo(this, 91, 224, textureX, textureY); // Box 318
		bodyModel[36] = new ModelRendererTurbo(this, 96, 212, textureX, textureY); // Box 319
		bodyModel[37] = new ModelRendererTurbo(this, 86, 215, textureX, textureY); // Box 320
		bodyModel[38] = new ModelRendererTurbo(this, 85, 215, textureX, textureY); // Box 321
		bodyModel[39] = new ModelRendererTurbo(this, 96, 212, textureX, textureY); // Box 322
		bodyModel[40] = new ModelRendererTurbo(this, 86, 215, textureX, textureY); // Box 323
		bodyModel[41] = new ModelRendererTurbo(this, 85, 215, textureX, textureY); // Box 324
		bodyModel[42] = new ModelRendererTurbo(this, 86, 215, textureX, textureY); // Box 325
		bodyModel[43] = new ModelRendererTurbo(this, 104, 224, textureX, textureY); // Box 326
		bodyModel[44] = new ModelRendererTurbo(this, 85, 215, textureX, textureY); // Box 327
		bodyModel[45] = new ModelRendererTurbo(this, 110, 214, textureX, textureY); // Box 328
		bodyModel[46] = new ModelRendererTurbo(this, 94, 227, textureX, textureY); // Box 329
		bodyModel[47] = new ModelRendererTurbo(this, 110, 218, textureX, textureY); // Box 330
		bodyModel[48] = new ModelRendererTurbo(this, 102, 200, textureX, textureY); // Box 331
		bodyModel[49] = new ModelRendererTurbo(this, 102, 200, textureX, textureY); // Box 332
		bodyModel[50] = new ModelRendererTurbo(this, 106, 227, textureX, textureY); // Box 333
		bodyModel[51] = new ModelRendererTurbo(this, 86, 215, textureX, textureY); // Box 334
		bodyModel[52] = new ModelRendererTurbo(this, 85, 215, textureX, textureY); // Box 335
		bodyModel[53] = new ModelRendererTurbo(this, 96, 218, textureX, textureY); // Box 583
		bodyModel[54] = new ModelRendererTurbo(this, 96, 218, textureX, textureY); // Box 584
		bodyModel[55] = new ModelRendererTurbo(this, 262, 30, textureX, textureY); // Box 348
		bodyModel[56] = new ModelRendererTurbo(this, 1, 90, textureX, textureY); // Box 349
		bodyModel[57] = new ModelRendererTurbo(this, 127, 90, textureX, textureY); // Box 350
		bodyModel[58] = new ModelRendererTurbo(this, 262, 30, textureX, textureY); // Box 353
		bodyModel[59] = new ModelRendererTurbo(this, 262, 30, textureX, textureY); // Box 356
		bodyModel[60] = new ModelRendererTurbo(this, 191, 84, textureX, textureY); // Box 360
		bodyModel[61] = new ModelRendererTurbo(this, 1, 108, textureX, textureY); // Box 361
		bodyModel[62] = new ModelRendererTurbo(this, 264, 32, textureX, textureY); // Box 362
		bodyModel[63] = new ModelRendererTurbo(this, 80, 85, textureX, textureY); // Box 366
		bodyModel[64] = new ModelRendererTurbo(this, 222, 19, textureX, textureY); // Box 367
		bodyModel[65] = new ModelRendererTurbo(this, 222, 19, textureX, textureY); // Box 368
		bodyModel[66] = new ModelRendererTurbo(this, 80, 85, textureX, textureY); // Box 369
		bodyModel[67] = new ModelRendererTurbo(this, 264, 32, textureX, textureY); // Box 370
		bodyModel[68] = new ModelRendererTurbo(this, 59, 104, textureX, textureY); // Box 371
		bodyModel[69] = new ModelRendererTurbo(this, 395, 24, textureX, textureY); // Box 372
		bodyModel[70] = new ModelRendererTurbo(this, 264, 32, textureX, textureY); // Box 373
		bodyModel[71] = new ModelRendererTurbo(this, 54, 85, textureX, textureY); // Box 374
		bodyModel[72] = new ModelRendererTurbo(this, 323, 13, textureX, textureY); // Box 375
		bodyModel[73] = new ModelRendererTurbo(this, 264, 32, textureX, textureY); // Box 376
		bodyModel[74] = new ModelRendererTurbo(this, 449, 26, textureX, textureY); // Box 377
		bodyModel[75] = new ModelRendererTurbo(this, 169, 95, textureX, textureY); // Box 378
		bodyModel[76] = new ModelRendererTurbo(this, 264, 32, textureX, textureY); // Box 379
		bodyModel[77] = new ModelRendererTurbo(this, 59, 104, textureX, textureY); // Box 380
		bodyModel[78] = new ModelRendererTurbo(this, 395, 24, textureX, textureY); // Box 381
		bodyModel[79] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 383
		bodyModel[80] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 384
		bodyModel[81] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 385
		bodyModel[82] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 386
		bodyModel[83] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 387
		bodyModel[84] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 388
		bodyModel[85] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 389
		bodyModel[86] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 390
		bodyModel[87] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 391
		bodyModel[88] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 392
		bodyModel[89] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 393
		bodyModel[90] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 394
		bodyModel[91] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 395
		bodyModel[92] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 396
		bodyModel[93] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 371
		bodyModel[94] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 375
		bodyModel[95] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 376
		bodyModel[96] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 377
		bodyModel[97] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 378
		bodyModel[98] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 379
		bodyModel[99] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 380
		bodyModel[100] = new ModelRendererTurbo(this, 34, 249, textureX, textureY); // Box 412
		bodyModel[101] = new ModelRendererTurbo(this, 34, 249, textureX, textureY); // Box 413
		bodyModel[102] = new ModelRendererTurbo(this, 74, 197, textureX, textureY); // Box 415
		bodyModel[103] = new ModelRendererTurbo(this, 294, 174, textureX, textureY); // Box 311
		bodyModel[104] = new ModelRendererTurbo(this, 294, 174, textureX, textureY); // Box 104

		bodyModel[0].addShapeBox(0F, 0F, 0F, 38, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 271
		bodyModel[0].setRotationPoint(-18F, -15F, 8.75F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 38, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 272
		bodyModel[1].setRotationPoint(-18F, -4.25F, 8.75F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 38, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 273
		bodyModel[2].setRotationPoint(-18F, 4F, 8.75F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 36, 2, 3, 0F,0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[3].setRotationPoint(-17F, -17F, 6.75F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 38, 1, 6, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 275
		bodyModel[4].setRotationPoint(-18F, -19.25F, 2.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 38, 1, 5, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[5].setRotationPoint(-18F, -19.25F, -2.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 38, 1, 6, 0F,0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[6].setRotationPoint(-18F, -19.25F, -8.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 278
		bodyModel[7].setRotationPoint(-18F, -18.25F, 8.75F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[8].setRotationPoint(-18F, -18.25F, -9.75F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 38, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 280
		bodyModel[9].setRotationPoint(-18F, -15F, -9.75F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 36, 2, 3, 0F,0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[10].setRotationPoint(-17F, -17F, -9.75F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 38, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 282
		bodyModel[11].setRotationPoint(-18F, -4.25F, -9.75F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 38, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[12].setRotationPoint(-18F, 4F, -9.75F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[13].setRotationPoint(-18F, -17F, -9.75F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[14].setRotationPoint(-18F, -17F, 8.75F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[15].setRotationPoint(19F, -17F, -9.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[16].setRotationPoint(19F, -17F, 8.75F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 38, 1, 17, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 288
		bodyModel[17].setRotationPoint(-18F, -18.25F, -8.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 36, 1, 17, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 289
		bodyModel[18].setRotationPoint(-17F, 2.5F, -8.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 2.5F, 1F, 0F, 2.5F, 1F, 1F, 2.5F, -1F, 0F, 2.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0F); // Box 290
		bodyModel[19].setRotationPoint(18F, -11.5F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -0.75F, 1F, 0F, -0.75F, 1F, 1F, -3F, 0F, 0F, -3F, 1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 1F, 0F, -1F, 0F, 0F, 0F); // Box 291
		bodyModel[20].setRotationPoint(18F, -18F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.25F, 4F, 0F, 0.25F, 4F, 0F, 0.25F, 3F, 0F, 0.25F, 3F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, -1.5F, 3F, 0F, -1F, 3F); // Box 292
		bodyModel[21].setRotationPoint(18F, -17F, -5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.25F, 3F, 0F, 0.25F, 3F, 0F, 0.25F, 4F, 0F, 0.25F, 4F, 0F, -1F, 3F, 1F, -1.5F, 3F, 1F, 0F, 1F, 0F, 0F, 0F); // Box 293
		bodyModel[22].setRotationPoint(18F, -17F, 3F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -3F, 1F, 1F, -3F, 0F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F); // Box 294
		bodyModel[23].setRotationPoint(18F, -18F, 6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 2.5F, 0F, 1F, 2.5F, -1F, 0F, 2.5F, 1F, 0F, 2.5F, 1F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 295
		bodyModel[24].setRotationPoint(18F, -11.5F, 6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 2.5F, 1F, 0F, 2.5F, 1F, 0F, 2.5F, 0F, 1F, 2.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, -1F); // Box 296
		bodyModel[25].setRotationPoint(-17F, -11.5F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, -3F, 1F, 1F, -3F, 0F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 0F, 1F, 0F, -1F); // Box 297
		bodyModel[26].setRotationPoint(-17F, -18F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.25F, 4F, 0F, 0.25F, 4F, 0F, 0.25F, 3F, 0F, 0.25F, 3F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 3F, 1F, -1.5F, 3F); // Box 298
		bodyModel[27].setRotationPoint(-17F, -17F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.25F, 3F, 0F, 0.25F, 3F, 0F, 0.25F, 4F, 0F, 0.25F, 4F, 1F, -1.5F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 1F, 0F, 1F); // Box 299
		bodyModel[28].setRotationPoint(-17F, -17F, 3F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,1F, -3F, 0F, 0F, -3F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1.1F, 0F, 0F, 1.1F); // Box 300
		bodyModel[29].setRotationPoint(-17F, -18F, 6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,1F, 2.5F, -1F, 0F, 2.5F, 0F, 0F, 2.5F, 1F, 0F, 2.5F, 1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 301
		bodyModel[30].setRotationPoint(-17F, -11.5F, 6F);

		bodyModel[31].addShapeBox(0F, -1F, 0F, 2, 2, 19, 0F,0F, 0F, 0.175F, 0F, 0F, 0.175F, 0F, 0F, 0.195F, 0F, 0F, 0.195F, -2F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, -2F, 0F, 0.15F); // Box 302
		bodyModel[31].setRotationPoint(-12F, 7F, -9.5F);

		bodyModel[32].addShapeBox(0F, -1F, 0F, 2, 2, 19, 0F,0F, 0F, 0.175F, 0F, 0F, 0.175F, 0F, 0F, 0.195F, 0F, 0F, 0.195F, 0F, 0F, 0.15F, -2F, 0F, 0.15F, -2F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 304
		bodyModel[32].setRotationPoint(11F, 7F, -9.5F);

		bodyModel[33].addShapeBox(0F, -1F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[33].setRotationPoint(-10F, 7F, 8.65F);

		bodyModel[34].addShapeBox(0F, -1F, 0F, 21, 2, 1, 0F,0F, 0F, 0.075F, 0F, 0F, 0.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[34].setRotationPoint(-10F, 7F, -9.6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[35].setRotationPoint(-14F, -20F, -4.25F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 319
		bodyModel[36].setRotationPoint(-14F, -21F, -5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,1F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 5.5F, 0F, 1F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5.5F, 0F); // Box 320
		bodyModel[37].setRotationPoint(-21F, -21F, -5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,1F, -4.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, -4.5F, 0F, 1F, 4.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 4.5F, 0F); // Box 321
		bodyModel[38].setRotationPoint(-21F, -31.25F, -5F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 322
		bodyModel[39].setRotationPoint(-10F, -21F, -5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,0F, 0F, 0F, 1F, 5.5F, 0F, 1F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5.5F, 0F, 1F, -5.5F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[40].setRotationPoint(-9F, -21F, -5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 2F, 0F, 1F, -4.5F, 0F, 1F, -4.5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, 4.5F, 0F, 1F, 4.5F, 0F, 0F, -2F, 0F); // Box 324
		bodyModel[41].setRotationPoint(-10F, -31.25F, -5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,0F, 0F, 0F, 1F, 5.5F, 0F, 1F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5.5F, 0F, 1F, -5.5F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[42].setRotationPoint(-9F, -21F, 5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[43].setRotationPoint(-14F, -20F, 3.25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 2F, 0F, 1F, -4.5F, 0F, 1F, -4.5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, 4.5F, 0F, 1F, 4.5F, 0F, 0F, -2F, 0F); // Box 327
		bodyModel[44].setRotationPoint(-10F, -31.25F, 5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 328
		bodyModel[45].setRotationPoint(-11F, -34.75F, 5.25F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[46].setRotationPoint(-13F, -33.75F, 4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 330
		bodyModel[47].setRotationPoint(-13F, -34.75F, 5.25F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 331
		bodyModel[48].setRotationPoint(-13F, -34.75F, -4.75F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 332
		bodyModel[49].setRotationPoint(-11F, -34.75F, -4.75F);

		bodyModel[50].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 333
		bodyModel[50].setRotationPoint(-13F, -33.75F, -5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,1F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 5.5F, 0F, 1F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5.5F, 0F); // Box 334
		bodyModel[51].setRotationPoint(-21F, -21F, 5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,1F, -4.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, -4.5F, 0F, 1F, 4.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 4.5F, 0F); // Box 335
		bodyModel[52].setRotationPoint(-21F, -31.25F, 5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 583
		bodyModel[53].setRotationPoint(-11F, -34.75F, -6.75F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 584
		bodyModel[54].setRotationPoint(-13F, -34.75F, -6.75F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 348
		bodyModel[55].setRotationPoint(15F, -0.5F, 2.75F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 10, 4, 13, 0F,0F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F, -6F, -3F, -6F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 349
		bodyModel[56].setRotationPoint(14F, -1.5F, -4.25F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 8, 13, 0F,0F, -4F, -6F, 0F, -4F, -6F, 0F, -4F, 0F, 0F, -4F, 0F, 0.5F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 350
		bodyModel[57].setRotationPoint(17F, -9.5F, -4.25F);

		bodyModel[58].addBox(0F, 0F, 0F, 6, 3, 6, 0F); // Box 353
		bodyModel[58].setRotationPoint(3.76F, -0.5F, 2.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 6, 3, 6, 0F); // Box 356
		bodyModel[59].setRotationPoint(-8F, -0.5F, 2.75F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 8, 13, 0F,0F, -4F, -6F, 0F, -4F, -6F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -6F, 0.5F, 0F, -6F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[60].setRotationPoint(-16.01F, -9.5F, -4.25F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 10, 4, 13, 0F,0F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F, -6F, -3F, -6F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 361
		bodyModel[61].setRotationPoint(-16.01F, -1.5F, -4.25F);

		bodyModel[62].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 362
		bodyModel[62].setRotationPoint(-16.01F, -0.5F, 4.75F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 16, 4, 13, 0F,0F, 0F, -6F, -9F, 0F, -6F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F, -9F, -3F, -6F, -9F, -3F, 0F, 0F, -3F, 0F); // Box 366
		bodyModel[63].setRotationPoint(-8.5F, -1.5F, -4.25F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 8, 13, 0F,0F, -4F, -6F, -0.5F, -4F, -6F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0.5F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 367
		bodyModel[64].setRotationPoint(-5.25F, -9.5F, -4.25F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 8, 13, 0F,0F, -4F, -6F, -0.5F, -4F, -6F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0.5F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 368
		bodyModel[65].setRotationPoint(6.25F, -9.5F, -4.25F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 16, 4, 13, 0F,0F, 0F, -6F, -9F, 0F, -6F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F, -9F, -3F, -6F, -9F, -3F, 0F, 0F, -3F, 0F); // Box 369
		bodyModel[66].setRotationPoint(3F, -1.5F, -4.25F);

		bodyModel[67].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 370
		bodyModel[67].setRotationPoint(-7F, -0.5F, -8.75F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 16, 4, 7, 0F,0F, 0F, -3F, -9F, 0F, -3F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, -9F, -3F, -3F, -9F, -3F, 0F, 0F, -3F, 0F); // Box 371
		bodyModel[68].setRotationPoint(-8.49F, -1.5F, -11.75F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 8, 7, 0F,0F, -4F, -3F, -0.5F, -4F, -3F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 372
		bodyModel[69].setRotationPoint(-5.24F, -9.5F, -11.75F);

		bodyModel[70].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 373
		bodyModel[70].setRotationPoint(-15.99F, -0.5F, -8.75F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 10, 4, 7, 0F,0F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, -6F, -3F, -3F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 374
		bodyModel[71].setRotationPoint(-16F, -1.5F, -11.75F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 8, 7, 0F,0F, -4F, -3F, 0F, -4F, -3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[72].setRotationPoint(-16F, -9.5F, -11.75F);

		bodyModel[73].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 376
		bodyModel[73].setRotationPoint(14F, -0.5F, -8.75F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 10, 4, 7, 0F,0F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, -6F, -3F, -3F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 377
		bodyModel[74].setRotationPoint(14F, -1.5F, -11.75F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 8, 7, 0F,0F, -4F, -3F, 0F, -4F, -3F, 0F, -4F, 0F, 0F, -4F, 0F, 0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 378
		bodyModel[75].setRotationPoint(17F, -9.5F, -11.75F);

		bodyModel[76].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 379
		bodyModel[76].setRotationPoint(4.49F, -0.5F, -8.75F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 16, 4, 7, 0F,0F, 0F, -3F, -9F, 0F, -3F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, -9F, -3F, -3F, -9F, -3F, 0F, 0F, -3F, 0F); // Box 380
		bodyModel[77].setRotationPoint(3F, -1.5F, -11.75F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 8, 7, 0F,0F, -4F, -3F, -0.5F, -4F, -3F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 381
		bodyModel[78].setRotationPoint(6.25F, -9.5F, -11.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 1F, -0.3F, -0.3F); // Box 383
		bodyModel[79].setRotationPoint(-3.5F, -14.5F, 2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 384
		bodyModel[80].setRotationPoint(-5.5F, -16.5F, 2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 385
		bodyModel[81].setRotationPoint(-16F, -16.5F, 2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 1F, -0.3F, -0.3F); // Box 386
		bodyModel[82].setRotationPoint(-14.5F, -14.5F, 2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 387
		bodyModel[83].setRotationPoint(6F, -16.5F, 2F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 388
		bodyModel[84].setRotationPoint(17F, -16.5F, 2F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 1F, -0.3F, -0.3F); // Box 389
		bodyModel[85].setRotationPoint(7.5F, -14.5F, 2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 390
		bodyModel[86].setRotationPoint(-5.5F, -16.5F, -6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 391
		bodyModel[87].setRotationPoint(-16F, -16.5F, -6F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 1F, -0.3F, -0.3F); // Box 392
		bodyModel[88].setRotationPoint(-14.5F, -14.5F, -6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 1F, -0.3F, -0.3F); // Box 393
		bodyModel[89].setRotationPoint(-3.5F, -14.5F, -6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 394
		bodyModel[90].setRotationPoint(6F, -16.5F, -6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 1F, -0.3F, -0.3F); // Box 395
		bodyModel[91].setRotationPoint(7.5F, -14.5F, -6F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 396
		bodyModel[92].setRotationPoint(17F, -16.5F, -6F);

		bodyModel[93].addBox(0F, 0F, 0F, 31, 1, 2, 0F); // Box 371
		bodyModel[93].setRotationPoint(-14F, -17.25F, -1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 0F, 1F, -0.8F, 0F, 1F, -0.8F, 0F); // Box 375
		bodyModel[94].setRotationPoint(-11F, -4.5F, 7.75F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 0F, 1F, -0.8F, 0F, 1F, -0.8F, 0F); // Box 376
		bodyModel[95].setRotationPoint(0.5F, -4.5F, 7.75F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, -0.8F, 0F, 1F, -0.8F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 0F); // Box 377
		bodyModel[96].setRotationPoint(-11F, -4.5F, -8.75F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, -0.8F, 0F, 1F, -0.8F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 0F); // Box 378
		bodyModel[97].setRotationPoint(0.5F, -4.5F, -8.75F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 0F, 1F, -0.8F, 0F, 1F, -0.8F, 0F); // Box 379
		bodyModel[98].setRotationPoint(11.5F, -4.5F, 7.75F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, -0.8F, 0F, 1F, -0.8F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 0F); // Box 380
		bodyModel[99].setRotationPoint(11.5F, -4.5F, -8.75F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 26, 2, 4, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[100].setRotationPoint(-16F, -20F, -9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 26, 2, 4, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[101].setRotationPoint(-16F, -20F, 5F);

		bodyModel[102].addBox(0F, 0F, 0F, 7, 2, 6, 0F); // Box 415
		bodyModel[102].setRotationPoint(5F, -20.5F, -3F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 90, 18, 1, 0F,0F, 0F, 0F, -60F, 0F, 0F, -60F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -60F, -12F, 0F, -60F, -12F, 0F, 0F, -12F, 0F); // Box 311
		bodyModel[103].setRotationPoint(-14F, -4F, -9.77F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 90, 18, 1, 0F,0F, 0F, 0F, -60F, 0F, 0F, -60F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -60F, -12F, 0F, -60F, -12F, 0F, 0F, -12F, 0F); // Box 104
		bodyModel[104].setRotationPoint(-14F, -4F, 8.77F);
	}
}