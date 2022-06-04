package net.firemuffin303.muffinsweapons.items.weapons;

import net.firemuffin303.muffinsweapons.enchantments.ModEnchantmentHelper;
import net.firemuffin303.muffinsweapons.enchantments.ModEnchantments;
import net.firemuffin303.muffinsweapons.entity.DevilsKnifeEntity;
import net.firemuffin303.muffinsweapons.items.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Vanishable;
import net.minecraft.util.UseAction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DevilKnifeItem extends Item implements Vanishable {
    float attackDamage;
    float attactSpeed;

    public DevilKnifeItem(float attackDamage, float attackSpeed, Settings settings) {
        super(settings);
        this.attackDamage = attackDamage;
        this.attactSpeed = attackSpeed;
    }

    public UseAction getUseAction(ItemStack stack) {
        return UseAction.SPEAR;
    }

    public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
        if (user instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) user;
            int i = this.getMaxUseTime(stack) - remainingUseTicks;
            if (i >= 10) {
                int metamorphosisLevel = ModEnchantmentHelper.getMetamorphosis(stack);
                int chaos_chaos = ModEnchantmentHelper.getChaosChaos(stack);
                if (metamorphosisLevel <= 0) {
                    if (!world.isClient) {
                        stack.damage(1, player, (playerEntity -> {
                            playerEntity.sendToolBreakStatus(user.getActiveHand());
                        }));
                        if (metamorphosisLevel == 0) {
                            DevilsKnifeEntity devilsKnifeEntity = new DevilsKnifeEntity(world, player, stack);
                            devilsKnifeEntity.setVelocity(player, player.getPitch(),player.getYaw(),0.0F,1.5F,0.5F);
                            if(player.getAbilities().creativeMode){
                                devilsKnifeEntity.pickupType = PersistentProjectileEntity.PickupPermission.CREATIVE_ONLY;
                            }

                            world.spawnEntity(devilsKnifeEntity);
                            if(chaos_chaos > 0){
                                DevilsKnifeEntity devilsKnifeEntity1 = devilsKnifeEntity;
                                devilsKnifeEntity1.setChaos(true);
                                for (int l = 0 ; l < chaos_chaos;l++){
                                    world.spawnEntity(devilsKnifeEntity1);
                                }
                            }
                        }
                    }

                }
            }
        }
    }

    public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity miner) {
        return !miner.isCreative();
    }

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damage(1, attacker, (e) -> {
            e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
        });
        return true;
    }

    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if ((double) state.getHardness(world, pos) != 0.0D) {
            stack.damage(2, miner, (e) -> {
                e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
            });
        }

        return true;
    }

    public int getEnchantability() {
        return 1;
    }
}


