package me.CrescendoFX.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Command_fakeop implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		
		if(!(sender instanceof Player)){
			
			sender.sendMessage(ChatColor.GOLD + "DogeCraftHub |" + " This command can only be used in-game.");
			return true;
		}
		
		if(args.length == 0){
			
			sender.sendMessage(ChatColor.RED + "DogeCraftHub |" + " Please enter the correct arguments.");
			return true;
		}
		Player t = Bukkit.getServer().getPlayer(args[0]);
		
		if(t == null){
			
			sender.sendMessage(ChatColor.RED + "DogeCraftHub |" + " The player" + args[0] + " is not online, or is invalid.");
			return true;
		}
		if(!sender.isOp()){
			sender.sendMessage(ChatColor.GOLD + "DogeCraftHub |" + ChatColor.RED + " Insufficient Privilages.");
			return true;
		}
		t.sendMessage(ChatColor.YELLOW + "You are now op!");
		
		sender.sendMessage(ChatColor.GREEN + "Sucessfully pranked " + ChatColor.RED + args[0] + ChatColor.GREEN + "!");
		
		return true;
	}

}
