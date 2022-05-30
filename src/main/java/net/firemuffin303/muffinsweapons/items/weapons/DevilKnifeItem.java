package net.firemuffin303.muffinsweapons.items.weapons;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Vanishable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DevilKnifeItem extends Item implements Vanishable {
    public DevilKnifeItem(Settings settings) {
        super(settings);
    }

    public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity miner) {
        return !miner.isCreative();
    }
}
