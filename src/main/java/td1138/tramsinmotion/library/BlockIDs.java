/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package td1138.tramsinmotion.library;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import td1138.tramsinmotion.items.ItemCenteredPole;
import train.common.items.*;
import train.common.items.slabs.*;


public enum BlockIDs {

	CenteredPole(true, ItemCenteredPole.class),

	;

	public Block block;
	public boolean hasItemBlock;
	public Class itemBlockClass;

	BlockIDs(boolean hasItemBlock, Class<ItemCenteredPole> itemBlockClass) {
		this.hasItemBlock = hasItemBlock;
		this.itemBlockClass = itemBlockClass;
	}
}
