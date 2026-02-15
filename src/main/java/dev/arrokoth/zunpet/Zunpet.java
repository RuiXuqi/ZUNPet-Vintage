package dev.arrokoth.zunpet;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author Arrokoth
 * @project Zunpet
 * @copyright Copyright © 2025 Arrokoth All Rights Reserved.
 */
@Mod(
        modid = Zunpet.MOD_ID,
        name = Zunpet.MOD_NAME,
        version = Tags.VERSION,
        customProperties = @Mod.CustomProperty(k = "license", v = "MIT")
)
@SuppressWarnings("unused")
public class Zunpet {
    public static final String MOD_ID = "zunpet";
    public static final String MOD_NAME = "Zunpet";

    @SidedProxy(clientSide = "dev.arrokoth.zunpet.ClientProxy", serverSide = "dev.arrokoth.zunpet.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }
}
