package com.ttaylorr.uhc.jump.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.ttaylorr.uhc.jump.pad.Launchpad;

public class PlayerEnterLaunchpadEvent extends Event {

	private static final HandlerList handlers = new HandlerList();
	
	private Player player;
	private Launchpad launchpad;
	
	public PlayerEnterLaunchpadEvent(Player player, Launchpad launchpad) {
		this.player = player;
		this.launchpad = launchpad;
	}
	
	public Player getPlayer() {
		return this.player;
	}
	
	public Launchpad getLaunchpad() {
		return this.launchpad;
	}
	
	public HandlerList getHandlers() {
	    return handlers;
	}
	 
	public static HandlerList getHandlerList() {
	    return handlers;
	}
	
}
