package net.Nephty.FoodSupplyMod.mixin;

import net.Nephty.FoodSupplyMod.FoodSupplyMod;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class FoodSupplyMixin {
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        FoodSupplyMod.LOGGER.info("This line is printed by the foodsupply mod mixin!");
    }
}
