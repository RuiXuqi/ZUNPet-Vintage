package dev.arrokoth.zunpet;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import dev.arrokoth.zunpet.registry.ZUNPetItems;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        ZUNPetItems.register();
    }
}
