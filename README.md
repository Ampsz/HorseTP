# **HorseTP Plugin**

## **Overview**
The **HorseTP Plugin** is a Minecraft server plugin that allows players to teleport with their horses, ensuring that both the player and their steed arrive at the destination together. This plugin is perfect for survival and role-playing servers where players frequently travel across large distances and want to bring their horses along without the hassle of separate teleport commands.

## **Features**
- **Horse Teleportation**: Players with the required permission (`horsetp.tp`) can teleport their horse along with them using common teleportation commands like `/home`, `/tpaccept`, etc.
- **Action Bar Notifications**: Players receive clear, on-screen messages above the hotbar, indicating whether their horse has successfully teleported with them or if it was left behind.
- **Permission-Based Access**: The ability to teleport with a horse is controlled by the `horsetp.tp` permission, allowing server administrators to decide who can use this feature.

## **Installation**
1. **Download the Plugin**: Download the latest release of the HorseTP plugin from the [Releases page](#).
2. **Place in Plugins Folder**: Copy the `HorseTP.jar` file to your server’s `plugins` directory.
3. **Restart the Server**: Restart your Minecraft server to load the plugin.
4. **Configure Permissions**: Use your preferred permission management plugin (e.g., LuckPerms) to assign the `horsetp.tp` permission to the appropriate player groups.

## **Configuration**
This plugin is designed to work out of the box with minimal configuration. However, you may want to adjust permissions using your server's permission management tool.

### **Permissions**
- **`horsetp.tp`**: Grants the player the ability to teleport while mounted on a horse. Without this permission, players will teleport without their horse, which will stay behind.

## **Usage**
Once installed and configured:
- Players can teleport with their horse by using any teleportation command (e.g., `/home`, `/tpaccept`) while mounted.
- Upon teleportation, a message will be displayed above the hotbar:
  - **Success Message**: `"You have teleported with your horse."`
  - **Failure Message**: `"You have teleported, but your horse did not follow."`

## **Compatibility**
- **Minecraft Versions**: The plugin is compatible with Minecraft versions 1.9 to 1.21+.
- **Server Implementations**: Compatible with Spigot, Paper, and other forks.

## **Changelog**
### **v1.0**
- Initial release of HorseTP Plugin.
- Added functionality for teleporting with a horse.
- Action Bar notifications for teleportation status.

## **Support**
If you encounter any issues or have feature requests, please open an issue on the [GitHub repository](#).

## **Contributing**
We welcome contributions from the community! If you'd like to contribute, please fork the repository, create a feature branch, and submit a pull request.

## **License**
This project is licensed under the MIT License. See the [LICENSE](https://github.com/BaconDrips/HorseTP/tree/main?tab=MIT-1-ov-file#readme) file for details.
