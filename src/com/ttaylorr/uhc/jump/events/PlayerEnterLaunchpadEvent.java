package com.ttaylorr.uhc.jump.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.ttaylorr.uhc.jump.pad.Launchpad;

public class PlayerEnterLaunchpadEvent extends Event {

	private static final HandlerList handlers = new HandlerList();
	
	private Player player;
	private Launchpad launchpad;
	private boolean isValid;
	
	public PlayerEnterLaunchpadEvent(Player player, Launchpad launchpad) {
		this.player = player;
		this.launchpad = launchpad;
		this.isValid = player.hasPermission("launchpad.use");		
	}
	
	public PlayerEnterLaunchpadEvent(Player player, Launchpad launchpad, boolean isValid) {
		this.player = player;
		this.launchpad = launchpad;
		this.isValid = isValid;
	}
	
	public Player getPlayer() {
		return this.player;
	}
	
	public Launchpad getLaunchpad() {
		return this.launchpad;
	}
	
	public boolean getIsValid() {
		return this.isValid;
	}
	
	public HandlerList getHandlers() {
	    return handlers;
	}
	 
	public static HandlerList getHandlerList() {
	    return handlers;
	}
	
}
