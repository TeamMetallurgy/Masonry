package com.teammetallurgy.masonry.datagen;

import com.teammetallurgy.masonry.Constants;
import com.teammetallurgy.masonry.datagen.providers.MasonryLootTableGen;
import com.teammetallurgy.masonry.datagen.providers.MasonryModelProvider;
import net.minecraft.data.DataGenerator;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = Constants.MOD_ID)
public class MasonryDataGen {

    @SubscribeEvent
    public static void serverGatherEvent(GatherDataEvent.Server event) {
        DataGenerator gen = event.getGenerator();

        gen.addProvider(true, MasonryLootTableGen.create(gen.getPackOutput(), event.getLookupProvider()));
    }

    @SubscribeEvent
    public static void clientGatherEvent(GatherDataEvent.Client event) {
        DataGenerator gen = event.getGenerator();

        gen.addProvider(true, new MasonryModelProvider(gen.getPackOutput()));
    }
}
