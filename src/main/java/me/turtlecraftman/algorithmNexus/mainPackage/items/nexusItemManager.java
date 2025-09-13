package me.turtlecraftman.algorithmNexus.mainPackage.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class nexusItemManager {
    
    public static ItemStack nexusCodex;
    public static ItemStack nexusRelic;
    
    public static void init() {
        createnexusCodex();
        createnexusRelic();
    }

    /**
     * Nexus Codex -
     * This book is used to open two different GUI menus that are used for the main plugin.
     * First GUI [Shift+Right Click] - This GUI is used to access the Progression System.
     * Second GUI [Shift+Left Click] - This GUI is used to access the Reward System.
     *
     * The Progression System - Used to grow your "connection" to the Nexus, while growing closer to the Nexus players
     * are able to unlock new perks, skills, unlockables, ect through a specialized tree system.
     *
     * The Reward System - Used to access the different rewards that can be earned from the Algorithm Nexus. With the
     * capabilities to also add your own custom rewards.
     *
     * Players will need to use an item or "relic" which this item is used to store points they collect, and once they
     * collected enough points, players will need to decide to use them for rewards or for progression. Making a new
     * progression style for all players.
     */
    
    private static void createnexusCodex() {
        ItemStack item = new ItemStack(Material.BOOK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.ITALIC + "Nexus Codex");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "This book contains the secrets");
        lore.add(ChatColor.GOLD + "of the Algorithm Nexus");
        lore.add("");
        lore.add(ChatColor.WHITE + "Must Be In Hand!!");
        lore.add(ChatColor.DARK_RED + "Shift+Right click to open");
        lore.add(ChatColor.RED + "the [no name yet]");
        lore.add("");
        lore.add(ChatColor.DARK_RED + "Shift+Left click to open");
        lore.add(ChatColor.RED + "the [no name yet]");
        lore.add("");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        nexusCodex = item;

    }

    private static void createnexusRelic() {
        ItemStack item = new ItemStack(Material.TOTEM_OF_UNDYING, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.ITALIC + "Nexus Relic");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "This item is used to store");
        lore.add(ChatColor.GOLD + "points you collect");
        lore.add("");
        lore.add(ChatColor.WHITE + "%pointamount%/" + ChatColor.GOLD + "%maxpoints%");
        lore.add("");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        nexusRelic = item;
    }

}
