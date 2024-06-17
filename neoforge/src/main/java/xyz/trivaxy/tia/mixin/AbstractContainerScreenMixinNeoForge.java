package xyz.trivaxy.tia.mixin;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import xyz.trivaxy.tia.MixinInjects;

@Mixin(AbstractContainerScreen.class)
public class AbstractContainerScreenMixinNeoForge {

    @Inject(method = "renderSlotContents", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiGraphics;renderItem(Lnet/minecraft/world/item/ItemStack;III)V"))
    private void injectRenderSlotScale(GuiGraphics gui, ItemStack itemstack, Slot slot, String countString, CallbackInfo ci) {
        MixinInjects.preRenderSlotItem(slot);
    }
}
