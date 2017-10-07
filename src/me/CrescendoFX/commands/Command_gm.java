package me.CrescendoFX.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Command_gm implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
			Player p = (Player) sender;
			
			if(sender instanceof Player){
					if(p.isOp()){
						if(args.length == 0){
							p.sendMessage(ChatColor.GOLD + "DogeCraftHub |" + " Incorrect Arguments!" + ChatColor.YELLOW + " /gm <0><1><2><3>");
							return true;
						}
						if(args[0].equalsIgnoreCase("0")){					
									p.setGameMode(GameMode.SURVIVAL);
									p.sendMessage(ChatColor.GOLD + "DogeCraftHub |" + " Successfully set Gamemode to Survival!");
									return true;
						}	
						if(args[0].equalsIgnoreCase("1")){					
									p.setGameMode(GameMode.CREATIVE);
									p.sendMessage(ChatColor.GOLD + "DogeCraftHub |" + " Successfully set Gamemode to Creative!");
									return true;
						}	
						if(args[0].equalsIgnoreCase("2")){					
									p.setGameMode(GameMode.ADVENTURE);
									p.sendMessage(ChatColor.GOLD + "DogeCraftHub |" + " Successfully set Gamemode to Adventure!");
									return true;
						}
						if(args[0].equalsIgnoreCase("3")){					
									p.setGameMode(GameMode.SPECTATOR);
									p.sendMessage(ChatColor.GOLD + "DogeCraftHub |" + " Successfully set Gamemode to Spectator!");
									return true;
								
						}
						else if(!args[0].equalsIgnoreCase("1")){					
							p.sendMessage(ChatColor.GOLD + "DogeCraftHub |" + " Incorrect Arguments!" + ChatColor.YELLOW + " /gm <0><1><2><3>");
							return true;
						}	
						else if(!args[0].equalsIgnoreCase("2")){					
							p.sendMessage(ChatColor.GOLD + "DogeCraftHub |" + " Incorrect Arguments!" + ChatColor.YELLOW + " /gm <0><1><2><3>");
								return true;
						}
					}
					
			if(!p.getPlayer().isOp()){
				}if(!args[0].equalsIgnoreCase("1")){
					p.sendMessage(ChatColor.GOLD + "DogeCraftHub |" + " Insufficient Permissions!");
					return true;
				}if(!args[0].equalsIgnoreCase("2")){
					p.sendMessage(ChatColor.GOLD + "DogeCraftHub |" + " Insufficient Permissions!");
					return true;
				}else if(args[0].equalsIgnoreCase("1")){
					p.sendMessage(ChatColor.GOLD + "DogeCraftHub |" + " Insufficient Permissions!");
					return true;
				}else if(args[0].equalsIgnoreCase("2")){
					p.sendMessage(ChatColor.GOLD + "DogeCraftHub |" + " Insufficient Permissions!");
					return true;
				}		
	
			return true;
			}
		if(!(sender instanceof Player)){
			
			p.sendMessage(ChatColor.GOLD + "DogeCraftHub |" + " This command can only be used in-game!");
			
		}
		return true;
	}
}
