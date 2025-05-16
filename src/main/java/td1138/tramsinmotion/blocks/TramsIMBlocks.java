/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package td1138.tramsinmotion.blocks;

import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import td1138.tramsinmotion.library.BlockIDs;
import td1138.tramsinmotion.library.TramsInMotionInfo;

public class TramsIMBlocks {

	public static void init() {
		loadBlocks();
		registerBlocks();
		setHarvestLevels();
	}

	public static Block CenteredPole=new BlockCenteredPole(Material.iron ).setHardness(3.5F).setStepSound(Block.soundTypeMetal);
	public static Block LFPlatformFenced=new BlockLFPlatformFenced(Material.iron ).setHardness(3.5F).setStepSound(Block.soundTypeMetal);
	public static Block LFPlatformShelter=new BlockLFPlatformShelter(Material.iron ).setHardness(3.5F).setStepSound(Block.soundTypeMetal);

	public static void loadBlocks() {
		BlockIDs.CenteredPole.block = new BlockCenteredPole (Material.iron);
		BlockIDs.LFPlatformFenced.block = new BlockLFPlatformFenced (Material.iron);
		BlockIDs.LFPlatformShelter.block = new BlockLFPlatformShelter (Material.iron);


	}

	public static void registerBlocks() {
		for (BlockIDs blocks : td1138.tramsinmotion.library.BlockIDs.values()) {
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
		TramsIMBlocks.CenteredPole.setHarvestLevel("axe", 0);
		TramsIMBlocks.LFPlatformFenced.setHarvestLevel("axe", 0);
		TramsIMBlocks.LFPlatformShelter.setHarvestLevel("axe", 0);

	}
}