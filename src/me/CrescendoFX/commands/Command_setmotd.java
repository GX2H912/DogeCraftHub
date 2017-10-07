package me.CrescendoFX.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import net.md_5.bungee.api.ChatColor;

public class Command_setmotd implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		
		if(args.length == 0){
			sender.sendMessage("Please Specify an MOTD!"); // If the player only types the command by itself
			return true; // Returns true :)
		}
		StringBuilder str = new StringBuilder(); // Gets instance of string builder :)
		for (int i = 0; i < args.length; i++){
			str.append(args[i]);
		}
		
		String motd = str.toString();
		sender.sendMessage(ChatColor.GOLD + "DogeCraftHub |" + ChatColor.GREEN + "MOTD: " + motd);
		

		return true; // Returns True :DDD
	}

}
