package minecraft.stellarkaitlynn.customCreate;

import org.bukkit.plugin.java.JavaPlugin;

public final class CustomCreate extends JavaPlugin implements Listener {

    public String serverName = "MyServer";
    public int onlinePlayerAmount = 0;
    FileConfiguration config = getConfig();

    @Override
    public void onEnable() {
        getLogger().info("Attempting to enable CustomCreate!");
        saveConfig();
        new commands(this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Attempting to disable CustomCreate!");
    }

    public void onPlayerJoin(PlayerJoinEvent event) {
        
    }
}
