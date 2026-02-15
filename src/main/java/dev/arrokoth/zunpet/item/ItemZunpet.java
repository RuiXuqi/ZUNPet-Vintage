package dev.arrokoth.zunpet.item;

import dev.arrokoth.zunpet.Zunpet;
import net.minecraft.creativetab.CreativeTabs;

/**
 * @author Arrokoth
 * @project Zunpet
 * @copyright Copyright © 2025 Arrokoth All Rights Reserved.
 */
public class ItemZunpet extends AbstractItemInstrument {
    private static final String ZUNPET_SOUND = Zunpet.MOD_ID + ":zunpet";

    public ItemZunpet() {
        super();
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setUnlocalizedName(Zunpet.MOD_ID + ".zunpet");
        this.setTextureName(Zunpet.MOD_ID + ":zunpet");
        this.setFull3D();
    }

    @Override
    public String getSound() {
        return ZUNPET_SOUND;
    }
}
