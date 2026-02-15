package dev.arrokoth.zunpet.client.screen;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import dev.arrokoth.zunpet.ZUNPet;
import dev.arrokoth.zunpet.item.AbstractItemInstrument;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

/**
 * @author Arrokoth
 * @project Zunpet
 * @copyright Copyright © 2025 Arrokoth All Rights Reserved.
 */
public class HudInstrument {
    private static final ResourceLocation NAME_BG = new ResourceLocation(ZUNPet.MOD_ID, "textures/hud/name_bg.png");
    private static final ResourceLocation BAR_TEXTURE = new ResourceLocation(ZUNPet.MOD_ID, "textures/hud/bar.png");
    private static final ResourceLocation POINTER_TEXTURE = new ResourceLocation(ZUNPet.MOD_ID, "textures/hud/pointer.png");

    private static final String[] NOTE_NAMES = {"C", "D", "E", "F", "G", "A", "H"};

    @SubscribeEvent
    public void onRenderGameOverlay(RenderGameOverlayEvent.Post event) {
        final Minecraft mc = Minecraft.getMinecraft();
        mc.mcProfiler.startSection("instrument");
        EntityPlayerSP player = mc.thePlayer;
        if (player != null && player.getHeldItem() != null && player.getHeldItem().getItem() instanceof AbstractItemInstrument) {
            final FontRenderer textRenderer = mc.fontRenderer;
            final ScaledResolution window = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);

            float var0 = Math.abs(player.rotationPitch / 90f * 7f);
            if (player.rotationPitch > 0) {
                var0 = 7 - var0;
            }
            String name = NOTE_NAMES[(int) (Math.abs(var0 + 0.5f) % 7)];

            // 渲染名称背景
            mc.getTextureManager().bindTexture(NAME_BG);
            Gui.func_146110_a(
                    (int) (window.getScaledWidth() / 1.5f - 4),
                    window.getScaledHeight() / 2 - 8,
                    0, 0, 16, 16, 16, 16
            );

            // 渲染音符名称文本
            textRenderer.drawString(
                    name,
                    (int) (window.getScaledWidth() / 1.5f),
                    (int) (window.getScaledHeight() / 2f - textRenderer.FONT_HEIGHT / 2f),
                    0xffffff,
                    true
            );

            // 渲染条形背景
            mc.getTextureManager().bindTexture(BAR_TEXTURE);
            Gui.func_146110_a(
                    (int) (window.getScaledWidth() / 1.5f + 6),
                    window.getScaledHeight() / 2 - 32,
                    0, 0, 16, 64, 16, 64
            );

            // 渲染指针
            mc.getTextureManager().bindTexture(POINTER_TEXTURE);
            float accurate = (var0 + 0.5f) - ((int) (var0 + 0.5f));
            Gui.func_146110_a(
                    (int) (window.getScaledWidth() / 1.5f + 6),
                    window.getScaledHeight() / 2 - 32 + ((int) (60 * accurate)),
                    0, 0, 16, 5, 16, 5
            );
        }
        mc.mcProfiler.endSection();
    }
}
