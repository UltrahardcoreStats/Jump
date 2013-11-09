package com.ttaylorr.uhc.jump.listeners;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import com.ttaylorr.uhc.jump.Jump;
import com.ttaylorr.uhc.jump.events.LaunchpadCreateEvent;
import com.ttaylorr.uhc.jump.pad.Launchpad;
import com.ttaylorr.uhc.jump.wand.LaunchpadWand;

public class WandListener implements Listener {

	HashMap<LaunchpadWand, ArrayList<Location>> wandMap = new HashMap<LaunchpadWand, ArrayList<Location>>();
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event) {
		if (LaunchpadWand.isValidWand(event.getItem())) {

			if(wandMap.get(event.getItem()).size() != 3) {
				switch (event.getAction()) {
				case LEFT_CLICK_BLOCK:
					wandMap.get(event.getItem()).add(event.getClickedBlock().getLocation());
					break;
				case RIGHT_CLICK_BLOCK:
					wandMap.get(event.getItem()).add(event.getClickedBlock().getLocation());
					break;
				default:
					break;
				}	
			} else {
				Location min, max, to;
				
				min = wandMap.get(event.getItem()).get(0);
				max = wandMap.get(event.getItem()).get(1);
				to = wandMap.get(event.getItem()).get(2);
				
				Launchpad l = new Launchpad(min, max, to);
				
				Jump.getLaunchpads().add(l);
				Bukkit.getServer().getPluginManager().callEvent(new LaunchpadCreateEvent(l, event.getPlayer()));
			}

		}
	}

}
