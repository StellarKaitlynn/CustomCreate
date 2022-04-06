package minecraft.stellarkaitlynn.customCreate;

import jdk.javadoc.internal.tool.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.List;

public class commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }
    private Main plugin;

    public commands(Main Plugin){
        this.plugin = plugin;
        Command Test = null;

    }

}
