package me.beaver;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;


public class Event implements Listener {

	@EventHandler
	
	public void playerCommandTeleportEvent(PlayerTeleportEvent event) 
	{
		 if (event.getCause() == PlayerTeleportEvent.TeleportCause.SPECTATE && event.getPlayer().hasPermission("spectator.bypass"))
		{
			event.setCancelled(false);
			
		}
		 else if (event.getCause() == PlayerTeleportEvent.TeleportCause.SPECTATE) 
		{
			event.setCancelled(true);
			event.getPlayer().sendMessage(ChatColor.RED + "You don't have acces to tp via the spectator menu.");
			event.getPlayer().sendMessage(ChatColor.GRAY +  "I'm sorry if you tried to spectate an animal or a player and this error message popped up." );
			
		}
		
		
		
	}
	
	
}
