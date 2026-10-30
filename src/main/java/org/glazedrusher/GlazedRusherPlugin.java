package org.glazedrusher;

import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.plugin.Plugin;

public class GlazedRusherPlugin extends Plugin {
    @Override
    public void onLoad() {
        this.getLogger().info("Loading Glazed Economy & Base-Hunting Suite for RusherHack...");
        
        var moduleManager = RusherHackAPI.getModuleManager();
        // Base Hunting Suite
        moduleManager.registerFeature(new SusChunkFinderModule());
        moduleManager.registerFeature(new HoleTunnelStairsModule());
        moduleManager.registerFeature(new RTPBaseFinderModule());
        
        // Economy Suite
        moduleManager.registerFeature(new AutoSellModule());
    }

    @Override
    public void onUnload() {
        this.getLogger().info("Unloading Glazed-Rusher Plugin.");
    }
}
