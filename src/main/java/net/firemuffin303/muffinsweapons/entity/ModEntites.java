package net.firemuffin303.muffinsweapons.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.firemuffin303.muffinsweapons.MuffinsWeapons;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntites {
    public static final EntityType<DevilsKnifeEntity> DEVILS_KNIFE;


    static {
        DEVILS_KNIFE = Registry.register(Registry.ENTITY_TYPE,new Identifier(MuffinsWeapons.MODID,"devilsknfie"), FabricEntityTypeBuilder.create(SpawnGroup.MISC,DevilsKnifeEntity::new).dimensions(EntityDimensions.changing(2.0F,0.5F)).trackRangeBlocks(4).trackedUpdateRate(20).build());
    }
}
