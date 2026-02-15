package dev.arrokoth.zunpet;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import dev.arrokoth.zunpet.registry.ZunpetItems;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        ZunpetItems.register();
    }
}
