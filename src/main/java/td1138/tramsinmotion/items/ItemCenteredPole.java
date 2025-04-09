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

    @Override
    public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int l, float par8, float par9, float par10) {
        Block i1 = world.getBlock(i, j, k);
        if (i1 == Blocks.snow) {
            l = 0;
        }
        else if (i1 != Blocks.vine) {
            if (l == 0) {
                j--;
            }
            if (l == 1) {
                j++;
            }
            if (l == 2) {
                k--;
            }
            if (l == 3) {
                k++;
            }
            if (l == 4) {
                i--;
            }
            if (l == 5) {
                i++;
            }
        }
		/*if (!entityplayer.canCurrentToolHarvestBlock(i, j, k)) {
			return false;
		}*/
        if (itemstack.stackSize == 0) {
            return false;
        }

        Block block = spawnID;
        if (world.setBlockMetadataWithNotify(i, j, k, Block.getIdFromBlock(spawnID), 0)) {
            if (world.getBlock(i, j, k) == spawnID) {
                spawnID.onBlockPlacedBy(world, i, j, k, entityplayer, new ItemStack(spawnID));
            }
            itemstack.stackSize--;
        }
        return true;
    }
}