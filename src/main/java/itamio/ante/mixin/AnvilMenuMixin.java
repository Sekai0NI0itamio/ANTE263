package itamio.ante.mixin;

import net.minecraft.world.inventory.AnvilMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

/**
 * Port of tinytransfem's AnvilMenuMixin: remove the anvil level cap
 * (40) and the "Too Expensive!" threshold (39) so any affordable
 * repair/rename/enchant works, no matter the cost.
 */
@Mixin(AnvilMenu.class)
public class AnvilMenuMixin {
    @ModifyConstant(method = "createResultInternal", constant = @Constant(intValue = 40))
    private int ante263$mixinLimitInt(int i) {
        return Integer.MAX_VALUE;
    }

    @ModifyConstant(method = "createResultInternal", constant = @Constant(intValue = 39))
    private int ante263$mixinMaxInt(int i) {
        return Integer.MAX_VALUE - 1;
    }
}
