package com.teammetallurgy.masonry;

import com.teammetallurgy.masonry.blocks.MasonryBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MasonryRegistries {
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event){
        MasonryBlocks.registerBlocks(event);
    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event){
        MasonryBlocks.registerBlockItems(event);
    }
}
