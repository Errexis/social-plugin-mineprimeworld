package rockzer.dev;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Comandos implements CommandExecutor{
	
   @Override
   public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
	   if(!(sender instanceof Player)) {
	        sender.sendMessage("§cApenas para jogadores.");
	        return true;
	        
	   } 
	   
	   Player p = (Player)sender;
	   if(!p.hasPermission("social.usar"))
		   p.sendMessage("§cSem Permissão.");
	  
	   {
		   
	   if(cmd.getName().equalsIgnoreCase("Social")) {
		  p.sendMessage("§6[MinePrimeWorld]:§1Discord:§fhttps://discord.gg/MuNKVR        §4Twitter:§ftwitter.com/mineprimeworld     §2Site:§fwww.mineprimeworld.com");
		  return true;
	      }
	   }
      return false;	   
   }
}   
