package minecraft.stellarkaitlynn.customCreate;

import jdk.javadoc.internal.tool.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import java.util.List;

public class commands implements CommandExecutor {
    private Main plugin;

    public commands(Main Plugin){
        this.plugin = plugin;
        plugin.getCommand("CustomCreate").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("CustomCreate"))
        {
            player.sendMessage("Type '/CustomCreate Help' for help with the CustomCreate commands!");
        }
        return false;
    }   
}
