/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package td1138.tramsinmotion.blocks.;


import net.minecraft.block.Block;
import td1138.tramsinmotion.library.TramsInMotionInfo;
import train.common.Traincraft;
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

	}

	public static void registerBlocks() {
		for (BlockIDs blocks : BlockIDs.values()) {
			if(blocks.block != null) {
				blocks.block.setBlockName(Info.modID + ":" + blocks.name());
				if (blocks.hasItemBlock) {
					GameRegistry.registerBlock(blocks.block, blocks.itemBlockClass, blocks.name());
				} else {
					GameRegistry.registerBlock(blocks.block, blocks.name());
				}
			}
		}
	}

	public static void setHarvestLevels() {
		TCBlocks.assemblyTableII.setHarvestLevel("axe", 0);
		TCBlocks.assemblyTableIII.setHarvestLevel("axe", 0);
		BlockIDs.waterWheel.block.setHarvestLevel("axe", 0);
		BlockIDs.windMill.block.setHarvestLevel("axe", 0);
		BlockIDs.oreTC.block.setHarvestLevel("pickaxe", 1);
		BlockIDs.snowGravel.block.setHarvestLevel("shovel",0);
		BlockIDs.poweredGravel.block.setHarvestLevel("shovel",0);
		BlockIDs.signalSpanish.block.setHarvestLevel("pickaxe",1);
		BlockIDs.asphalt.block.setHarvestLevel("pickaxe", 0);
		BlockIDs.metroMadridPole.block.setHarvestLevel("pickaxed", 0);

		Blocks.rail.setHarvestLevel("ItemStacked", 0);
		Blocks.detector_rail.setHarvestLevel("ItemStacked", 0);
		Blocks.golden_rail.setHarvestLevel("ItemStacked", 0);
	}
}