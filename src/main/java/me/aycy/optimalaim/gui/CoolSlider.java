package me.aycy.optimalaim.gui;

import net.minecraftforge.fml.client.config.GuiSlider;

public class CoolSlider extends GuiSlider {
    public CoolSlider(int i, int b, int c, String d, double e, double f, double g) {
        super(i, b, c, 150, 20, d, "", e, f, g, true, true);
        updateSlider();
    }

    public void updateSlider() {
        this.precision = 2;
        super.updateSlider();
    }

    public void a(float f) {
        setValue(f);
        updateSlider();
    }
}
