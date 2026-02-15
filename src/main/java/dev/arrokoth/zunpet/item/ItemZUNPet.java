package dev.arrokoth.zunpet.item;

import dev.arrokoth.zunpet.Tags;
import dev.arrokoth.zunpet.registry.ZUNPetSoundEvents;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.SoundEvent;

/**
 * @author Arrokoth
 * @project Zunpet
 * @copyright Copyright © 2025 Arrokoth All Rights Reserved.
 */
public class ItemZUNPet extends AbstractItemInstrument {
    public ItemZUNPet() {
        super();
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.COMBAT);
        this.setRegistryName(Tags.MOD_ID, "zunpet");
        this.setTranslationKey(Tags.MOD_ID + ".zunpet");
    }

    @Override
    public SoundEvent getSound() {
        return ZUNPetSoundEvents.ZUNPET_SOUND;
    }
}
