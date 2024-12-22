package net.starglobe.mythsmonoliths;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.starglobe.mythsmonoliths.block.ModBlocks;
import net.starglobe.mythsmonoliths.item.ModItems;
import net.starglobe.mythsmonoliths.sound.ModSounds;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(MythsMonoliths.MOD_ID)
public class MythsMonoliths {
    public static final String MOD_ID = "mythsmonoliths";
    private static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public MythsMonoliths(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModSounds.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            //event.accept(Items.FIRE_CHARGE);

            event.accept(ModItems.BREEZE_DUST);
            //event.accept(Items.WIND_CHARGE);

            event.accept(ModItems.BRINE_ROD);
            event.accept(ModItems.BRINE_FOAM);
            event.accept(ModItems.WATER_CHARGE);

            event.accept(ModItems.BOULDER_ROD);
            event.accept(ModItems.BOULDER_GRAIN);
            event.accept(ModItems.EARTH_CHARGE);
        }
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.WATER_CHARGE);
            event.accept(ModItems.EARTH_CHARGE);
            event.accept(ModItems.GRAPPLE);
            event.accept(ModItems.MUSIC_DISC_STRIKE);
        }
        if(event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.ANCHOR);
            event.accept(ModItems.GAUNTLET);
            //event.accept(Items.FIRE_CHARGE);
            event.accept(ModItems.WATER_CHARGE);
            event.accept(ModItems.EARTH_CHARGE);
        }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.CALCITE_SLAB);
            event.accept(ModBlocks.CALCITE_STAIRS);
            event.accept(ModBlocks.CALCITE_WALL);
            event.accept(ModBlocks.POLISHED_CALCITE);
            event.accept(ModBlocks.POLISHED_CALCITE_SLAB);
            event.accept(ModBlocks.POLISHED_CALCITE_STAIRS);
            event.accept(ModBlocks.POLISHED_CALCITE_WALL);
            event.accept(ModBlocks.CALCITE_BRICKS);
            event.accept(ModBlocks.CALCITE_BRICK_SLAB);
            event.accept(ModBlocks.CALCITE_BRICK_STAIRS);
            event.accept(ModBlocks.CALCITE_BRICK_WALL);
            event.accept(ModBlocks.CHISELED_CALCITE);
            event.accept(ModBlocks.CHISELED_CALCITE_BRICKS);
            event.accept(ModBlocks.SMOOTH_BASALT_SLAB);
            event.accept(ModBlocks.SMOOTH_BASALT_STAIRS);
            event.accept(ModBlocks.SMOOTH_BASALT_WALL);
            event.accept(ModBlocks.POLISHED_SMOOTH_BASALT);
            event.accept(ModBlocks.POLISHED_SMOOTH_BASALT_SLAB);
            event.accept(ModBlocks.POLISHED_SMOOTH_BASALT_STAIRS);
            event.accept(ModBlocks.POLISHED_SMOOTH_BASALT_WALL);
            event.accept(ModBlocks.BASALT_BRICKS);
            event.accept(ModBlocks.BASALT_BRICK_SLAB);
            event.accept(ModBlocks.BASALT_BRICK_STAIRS);
            event.accept(ModBlocks.BASALT_BRICK_WALL);
            event.accept(ModBlocks.CHISELED_BASALT);
            event.accept(ModBlocks.SMOOTH_NETHER_BRICKS);
            event.accept(ModBlocks.SMOOTH_NETHER_BRICK_SLAB);
            event.accept(ModBlocks.SMOOTH_NETHER_BRICK_STAIRS);
            event.accept(ModBlocks.SMOOTH_NETHER_BRICK_WALL);
            event.accept(ModBlocks.SMOOTH_RED_NETHER_BRICKS);
            event.accept(ModBlocks.SMOOTH_RED_NETHER_BRICK_SLAB);
            event.accept(ModBlocks.SMOOTH_RED_NETHER_BRICK_STAIRS);
            event.accept(ModBlocks.SMOOTH_RED_NETHER_BRICK_WALL);
            event.accept(ModBlocks.CHISELED_RED_NETHER_BRICKS);
            event.accept(ModBlocks.RED_NETHER_BRICK_FENCE);
            event.accept(ModBlocks.BEATEN_COPPER);
            event.accept(ModBlocks.BEATEN_COPPER_SLAB);
            event.accept(ModBlocks.SMOOTH_BEATEN_COPPER);
            event.accept(ModBlocks.EXPOSED_BEATEN_COPPER);
            event.accept(ModBlocks.EXPOSED_BEATEN_COPPER_SLAB);
            event.accept(ModBlocks.EXPOSED_SMOOTH_BEATEN_COPPER);
            event.accept(ModBlocks.WEATHERED_BEATEN_COPPER);
            event.accept(ModBlocks.WEATHERED_BEATEN_COPPER_SLAB);
            event.accept(ModBlocks.WEATHERED_SMOOTH_BEATEN_COPPER);
            event.accept(ModBlocks.OXIDIZED_BEATEN_COPPER);
            event.accept(ModBlocks.OXIDIZED_BEATEN_COPPER_SLAB);
            event.accept(ModBlocks.OXIDIZED_SMOOTH_BEATEN_COPPER);
            event.accept(ModBlocks.WAXED_BEATEN_COPPER);
            event.accept(ModBlocks.WAXED_BEATEN_COPPER_SLAB);
            event.accept(ModBlocks.WAXED_SMOOTH_BEATEN_COPPER);
            event.accept(ModBlocks.WAXED_EXPOSED_BEATEN_COPPER);
            event.accept(ModBlocks.WAXED_EXPOSED_BEATEN_COPPER_SLAB);
            event.accept(ModBlocks.WAXED_EXPOSED_SMOOTH_BEATEN_COPPER);
            event.accept(ModBlocks.WAXED_WEATHERED_BEATEN_COPPER);
            event.accept(ModBlocks.WAXED_WEATHERED_BEATEN_COPPER_SLAB);
            event.accept(ModBlocks.WAXED_WEATHERED_SMOOTH_BEATEN_COPPER);
            event.accept(ModBlocks.WAXED_OXIDIZED_BEATEN_COPPER);
            event.accept(ModBlocks.WAXED_OXIDIZED_BEATEN_COPPER_SLAB);
            event.accept(ModBlocks.WAXED_OXIDIZED_SMOOTH_BEATEN_COPPER);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
