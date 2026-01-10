package com.rayishere.contohmod.item;

import com.rayishere.contohmod.ContohMod;
import com.rayishere.contohmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ContohMod.MOD_ID);

    public static final Supplier<CreativeModeTab> PUNIV_ITEMS_TAB = CREATIVE_MODE_TAB.register("puniv_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(itemsOP.PUNIV.get()))
                    .title(Component.translatable("creativetab.easyenderpearl.puniv_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(itemsOP.PUNIV);
                        output.accept(itemsOP.OPENDER);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> PUNIV_BLOCKS_TAB = CREATIVE_MODE_TAB.register("puniv_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PUNIV_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ContohMod.MOD_ID, "puniv_items_tab"))
                    .title(Component.translatable("creativetab.easyenderpearl.puniv_blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.PUNIV_BLOCK);
                        output.accept(ModBlocks.PUNIV_ORE);
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
