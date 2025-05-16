package td1138.tramsinmotion.core;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;
import org.lwjgl.opengl.GL11;
import td1138.tramsinmotion.core.handlers.RecipeBookHandler;
import td1138.tramsinmotion.gui.GuiRecipeBook;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import td1138.tramsinmotion.library.BlockIDs;
import td1138.tramsinmotion.library.GuiIDs;
import td1138.tramsinmotion.models.render.*;
import td1138.tramsinmotion.tile.poles.TileCenteredPole;
import td1138.tramsinmotion.tile.poles.TileLFPlatformFenced;
import td1138.tramsinmotion.tile.poles.TileLFPlatformShelter;


import java.util.Calendar;

public class ClientProxy extends CommonProxy {

    public static boolean preRenderModels=false;

    public static boolean isHoliday() {
        Calendar cal = Calendar.getInstance();
        return(cal.get(Calendar.MONTH) == Calendar.DECEMBER || (cal.get(Calendar.MONTH) == Calendar.JANUARY) && cal.get(Calendar.DATE) < 7);
    }
    public static boolean isPumpkin() {
        Calendar cal = Calendar.getInstance();
        return(cal.get(Calendar.MONTH) == Calendar.OCTOBER || cal.get(Calendar.MONTH) == Calendar.NOVEMBER && cal.get(Calendar.DATE) < 15);
    }
    public static boolean isAnniversary() {
        Calendar cal = Calendar.getInstance();
        return(cal.get(Calendar.MONTH) == Calendar.AUGUST && cal.get(Calendar.DATE) == 29);
    }


    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity te = world.getTileEntity(x, y, z);
        EntityPlayer riddenByEntity = null;
        Entity entity = player.ridingEntity;
        if (player.ridingEntity != null) {
            riddenByEntity = (EntityPlayer) entity.riddenByEntity;
        }

        Entity entity1 = null;
        if (y == -1) {
            for (Object ent : world.loadedEntityList) {
                if (((Entity) ent).getEntityId() == x)
                    entity1 = (Entity) ent;
            }
        }
        switch (ID) {

            case (GuiIDs.RECIPE_BOOK):
                return new GuiRecipeBook(player, player.getCurrentEquippedItem());


            default:
                return null;
        }
    }

    @Override
    public Object getTESR(){return specialRenderer;}

    public static final TileEntitySpecialRenderer specialRenderer = new TileEntitySpecialRenderer() {
        @Override
        public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float p_1475008) {
            GL11.glPushMatrix();
            GL11.glTranslated(x,y, z);
            tileEntity.func_145828_a(null);
            GL11.glPopMatrix();
        }

        @Override
        protected void bindTexture(ResourceLocation p_1474991){}
    };

    private static final Render nullRender = new Render() {
        @Override
        public void doRender(Entity p_769861, double p_769862, double p_769864, double p_769866, float p_769868, float p_769869) {}

        @Override
        protected ResourceLocation getEntityTexture(Entity p_1107751) {
            return null;
        }
    };

    @Override
    public GuiScreen getCurrentScreen() {
        return Minecraft.getMinecraft().currentScreen;
    }

    @Override
    public void registerBookHandler() {
        RecipeBookHandler recipeBookHandler = new RecipeBookHandler();
    }

    //@Override

    public void registerTileEntities() {

        ClientRegistry.bindTileEntitySpecialRenderer(TileCenteredPole.class, new RenderCenteredPole());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.CenteredPole.block), new ItemRenderCenteredPole());
        ClientRegistry.bindTileEntitySpecialRenderer(TileLFPlatformFenced.class, new RenderLFPlatformFenced());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.LFPlatformFenced.block), new ItemRenderLFPlatformFenced());
        ClientRegistry.bindTileEntitySpecialRenderer(TileLFPlatformShelter.class, new RenderLFPlatformShelter());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.LFPlatformShelter.block), new ItemRenderLFPlatformShelter());

    }

    @Override
    public void registerRenderInformation() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileCenteredPole.class, new RenderCenteredPole());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.CenteredPole.block), new ItemRenderCenteredPole());
        ClientRegistry.bindTileEntitySpecialRenderer(TileLFPlatformFenced.class, new RenderLFPlatformFenced());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.LFPlatformFenced.block), new ItemRenderLFPlatformFenced());
    }

}
