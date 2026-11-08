package itamio.ante.mixin;

import net.minecraft.client.gui.screens.inventory.AnvilScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

/**
 * Port of tinytransfem's AnvilScreenMixin: client-side, remove the
 * "Too Expensive!" label threshold on the anvil screen.
 */
@Mixin(AnvilScreen.class)
public class AnvilScreenMixin {
    @ModifyConstant(method = "extractLabels", constant = @Constant(intValue = 40))
    private int ante263$mixinLimitInt(int i) {
        return Integer.MAX_VALUE;
    }
}
