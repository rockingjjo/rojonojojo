package net.rojonojojo.jojo.entityrenderers;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.rojonojojo.jojo.entities.PunchBaseEntity;
import net.rojonojojo.jojo.entitymodels.PunchBaseModel;
import software.bernie.HU.geckolib3.model.AnimatedGeoModel;

public class PunchBaseRenderer extends GeoProjectilesRenderer<PunchBaseEntity>{
    public PunchBaseRenderer(EntityRendererManager renderManager) {
        super(renderManager, new PunchBaseModel());
    }

    protected int getBlockLightLevel(PunchBaseEntity entityIn, BlockPos partialTicks) {
        return 15;
    }

    @Override
    public RenderType getRenderType(PunchBaseEntity animatable, float partialTicks, MatrixStack stack,
                                    IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }

}
