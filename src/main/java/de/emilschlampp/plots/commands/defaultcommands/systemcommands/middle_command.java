package de.emilschlampp.plots.commands.defaultcommands.systemcommands;

import de.emilschlampp.plots.commands.HelpCommandInterface;
import de.emilschlampp.plots.commands.PlotSubCommand;
import de.emilschlampp.plots.utils.math_sys;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class middle_command extends PlotSubCommand implements HelpCommandInterface {
    public middle_command() {
        super("middle", "splots.middle");
    }

    @Override
    public List<String> tabComplete(Player player, String[] args) {
        return new ArrayList<>();
    }

    @Override
    public void execute(Player player, String[] args) {
        if(!isOnPlotCheck(player)) {
            return;
        }
        player.teleport(math_sys.getMiddleLocation(math_sys.getPlot(player.getLocation())).add(0.5,0,0.5));
        player.sendMessage(PREFIX+"Du wurdest zur Mitte teleportiert!");
    }

    @Override
    public String getHelp() {
        return "Teleportiert dich in die Mitte von dem Grundstück auf dem du stehst.";
    }
}
