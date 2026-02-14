package dev.arrokoth.zunpet.item;

import dev.arrokoth.zunpet.Tags;
import dev.arrokoth.zunpet.registry.ZunpetSoundEvents;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.SoundEvent;

/**
 * @author Arrokoth
 * @project Zunpet
 * @copyright Copyright © 2025 Arrokoth All Rights Reserved.
 */
public class ItemZunpet extends AbstractItemInstrument {
    public ItemZunpet() {
        super();
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.COMBAT);
        this.setRegistryName(Tags.MOD_ID, "zunpet");
        this.setTranslationKey(Tags.MOD_ID + ".zunpet");
    }

    @Override
    public SoundEvent getSound() {
        return ZunpetSoundEvents.ZUNPET_SOUND;
    }
}
