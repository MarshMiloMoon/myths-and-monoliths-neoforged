package net.starglobe.mythsmonoliths.entity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.starglobe.mythsmonoliths.MythsMonoliths;
import net.starglobe.mythsmonoliths.entity.custom.BrineEntity;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, MythsMonoliths.MOD_ID);

    public static final Supplier<EntityType<BrineEntity>> BRINE =
            ENTITY_TYPES.register("brine", () -> EntityType.Builder.of(BrineEntity::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.8f).build("brine"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
