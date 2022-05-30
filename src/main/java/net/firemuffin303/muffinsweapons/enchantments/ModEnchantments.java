package net.firemuffin303.muffinsweapons.enchantments;

import net.firemuffin303.muffinsweapons.enchantments.claws.WallClimbEnchantment;
import net.firemuffin303.muffinsweapons.enchantments.devilknife.ChaosChaosEnchantment;
import net.firemuffin303.muffinsweapons.enchantments.devilknife.MetamorphosisEnchantment;
import net.firemuffin303.muffinsweapons.enchantments.devilknife.RevolvingEnchantment;
import net.firemuffin303.muffinsweapons.enchantments.inkaxe.InkSlashEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;

public class ModEnchantments {
    public static final Enchantment BLEED = new BleedEnchantment(Enchantment.Rarity.RARE,new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    //Ink Axe
    public static final Enchantment INKSLASH = new InkSlashEnchantment(Enchantment.Rarity.VERY_RARE, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    //Claws
    public static final Enchantment WALLCLIMB = new WallClimbEnchantment(Enchantment.Rarity.RARE,new EquipmentSlot[]{EquipmentSlot.MAINHAND});

    //Devils Knife
    public static final Enchantment METAMORPHOSIS = new MetamorphosisEnchantment(Enchantment.Rarity.VERY_RARE,new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    public static final Enchantment REVOLVING = new RevolvingEnchantment(Enchantment.Rarity.VERY_RARE,new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    public static final Enchantment CHAOS_CHAOS = new ChaosChaosEnchantment(Enchantment.Rarity.VERY_RARE,new EquipmentSlot[]{EquipmentSlot.MAINHAND});
}
