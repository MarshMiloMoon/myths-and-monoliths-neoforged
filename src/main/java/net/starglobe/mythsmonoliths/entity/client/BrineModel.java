package net.starglobe.mythsmonoliths.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.starglobe.mythsmonoliths.MythsMonoliths;
import net.starglobe.mythsmonoliths.entity.custom.BrineEntity;

public class BrineModel<T extends BrineEntity> extends HierarchicalModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(MythsMonoliths.MOD_ID, "brine"), "main");
    private final ModelPart head;
    private final ModelPart rightfin;
    private final ModelPart leftfin;
    private final ModelPart whiskers;
    private final ModelPart rods;
    private final ModelPart rod0;
    private final ModelPart rod1;
    private final ModelPart rod2;
    private final ModelPart rod3;
    private final ModelPart rod4;
    private final ModelPart rod5;
    private final ModelPart lowerrods;
    private final ModelPart rod6;
    private final ModelPart rod7;
    private final ModelPart rod8;
    private final ModelPart rod9;
    private final ModelPart rod10;
    private final ModelPart rod11;

    public BrineModel(ModelPart root) {
        this.head = root.getChild("head");
        this.rightfin = this.head.getChild("rightfin");
        this.leftfin = this.head.getChild("leftfin");
        this.whiskers = this.head.getChild("whiskers");
        this.rods = root.getChild("rods");
        this.rod0 = this.rods.getChild("rod0");
        this.rod1 = this.rods.getChild("rod1");
        this.rod2 = this.rods.getChild("rod2");
        this.rod3 = this.rods.getChild("rod3");
        this.rod4 = this.rods.getChild("rod4");
        this.rod5 = this.rods.getChild("rod5");
        this.lowerrods = this.rods.getChild("lowerrods");
        this.rod6 = this.lowerrods.getChild("rod6");
        this.rod7 = this.lowerrods.getChild("rod7");
        this.rod8 = this.lowerrods.getChild("rod8");
        this.rod9 = this.lowerrods.getChild("rod9");
        this.rod10 = this.lowerrods.getChild("rod10");
        this.rod11 = this.lowerrods.getChild("rod11");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));

        PartDefinition rightfin = head.addOrReplaceChild("rightfin", CubeListBuilder.create().texOffs(8, 17).addBox(-4.0F, -2.0F, 0.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -4.0F, 0.0F));

        PartDefinition leftfin = head.addOrReplaceChild("leftfin", CubeListBuilder.create().texOffs(8, 23).addBox(0.0F, -2.0F, 0.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -4.0F, 0.0F));

        PartDefinition whiskers = head.addOrReplaceChild("whiskers", CubeListBuilder.create().texOffs(16, 16).addBox(-9.0F, 0.0F, 0.0F, 7.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(18, 24).addBox(2.0F, 0.0F, 0.0F, 7.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -4.0F));

        PartDefinition rods = partdefinition.addOrReplaceChild("rods", CubeListBuilder.create(), PartPose.offset(0.0F, 6.0F, 0.0F));

        PartDefinition rod0 = rods.addOrReplaceChild("rod0", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -3.0F));

        PartDefinition rod1 = rods.addOrReplaceChild("rod1", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 0.0F, -2.0F));

        PartDefinition rod2 = rods.addOrReplaceChild("rod2", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 0.0F, 2.0F));

        PartDefinition rod3 = rods.addOrReplaceChild("rod3", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 3.0F));

        PartDefinition rod4 = rods.addOrReplaceChild("rod4", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 0.0F, 2.0F));

        PartDefinition rod5 = rods.addOrReplaceChild("rod5", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 0.0F, -2.0F));

        PartDefinition lowerrods = rods.addOrReplaceChild("lowerrods", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rod6 = lowerrods.addOrReplaceChild("rod6", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.0F, -3.0F));

        PartDefinition rod7 = lowerrods.addOrReplaceChild("rod7", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 9.0F, -2.0F));

        PartDefinition rod8 = lowerrods.addOrReplaceChild("rod8", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 9.0F, 2.0F));

        PartDefinition rod9 = lowerrods.addOrReplaceChild("rod9", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.0F, 3.0F));

        PartDefinition rod10 = lowerrods.addOrReplaceChild("rod10", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 9.0F, 2.0F));

        PartDefinition rod11 = lowerrods.addOrReplaceChild("rod11", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 9.0F, -2.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public void setupAnim(BrineEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch);

        this.animateWalk(BrineAnimations.WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(entity.idleAnimationState, BrineAnimations.IDLE, ageInTicks, 1f);
    }

    private void applyHeadRotation(float headYaw, float headPitch) {
        headYaw = Mth.clamp(headYaw, -30f, 30f);
        headPitch = Mth.clamp(headPitch, -25f, 45);

        this.head.yRot = headYaw * ((float)Math.PI / 180f);
        this.head.xRot = headPitch * ((float)Math.PI / 180f);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        head.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        rods.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }

    @Override
    public ModelPart root() {
        return rods;
    }
}
