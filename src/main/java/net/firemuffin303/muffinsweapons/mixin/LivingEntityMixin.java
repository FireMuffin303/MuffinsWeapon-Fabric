package net.firemuffin303.muffinsweapons.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.Packet;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity  {
    @Shadow protected abstract void tickCramming();

    public int metamorphosisTicks;
    public LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(method = "tickMovement",at = @At("TAIL"))
    public void setMetamorphosisTick(CallbackInfo callbackInfo){
        this.world.getProfiler().push("metamorphosis");
        if(this.metamorphosisTicks > 0){
            --this.metamorphosisTicks;

        }
        this.tickCramming();
        this.world.getProfiler().pop();
    }

    protected void tickMetamorphosis(Box a,Box b){

    }


    @Override
    protected void initDataTracker() {

    }

    @Override
    protected void readCustomDataFromNbt(NbtCompound nbt) {

    }

    @Override
    protected void writeCustomDataToNbt(NbtCompound nbt) {

    }

    @Override
    public Packet<?> createSpawnPacket() {
        return null;
    }
}
