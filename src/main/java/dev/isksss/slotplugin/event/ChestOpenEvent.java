package dev.isksss.slotplugin.event;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.type.Chest;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class ChestOpenEvent implements Listener {

    @EventHandler
    public void onChestOpenEvent(InventoryOpenEvent e){
        if (!(e.getInventory().getHolder() instanceof Chest)) {
            return;
        }
        // todo: チェストが開かれたとき、登録されているか確認する。

    }
}
