package com.teammetallurgy.masonry.blocks;

import com.google.common.collect.Lists;
import com.teammetallurgy.masonry.MasonryMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ObjectHolder;

import java.util.List;

public class MasonryBlocks {
    public static List<Block> BLOCKS = Lists.newArrayList();
    public static List<Item> BLOCK_ITEMS = Lists.newArrayList();

    public static Block devBlock = register("devblock", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));

    private static Block register(String registryName, Block thisBlock){
        thisBlock.setRegistryName(registryName);
        BLOCKS.add(thisBlock);

        Item.Properties properties = new Item.Properties().group(MasonryMain.itemGroup);
        BlockItem thisBlockItem = new BlockItem(thisBlock, properties);
        BLOCK_ITEMS.add(thisBlockItem.setRegistryName(registryName));

        return thisBlock;
    }

    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        for(Block thisBlock : BLOCKS){
            event.getRegistry().register(thisBlock);
        }
    }

    public static void registerBlockItems(final RegistryEvent.Register<Item> event){
        for(Item thisBlockItem : BLOCK_ITEMS){
            event.getRegistry().register(thisBlockItem);
        }
    }
}
