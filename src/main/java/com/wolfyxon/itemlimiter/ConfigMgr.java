package com.wolfyxon.itemlimiter;

import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;

public class ConfigMgr {
    FileConfiguration configFile;
    ItemLimiter plugin;

    public ConfigMgr(ItemLimiter plugin){
        this.plugin = plugin;
    }

    public void load(){
        configFile = plugin.getConfig();
    }

    public int getMaxDataSize(){
        return configFile.getInt("maxItemDataSize");
    }

    public int getMaxBookPages(){
        return configFile.getInt("maxBookPages");
    }

    public String getMessage(String localPath){
        return Utils.format( configFile.getString("messages."+localPath) );
    }

    public static boolean hasPermission(String permission, CommandSender sender){
        if(sender instanceof ConsoleCommandSender) return true;
        if(sender.isOp()) return true;
        String prefix = "itemlimiter.";
        return sender.hasPermission(prefix+permission);
    }


}
