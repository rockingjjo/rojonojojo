package net.rojonojojo.jojo.util;


import net.minecraft.client.Minecraft;
import net.minecraft.util.Timer;
import net.minecraft.util.Util;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.rojonojojo.jojo.RojoNoJojo;
import net.rojonojojo.jojo.abilities.Healing;
import xyz.heroesunited.heroesunited.common.abilities.AbilityType;
import xyz.heroesunited.heroesunited.util.HUTickrate;

import java.util.HashMap;
import java.util.Map;

import static xyz.heroesunited.heroesunited.util.HUTickrate.CLIENT_TICK;

@Mod.EventBusSubscriber(modid = RojoNoJojo.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegisterEventHandler {

    public static final Map<String, AbilityType> ABILITIES = new HashMap<>();

    public static final AbilityType HEALING = new AbilityType(Healing::new, RojoNoJojo.MOD_ID, "healing");


//    @SubscribeEvent
//    public static void onClientSetup(FMLClientSetupEvent event){
//
//    }


    @SubscribeEvent
    public static void registerAbilityTypes(RegistryEvent.Register<AbilityType> e) {
        e.getRegistry().register(HEALING);
        ABILITIES.put(HEALING.getRegistryName().toString(),HEALING);
    }

//    @SubscribeEvent
//    public static void onWorldTick(TickEvent.WorldTickEvent event) {
//        float tickrate = -20.0f;
//
//        if (event.side.isClient() && CLIENT_TICK != tickrate) {
//            ObfuscationReflectionHelper.setPrivateValue(Minecraft.class, Minecraft.getInstance(), new Timer(tickrate, 0l), "timer");
//            CLIENT_TICK = tickrate;
//        }
//        if (event.side.isServer() && HUTickrate.SERVER_TICK != (long) (1000L / tickrate)) {
//            HUTickrate.SERVER_TICK = (long) (1000L / tickrate);
//
//        }
//
//    }

//    @SubscribeEvent
//    public static void playerTick(TickEvent.PlayerTickEvent event){
//        //event.player.sendMessage(new StringTextComponent("sip"), Util.NIL_UUID);
//    }

}
