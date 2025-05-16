package td1138.tramsinmotion.core;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.opengl.GL11;
import td1138.tramsinmotion.library.BlockIDs;
import td1138.tramsinmotion.models.render.*;
import td1138.tramsinmotion.tile.poles.TileCenteredPole;
import td1138.tramsinmotion.tile.poles.TileLFPlatformFenced;
import td1138.tramsinmotion.tile.poles.TileLFPlatformShelter;
import train.common.Traincraft;
import train.common.core.handlers.ChunkEvents;
import train.common.core.handlers.WorldEvents;

public class CommonProxy implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

            return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

      return null;

    }
    public Object getTESR(){return null;}
    public boolean isClient(){
        return false;
    }
    public GuiScreen getCurrentScreen() {
        return null;
    }

    public void registerBookHandler() {}

    public void registerRenderInformation() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileCenteredPole.class, new RenderCenteredPole());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(td1138.tramsinmotion.library.BlockIDs.CenteredPole.block), new ItemRenderCenteredPole());
        ClientRegistry.bindTileEntitySpecialRenderer(TileLFPlatformFenced.class, new RenderLFPlatformFenced());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.LFPlatformFenced.block), new ItemRenderLFPlatformFenced());
        ClientRegistry.bindTileEntitySpecialRenderer(TileLFPlatformShelter.class, new RenderLFPlatformShelter());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.LFPlatformShelter.block), new ItemRenderLFPlatformShelter());
    }
    
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
    public void registerTileEntities() {
    }

    public void registerEvents(FMLPreInitializationEvent event) {
        WorldEvents worldEvents = new WorldEvents();
        ChunkEvents chunkEvents = new ChunkEvents();

        registerEvent(worldEvents);
        registerEvent(chunkEvents);
        ForgeChunkManager.setForcedChunkLoadingCallback(Traincraft.instance, chunkEvents);
    }
    public void registerEvent(Object o) {
        FMLCommonHandler.instance().bus().register(o);
        MinecraftForge.EVENT_BUS.register(o);
    }
};

