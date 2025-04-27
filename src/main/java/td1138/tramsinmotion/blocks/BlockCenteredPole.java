package td1138.tramsinmotion.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import td1138.tramsinmotion.TramsInMotion;
import td1138.tramsinmotion.tile.poles.TileCenteredPole;


import java.util.Random;

public class BlockCenteredPole extends BlockContainer {

    public BlockCenteredPole(Material material) {
        super(material.iron);
        setCreativeTab(TramsInMotion.tabTramsInMotion);
        setBlockBounds(0.3F, 0.0F, 0.3F, 0.7F, 3F, 0.7F);
        setHarvestLevel("axe", 0);
    }

    @Override
    public int damageDropped(int i) {
        return i;
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random) {
        return 1;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public void onBlockAdded(World world, int i, int j, int k) {
        super.onBlockAdded(world, i, j, k);
        world.markBlockForUpdate(i, j, k);
    }

    @Override
    public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack stack) {
        super.onBlockPlacedBy(world, i, j, k, entityliving, stack);
        TileCenteredPole te = (TileCenteredPole) world.getTileEntity(i, j, k);
        if (te != null) {
            int dir = MathHelper.floor_double((double) ((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
            te.setFacing(ForgeDirection.getOrientation(dir == 0 ? 2 : dir == 1 ? 5 : dir == 2 ? 3 : 4));
            world.markBlockForUpdate(i, j, k);
        }
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override

    public int getRenderType (){
        return -1;
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int meta) {
        return new TileCenteredPole();
    }

    @Override
    public TileEntity createTileEntity(World var1, int meta) {
        return new TileCenteredPole();
    }
}
