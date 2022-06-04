package net.firemuffin303.muffinsweapons.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.firemuffin303.muffinsweapons.MuffinsWeapons;
import net.firemuffin303.muffinsweapons.items.spell.SpellTags;
import net.firemuffin303.muffinsweapons.items.weapons.*;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import org.lwjgl.system.CallbackI;

public class ModItems {
    //Claws
    public static final Item IRON_CLAWS = new ClawsItem(ToolMaterials.IRON,2,-1.8F,new FabricItemSettings().group(MuffinsWeapons.TAB));
    public static final Item GOLD_CLAWS = new ClawsItem(ToolMaterials.GOLD,2,-1.8F,new FabricItemSettings().group(MuffinsWeapons.TAB));
    public static final Item DIAMOND_CLAWS = new ClawsItem(ToolMaterials.DIAMOND,2,-1.8F,new FabricItemSettings().group(MuffinsWeapons.TAB));
    public static final Item NETHERITE_CLAWS = new ClawsItem(ToolMaterials.NETHERITE,2,-1.8F,new FabricItemSettings().group(MuffinsWeapons.TAB));
    //Ink Axes
    public static final Item INK_AXE = new InkAxeItem(ToolMaterials.DIAMOND,6,-3.1F,new FabricItemSettings().group(MuffinsWeapons.TAB));
    public static final Item NETHERITE_INK_AXE = new InkAxeItem(ToolMaterials.NETHERITE,5,-3.0F,new FabricItemSettings().group(MuffinsWeapons.TAB));

    public static final Item DEVILKNIFE = new DevilKnifeItem(9,-3.4F,new FabricItemSettings().group(MuffinsWeapons.TAB));

    //Spell Books
    public static final Item SPELL_BOOK = new SpellBookItem(new FabricItemSettings().group(MuffinsWeapons.TAB), SpellTags.REGULAR_SPELLS);
    public static final Item EVOKER_SPELL_BOOK = new SpellBookItem(new FabricItemSettings().group(MuffinsWeapons.TAB),SpellTags.EVOKER_SPELLS);
    public static final Item NETHER_SPELL_BOOK = new SpellBookItem(new FabricItemSettings().group(MuffinsWeapons.TAB),SpellTags.NETHER_SPELLS);
    public static final Item END_SPELL_BOOK = new SpellBookItem(new FabricItemSettings().group(MuffinsWeapons.TAB),SpellTags.END_SPELLS);
    public static final Item DEEPDARK_SPELL_BOOK = new SpellBookItem(new FabricItemSettings().group(MuffinsWeapons.TAB),SpellTags.DEEPDARK_SPELLS);
}
