package com.teammetallurgy.masonry;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = Constants.MOD_ID)
public class Masonry {

    public Masonry() {
        MasonryCommon.init();
        final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::setupCommon);
        eventBus.addListener(this::setupClient);
    }

    public void setupCommon(final FMLCommonSetupEvent event) {
    }

    public void setupClient(final FMLClientSetupEvent event) {
    }
}