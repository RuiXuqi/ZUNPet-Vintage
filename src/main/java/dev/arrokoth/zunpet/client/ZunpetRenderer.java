// TODO
//package dev.arrokoth.zunpet.client;
//
//import net.minecraft.client.renderer.ItemRenderer;
//import net.minecraft.client.renderer.Tessellator;
//import net.minecraft.item.ItemStack;
//import net.minecraft.util.IIcon;
//import net.minecraftforge.client.IItemRenderer;
//import org.lwjgl.opengl.GL11;
//
//public class ZunpetRenderer implements IItemRenderer {
//    @Override
//    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
//        return type == ItemRenderType.EQUIPPED || type == ItemRenderType.EQUIPPED_FIRST_PERSON;
//    }
//
//    @Override
//    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
//        return false;
//    }
//
//    @Override
//    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
//        IIcon icon = item.getIconIndex();
//        Tessellator tessellator = Tessellator.instance;
//
//        GL11.glPushMatrix();
//
//        if (type == ItemRenderType.EQUIPPED_FIRST_PERSON) {
//        } else if (type == ItemRenderType.EQUIPPED) {
//        }
//
//        ItemRenderer.renderItemIn2D(tessellator,
//                icon.getMaxU(), icon.getMinV(), icon.getMinU(), icon.getMaxV(),
//                icon.getIconWidth(), icon.getIconHeight(), 0.0625F);
//
//        GL11.glPopMatrix();
//    }
//
//    public static void register() {
//        MinecraftForgeClient.registerItemRenderer(ZunpetItems.ZUN_PET_ITEM, new ZunpetRenderer());
//    }
//}
