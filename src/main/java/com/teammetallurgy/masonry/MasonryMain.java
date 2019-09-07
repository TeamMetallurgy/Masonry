package com.teammetallurgy.masonry;

import com.teammetallurgy.masonry.blocks.MasonryBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("masonry")
public class MasonryMain {
    public static final String MOD_ID = "masonry";

    public static ItemGroup itemGroup = new ItemGroup("masonry"){
        @Override
        public ItemStack createIcon(){
            return new ItemStack(MasonryBlocks.devBlock);
        }
    };

    public MasonryMain(){
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event){

    }

    private void clientRegistries(final FMLClientSetupEvent event){

    }
}
