package me.aycy.optimalaim.command;

import me.aycy.optimalaim.gui.SettingsScreen;
import me.aycy.optimalaim.util.StringObfuscator;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class OACommand extends CommandBase {
    public String getCommandName() {
        return StringObfuscator.obfuscate("bkp");
    }

    public String getCommandUsage(ICommandSender iCommandSender) {
        return EnumChatFormatting.RED + "/" + getCommandName();
    }

    public void processCommand(ICommandSender iCommandSender, String[] args) {
        if (args.length == 0) {
            (new SettingsScreen()).a();
        } else {
            iCommandSender.addChatMessage(new ChatComponentText(getCommandUsage(iCommandSender)));
        }
    }

    public boolean canCommandSenderUseCommand(ICommandSender iCommandSender) {
        return true;
    }
}
