package net.rojonojojo.jojo.init;


import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.rojonojojo.jojo.RojoNoJojo;
import net.rojonojojo.jojo.entities.PunchBaseEntity;

public class ModEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, RojoNoJojo.MOD_ID);

    public static RegistryObject<EntityType<PunchBaseEntity>> PUNCH_BASE_ENTITY = ENTITY_TYPES.register("punch_base_entity",
            () -> EntityType.Builder.<PunchBaseEntity>of(PunchBaseEntity::new, EntityClassification.MISC).sized(3.0f, 3.0f).build(new ResourceLocation(RojoNoJojo.MOD_ID, "unit01").toString()));

}
