package me.aycy.optimalaim.gui;

import me.aycy.optimalaim.OptimalAim;
import me.aycy.optimalaim.config.Config;

import me.aycy.optimalaim.util.RenderUtils;
import me.aycy.optimalaim.util.StringObfuscator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.config.GuiButtonExt;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class SettingsScreen extends GuiScreen {
    private final Config config = OptimalAim.instance.config;


    public void initGui() {
        this.buttonList.add(this.e = new GuiButtonExt(0, this.width / 2 - 190, this.height / 2 - 94, 150, 20, StringObfuscator.obfuscate("Bkp>%") + (this.config.e ? (EnumChatFormatting.GREEN + StringObfuscator.obfuscate("Pp")) : (EnumChatFormatting.RED + StringObfuscator.obfuscate("Phi")))));
        this.buttonList.add(this.f = new CoolSlider(1, this.width / 2 - 190, this.height / 2 - 70, StringObfuscator.obfuscate("Sgqhjx'Lr}m{qtJ1"), 1.0D, 32.0D, this.config.f));
        this.buttonList.add(this.g = new CoolSlider(2, this.width / 2 - 190, this.height / 2 - 46, StringObfuscator.obfuscate("Xkgxm@'"), 0.10000000149011612D, 0.6000000238418579D, (this.config.g * 2.0F)));
        this.buttonList.add(this.h = new CoolSlider(3, this.width / 2 - 190, this.height / 2 - 22, StringObfuscator.obfuscate("Sgg>%"), 0.0D, 1.0D, c ? this.config.d.e : this.config.c.e));
        this.buttonList.add(this.i = new CoolSlider(4, this.width / 2 - 190, this.height / 2 + 2, StringObfuscator.obfuscate("Hthis@'"), 0.0D, 1.0D, c ? this.config.d.f : this.config.c.f));
        this.buttonList.add(this.j = new CoolSlider(5, this.width / 2 - 190, this.height / 2 + 26, StringObfuscator.obfuscate("Cnxi?&"), 0.0D, 1.0D, c ? this.config.d.g : this.config.c.g));
        this.buttonList.add(this.k = new CoolSlider(6, this.width / 2 - 190, this.height / 2 + 50, StringObfuscator.obfuscate("Bnslf@'"), 0.0D, 1.0D, c ? this.config.d.h : this.config.c.h));
        this.buttonList.add(this.l = new GuiButtonExt(7, this.width / 2 - 190, this.height / 2 + 74, 150, 20, (c ? StringObfuscator.obfuscate("Pwwpntl") : StringObfuscator.obfuscate("Dwei")) + StringObfuscator.obfuscate("!Erptx")));
    }

    public void drawScreen(int i, int j, float c) {
        drawBackground(0);
        GlStateManager.pushMatrix();
        GlStateManager.scale(1.5F, 1.5F, 1.0F);
        drawCenteredString(this.fontRendererObj, StringObfuscator.obfuscate("Prwmrgs(Jsx"), (int) (this.width / 1.5F / 2.0F) + 60, (int) (this.height / 1.5F / 2.0F) - 62, -1);
        GlStateManager.scale(0.33333334F, 0.33333334F, 1.0F);
        drawCenteredString(this.fontRendererObj, StringObfuscator.obfuscate("Dtheykk(k+Mq"), (int) (this.width / 0.5F / 2.0F) + 180, (int) (this.height / 0.5F / 2.0F) - 156, -5592406);
        GlStateManager.scale(2.0F, 2.0F, 1.0F);
        int d = this.width / 2 + 40;
        int e = this.height / 2 - 50;
        GuiScreen.drawRect(d, e, d + 100, e + 100, -2147483648);
        drawGradientRect(d, e, d + 100, e + 8, -2147483648, 0);
        drawGradientRect(d, e + 92, d + 100, e + 100, 0, -2147483648);
        RenderUtils.a(d, e, d + 8, e + 100, -2147483648, 0);
        RenderUtils.a(d + 92, e, d + 100, e + 100, 0, -2147483648);
        GlStateManager.disableAlpha();
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        GlStateManager.enableTexture2D();
        float f = this.config.g / 0.3F * 0.25F;
        float g = -f * 256.0F / 2.0F + 50.0F;
        d += (int) g;
        e += (int) g;
        GlStateManager.scale(f, f, 1.0F);
        if (this.config.c.h > 0.0F) {
            GlStateManager.color(this.config.c.e, this.config.c.f, this.config.c.g, this.config.c.h);
            this.mc.getTextureManager().bindTexture(cube_png);
            drawTexturedModalRect(d * 1.0F / f, e * 1.0F / f, 0, 0, 256, 256);
        }
        if (this.config.d.h > 0.0F) {
            GlStateManager.color(this.config.d.e, this.config.d.f, this.config.d.g, this.config.d.h);
            this.mc.getTextureManager().bindTexture(outline_png);
            drawTexturedModalRect(d * 1.0F / f, e * 1.0F / f, 0, 0, 256, 256);
        }
        GlStateManager.popMatrix();
        super.drawScreen(i, j, c);
    }

    protected void actionPerformed(GuiButton guiButton) {
        GuiButtonExt e;
        StringBuilder append;
        Config d;
        switch (guiButton.id) {
            case 0:
                e = this.e;
                append = (new StringBuilder()).append(StringObfuscator.obfuscate("Bkp>%"));
                d = this.config;
                d.e = !d.e;
                e.displayString = append.append(d.e ? (EnumChatFormatting.GREEN + StringObfuscator.obfuscate("Pp")) : (EnumChatFormatting.RED + StringObfuscator.obfuscate("Phi"))).toString();
                break;

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                a(2.0F);
                break;

            case 7:
                this.l.displayString = ((c = !c) ? StringObfuscator.obfuscate("Pwwpntl") : StringObfuscator.obfuscate("Dwei")) + StringObfuscator.obfuscate("!Erptx");
                this.h.a(c ? this.config.d.e : this.config.c.e);
                this.i.a(c ? this.config.d.f : this.config.c.f);
                this.j.a(c ? this.config.d.g : this.config.c.g);
                this.k.a(c ? this.config.d.h : this.config.c.h);
                break;
        }
    }


    protected void mouseClickMove(int i, int j, int c, long d) {
        a(2.0F);
    }

    public void onGuiClosed() {
        this.config.a(false);
    }

    public void a() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void a(float f) {
        this.config.f = (float) this.f.getValue();
        this.config.g = (float) this.g.getValue() / f;
        if (c) {
            this.config.d.e = (float) this.h.getValue();
            this.config.d.f = (float) this.i.getValue();
            this.config.d.g = (float) this.j.getValue();
            this.config.d.h = (float) this.k.getValue();
        } else {

            this.config.c.e = (float) this.h.getValue();
            this.config.c.f = (float) this.i.getValue();
            this.config.c.g = (float) this.j.getValue();
            this.config.c.h = (float) this.k.getValue();
        }
    }

    @SubscribeEvent
    public void a(TickEvent.ClientTickEvent clientTickEvent) {
        Minecraft.getMinecraft().displayGuiScreen(this);
        MinecraftForge.EVENT_BUS.unregister(this);
    }


    private static final ResourceLocation cube_png = new ResourceLocation(StringObfuscator.obfuscate("prwmrgsirw"), StringObfuscator.obfuscate("dwei3vuo"));
    private static final ResourceLocation outline_png = new ResourceLocation(StringObfuscator.obfuscate("prwmrgsirw"), StringObfuscator.obfuscate("pwwpntl6yxr"));
    private static boolean c;
    private GuiButtonExt e;
    private CoolSlider f;
    private CoolSlider g;
    private CoolSlider h;
    private CoolSlider i;
    private CoolSlider j;
    private CoolSlider k;
    private GuiButtonExt l;
}
