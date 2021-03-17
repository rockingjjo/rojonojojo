package net.rojonojojo.jojo.abilities;

import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Util;
import net.minecraftforge.common.ForgeMod;
import net.rojonojojo.jojo.util.RegisterEventHandler;
import xyz.heroesunited.heroesunited.common.abilities.AbilityHelper;
import xyz.heroesunited.heroesunited.common.abilities.AbilityType;
import xyz.heroesunited.heroesunited.common.abilities.JSONAbility;

import java.util.UUID;

public class ZoomPunch extends JSONAbility {
    public ZoomPunch() {
        super(RegisterEventHandler.ZOOM_PUNCH);
    }

    @Override
    public void action(PlayerEntity player) {

    }
}
