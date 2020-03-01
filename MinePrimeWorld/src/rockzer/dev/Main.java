package rockzer.dev;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		
		getCommand("Social").setExecutor(new Comandos());
		Bukkit.getConsoleSender().sendMessage("Plugin inciado");
		
	}
	
	@Override
	public void onDisable() {
		
		Bukkit.getConsoleSender().sendMessage("Plugin Desabilitado");
	}
}
