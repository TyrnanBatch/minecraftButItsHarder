package com.company;

import org.bukkit.Bukkit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import com.company.listeners.*;


public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // startup
        // reloads
        // plugin reloads
    }

    @Override
    public void onDisable() {
        // shutdown
        // reloads
        // plugin reloads
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("TestforMain")) {
            if (sender instanceof Player) {
                //player created
                Player player = (Player) sender;
                player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Test successful");
            } else {
                sender.sendMessage("Test Error");
            }
            return true;
        }

        return false;
    }
}
