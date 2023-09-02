package me.aycy.optimalaim.util;

import java.util.Arrays;
import java.util.List;

import me.aycy.optimalaim.config.Config;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;


public class ColorConfig {
    public ColorConfig(Config a, Configuration configuration, String c) {
        this.config = a;
        this.c = configuration;
        this.d = c;
    }

    public void a(boolean a) {
        Property property1 = this.c.get(this.d, listOfString.get(0), 1.0D, null, 0.0D, 1.0D);
        Property c = this.c.get(this.d, listOfString.get(1), 0.0D, null, 0.0D, 1.0D);
        Property property2 = this.c.get(this.d, listOfString.get(2), 0.0D, null, 0.0D, 1.0D);
        Property e = this.c.get(this.d, listOfString.get(3), 1.0D, null, 0.0D, 1.0D);
        this.c.setCategoryPropertyOrder(this.d, listOfString);
        if (a) {
            this.e = this.config.a(property1);
            this.f = this.config.a(c);
            this.g = this.config.a(property2);
            this.h = this.config.a(e);
        }
        property1.set(this.e);
        c.set(this.f);
        property2.set(this.g);
        e.set(this.h);
    }


    private static final List<String> listOfString = Arrays.asList(StringObfuscator.obfuscate("sgg"), StringObfuscator.obfuscate("hthis"), StringObfuscator.obfuscate("cnxi"), StringObfuscator.obfuscate("bnslf"));
    private final Config config;
    private final Configuration c;
    private final String d;
    public float e;
    public float f;
    public float g;
    public float h;
}
