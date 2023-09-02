package me.aycy.optimalaim.config;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import me.aycy.optimalaim.util.ColorConfig;
import me.aycy.optimalaim.util.StringObfuscator;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;


public class Config {
    private final Configuration a;
    private final String b;
    public final ColorConfig c;

    public Config(File a) {
        this.a = new Configuration(a, true);
        this.b = StringObfuscator.obfuscate("Bkp");
        this.c = new ColorConfig(this, this.a, StringObfuscator.obfuscate("Dwei"));
        this.d = new ColorConfig(this, this.a, StringObfuscator.obfuscate("Pwwpntl"));
        a(true);
    }

    public final ColorConfig d;
    public boolean e;
    public float f;
    public float g;

    public void a(boolean a) {
        if (a) {
            this.a.load();
        }
        this.c.a(a);
        this.d.a(a);
        Property property1 = this.a.get(this.b, StringObfuscator.obfuscate("fpdfqkk"), true);
        Property c = this.a.get(this.b, StringObfuscator.obfuscate("ekvxftjm"), 10.0D, null, 1.0D, 32.0D);
        Property property2 = this.a.get(this.b, StringObfuscator.obfuscate("scgmzy"), 0.2D, null, 0.05000000074505806D, 0.30000001192092896D);
        List<String> e = new ArrayList<>();
        e.add(property1.getName());
        e.add(c.getName());
        e.add(property2.getName());
        this.a.setCategoryPropertyOrder(this.b, e);
        if (a) {
            this.e = property1.getBoolean();
            this.f = a(c);
            this.g = a(property2);
        }
        property1.set(this.e);
        c.set(this.f);
        property2.set(this.g);
        if (this.a.hasChanged()) {
            this.a.save();
        }
    }

    public float a(Property a) {
        float f1 = Float.parseFloat(a.getMinValue());
        float c = Float.parseFloat(a.getMaxValue());
        float f2 = (float) a.getDouble();
        if (f2 < f1) {
            f2 = f1;
        } else if (c < f2) {
            f2 = c;
        }
        return f2;
    }
}
