package net.starglobe.mythsmonoliths.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SpawnEggItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.starglobe.mythsmonoliths.MythsMonoliths;
import net.starglobe.mythsmonoliths.entity.ModEntities;
import net.starglobe.mythsmonoliths.sound.ModSounds;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MythsMonoliths.MOD_ID);

    public static final DeferredItem<Item> BREEZE_DUST = ITEMS.register("breeze_dust",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BRINE_ROD = ITEMS.register("brine_rod",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRINE_FOAM = ITEMS.register("brine_foam",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WATER_CHARGE = ITEMS.register("water_charge",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BOULDER_ROD = ITEMS.register("boulder_rod",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOULDER_GRAIN = ITEMS.register("boulder_grain",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EARTH_CHARGE = ITEMS.register("earth_charge",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GAUNTLET = ITEMS.register("gauntlet",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> ANCHOR = ITEMS.register("anchor",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> GRAPPLE = ITEMS.register("grapple",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> MUSIC_DISC_STRIKE = ITEMS.register("music_disc_strike",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).jukeboxPlayable(ModSounds.STRIKE_KEY)
                    .stacksTo(1)));

    public static final DeferredItem<Item> BRINE_SPAWN_EGG = ITEMS.register("brine_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.BRINE, 0x2a5375, 0x77d9ff,
                    new Item.Properties()));

    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
