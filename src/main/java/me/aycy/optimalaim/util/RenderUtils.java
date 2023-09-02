package me.aycy.optimalaim.util;

import me.aycy.optimalaim.aabb.CustomAABB;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;


public class RenderUtils {
    public static void renderCube(CustomAABB customAABB1) {
        worldRenderer.begin(7, DefaultVertexFormats.POSITION);
        worldRenderer.pos(customAABB1.minX, customAABB1.maxY, customAABB1.maxZ).endVertex();
        worldRenderer.pos(customAABB1.maxX, customAABB1.maxY, customAABB1.maxZ).endVertex();
        worldRenderer.pos(customAABB1.maxX, customAABB1.maxY, customAABB1.minZ).endVertex();
        worldRenderer.pos(customAABB1.minX, customAABB1.maxY, customAABB1.minZ).endVertex();
        RenderUtils.tessellator.draw();
        worldRenderer.begin(7, DefaultVertexFormats.POSITION);
        worldRenderer.pos(customAABB1.maxX, customAABB1.minY, customAABB1.maxZ).endVertex();
        worldRenderer.pos(customAABB1.minX, customAABB1.minY, customAABB1.maxZ).endVertex();
        worldRenderer.pos(customAABB1.minX, customAABB1.minY, customAABB1.minZ).endVertex();
        worldRenderer.pos(customAABB1.maxX, customAABB1.minY, customAABB1.minZ).endVertex();
        RenderUtils.tessellator.draw();
        worldRenderer.begin(7, DefaultVertexFormats.POSITION);
        worldRenderer.pos(customAABB1.minX, customAABB1.maxY, customAABB1.minZ).endVertex();
        worldRenderer.pos(customAABB1.maxX, customAABB1.maxY, customAABB1.minZ).endVertex();
        worldRenderer.pos(customAABB1.maxX, customAABB1.minY, customAABB1.minZ).endVertex();
        worldRenderer.pos(customAABB1.minX, customAABB1.minY, customAABB1.minZ).endVertex();
        RenderUtils.tessellator.draw();
        worldRenderer.begin(7, DefaultVertexFormats.POSITION);
        worldRenderer.pos(customAABB1.maxX, customAABB1.maxY, customAABB1.maxZ).endVertex();
        worldRenderer.pos(customAABB1.minX, customAABB1.maxY, customAABB1.maxZ).endVertex();
        worldRenderer.pos(customAABB1.minX, customAABB1.minY, customAABB1.maxZ).endVertex();
        worldRenderer.pos(customAABB1.maxX, customAABB1.minY, customAABB1.maxZ).endVertex();
        RenderUtils.tessellator.draw();
        worldRenderer.begin(7, DefaultVertexFormats.POSITION);
        worldRenderer.pos(customAABB1.minX, customAABB1.maxY, customAABB1.maxZ).endVertex();
        worldRenderer.pos(customAABB1.minX, customAABB1.maxY, customAABB1.minZ).endVertex();
        worldRenderer.pos(customAABB1.minX, customAABB1.minY, customAABB1.minZ).endVertex();
        worldRenderer.pos(customAABB1.minX, customAABB1.minY, customAABB1.maxZ).endVertex();
        RenderUtils.tessellator.draw();
        worldRenderer.begin(7, DefaultVertexFormats.POSITION);
        worldRenderer.pos(customAABB1.maxX, customAABB1.maxY, customAABB1.minZ).endVertex();
        worldRenderer.pos(customAABB1.maxX, customAABB1.maxY, customAABB1.maxZ).endVertex();
        worldRenderer.pos(customAABB1.maxX, customAABB1.minY, customAABB1.maxZ).endVertex();
        worldRenderer.pos(customAABB1.maxX, customAABB1.minY, customAABB1.minZ).endVertex();
        RenderUtils.tessellator.draw();
    }

    public static void a(int a, int b, int i, int d, int e, int f) {
        float g = (e >> 24 & 0xFF) / 255.0F;
        float h = (e >> 16 & 0xFF) / 255.0F;
        float f1 = (e >> 8 & 0xFF) / 255.0F;
        float j = (e & 0xFF) / 255.0F;
        float k = (f >> 24 & 0xFF) / 255.0F;
        float l = (f >> 16 & 0xFF) / 255.0F;
        float m = (f >> 8 & 0xFF) / 255.0F;
        float n = (f & 0xFF) / 255.0F;
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        GlStateManager.shadeModel(7425);
        RenderUtils.worldRenderer.begin(7, DefaultVertexFormats.POSITION_COLOR);
        RenderUtils.worldRenderer.pos(a, b, 0.0D).color(h, f1, j, g).endVertex();
        RenderUtils.worldRenderer.pos(a, d, 0.0D).color(h, f1, j, g).endVertex();
        RenderUtils.worldRenderer.pos(i, d, 0.0D).color(l, m, n, k).endVertex();
        RenderUtils.worldRenderer.pos(i, b, 0.0D).color(l, m, n, k).endVertex();
        RenderUtils.tessellator.draw();
        GlStateManager.shadeModel(7424);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
    }


    private static final Tessellator tessellator = Tessellator.getInstance();
    private static final WorldRenderer worldRenderer = tessellator.getWorldRenderer();
}
