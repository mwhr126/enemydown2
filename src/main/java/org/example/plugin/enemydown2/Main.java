package org.example.plugin.enemydown2;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.example.plugin.enemydown2.command.EnemyDownCommand;
import org.example.plugin.enemydown2.command.EnemySpawnCommand;
import org.jetbrains.annotations.NotNull;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        EnemyDownCommand enemyDownCommand = new EnemyDownCommand(this);
        Bukkit.getPluginManager().registerEvents(enemyDownCommand, this);
        getCommand("enemyDown").setExecutor(enemyDownCommand);

        EnemySpawnCommand enemySpawnCommand = new EnemySpawnCommand();
        Bukkit.getPluginManager().registerEvents(enemySpawnCommand, this);
        getCommand("enemySpawn").setExecutor(enemySpawnCommand);
    }

}
