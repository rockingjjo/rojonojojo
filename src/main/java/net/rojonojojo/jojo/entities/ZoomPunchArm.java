package net.rojonojojo.jojo.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.projectile.DamagingProjectileEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.IPacket;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.rojonojojo.jojo.abilities.ZoomPunch;
import net.rojonojojo.jojo.init.ModEntityTypes;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class ZoomPunchArm extends AbstractArrowEntity implements IAnimatable {


    public ZoomPunchArm(EntityType<? extends AbstractArrowEntity> p_i48546_1_, World p_i48546_2_) {
        super(p_i48546_1_, p_i48546_2_);
    }

    @Override
    protected void onHit(RayTraceResult p_70227_1_) {
        RayTraceResult.Type lvt_2_1_ = p_70227_1_.getType();
        if (lvt_2_1_ == RayTraceResult.Type.ENTITY) {
            this.onHitEntity((EntityRayTraceResult)p_70227_1_);
        } else if (lvt_2_1_ == RayTraceResult.Type.BLOCK) {
            this.onHitBlock((BlockRayTraceResult)p_70227_1_);
        }

    }

    @Override
    public boolean isPickable() {
        return false;
    }

    @Override
    public void registerControllers(AnimationData animationData) {

    }

    @Override
    public AnimationFactory getFactory() {
        return null;
    }

    @Override
    protected ItemStack getPickupItem() {
        return null;
    }
}
