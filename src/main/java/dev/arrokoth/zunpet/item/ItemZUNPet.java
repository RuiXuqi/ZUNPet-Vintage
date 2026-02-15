package dev.arrokoth.zunpet.item;

import dev.arrokoth.zunpet.ZUNPet;
import net.minecraft.creativetab.CreativeTabs;

/**
 * @author Arrokoth
 * @project Zunpet
 * @copyright Copyright © 2025 Arrokoth All Rights Reserved.
 */
public class ItemZUNPet extends AbstractItemInstrument {
    private static final String ZUNPET_SOUND = ZUNPet.MOD_ID + ":zunpet";

    public ItemZUNPet() {
        super();
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setUnlocalizedName(ZUNPet.MOD_ID + ".zunpet");
        this.setTextureName(ZUNPet.MOD_ID + ":zunpet");
        this.setFull3D();
    }

    @Override
    public String getSound() {
        return ZUNPET_SOUND;
    }
}
