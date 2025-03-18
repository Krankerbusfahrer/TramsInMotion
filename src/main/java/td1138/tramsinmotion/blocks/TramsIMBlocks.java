/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package td1138.tramsinmotion.blocks;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import td1138.tramsinmotion.library.TramsInMotionInfo;
import train.common.Traincraft;
import train.common.library.BlockIDs;
import train.common.library.TraincraftRegistry;

public class TramsIMBlocks {

	public static void init() {
		loadBlocks();
		registerBlocks();
		setHarvestLevels();
	}

	public static Block centeredpole=new BlockCenteredPole().setHardness(3.5F).setStepSound(Block.soundTypeMetal);


	public static void loadBlocks() {
		TraincraftRegistry.registerBlock(centeredpole, Traincraft.tcTab, TramsInMotionInfo.modID,"centeredpole");



	}

	public static void registerBlocks() {
		for (BlockIDs blocks : BlockIDs.values()) {
			if(blocks.block != null) {
				blocks.block.setBlockName(TramsInMotionInfo.modID + ":" + blocks.name());
				if (blocks.hasItemBlock) {
					GameRegistry.registerBlock(blocks.block, blocks.itemBlockClass, blocks.name());
				} else {
					GameRegistry.registerBlock(blocks.block, blocks.name());
				}
			}
		}
}

	public static void setHarvestLevels() {
		TramsIMBlocks.centeredpole.setHarvestLevel("axe", 0);

	}
}