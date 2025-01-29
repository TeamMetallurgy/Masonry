package com.teammetallurgy.masonry;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(Constants.MOD_ID)
public class Masonry {

    public Masonry(IEventBus eventBus) {
        MasonryCommon.init();
        eventBus.addListener(this::setupCommon);
        eventBus.addListener(this::setupClient);
    }

    public void setupCommon(final FMLCommonSetupEvent event) {
    }

    public void setupClient(final FMLClientSetupEvent event) {
    }
}