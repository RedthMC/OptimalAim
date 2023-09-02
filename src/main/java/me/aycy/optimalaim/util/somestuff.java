package me.aycy.optimalaim.util;

import me.aycy.optimalaim.OptimalAim;
import me.aycy.optimalaim.aabb.CustomAABB;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;

public class somestuff {
    private final RenderPlayerEvent a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;
    private final double g;
    private final double h;
    private final double i;

    public somestuff(RenderPlayerEvent a, EntityPlayer entityPlayer) {
        this.a = a;
        this.b = OptimalAim.instance.config.g;
        this.c = entityPlayer.getEyeHeight();
        this.d = (entityPlayer.width / 2.0F + 0.1F);
        this.e = (entityPlayer.width + 0.2F);
        this.f = (entityPlayer.height + 0.2F);
        this.g = entityPlayer.lastTickPosX + (entityPlayer.posX - entityPlayer.lastTickPosX) * a.partialRenderTick;
        this.h = entityPlayer.lastTickPosY + (entityPlayer.posY - entityPlayer.lastTickPosY) * a.partialRenderTick;
        this.i = entityPlayer.lastTickPosZ + (entityPlayer.posZ - entityPlayer.lastTickPosZ) * a.partialRenderTick;
    }

    public CustomAABB a(somestuff a) {
        double d1 = a(this.a.x - a.g, this.g, a.g - this.d, this.e, this.b);
        double c = a(this.a.y - a.h, this.h + this.c, a.h - 0.10000000149011612D, this.f, this.b);
        double d = a(this.a.z - a.i, this.i, a.i - this.d, this.e, this.b);
        return new CustomAABB(d1 - this.b, c - this.b, d - this.b, d1 + this.b, c + this.b, d + this.b);
    }

    private double a(double a, double d1, double c, double d, double e) {
        if (d1 <= c + e) {
            return c + a + e;
        }
        if (d1 >= c + d - e) {
            return c + d + a - e;
        }
        return d1 + a;
    }
}
