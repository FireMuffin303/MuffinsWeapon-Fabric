package net.firemuffin303.muffinsweapons.entity;

import net.firemuffin303.muffinsweapons.enchantments.ModEnchantmentHelper;
import net.firemuffin303.muffinsweapons.items.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;

public class DevilsKnifeEntity extends PersistentProjectileEntity {

    private static final TrackedData<Boolean> ENCHANTED  = DataTracker.registerData(DevilsKnifeEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
    private static final TrackedData<Boolean> CHAOS  = DataTracker.registerData(DevilsKnifeEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
    private static final TrackedData<Byte> REVOLVING = DataTracker.registerData(DevilsKnifeEntity.class, TrackedDataHandlerRegistry.BYTE);
    private ItemStack devilsKnifeStack;

    public DevilsKnifeEntity(EntityType<? extends DevilsKnifeEntity> entityType, World world) {
        super(entityType, world);
        this.devilsKnifeStack = new ItemStack(ModItems.DEVILKNIFE);

    }

    public DevilsKnifeEntity(World world, LivingEntity owner, ItemStack stack) {
        super(ModEntites.DEVILS_KNIFE,owner, world);
        this.devilsKnifeStack = new ItemStack(ModItems.DEVILKNIFE);
        this.devilsKnifeStack = stack.copy();
        this.dataTracker.set(ENCHANTED, stack.hasGlint());
        this.dataTracker.set(CHAOS, false);
        this.dataTracker.set(REVOLVING,(byte)ModEnchantmentHelper.getRevolving(stack));
    }

    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(ENCHANTED, false);
    }

    @Override
    protected ItemStack asItemStack() {
        return null;
    }

    private boolean isOwnerAlive() {
        Entity entity = this.getOwner();
        if (entity != null && entity.isAlive()) {
            return !(entity instanceof ServerPlayerEntity) || !entity.isSpectator();
        } else {
            return false;
        }
    }

    public void setChaos(boolean a){
        this.dataTracker.set(CHAOS,a);
    }
}
