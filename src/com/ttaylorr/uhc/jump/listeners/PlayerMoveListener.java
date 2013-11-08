package com.ttaylorr.uhc.jump.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import com.ttaylorr.uhc.jump.ReadySetJump;
import com.ttaylorr.uhc.jump.events.PlayerEnterLaunchpadEvent;
import com.ttaylorr.uhc.jump.pad.Launchpad;

public class PlayerMoveListener implements Listener {

	@EventHandler
	public void onPlayerMove(PlayerMoveEvent event) {
		Location to = event.getTo();
		
		for(Launchpad l : ReadySetJump.getLaunchpads()) {
			if(to.toVector().isInAABB(l.getMin().toVector(), l.getMax().toVector())) {
				Bukkit.getServer().getPluginManager().callEvent(new PlayerEnterLaunchpadEvent(event.getPlayer(), l));
			}
		}
	}
	
}
