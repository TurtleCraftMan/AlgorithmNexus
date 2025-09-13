package me.turtlecraftman.algorithmNexus.mainPackage.guis;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class progressionGUI implements InventoryHolder {

    private Inventory inventory;

    public progressionGUI(Player player) {
        inventory = getInventory(this, 54, "Progression Menu");
        setupInventory();
    }

    private Inventory getInventory(progressionGUI progressionGUI, int size, String title) {
        return Bukkit.createInventory(progressionGUI, size, title);
    }

    private void setupInventory() {
        // Level 1-5 progression boxes (top 5 rows)
        for (int level = 1; level <= 25; level++) {
            ItemStack levelItem = new ItemStack(Material.BOOK);
            ItemMeta meta = levelItem.getItemMeta();
            meta.setDisplayName("Level " + level);
            meta.setLore(java.util.Arrays.asList("Simple description for level " + level));
            levelItem.setItemMeta(meta);
            inventory.setItem(level - 1, levelItem);
        }

        // Bottom row navigation buttons (row 6)
        int lastRow = 5 * 9; // Starting index of last row

        ItemStack backButton = createMenuItem(Material.ARROW, "Back Page");
        ItemStack nextButton = createMenuItem(Material.ARROW, "Next Page");
        ItemStack homeButton = createMenuItem(Material.COMPASS, "Home");
        ItemStack closeButton = createMenuItem(Material.BARRIER, "Close");

        inventory.setItem(lastRow + 0, backButton);
        inventory.setItem(lastRow + 4, homeButton);
        inventory.setItem(lastRow + 8, nextButton);
        inventory.setItem(lastRow + 7, closeButton);
    }

    private ItemStack createMenuItem(Material material, String name) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        return item;
    }

    @Override
    public Inventory getInventory() {
        return inventory;
    }

    public void openInventory(Player player) {
        player.openInventory(inventory);
    }
}