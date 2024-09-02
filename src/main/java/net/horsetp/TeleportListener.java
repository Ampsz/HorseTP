package net.horsetp;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class TeleportListener implements Listener {

    private final HorseTP plugin;

    public TeleportListener(HorseTP plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerTeleport(PlayerTeleportEvent event) {
        Player player = event.getPlayer();

        // Ensure the event is triggered by an actual teleport and not by mounting
        if (event.getCause() == PlayerTeleportEvent.TeleportCause.COMMAND || event.getCause() == PlayerTeleportEvent.TeleportCause.PLUGIN) {

            // Check if the player is riding a horse during a teleportation event
            if (player.isInsideVehicle() && player.getVehicle().getType() == EntityType.HORSE) {
                Horse horse = (Horse) player.getVehicle();
                if (player.hasPermission("horsetp.tp")) {
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            if (horse != null && horse.isValid()) {
                                horse.teleport(event.getTo()); // Teleport the horse after the player

                                // Send the action bar message
                                sendActionBar(player, ChatColor.GREEN + "You have teleported with your horse.");
                            }
                        }
                    }.runTaskLater(plugin, 1L); // Delay teleportation by 1 tick
                } else {
                    sendActionBar(player, ChatColor.RED + "You have teleported, but your horse did not follow.");
                    horse.eject();  // Eject the player from the horse
                }
            }
        }
    }

    // Method to send action bar message
    private void sendActionBar(Player player, String message) {
        if (player.getServer().getVersion().contains("1.16") || player.getServer().getVersion().contains("1.17") || player.getServer().getVersion().contains("1.18") || player.getServer().getVersion().contains("1.19") || player.getServer().getVersion().contains("1.20") || player.getServer().getVersion().contains("1.21")) {
            player.sendActionBar(message);
        } else {
            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(message));
        }
    }
}