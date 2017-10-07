package me.CrescendoFX.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;


public class Command_doge implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		Player p = (Player) sender;
		if (!(sender instanceof Player)){
			sender.sendMessage(ChatColor.GOLD + "Incorrect arguments!");
			return true; // first return
		}
		if (args.length == 0){
			
			ItemStack o = new ItemStack(Material.CAKE, 1);
			ItemMeta z = o.getItemMeta();
			z.setDisplayName(ChatColor.GRAY + "Doge" + ChatColor.WHITE + " Food");
			o.setItemMeta(z);
			p.getPlayer().getInventory().setItemInHand(o);
			p.sendMessage(ChatColor.GOLD + "Enjoy your Dog Food! :)");
			return true; // second return
		}
		Player t = Bukkit.getServer().getPlayer(args[0]);
		
		if(t == null){
			p.sendMessage(ChatColor.GOLD + "The player, " + args[0] + " isn't online!");
			return true; // third return
		}
		ItemStack o = new ItemStack(Material.CAKE, 1);
		ItemMeta z = o.getItemMeta();
		z.setDisplayName(ChatColor.GRAY + "Doge" + ChatColor.WHITE + " Food");
		o.setItemMeta(z);
		t.sendMessage(ChatColor.GOLD + sender.getName() + " has generously offered you Dog Food! :)");
		t.getPlayer().getInventory().setItemInHand(o);
		
		return true; // Final return
	}
	
}
