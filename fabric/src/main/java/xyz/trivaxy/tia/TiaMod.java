package xyz.trivaxy.tia;

import net.fabricmc.api.ClientModInitializer;

public class TiaMod implements ClientModInitializer {
    
    @Override
    public void onInitializeClient() {
        FabricConfigs.load();
    }
}
