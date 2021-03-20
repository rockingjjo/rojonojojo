package net.rojonojojo.jojo.abilities;

import com.google.gson.JsonObject;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.Util;
import net.minecraft.util.text.StringTextComponent;
import net.rojonojojo.jojo.util.RegisterEventHandler;
import xyz.heroesunited.heroesunited.common.abilities.JSONAbility;
import xyz.heroesunited.heroesunited.common.capabilities.HUPlayer;

public class Healing extends JSONAbility {
    public Healing() { super(RegisterEventHandler.HEALING); }

    @Override
    public void onUpdate(PlayerEntity player) {
        super.onUpdate(player);
    }

    @Override
    public void action(PlayerEntity player) {
        if (this.enabled) {
            player.setHealth(player.getHealth() + 2);
        }
    }

}
