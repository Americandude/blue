package nitwit.modules.util.render;

import net.lax1dude.eaglercraft.EaglerAdapter;
import net.lax1dude.eaglercraft.adapter.Tessellator;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Entity;
import net.minecraft.src.RenderManager;

public class RenderUtil {

    public static void drawWallHack(Entity entity, float r, float g, float b, float a) {

        double x = entity.boundingBox.minX - 0.05 - RenderManager.renderPosX;
        double y = entity.boundingBox.minY - RenderManager.renderPosY;
        double z = entity.boundingBox.minZ - 0.05 - RenderManager.renderPosZ;

        EaglerAdapter.glBlendFunc(770, 771);
        EaglerAdapter.glEnable(EaglerAdapter.GL_LINE_STRIP);
        EaglerAdapter.glEnable(3042);
        EaglerAdapter.glLineWidth(2.0f);
        EaglerAdapter.glDisable(3553);
        EaglerAdapter.glDisable(2929);
        EaglerAdapter.glDepthMask(false);
        EaglerAdapter.glColor4f(r, g, b, a);
        AxisAlignedBB myBox1 = AxisAlignedBB.getBoundingBox(x, y, z, x + entity.width + 0.1, y + entity.height + 0.1, z + entity.width + 0.1);
        drawOutlinedBoundingBox(myBox1);
        EaglerAdapter.glEnable(3553);
        EaglerAdapter.glEnable(2929);
        EaglerAdapter.glDepthMask(true);
        EaglerAdapter.glDisable(EaglerAdapter.GL_LINE_STRIP);
        EaglerAdapter.glDisable(3042);
    }
    
    public static void drawRect(int x1, int y1, int x2, int y2, int col) {
        int var5;

        if (x1 < x2) {
            var5 = x1;
            x1 = x2;
            x2 = var5;
        }

        if (y1 < y2) {
            var5 = y1;
            y1 = y2;
            y2 = var5;
        }

        float var10 = (float) (col >> 24 & 255) / 255.0F;
        float var6 = (float) (col >> 16 & 255) / 255.0F;
        float var7 = (float) (col >> 8 & 255) / 255.0F;
        float var8 = (float) (col & 255) / 255.0F;
        Tessellator var9 = Tessellator.instance;
        EaglerAdapter.glEnable(EaglerAdapter.GL_BLEND);
        EaglerAdapter.glDisable(EaglerAdapter.GL_TEXTURE_2D);
        EaglerAdapter.glBlendFunc(EaglerAdapter.GL_SRC_ALPHA, EaglerAdapter.GL_ONE_MINUS_SRC_ALPHA);
        EaglerAdapter.glColor4f(var6, var7, var8, var10);
        var9.startDrawingQuads();
        var9.addVertex((double) x1, (double) y2, 0.0D);
        var9.addVertex((double) x2, (double) y2, 0.0D);
        var9.addVertex((double) x2, (double) y1, 0.0D);
        var9.addVertex((double) x1, (double) y1, 0.0D);
        var9.draw();
        EaglerAdapter.glEnable(EaglerAdapter.GL_TEXTURE_2D);
        EaglerAdapter.glDisable(EaglerAdapter.GL_BLEND);
    }
    
    private static void drawOutlinedBoundingBox(AxisAlignedBB y1AxisAlignedBB){
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawing(3);
        tessellator.addVertex(y1AxisAlignedBB.minX, y1AxisAlignedBB.minY, y1AxisAlignedBB.minZ);
        tessellator.addVertex(y1AxisAlignedBB.maxX, y1AxisAlignedBB.minY, y1AxisAlignedBB.minZ);
        tessellator.addVertex(y1AxisAlignedBB.maxX, y1AxisAlignedBB.minY, y1AxisAlignedBB.maxZ);
        tessellator.addVertex(y1AxisAlignedBB.minX, y1AxisAlignedBB.minY, y1AxisAlignedBB.maxZ);
        tessellator.addVertex(y1AxisAlignedBB.minX, y1AxisAlignedBB.minY, y1AxisAlignedBB.minZ);
        tessellator.draw();
        tessellator.startDrawing(3);
        tessellator.addVertex(y1AxisAlignedBB.minX, y1AxisAlignedBB.maxY, y1AxisAlignedBB.minZ);
        tessellator.addVertex(y1AxisAlignedBB.maxX, y1AxisAlignedBB.maxY, y1AxisAlignedBB.minZ);
        tessellator.addVertex(y1AxisAlignedBB.maxX, y1AxisAlignedBB.maxY, y1AxisAlignedBB.maxZ);
        tessellator.addVertex(y1AxisAlignedBB.minX, y1AxisAlignedBB.maxY, y1AxisAlignedBB.maxZ);
        tessellator.addVertex(y1AxisAlignedBB.minX, y1AxisAlignedBB.maxY, y1AxisAlignedBB.minZ);
        tessellator.draw();
        tessellator.startDrawing(1);
        tessellator.addVertex(y1AxisAlignedBB.minX, y1AxisAlignedBB.minY, y1AxisAlignedBB.minZ);
        tessellator.addVertex(y1AxisAlignedBB.minX, y1AxisAlignedBB.maxY, y1AxisAlignedBB.minZ);
        tessellator.addVertex(y1AxisAlignedBB.maxX, y1AxisAlignedBB.minY, y1AxisAlignedBB.minZ);
        tessellator.addVertex(y1AxisAlignedBB.maxX, y1AxisAlignedBB.maxY, y1AxisAlignedBB.minZ);
        tessellator.addVertex(y1AxisAlignedBB.maxX, y1AxisAlignedBB.minY, y1AxisAlignedBB.maxZ);
        tessellator.addVertex(y1AxisAlignedBB.maxX, y1AxisAlignedBB.maxY, y1AxisAlignedBB.maxZ);
        tessellator.addVertex(y1AxisAlignedBB.minX, y1AxisAlignedBB.minY, y1AxisAlignedBB.maxZ);
        tessellator.addVertex(y1AxisAlignedBB.minX, y1AxisAlignedBB.maxY, y1AxisAlignedBB.maxZ);
        tessellator.draw();
    }
}
