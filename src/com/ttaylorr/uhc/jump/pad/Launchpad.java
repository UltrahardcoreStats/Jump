package com.ttaylorr.uhc.jump.pad;

import org.bukkit.Location;

public class Launchpad {

	private Location min;
	private Location max;
	
	public Launchpad(Location min, Location max) {
		this.min = min;
		this.max = max;
	}
	
	public Location getMin() {
		return this.min;
	}
	
	public Location getMax() {
		return this.max;
	}
	
	protected void setMax(Location l1) {
		this.max = l1;
		return;
	}
	
	protected void setMin(Location l1) {
		this.min = l1;
		return;
	}
	
}
