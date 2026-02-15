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
        modid = ZUNPet.MOD_ID,
        name = ZUNPet.MOD_NAME,
        version = Tags.VERSION,
        customProperties = {
                @Mod.CustomProperty(k = "license", v = "MIT"),
                @Mod.CustomProperty(k = "issueTrackerUrl", v = "https://github.com/RuiXuqi/ZUNPet-Vintage/issues"),
                @Mod.CustomProperty(k = "iconFile", v = "zunpet_icon.png")
        }
)
@SuppressWarnings("unused")
public class ZUNPet {
    public static final String MOD_ID = "zunpet";
    public static final String MOD_NAME = "ZUNPet";

    @SidedProxy(clientSide = "dev.arrokoth.zunpet.ClientProxy", serverSide = "dev.arrokoth.zunpet.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }
}
