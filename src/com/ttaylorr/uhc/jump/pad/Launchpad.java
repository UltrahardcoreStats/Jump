package com.ttaylorr.uhc.jump.pad;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Launchpad {

	private Location min;
	private Location max;
	private Location to;
	
	private ArrayList<Player> containedPlayers = new ArrayList<Player>();
	
	public Launchpad(Location min, Location max, Location to) {
		this.min = min;
		this.max = max;
		this.to = to;
	}
	
	public Location getMin() {
		return this.min;
	}
	
	public Location getMax() {
		return this.max;
	}
	
	public Location getTo() {
		return this.to;
	}
	
	protected void setMax(Location l1) {
		this.max = l1;
		return;
	}
	
	protected void setMin(Location l1) {
		this.min = l1;
		return;
	}
	
	protected void setTo(Location l1) {
		this.to = l1;
		return;
	}
	
	public ArrayList<Player> getContainedPlayers() {
		return this.containedPlayers;
	}
	
}
