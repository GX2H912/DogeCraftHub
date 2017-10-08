package me.CrescendoFX.main;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import me.CrescendoFX.commands.Command_bmsg;
import me.CrescendoFX.commands.Command_doge;
import me.CrescendoFX.commands.Command_fakeop;
import me.CrescendoFX.commands.Command_gm;
import net.md_5.bungee.api.ChatColor;

public class main extends JavaPlugin implements Listener{
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e){
		
		Player p = e.getPlayer();
		
		p.sendMessage(ChatColor.GOLD + getConfig().getString("message"));
		
		ItemStack o = new ItemStack(Material.CAKE, 1);
		ItemMeta z = o.getItemMeta();
		z.setDisplayName(ChatColor.GRAY + "Doge" + ChatColor.WHITE + " Foodz");
		o.setItemMeta(z);
		e.getPlayer().getInventory().setItemInHand(o);
		
	}
	
	@Override
	public void onEnable(){
		getConfig().options().copyDefaults(true);
		saveConfig();
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
		this.getCommand("doge").setExecutor(new Command_doge());
		this.getCommand("bmsg").setExecutor(new Command_bmsg());
		this.getCommand("gm").setExecutor(new Command_gm());
		this.getCommand("fakeop").setExecutor(new Command_fakeop());
		getLogger().info(ChatColor.GOLD + "DogeCraftHub for" + Bukkit.getVersion() + " has been enabled!");
	}


	@Override
	public void onDisable(){
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(!sender.isOp()){
			sender.sendMessage(ChatColor.GOLD + "DogeCraftHub |" + ChatColor.GREEN + "Insufficient Privilages!");
			return true;
		}
		if(cmd.getName().equalsIgnoreCase("motd")){
			sender.sendMessage(ChatColor.GOLD + getConfig().getString("message"));
			return true;
		}
		if(cmd.getName().equalsIgnoreCase("setmotd")){
			if(args.length == 0){
				sender.sendMessage(ChatColor.GOLD + "DogeCraftHub |" + ChatColor.GREEN + " Please Specify an MOTD!"); // If the player only types the command by itself
				return true; // Returns true :)
			}
			StringBuilder str = new StringBuilder(); // Gets instance of string builder :)
			for (int i = 0; i < args.length; i++){
				str.append(args[i]);
			}
			
			String motd = str.toString();
			getConfig().set("message", motd);
			saveConfig();
			
			sender.sendMessage(ChatColor.GOLD + "DogeCraftHub |" + ChatColor.GREEN + "Successfully set MOTD set to: "+ motd);

			return true; // Returns True :DDD
		}
		return true; // Returns True :DDD
	}
	
}
	

