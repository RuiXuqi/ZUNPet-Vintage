package dev.arrokoth.zunpet.registry;

import dev.arrokoth.zunpet.Tags;
import dev.arrokoth.zunpet.item.ItemZUNPet;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid = Tags.MOD_ID)
public class ZUNPetItems {
    public static final Item ZUN_PET_ITEM = new ItemZUNPet();

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(ZUN_PET_ITEM);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(ZUN_PET_ITEM, 0, new ModelResourceLocation(ZUN_PET_ITEM.getRegistryName(), "inventory"));
    }
}
