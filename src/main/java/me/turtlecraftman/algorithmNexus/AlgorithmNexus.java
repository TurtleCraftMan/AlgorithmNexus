package me.turtlecraftman.algorithmNexus;

import me.turtlecraftman.algorithmNexus.mainPackage.items.nexusItemManager;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import static org.bukkit.Bukkit.getConsoleSender;


public final class AlgorithmNexus extends JavaPlugin {

    @Override
    public void onEnable() {

        // Main Package Initialization
        nexusItemManager.init();

        // Send enable message to console
        getConsoleSender().sendMessage(ChatColor.GREEN + "[AlgorithmNexus] Plugin has been enabled!");
    }

    @Override
    public void onDisable() {

        // Send disable message to console
        getConsoleSender().sendMessage(ChatColor.RED + "[AlgorithmNexus] Plugin has been disabled!");
    }
}