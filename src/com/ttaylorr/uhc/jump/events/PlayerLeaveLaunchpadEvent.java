package com.ttaylorr.uhc.jump.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerLeaveLaunchpadEvent extends Event {

	// TODO: not yet implemented...

	private static final HandlerList handlers = new HandlerList();

	public HandlerList getHandlers() {
	    return handlers;
	}
	 
	public static HandlerList getHandlerList() {
	    return handlers;
	}
	
}
