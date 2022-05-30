package net.firemuffin303.muffinsweapons.enchantments.inkaxe;

import net.firemuffin303.muffinsweapons.items.ModItems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;

public class InkSlashEnchantment extends Enchantment {
    public InkSlashEnchantment(Rarity weight, EquipmentSlot[] slotTypes) {
        super(weight, EnchantmentTarget.WEAPON, slotTypes);
    }

    @Override
    public boolean isTreasure() {
        return true;
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.isOf(ModItems.INK_AXE) || stack.isOf(ModItems.NETHERITE_INK_AXE);
    }
}
