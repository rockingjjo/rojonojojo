package net.rojonojojo.jojo.entities;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.*;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.rojonojojo.jojo.init.ModEntityTypes;
import software.bernie.HU.geckolib3.core.IAnimatable;
import software.bernie.HU.geckolib3.core.PlayState;
import software.bernie.HU.geckolib3.core.builder.AnimationBuilder;
import software.bernie.HU.geckolib3.core.controller.AnimationController;
import software.bernie.HU.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.HU.geckolib3.core.manager.AnimationData;
import software.bernie.HU.geckolib3.core.manager.AnimationFactory;

import java.util.List;

public class PunchBaseEntity extends AbstractArrowEntity implements IAnimatable {

    private AnimationFactory factory = new AnimationFactory(this);
    private int ticksInAir;

    public PunchBaseEntity(EntityType<? extends AbstractArrowEntity> type, World world) {
        super(type, world);
    }

    public PunchBaseEntity(World world, LivingEntity owner) {
        super(ModEntityTypes.PUNCH_BASE_ENTITY.get(), owner, world);
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event)
    {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.bat.fly", true));
        return PlayState.CONTINUE;
    }

    @Override
    protected ItemStack getPickupItem() {
        return new ItemStack(Items.AIR);
    }

    @Override
    public void tick() {
        if (this.tickCount >= 40) {
            this.remove();
        }
    }

    @Override
    protected void onHitEntity(EntityRayTraceResult p_213868_1_) {
        super.onHitEntity(p_213868_1_);
        Entity entity = this.getOwner();
        if (p_213868_1_.getType() != RayTraceResult.Type.ENTITY || !p_213868_1_.getEntity().is(entity)) {
            if (!this.level.isClientSide) {
                this.remove();
            }
        }
    }

    @Override
    protected void onHitBlock(BlockRayTraceResult p_230299_1_) {
        BlockState lvt_3_1_ = this.level.getBlockState(p_230299_1_.getBlockPos());
        final int BLOCK_UPDATE = (1 << 1);
        World world = this.level;
        lvt_3_1_.onProjectileHit(this.level, lvt_3_1_, p_230299_1_, this);
        Block block = lvt_3_1_.getBlock();
        world.setBlock(p_230299_1_.getBlockPos(), Blocks.AIR.defaultBlockState(), BLOCK_UPDATE);
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController(this, "controller", 0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory()
    {
        return this.factory;
    }

    @Override
    public void shoot(double x, double y, double z, float velocity, float inaccuracy) {
        super.shoot(x, y, z, velocity, inaccuracy);
    }
}
