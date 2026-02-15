package dev.arrokoth.zunpet;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import dev.arrokoth.zunpet.client.screen.HudInstrument;
import net.minecraftforge.common.MinecraftForge;

@SuppressWarnings("unused")
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        MinecraftForge.EVENT_BUS.register(new HudInstrument());
        //ZunpetRenderer.register();
    }
}
