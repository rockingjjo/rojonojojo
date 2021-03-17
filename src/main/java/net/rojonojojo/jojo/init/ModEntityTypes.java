package net.rojonojojo.jojo.init;


import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.rojonojojo.jojo.RojoNoJojo;
import net.rojonojojo.jojo.entities.ZoomPunchArm;

public class ModEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, RojoNoJojo.MOD_ID);

    public static RegistryObject<EntityType<ZoomPunchArm>> ZOOM_PUNCH_ARM = ENTITY_TYPES.register("zoom_punch_arm",
            () -> EntityType.Builder.of(ZoomPunchArm::new, EntityClassification.MISC).sized(30.0f, 30.0f).build(new ResourceLocation(RojoNoJojo.MOD_ID, "unit01").toString()));
}
