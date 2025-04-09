package td1138.tramsinmotion.items;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import td1138.tramsinmotion.TramsInMotion;

public class ItemCenteredPole extends ItemBlock {
    private Block spawnID;

    public ItemCenteredPole(Block block) {
        super(block);
        spawnID = block;
        setCreativeTab(TramsInMotion.tabTramsInMotion);
    }

}