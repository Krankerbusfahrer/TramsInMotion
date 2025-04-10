package td1138.tramsinmotion.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import td1138.tramsinmotion.TramsInMotion;

public class ItemLFPlatformFenced extends ItemBlock {
    private Block spawnID;

    public ItemLFPlatformFenced(Block block) {
        super(block);
        spawnID = block;
        setCreativeTab(TramsInMotion.tabTramsInMotion);
    }

}