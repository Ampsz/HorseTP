package net.horsetp;

import org.bukkit.plugin.java.JavaPlugin;

public final class HorseTP extends JavaPlugin {

    @Override
    public void onEnable() {
        //Register the event listener:
        getServer().getPluginManager().registerEvents(new TeleportListener(this), this);
        getLogger().info("HorseTP has been enabled.");

    }

    @Override
    public void onDisable() {
        getLogger().info("HorseTP has been disabled.");
    }
}
