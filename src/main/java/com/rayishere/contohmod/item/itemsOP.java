package com.rayishere.contohmod.item;

import com.rayishere.contohmod.ContohMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class itemsOP {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ContohMod.MOD_ID);

    public static final DeferredItem<Item> OPENDER = ITEMS.register("opender",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PUNIV =  ITEMS.register("puniv",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
