package me.turtlecraftman.algorithmNexus.mainPackage.items.weapons.classes;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class daggerClass {
    private static String baseName = "Dagger";
    private static Material material;
    private static String prefix;

    public static ItemStack createDagger(Material material) {
        ItemStack dagger = new ItemStack(material, 1);
        ItemMeta meta = dagger.getItemMeta();

        switch (material) {
            case WOODEN_SWORD:
                prefix = "Wooden";
                break;
            case STONE_SWORD:
                prefix = "Stone";
                break;
            case IRON_SWORD:
                prefix = "Iron";
                break;
            case GOLDEN_SWORD:
                prefix = "Golden";
                break;
            case DIAMOND_SWORD:
                prefix = "Diamond";
                break;
            case NETHERITE_SWORD:
                prefix = "Netherite";
                break;
            default:
                prefix = "";
        }

        meta.setDisplayName(ChatColor.RESET + prefix + " " + baseName);
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "A lightweight blade for quick strikes");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        dagger.setItemMeta(meta);

        return dagger;
    }
}