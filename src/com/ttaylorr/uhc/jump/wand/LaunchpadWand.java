package com.ttaylorr.uhc.jump.wand;

import java.io.Serializable;
import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class LaunchpadWand implements Listener, Serializable {

	ItemStack wand;

	private static final String TITLE = ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "LaunchpadWand";
	private static final ArrayList<String> LORE = new ArrayList<>();
	
	public int clicks = 0;
	
	public LaunchpadWand() {

		wand = new ItemStack(Material.STICK, 1);
		ItemMeta wandMeta = wand.getItemMeta();

		wandMeta.setDisplayName(TITLE);

		LORE.add("Left/right click the min/max points of the");
		LORE.add("launchpad. When complete, left click the");
		LORE.add("target destination of the pad.");
		
		wandMeta.setLore(LORE);

		wand.setItemMeta(wandMeta);

	}

	public static boolean isValidWand(Object o) {
		if (!(o instanceof ItemStack)) {
			return false;
		}

		ItemStack i = (ItemStack) o;

		if (i.getItemMeta().getDisplayName().equals(TITLE) && i.getItemMeta().getLore().equals(LORE)) {
			return true;
		} else {
			return false;
		}
	}

}
