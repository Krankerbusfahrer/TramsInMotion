package td1138.tramsinmotion.models.render;

import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import fexcraft.tmt.slim.Tessellator;
import td1138.tramsinmotion.blocks.BlockCenteredPole;
import td1138.tramsinmotion.library.TramsInMotionInfo;
import td1138.tramsinmotion.models.blocks.ModelCenteredPole;
import train.common.library.Info;

public class ItemRenderCenteredPole implements IItemRenderer {
    private static final ModelCenteredPole modelCenteredPole = new ModelCenteredPole();
    private static final ResourceLocation texture = new ResourceLocation(TramsInMotionInfo.resourceLocation,TramsInMotionInfo.modelTexPrefix + "Tram_Double_Pole.png");

    public ItemRenderCenteredPole() {
    }

    @Override
    public boolean handleRenderType(ItemStack item, IItemRenderer.ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(IItemRenderer.ItemRenderType type, ItemStack item, IItemRenderer.ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(IItemRenderer.ItemRenderType type, ItemStack item, Object... data) {
        switch (type) {
            case ENTITY:
                RenderCenteredPole(0.2f, 1f, 1f);
                return;
            case EQUIPPED:
                RenderCenteredPole(0.2f, 1f, 1f);
                return;

            case EQUIPPED_FIRST_PERSON: {
                RenderCenteredPole(0.2f, 1f, 1f);
                return;
            }
            case INVENTORY: {
                RenderCenteredPole(0f, 0f, 0.7f);
                return;
            }
            default:
                break;
        }
    }

    private void RenderCenteredPole(float x, float y, float z) {
        Tessellator.bindTexture(texture);
        GL11.glPushMatrix();
        GL11.glTranslatef(x, y + 0.125f, z);
        GL11.glRotatef(180f, 0f, 0f, 1f);
        modelCenteredPole.render();
        GL11.glPopMatrix();
    }
}
