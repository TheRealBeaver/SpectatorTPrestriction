package me.beaver;


import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


public class SpectatorTabMode extends JavaPlugin{
	
	public void onEnable() {
		
		Bukkit.getServer().getLogger().info("Spectator TP restrictions enabled. Version 1.1");
		    getServer().getPluginManager().registerEvents(new Event(), this);
		    	
	}
	
	public void onDisable() 
	{
		
		Bukkit.getServer().getLogger().info("Spectator TP restrictions has been disabled on " + Bukkit.getServerName());
		
	}


}
