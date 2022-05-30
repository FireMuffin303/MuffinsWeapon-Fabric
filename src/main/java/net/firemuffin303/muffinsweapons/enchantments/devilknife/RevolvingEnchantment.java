package net.firemuffin303.muffinsweapons.enchantments.devilknife;

import net.firemuffin303.muffinsweapons.enchantments.ModEnchantments;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;

public class RevolvingEnchantment extends DevilsKnifeEnchantment {
    public RevolvingEnchantment(Rarity weight, EquipmentSlot[] slotTypes) {
        super(weight, slotTypes);
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != ModEnchantments.METAMORPHOSIS;
    }

}
