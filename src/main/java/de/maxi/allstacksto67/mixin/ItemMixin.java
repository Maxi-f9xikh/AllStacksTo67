package de.maxi.allstacksto67.mixin;

import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.class)
public abstract class ItemMixin {

	@Inject(method = "getMaxCount", at = @At("RETURN"), cancellable = true)
	private void allstacksto67$modifyMaxCount(CallbackInfoReturnable<Integer> cir) {
		int original = cir.getReturnValue();
		if (original > 1) {
			cir.setReturnValue(67);
		}
	}
}
