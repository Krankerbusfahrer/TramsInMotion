package td1138.tramsinmotion.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import td1138.tramsinmotion.TramsInMotion;

public class ItemLFPlatformShelter extends ItemBlock {
    private Block spawnID;

    public ItemLFPlatformShelter(Block block) {
        super(block);
        spawnID = block;
        setCreativeTab(TramsInMotion.tabTramsInMotion);
    }

}