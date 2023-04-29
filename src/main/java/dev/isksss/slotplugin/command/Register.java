package dev.isksss.slotplugin.command;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.jetbrains.annotations.NotNull;

public class Register implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        String commandName = "register";
        // コマンドが違うときfalse;
        if (!(command.getName().equalsIgnoreCase(commandName))){
            return false;
        }
        // Playerのみ実行可能
        if(!(sender instanceof Player)){
            return false;
        }

        Player p = (Player)sender;

        //playerがOPでないときfalse
        if(!(p.isOp())){
            return false;
        }
        ItemStack item = new ItemStack(Material.WRITTEN_BOOK);
        BookMeta meta = (BookMeta)item.getItemMeta();
        meta.setAuthor("server");
        meta.setTitle("register");

        item.setItemMeta(meta);

        p.getInventory().addItem(item);

        return true;
    }
}
