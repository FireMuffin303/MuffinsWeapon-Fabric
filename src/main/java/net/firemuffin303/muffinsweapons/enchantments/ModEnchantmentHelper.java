package net.firemuffin303.muffinsweapons.enchantments;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;

public class ModEnchantmentHelper {

    public static int getMetamorphosis(ItemStack stack){
        return EnchantmentHelper.getLevel(ModEnchantments.METAMORPHOSIS,stack);
    }

    public static int getChaosChaos(ItemStack stack){
        return EnchantmentHelper.getLevel(ModEnchantments.CHAOS_CHAOS,stack);
    }

    public static int getRevolving(ItemStack stack){
        return EnchantmentHelper.getLevel(ModEnchantments.REVOLVING,stack);
    }
}

