package dev.arrokoth.zunpet.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;

/**
 * @author Arrokoth
 * @project Zunpet
 * @copyright Copyright © 2025 Arrokoth All Rights Reserved.
 */
public abstract class AbstractItemInstrument extends Item {
    @Override
    public void onPlayerStoppedUsing(ItemStack itemStack, World level, EntityPlayer player, int i) {
        int itemId = Item.getIdFromItem(this);
        if (itemId >= 0 && itemId < StatList.objectUseStats.length && StatList.objectUseStats[itemId] != null) {
            player.addStat(StatList.objectUseStats[itemId], 1);
        }
    }

    @Override
    public void onUsingTick(ItemStack itemStack, EntityPlayer player, int i) {
        if (player.worldObj.getTotalWorldTime() % 3 != 0) {
            return;
        }

        this.playSound(player.worldObj, player);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        player.setItemInUse(itemStack, this.getMaxItemUseDuration(itemStack));
        this.playSound(world, player);
        return itemStack;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack itemStack) {
        return 400;
    }

    public void playSound(World level, EntityPlayer player) {
        float pitch = Math.abs(player.prevRotationPitch / 90f) + 1;

        if (player.prevRotationPitch > 0) {
            pitch = (1 - pitch + 1) / 2f + 0.5f;
        }

        level.playSoundAtEntity(player, this.getSound(), 2, pitch);
    }

    @Override
    public EnumAction getItemUseAction(ItemStack itemStack) {
        return EnumAction.bow;
    }

    public abstract String getSound();
}
