package dev.isksss.slotplugin;

import dev.isksss.slotplugin.event.OnPlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class SlotPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new OnPlayerJoinEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
