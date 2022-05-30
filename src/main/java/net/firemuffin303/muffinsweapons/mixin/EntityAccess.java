package net.firemuffin303.muffinsweapons.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;

public interface EntityAccess {
    TrackedData<Integer> BLEED_TICKS = DataTracker.registerData(Entity.class, TrackedDataHandlerRegistry.INTEGER);
    TrackedData<Integer> INK_TICKS = DataTracker.registerData(Entity.class, TrackedDataHandlerRegistry.INTEGER);

    int getBleedTicks();
    void setBleedTicks(int bleedTicks);

    void setInkTicks(int inkTicks);
    int getInkTicks();
}
