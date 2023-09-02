package me.aycy.optimalaim.eventlistener;

import me.aycy.optimalaim.OptimalAim;
import me.aycy.optimalaim.config.Config;
import me.aycy.optimalaim.aabb.CustomAABB;
import me.aycy.optimalaim.util.ColorConfig;
import me.aycy.optimalaim.util.RenderUtils;
import me.aycy.optimalaim.util.somestuff;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;


public class EventRenderer {
    private final Minecraft a = Minecraft.getMinecraft();
    private final Config Config = OptimalAim.instance.config;
    private EntityPlayer c;

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public void a(RenderPlayerEvent.Post post) {
        if (this.Config.e) {
            EntityPlayer entityPlayer = post.entityPlayer;
            a(entityPlayer);
            if (this.c != null && this.c == entityPlayer) {
                somestuff c = new somestuff(post, this.a.thePlayer);
                somestuff d = new somestuff(post, entityPlayer);
                a(c.a(d), this.Config.c, this.Config.d);
            }
        }
    }

    private void a(EntityPlayer entityPlayer) {
        if (!entityPlayer.isUser() && !entityPlayer.isInvisible()) {
            float f = entityPlayer.getDistanceToEntity(this.a.thePlayer);
            if (this.c == null) {
                if (entityPlayer.deathTime <= 0 && f <= this.Config.f) {
                    this.c = entityPlayer;
                }
            } else {

                float c = this.c.getDistanceToEntity(this.a.thePlayer);
                if (this.c != entityPlayer) {
                    if (f < c) {
                        this.c = entityPlayer;
                    }
                } else if (c > this.Config.f || this.c.deathTime > 0) {
                    this.c = null;
                }
            }
        }
    }

    private void a(CustomAABB customAABB1, ColorConfig d1, ColorConfig c) {
        GlStateManager.pushMatrix();
        GlStateManager.disableAlpha();
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        GlStateManager.disableTexture2D();
        GlStateManager.depthMask(true);
        GlStateManager.disableLighting();
        GlStateManager.enableCull();
        if (d1.h > 0.0F) {
            GlStateManager.color(d1.e, d1.f, d1.g, d1.h);
            RenderUtils.renderCube(customAABB1);
        }
        if (c.h > 0.0F) {
            GL11.glEnable(2848);
            GL11.glHint(3154, 4354);
            GL11.glLineWidth(2.0F);
            GlStateManager.color(c.e, c.f, c.g, c.h);
            RenderGlobal.drawSelectionBoundingBox(customAABB1);
        }
        GlStateManager.enableCull();
        GlStateManager.enableLighting();
        GlStateManager.depthMask(true);
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.popMatrix();
    }
}
