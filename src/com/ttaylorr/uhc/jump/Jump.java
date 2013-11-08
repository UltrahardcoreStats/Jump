package com.ttaylorr.uhc.jump;

import java.util.ArrayList;

import org.bukkit.plugin.java.JavaPlugin;

import com.ttaylorr.uhc.jump.pad.Launchpad;

public class Jump extends JavaPlugin {

	private static ArrayList<Launchpad> launchpads = new ArrayList<Launchpad>();
	
	@Override
	public void onDisable() {
		
	}
	
	@Override
	public void onEnable() {
		
	}
	
	public static ArrayList<Launchpad> getLaunchpads() {
		return launchpads;
	}
	
}
