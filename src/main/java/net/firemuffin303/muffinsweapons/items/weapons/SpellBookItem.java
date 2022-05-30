package net.firemuffin303.muffinsweapons.items.weapons;

import net.firemuffin303.muffinsweapons.items.spell.Spell;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;

public class SpellBookItem extends Item {
    private static final String SPELL_KEY = "spell";
    private TagKey<Spell> spellTag;

    public SpellBookItem(Settings settings,TagKey<Spell> spellTag) {
        super(settings);
        this.spellTag = spellTag;
    }
}
