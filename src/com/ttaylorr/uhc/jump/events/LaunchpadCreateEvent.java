package com.ttaylorr.uhc.jump.events;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.ttaylorr.uhc.jump.pad.Launchpad;

public class LaunchpadCreateEvent extends Event {

	private static final HandlerList handlers = new HandlerList();
	
	private CommandSender creator;
	private Launchpad launchpad;
	
	public LaunchpadCreateEvent(Launchpad launchpad, CommandSender creator) {
		this.launchpad = launchpad;
		this.creator = creator;
	}
	
	public CommandSender getCreator() {
		return this.creator;
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
