package net.rojonojojo.jojo.util;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.rojonojojo.jojo.RojoNoJojo;
import net.rojonojojo.jojo.entityrenderers.PunchBaseRenderer;
import net.rojonojojo.jojo.init.ModEntityTypes;

@Mod.EventBusSubscriber(modid = RojoNoJojo.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class RegisterEventHandlerClient {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event){
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.PUNCH_BASE_ENTITY.get(), PunchBaseRenderer::new);
    }


}
