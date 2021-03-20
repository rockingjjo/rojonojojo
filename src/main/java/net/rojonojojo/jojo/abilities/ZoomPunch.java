package net.rojonojojo.jojo.abilities;

import net.minecraft.command.CommandSource;
import net.minecraft.command.ICommandSource;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.ProjectileHelper;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.Util;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ForgeMod;
import net.rojonojojo.jojo.entities.PunchBaseEntity;
import net.rojonojojo.jojo.util.RegisterEventHandler;
import xyz.heroesunited.heroesunited.HeroesUnited;
import xyz.heroesunited.heroesunited.common.abilities.AbilityHelper;
import xyz.heroesunited.heroesunited.common.abilities.AbilityType;
import xyz.heroesunited.heroesunited.common.abilities.JSONAbility;
import xyz.heroesunited.heroesunited.util.HUPlayerUtil;

import java.util.UUID;

public class ZoomPunch extends JSONAbility {

    public ZoomPunch() {
        super(RegisterEventHandler.ZOOM_PUNCH);
    }

    @Override
    public void action(PlayerEntity player) {
        if (this.enabled){
            if (!player.level.isClientSide) {
                ArrowEntity arrowEntity = new ArrowEntity(player.level, player);
                arrowEntity.shootFromRotation(player, player.xRot, player.yRot, 0, 3, 1);
                arrowEntity.setOwner(player);
                player.level.addFreshEntity(arrowEntity);
            }
            HUPlayerUtil.sendMessage(player, new StringTextComponent("u cool guy"));
        }
    }
}
