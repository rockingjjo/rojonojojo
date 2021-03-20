package net.rojonojojo.jojo.abilities;

import net.minecraft.command.CommandSource;
import net.minecraft.command.ICommandSource;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
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
        this.actionType = ActionType.HELD;
    }

    @Override
    public void action(PlayerEntity player) {
        if (this.enabled){
            ArrowEntity arrowEntity = new ArrowEntity(player.level, player);
            arrowEntity.shootFromRotation(player, player.getRotationVector().x, player.getRotationVector().y, 0, 30, 7);
            arrowEntity.xRot = player.xRot;
            arrowEntity.yRot = player.yRot;
            arrowEntity.setOwner(player);
            //arrowEntity.addEffect();
            HUPlayerUtil.sendMessage(player, new StringTextComponent("u cool guy"));
            player.level.addFreshEntity(arrowEntity);
        }
    }

    @Override
    public int getKey() {
        return 8;
    }

}
