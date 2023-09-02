package me.aycy.optimalaim;

import me.aycy.optimalaim.command.OACommand;
import me.aycy.optimalaim.config.Config;
import me.aycy.optimalaim.eventlistener.EventRenderer;
import me.aycy.optimalaim.util.StringObfuscator;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

@Mod(modid = OptimalAim.MODID, name = OptimalAim.NAME, version = OptimalAim.VERSION)
public class OptimalAim {
    public static final String MODID = "@ID@";
    public static final String NAME = "@NAME@";
    public static final String VERSION = "@VER@";

    @Mod.Instance(MODID)
    public static OptimalAim instance;

    public Config config;

    @Mod.EventHandler
    public void a(FMLPreInitializationEvent e) {
        this.config = new Config(new File(Loader.instance().getConfigDir(), StringObfuscator.obfuscate("prwmrgsIrw9osu")));
    }

    @Mod.EventHandler
    public void a(FMLInitializationEvent a) {
        MinecraftForge.EVENT_BUS.register(new EventRenderer());
        ClientCommandHandler.instance.registerCommand(new OACommand());
    }
}
