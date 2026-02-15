package dev.arrokoth.zunpet.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ZunpetRecipes {
    public static void registerRecipes() {
        // 对应 1.12.2 JSON 中的 shaped 配方
        GameRegistry.addRecipe(new ShapedOreRecipe(
                new ItemStack(ZunpetItems.ZUN_PET_ITEM, 1),
                "CC ",
                "CG ",
                "  G",
                'C', "ingotCopper",
                'G', "ingotGold"
        ));
    }
}
