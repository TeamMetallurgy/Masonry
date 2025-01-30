package com.teammetallurgy.masonry;

import com.teammetallurgy.masonry.blocks.MasonryBlocks;
import com.teammetallurgy.masonry.registration.RegistrationProvider;
import com.teammetallurgy.masonry.registration.RegistryObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

public class MasonryCommon {
    public static final String MOD_ID = "masonry";

    public static final RegistrationProvider<CreativeModeTab> CREATIVE_TABS = RegistrationProvider.get(BuiltInRegistries.CREATIVE_MODE_TAB, Constants.MOD_ID);
    public static final RegistryObject<CreativeModeTab, CreativeModeTab> GROUP = CREATIVE_TABS.register("tab", () -> new CreativeModeTab.Builder(CreativeModeTab.Row.TOP, 0)
            .icon(() -> new ItemStack(Blocks.STONECUTTER))
            .title(Component.translatable("tabs." + Constants.MOD_ID + ".tab"))
            .displayItems((featureFlagSet, tabOutput) -> {
                MasonryBlocks.ITEMS_FOR_TAB_LIST.forEach(registryObject -> tabOutput.accept(new ItemStack(registryObject.get())));
            }).build()
    );

    public static void init() {
        MasonryBlocks.load();
    }
}