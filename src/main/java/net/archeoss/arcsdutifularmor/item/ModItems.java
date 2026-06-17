package net.archeoss.arcsdutifularmor.item;

import net.archeoss.arcsdutifularmor.ArcsDutifulArmor;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ArcsDutifulArmor.MOD_ID);

    public static final DeferredItem<Item> AWESOMEITEM = ITEMS.register("awesomeitem",
            () -> new Item(new Item.Properties()));
            public static final DeferredItem<Item> RAW_TAZURINE = ITEMS.register("raw_tazurine",
                () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

