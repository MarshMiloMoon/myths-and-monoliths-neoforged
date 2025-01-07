package net.starglobe.mythsmonoliths.event;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.starglobe.mythsmonoliths.MythsMonoliths;
import net.starglobe.mythsmonoliths.entity.ModEntities;
import net.starglobe.mythsmonoliths.entity.client.BrineModel;
import net.starglobe.mythsmonoliths.entity.custom.BrineEntity;

@EventBusSubscriber(modid = MythsMonoliths.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(BrineModel.LAYER_LOCATION, BrineModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.BRINE.get(), BrineEntity.createAttributes().build());
    }
}
