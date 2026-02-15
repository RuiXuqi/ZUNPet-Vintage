package dev.arrokoth.zunpet.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import dev.arrokoth.zunpet.ZUNPet;
import dev.arrokoth.zunpet.item.ItemZUNPet;
import net.minecraft.item.Item;

public class ZUNPetItems {
    public static final Item ZUN_PET_ITEM = new ItemZUNPet();

    public static void register() {
        GameRegistry.registerItem(ZUN_PET_ITEM, ZUNPet.MOD_ID + ":zunpet");
    }
}
