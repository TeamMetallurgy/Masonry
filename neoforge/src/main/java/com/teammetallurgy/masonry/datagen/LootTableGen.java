package com.teammetallurgy.masonry.datagen;

import com.teammetallurgy.masonry.blocks.MasonryBlocks;
import com.teammetallurgy.masonry.registration.RegistryObject;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class LootTableGen {

    public static LootTableProvider create(PackOutput gen, CompletableFuture<HolderLookup.Provider> lookup) {
        return new LootTableProvider(gen, Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(MasonryBlockLootSubProvider::new, LootContextParamSets.BLOCK)
        ), lookup);
    }

    public static class MasonryBlockLootSubProvider extends BlockLootSubProvider {

        public MasonryBlockLootSubProvider(HolderLookup.Provider lookupProvider) {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags(), lookupProvider);
        }

        @Override
        @Nonnull
        protected Iterable<Block> getKnownBlocks() {
            return MasonryBlocks.BLOCK_DEFERRED.getEntries()
                    .stream()
                    .map(e -> e.asHolder().value())
                    .toList();
        }

        @Override
        protected void generate() {
            for (RegistryObject<Block, Block> blockObject : MasonryBlocks.BLOCKS) {
                Block block = blockObject.get();
                if (block instanceof SlabBlock) {
                    this.add(block, this.createSlabItemTable(block));
                } else {
                    this.dropSelf(block);
                }
            }
        }
    }
}