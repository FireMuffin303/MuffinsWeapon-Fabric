package net.firemuffin303.muffinsweapons.enchantments;

import net.firemuffin303.muffinsweapons.mixin.EntityAccess;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;

public class BleedEnchantment extends Enchantment {
    protected BleedEnchantment(Rarity weight, EquipmentSlot[] slotTypes) {
        super(weight, EnchantmentTarget.WEAPON, slotTypes);
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != Enchantments.FIRE_ASPECT;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (target instanceof EntityAccess) {
            if (!target.world.isClient && target instanceof LivingEntity) {
                if (!((LivingEntity) target).isDead()) {
                    if (!((LivingEntity) target).isUndead()) {
                        if(target.world.random.nextInt(10) <= level+2 && ((EntityAccess) target).getBleedTicks() < 200){
                            ((EntityAccess) target).setBleedTicks(200);
                        }

                    }
                }
            }

        }
    }
}
