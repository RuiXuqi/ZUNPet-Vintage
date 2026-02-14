package dev.arrokoth.zunpet.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.*;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * @author Arrokoth
 * @project Zunpet
 * @copyright Copyright © 2025 Arrokoth All Rights Reserved.
 */
@ParametersAreNonnullByDefault
public abstract class AbstractItemInstrument extends Item {
    @Override
    public void onPlayerStoppedUsing(ItemStack itemStack, World level, EntityLivingBase livingEntity, int i) {
        if (livingEntity instanceof EntityPlayer player) {
            player.addStat(StatList.getObjectUseStats(this));
        }
    }

    @Override
    public void onUsingTick(ItemStack itemStack, EntityLivingBase livingEntity, int i) {
        if (livingEntity.world.getTotalWorldTime() % 3 != 0) {
            return;
        }

        if (livingEntity instanceof EntityPlayer player) {
            this.playSound(livingEntity.world, player);
        }
    }

    @Nonnull
    @Override
    public ActionResult<ItemStack> onItemRightClick(World level, EntityPlayer player, EnumHand interactionHand) {
        player.setActiveHand(interactionHand);
        this.playSound(level, player);
        return new ActionResult<>(EnumActionResult.SUCCESS, player.getHeldItem(interactionHand));
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

        level.playSound(player, player.posX, player.posY, player.posZ, this.getSound(), SoundCategory.PLAYERS, 2, pitch);
    }

    @Nonnull
    @Override
    public EnumAction getItemUseAction(ItemStack itemStack) {
        return EnumAction.BOW;
    }

    public abstract SoundEvent getSound();
}
