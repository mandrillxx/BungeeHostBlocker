package me.mandrillx.hostblocker;

import net.md_5.bungee.api.event.LoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.event.EventHandler;

public final class HostBlocker extends Plugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getProxy().getPluginManager().registerListener(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onLoginCheckHost(LoginEvent event) {
        event.registerIntent(this);

        System.out.println("Host: " + event.getConnection().getVirtualHost().getHostName());
    }

}
