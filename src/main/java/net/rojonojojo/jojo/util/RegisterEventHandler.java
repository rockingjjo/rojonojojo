package net.rojonojojo.jojo.util;


import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rojonojojo.jojo.RojoNoJojo;
import net.rojonojojo.jojo.abilities.Healing;
import net.rojonojojo.jojo.abilities.ZoomPunch;
import xyz.heroesunited.heroesunited.common.abilities.AbilityType;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(modid = RojoNoJojo.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegisterEventHandler {

    public static final Map<String, AbilityType> ABILITIES = new HashMap<>();

    public static final AbilityType HEALING = new AbilityType(Healing::new, RojoNoJojo.MOD_ID, "healing");
    public static final AbilityType ZOOM_PUNCH = new AbilityType(ZoomPunch::new, RojoNoJojo.MOD_ID, "zoom_punch");


//    @SubscribeEvent
//    public static void onClientSetup(FMLClientSetupEvent event){
//
//    }


    @SubscribeEvent
    public static void registerAbilityTypes(RegistryEvent.Register<AbilityType> e) {
        e.getRegistry().register(HEALING);
        ABILITIES.put(HEALING.getRegistryName().toString(),HEALING);

        e.getRegistry().register(ZOOM_PUNCH);
        ABILITIES.put(ZOOM_PUNCH.getRegistryName().toString(),ZOOM_PUNCH);
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
