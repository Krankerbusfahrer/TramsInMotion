/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package td1138.tramsinmotion.models.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import fexcraft.tmt.slim.Tessellator;
import td1138.tramsinmotion.blocks.CenteredPole;
import td1138.tramsinmotion.library.TramsInMotionInfo;
import td1138.tramsinmotion.tile.poles.TileCenteredPole;


public class RenderCenteredPole extends TileEntitySpecialRenderer {

    private static final CenteredPole CenteredPole = new CenteredPole();
    private static final ResourceLocation texture = new ResourceLocation(TramsInMotionInfo.resourceLocation, TramsInMotionInfo.modelTexPrefix + "Tram_Double_Pole.png");

    public RenderCenteredPole() {
    }

    public void render(TileEntity var1, double x, double y, double z) {
        GL11.glPushMatrix();

        GL11.glTranslated(x, y, z);
        fexcraft.tmt.slim.Tessellator.bindTexture(texture);

        GL11.glTranslatef(0.5F, 0.65F, 0.5F);

        switch (((TileCenteredPole) var1).getFacing()) {
            case NORTH: {
                GL11.glRotated(180, 0, 0, 1);
                GL11.glRotated(90, 0, 1, 0);
                //GL11.glTranslated(0.5, 0f, 0.5);
                //System.out.println("N");

                break;
            }
            case SOUTH: {
                GL11.glRotated(180, 0, 0, 1);
                GL11.glRotated(270, 0, 1, 0);
                //GL11.glTranslated(0.5, 0f, 0.5);
                //System.out.println("S");

                //GL11.glTranslated(0.1875, -1, 0.125);
                break;
            }
            case WEST: {
                GL11.glRotated(180, 0, 0, 1);
                GL11.glRotated(180, 0, 1, 0);
                //System.out.println("E");

                //GL11.glTranslated(0.1875, -1, 0.125);
                break;
            }
            case EAST: {
                GL11.glRotated(180, 0, 0, 1);
                GL11.glRotated(0, 0, 1, 0);
                //System.out.println("W");
                //GL11.glTranslated(0.1875, -1, 0.125);
                break;
            }

        }


        CenteredPole.render();

        GL11.glPopMatrix();
    }

    @Override
    public void renderTileEntityAt(TileEntity var1, double var2, double var4, double var6, float var8) {
        render(var1, var2, var4, var6);
    }
}
