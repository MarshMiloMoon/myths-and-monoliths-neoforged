package net.starglobe.mythsmonoliths.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.starglobe.mythsmonoliths.MythsMonoliths;
import net.starglobe.mythsmonoliths.entity.custom.BrineEntity;

public class BrineRenderer extends MobRenderer<BrineEntity, BrineModel<BrineEntity>> {

    public BrineRenderer(EntityRendererProvider.Context context) {
        super(context, new BrineModel<>(context.bakeLayer(BrineModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(BrineEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(MythsMonoliths.MOD_ID, "textures/entity/brine.png");
    }

    @Override
    public void render(BrineEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
