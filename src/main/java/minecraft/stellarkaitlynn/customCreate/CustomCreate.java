package minecraft.stellarkaitlynn.customCreate;

import org.bukkit.plugin.java.JavaPlugin;

public final class CustomCreate extends JavaPlugin implements Listener {

    public String serverName = "MyServer";
    public int onlinePlayerAmount = 0;
    FileConfiguration config = getConfig();

    @Override
    public void onEnable() {
        getLogger().info("Attempting to enable CustomCreate!");
        config.addDefault("adminToolsModule", true);
        config.addDefault("performanceDebuggingHandlerModule", true);
        config.addDefault("worldWebNetworkModule", true);
        config.addDefault("permissionsHandlerModule", true);
        config.addDefault("profileSocialModule", true);
        config.addDefault("anticheatModule", true);
        config.addDefault("logHandlerModule", true);
        config.addDefault("griefProtectionModule", true);
        config.addDefault("channelHandlerModule", true);
        config.addDefault("hologramModule", true);
        config.addDefault("mapSketchingHandlerModule", true);
        config.addDefault("GUICreatorModule", true);
        config.addDefault("minigameCreatorModule", true);
        config.addDefault("recipeCreatorModule", true);
        config.addDefault("packCreatorModule", true);
        config.addDefault("economyHandlerModule", true);
        config.addDefault("factionsModule", true);
        config.addDefault("warpHandlerModule", true);
        config.addDefault("skyblockModule", true);
        config.addDefault("oneblockModule", true);
        config.addDefault("generationHandlerModule", true);
        config.options().copyDefaults(true);
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
