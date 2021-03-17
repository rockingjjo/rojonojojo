package net.rojonojojo.jojo.entityrenderers;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.rojonojojo.jojo.entities.ZoomPunchArm;
import net.rojonojojo.jojo.entitymodels.ZoomPunchArmModel;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoReplacedEntityRenderer;

public class ZoomPunchRenderer extends GeoProjectilesRenderer<ZoomPunchArm> {

    public ZoomPunchRenderer(EntityRendererManager renderManager) {
        super(renderManager, new ZoomPunchArmModel());
    }
}