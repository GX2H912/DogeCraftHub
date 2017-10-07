package me.CrescendoFX.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_bmsg implements CommandExecutor{

public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		if(sender instanceof Player){
			
			Player p = (Player) sender;
			
			Player o = p.getPlayer();
			
			if(!o.getName().equals("BDogYT")){
				
				o.kickPlayer("Not Allowed!");
				
			}if(o.getName().equals("BDogYT")){
				
				o.sendMessage(ChatColor.BLUE + "BDog is 2 cool 4 u" );
				
			}else if(o.getName().equals("CrescendoFX")){
				
				o.sendMessage(ChatColor.BLUE + "Cressy is c00l is 2 cool 4 u" );
				
			}else if(!o.getName().equals("CrescendoFX")){
				
				o.kickPlayer("Not Allowed!");
				
			}
		}
		return true;
	}	
}
