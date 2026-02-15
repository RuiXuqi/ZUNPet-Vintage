package dev.arrokoth.zunpet.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import dev.arrokoth.zunpet.Zunpet;
import dev.arrokoth.zunpet.item.ItemZunpet;
import net.minecraft.item.Item;

public class ZunpetItems {
    public static final Item ZUN_PET_ITEM = new ItemZunpet();

    public static void register() {
        GameRegistry.registerItem(ZUN_PET_ITEM, Zunpet.MOD_ID + ":zunpet");
    }
}
