package com.ttaylorr.uhc.jump.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.ttaylorr.uhc.jump.pad.Launchpad;

public class PlayerLaunchEvent extends Event {

	private Launchpad launchpad;
	private Player player;
	
	public PlayerLaunchEvent(Launchpad launchpad, Player player) {
		this.launchpad = launchpad;
		this.player = player;
	
		player.teleport(launchpad.getTo());
		
		launchpad.getContainedPlayers().remove(player);
	
	}
	
	public Launchpad getLaunchpad() {
		return this.launchpad;
	}
	
	public Player getPlayer() {
		return this.player;
	}
	
	private static final HandlerList handlers = new HandlerList();

	public HandlerList getHandlers() {
	    return handlers;
	}
	 
	public static HandlerList getHandlerList() {
	    return handlers;
	}
	
}
