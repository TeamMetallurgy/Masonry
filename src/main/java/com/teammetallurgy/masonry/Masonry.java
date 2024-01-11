package com.teammetallurgy.masonry;

import com.teammetallurgy.masonry.blocks.MasonryBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod("masonry")
public class Masonry {
    public static final String MOD_ID = "masonry";
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final RegistryObject<CreativeModeTab> GROUP = CREATIVE_TABS.register("tab", () -> new CreativeModeTab.Builder(CreativeModeTab.Row.TOP, 0)
            .icon(() -> new ItemStack(Blocks.STONECUTTER))
            .title(Component.translatable("tabs." + MOD_ID + ".tab"))
            .displayItems((featureFlagSet, tabOutput) -> {
                MasonryBlocks.ITEMS_FOR_TAB_LIST.forEach(registryObject -> tabOutput.accept(new ItemStack(registryObject.get())));
            }).build()
    );

    public Masonry() {
        final IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        modBus.addListener(this::setupCommon);
        this.registerDeferredRegistries(modBus);
    }

    private void setupCommon(final FMLCommonSetupEvent event) {

    }

    public void registerDeferredRegistries(IEventBus modBus) {
        MasonryBlocks.BLOCK_DEFERRED.register(modBus);
        MasonryBlocks.ITEM_DEFERRED.register(modBus);
        CREATIVE_TABS.register(modBus);
    }
}