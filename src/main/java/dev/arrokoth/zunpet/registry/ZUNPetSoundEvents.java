package dev.arrokoth.zunpet.registry;

import dev.arrokoth.zunpet.Tags;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Tags.MOD_ID)
public class ZUNPetSoundEvents {
    public static SoundEvent ZUNPET_SOUND;

    static {
        ResourceLocation location = new ResourceLocation(Tags.MOD_ID, "zunpet");
        ZUNPET_SOUND = new SoundEvent(location).setRegistryName(location);
    }

    @SubscribeEvent
    public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
        event.getRegistry().register(ZUNPET_SOUND);
    }
}
