package net.rojonojojo.jojo.entitymodels;

import net.minecraft.util.ResourceLocation;
import net.rojonojojo.jojo.RojoNoJojo;
import net.rojonojojo.jojo.entities.ZoomPunchArm;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ZoomPunchArmModel extends AnimatedGeoModel<ZoomPunchArm> {

    @Override
    public ResourceLocation getModelLocation(ZoomPunchArm zoomPunchArm) {
        return new ResourceLocation(RojoNoJojo.MOD_ID, "geo/zoompuncharmmodel.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ZoomPunchArm zoomPunchArm) {
        return new ResourceLocation(RojoNoJojo.MOD_ID, "textures/entity/zoompuncharmtexture.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ZoomPunchArm zoomPunchArm) {
        return null;
    }
}
