package net.rojonojojo.jojo.entitymodels;

import net.minecraft.util.ResourceLocation;
import net.rojonojojo.jojo.RojoNoJojo;
import net.rojonojojo.jojo.entities.PunchBaseEntity;
import software.bernie.HU.geckolib3.model.AnimatedGeoModel;

public class PunchBaseModel extends AnimatedGeoModel<PunchBaseEntity> {
    @Override
    public ResourceLocation getModelLocation(PunchBaseEntity object) {
        return new ResourceLocation(RojoNoJojo.MOD_ID, "geo/zoompuncharm.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(PunchBaseEntity object) {
        return new ResourceLocation(RojoNoJojo.MOD_ID, "textures/entity/zoompuncharmtexture.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(PunchBaseEntity animatable) {
        return new ResourceLocation(RojoNoJojo.MOD_ID, "animations/zoompuncharm.animation.json");
    }
}
