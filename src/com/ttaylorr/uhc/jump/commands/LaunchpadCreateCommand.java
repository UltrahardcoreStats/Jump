package com.ttaylorr.uhc.jump.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

import com.ttaylorr.uhc.jump.ReadySetJump;
import com.ttaylorr.uhc.jump.events.LaunchpadCreateEvent;
import com.ttaylorr.uhc.jump.pad.Launchpad;

public class LaunchpadCreateCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (args.length != 6) {
			return false;
		} else if(sender.hasPermission("launchpad.create") || !(sender instanceof ConsoleCommandSender)) {
			 return false;
		} else {
			double x1 = Math.floor(Double.parseDouble(args[0])) + 0.5;
			double y1 = Math.floor(Double.parseDouble(args[1]));
			double z1 = Math.floor(Double.parseDouble(args[2])) + 0.5;
			double x2 = Math.floor(Double.parseDouble(args[3])) + 0.5;
			double y2 = Math.floor(Double.parseDouble(args[4]));
			double z2 = Math.floor(Double.parseDouble(args[5])) + 0.5;

			World world = Bukkit.getWorld("");

			Location min = new Location(world, x1, y1, z1);
			Location max = new Location(world, x2, y2, z2);

			Launchpad l = new Launchpad(min, max);
			
			ReadySetJump.getLaunchpads().add(new Launchpad(min, max));

			Bukkit.getServer().getPluginManager().callEvent(new LaunchpadCreateEvent(l, sender));
			
			return true;
		}
	}

}
