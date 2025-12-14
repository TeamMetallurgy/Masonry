package com.teammetallurgy.masonry.datagen.providers;

import com.teammetallurgy.masonry.MasonryCommon;
import com.teammetallurgy.masonry.blocks.MasonryBlocks;
import com.teammetallurgy.masonry.registration.RegistryObject;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.blockstates.*;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.client.renderer.item.BlockModelWrapper;
import net.minecraft.client.renderer.item.ClientItem;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

import javax.annotation.Nonnull;
import java.util.Collections;

public class MasonryModelProvider extends ModelProvider {

    public MasonryModelProvider(PackOutput output) {
        super(output, MasonryCommon.MOD_ID);
    }

    @Override
    protected void registerModels(@Nonnull BlockModelGenerators blockModels, @Nonnull ItemModelGenerators itemModels) {
        for (RegistryObject<Item, BlockItem> itemBlockObject : MasonryBlocks.BLOCK_ITEMS) {
            BlockItem itemBlock = itemBlockObject.get();
            Block block = itemBlock.getBlock();
            //"Client Items". Located in assets/items/
            if (block instanceof WallBlock) {
                itemModels.itemModelOutput.register(itemBlock,
                        new ClientItem(new BlockModelWrapper.Unbaked(ModelLocationUtils.getModelLocation(itemBlock), Collections.emptyList()), ClientItem.Properties.DEFAULT));
            } else {
                itemModels.itemModelOutput.register(itemBlock,
                        new ClientItem(new BlockModelWrapper.Unbaked(ModelLocationUtils.getModelLocation(block), Collections.emptyList()), ClientItem.Properties.DEFAULT));
            }
        }
        //Generates blockstates and block models - NOT FULLY WORKING
        for (RegistryObject<Block, Block> blockObject : MasonryBlocks.BLOCKS) {
            Block block = blockObject.get();
            if (block instanceof SlabBlock) {
                Identifier baseBlock = ModelLocationUtils.getModelLocation(MasonryBlocks.BASED_ON.get(blockObject).get());
                TexturedModel cube = TexturedModel.CUBE.get(MasonryBlocks.BASED_ON.get(blockObject).get());
                Identifier slabBottom = ModelTemplates.SLAB_BOTTOM.create(block, cube.getMapping(), blockModels.modelOutput);
                Identifier slabTop = ModelTemplates.SLAB_TOP.create(block, cube.getMapping(), blockModels.modelOutput);
                //blockModels.blockStateOutput.accept(BlockModelGenerators.createSlab(block, slabBottom, slabTop, baseBlock));
            } else if (block instanceof WallBlock) {
                TextureMapping baseBlock = TextureMapping.cube(MasonryBlocks.BASED_ON.get(blockObject).get());
                Identifier wallPost = ModelTemplates.WALL_POST.create(block, baseBlock, blockModels.modelOutput);
                Identifier wallLowSide = ModelTemplates.WALL_LOW_SIDE.create(block, baseBlock, blockModels.modelOutput);
                Identifier wallTallSide = ModelTemplates.WALL_TALL_SIDE.create(block, baseBlock, blockModels.modelOutput);
                //blockModels.blockStateOutput.accept(BlockModelGenerators.createWall(block, wallPost, wallLowSide, wallTallSide));
                //Identifier wallInventory = ModelTemplates.WALL_INVENTORY.create(block, baseBlock, blockModels.modelOutput);
                //blockModels.registerSimpleItemModel(block, wallInventory);
            } else if (block instanceof RotatedPillarBlock) {
                Identifier location = TexturedModel.COLUMN_ALT.create(block, blockModels.modelOutput);
                //blockModels.blockStateOutput.accept(BlockModelGenerators.createRotatedPillarWithHorizontalVariant(block, location, location));
            } else if (block instanceof GlazedTerracottaBlock) {
                blockModels.createColoredBlockWithStateRotations(TexturedModel.GLAZED_TERRACOTTA, block);
            } else {
                blockModels.createTrivialCube(block);
            }
        }
    }
}