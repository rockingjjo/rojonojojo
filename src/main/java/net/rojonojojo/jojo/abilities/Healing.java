package net.rojonojojo.jojo.abilities;

import com.google.gson.JsonObject;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.Util;
import net.minecraft.util.text.StringTextComponent;
import net.rojonojojo.jojo.util.RegisterEventHandler;
import xyz.heroesunited.heroesunited.common.abilities.Ability;
import xyz.heroesunited.heroesunited.common.capabilities.HUPlayer;

public class Healing extends Ability {
    public Healing() { super(RegisterEventHandler.HEALING); }

    @Override
    public void toggle(PlayerEntity player, int id, boolean pressed) {
        if (this.getJsonObject().has("key")) {
            JsonObject key = JSONUtils.getAsJsonObject(this.getJsonObject(), "key");
            String pressType = JSONUtils.getAsString(key, "pressType", "toggle");

            if (id == JSONUtils.getAsInt(key, "id")) {
                if (pressType.equals("toggle")) {
                    if (pressed) {
                        player.sendMessage(new StringTextComponent("lol gay bruh"), Util.NIL_UUID);
                    }
                } else if (pressType.equals("action")) {
                    if (pressed) {

                    }
                    HUPlayer.getCap(player).setSlowMoSpeed(20F);
                } else if (pressType.equals("held")) {

                }
            }
        }
    }
}
