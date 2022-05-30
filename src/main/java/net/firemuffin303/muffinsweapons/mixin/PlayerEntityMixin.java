package net.firemuffin303.muffinsweapons.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {
    public void useMetamorphosis(int metamorphosisTicks){

    }
}
