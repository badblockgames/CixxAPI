package be.cixxor.api.utils.mongodb;

import org.bukkit.Bukkit;

import net.md_5.bungee.api.ChatColor;

public class MongoMessages {
	
	public static void consoleGood(String s) {
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + s);
	}
	public static void consoleRed(String s) {
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED + s);
	}
	public static void consoleInfo(String s) {
		Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW + s);
	}
	
}
