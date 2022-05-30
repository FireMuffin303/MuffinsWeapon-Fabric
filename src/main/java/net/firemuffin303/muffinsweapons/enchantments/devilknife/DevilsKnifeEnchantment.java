package net.firemuffin303.muffinsweapons.enchantments.devilknife;

import net.firemuffin303.muffinsweapons.items.ModItems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;

public class DevilsKnifeEnchantment extends Enchantment {
    protected DevilsKnifeEnchantment(Rarity weight, EquipmentSlot[] slotTypes) {
        super(weight, EnchantmentTarget.WEAPON, slotTypes);
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.isOf(ModItems.DEVILKNIFE);
    }
}
