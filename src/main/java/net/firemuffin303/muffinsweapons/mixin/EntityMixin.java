package net.firemuffin303.muffinsweapons.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Entity.class)
public class EntityMixin implements EntityAccess {
    @Shadow @Final protected DataTracker dataTracker;

    @Inject(method = "<init>",at = @At("TAIL"),cancellable = true)
    private void init(CallbackInfo callbackInfo){
        this.dataTracker.startTracking(BLEED_TICKS,0);
    }

    @Override
    public int getBleedTicks(){
        return this.dataTracker.get(BLEED_TICKS);
    }

    @Override
    public void setBleedTicks(int bleedTicks){
        this.dataTracker.set(BLEED_TICKS,bleedTicks);
    }

    @Override
    public void setInkTicks(int inkTicks) {
        this.dataTracker.set(INK_TICKS,inkTicks);
    }

    @Override
    public int getInkTicks() {
        return this.dataTracker.get(INK_TICKS);
    }

}
