package dev.isksss.slotplugin;

import dev.isksss.slotplugin.command.Register;
import dev.isksss.slotplugin.db.InitDb;
import dev.isksss.slotplugin.event.OnPlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class SlotPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new OnPlayerJoinEvent(), this);
        getCommand("register").setExecutor(new Register());

        InitDb initDb = new InitDb();
        initDb.Init();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
