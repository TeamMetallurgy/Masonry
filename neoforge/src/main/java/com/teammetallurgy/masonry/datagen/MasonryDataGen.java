package com.teammetallurgy.masonry.datagen;

import net.minecraft.data.DataGenerator;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class MasonryDataGen {

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent.Server event) {
        DataGenerator gen = event.getGenerator();

        gen.addProvider(event.includeDev(), LootTableGen.create(gen.getPackOutput(), event.getLookupProvider()));
    }
}
