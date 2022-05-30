package net.firemuffin303.muffinsweapons.items.spell;

import net.minecraft.util.registry.RegistryKey;

public interface Spells {
    int SPELL_RANGE = 8;

    //--Regular--
    RegistryKey<Spell> TIME_SKIP;
    //speed time blocks within 4 blocks, copper will oxidize faster or crops growth speed increase.
    // cost max hunger.

    RegistryKey<Spell> FROSTWAVE;
    // explode a ice circle from caster, cause mob frozen.
    // cost hunger.

    //--Evoker--
    RegistryKey<Spell> FANGS_LOCK;
    //summon randomly place evoker's fangs within 8 blocks, will lock entity's movement.
    // cost hunger.

    RegistryKey<Spell> SUMMON_VEX;
    //summon 5 vexes, vexes will focus on killing mob first.
    // cost hunger.

    RegistryKey<Spell> WOLOLO;
    //make hostile mob kill each other, won't affect on boss and Warden.
    // cost hunger.

    //--Nether--
    RegistryKey<Spell> GOLDEN_EYES;
    // all chest and any kind of gold block highlight within 32 blocks,
    // cost hunger.

    RegistryKey<Spell> FIREWAVE;
    // explode a fire circle from caster, cause mob on fire.
    // cost hunger.

    //--End--
    RegistryKey<Spell> COSMIC_ELYTRA;
    //make a temporary elytra for 5 min, won't replace chestplate slot.
    // cost 8 hunger.
    RegistryKey<Spell> LEVITATION;
    //cost hunger

    //--Deep Dark--
    RegistryKey<Spell> VIBRATION_SENSE;
    //all moving living entity are highlighted,
    // cost hunger.

}
