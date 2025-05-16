package td1138.tramsinmotion.models.render;

import fexcraft.tmt.slim.Tessellator;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import td1138.tramsinmotion.library.TramsInMotionInfo;
import td1138.tramsinmotion.models.blocks.ModelLFPlatformShelter;

public class ItemRenderLFPlatformShelter implements IItemRenderer {
    private static final ModelLFPlatformShelter modelLFPlatformShelter = new ModelLFPlatformShelter();
    private static final ResourceLocation texture = new ResourceLocation(TramsInMotionInfo.resourceLocation,TramsInMotionInfo.modelTexPrefix + "Low_Floor_Platform.png");

    public ItemRenderLFPlatformShelter() {
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        switch (type) {
            case ENTITY:
                RenderLFPlatformShelter(0.2f, 1f, 1f);
                return;
            case EQUIPPED:
                RenderLFPlatformShelter(0.2f, 1f, 1f);
                return;

            case EQUIPPED_FIRST_PERSON: {
                RenderLFPlatformShelter(0.2f, 1f, 1f);
                return;
            }
            case INVENTORY: {
                RenderLFPlatformShelter(0f, 0f, 0.7f);
                return;
            }
            default:
                break;
        }
    }

    private void RenderLFPlatformShelter(float x, float y, float z) {
        Tessellator.bindTexture(texture);
        GL11.glPushMatrix();
        GL11.glTranslatef(x, y + 0.125f, z);
        GL11.glRotatef(180f, 0f, 0f, 1f);
        modelLFPlatformShelter.render();
        GL11.glPopMatrix();
    }
}
