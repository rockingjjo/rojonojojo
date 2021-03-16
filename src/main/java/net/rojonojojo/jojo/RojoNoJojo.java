package net.rojonojojo.jojo;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(RojoNoJojo.MOD_ID)
public class RojoNoJojo {
    public RojoNoJojo instance;
    public static final String MOD_ID = "rojonojojo";
    public static final Logger LOGGER = LogManager.getLogger();

    public RojoNoJojo() {
        instance = this;

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        //ItemInit.ITEMS.register(bus);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    }

    public void setup(final FMLCommonSetupEvent event){

    }

    private void clientSetup(final FMLCommonSetupEvent event){

    }

    public void onServerStarting(FMLServerStartingEvent event){

    }
}
