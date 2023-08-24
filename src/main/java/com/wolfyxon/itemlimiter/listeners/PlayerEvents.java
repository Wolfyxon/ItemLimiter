package com.wolfyxon.itemlimiter.listeners;

import com.wolfyxon.itemlimiter.ItemLimiter;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerEvents  implements Listener {
    ItemLimiter plugin;

    public PlayerEvents(ItemLimiter plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player plr = e.getPlayer();
    }

    @EventHandler
    public void nPlayerPickupItem(EntityPickupItemEvent e){
        Entity entity = e.getEntity();
        if(!(entity instanceof Player)) return;
        Player plr = (Player) entity;
        Item item = e.getItem();
    }


}