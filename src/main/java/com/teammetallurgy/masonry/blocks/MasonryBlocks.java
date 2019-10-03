package com.teammetallurgy.masonry.blocks;

import com.google.common.collect.Lists;
import com.teammetallurgy.masonry.MasonryMain;
import net.minecraft.block.*;
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

    //public static Block devBlock = register("devblock", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block ANDESITE_TILED = register("andesitetiled", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block DARK_PRISMARINE_TILED = register("darkprismarinetiled", new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(1.5F, 6.0F)));
    public static Block DIORITE_TILED = register("dioritetiled", new Block(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F)));
    public static Block END_STONE_TILED = register("endstonetiled", new Block(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(3.0F, 9.0F)));
    public static Block GRANITE_TILED = register("granitetiled", new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)));
    public static Block NETHERRACK_TILED = register("netherracktiled", new Block(Block.Properties.create(Material.ROCK, MaterialColor.NETHERRACK).hardnessAndResistance(0.4F, 0.4F)));
    public static Block OBSIDIAN_TILED = register("obsidiantiled", new Block(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(50.0F, 1200.0F)));
    public static Block PRISMARINE_TILED = register("prismarinetiled", new Block(Block.Properties.create(Material.ROCK, MaterialColor.CYAN).hardnessAndResistance(1.5F, 6.0F)));
    public static Block STONE_CARVED_CREEPER = register("stonecarvedcreeper", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block STONE_CARVED_DERP = register("stonecarvedderp", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block STONE_CARVED_VILLAGER = register("stonecarvedvillager", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block STONE_CARVED_WITHER = register("stonecarvedwither", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block STONE_CARVED_WRITING = register("stonecarvedwriting", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block STONE_COLUMN = register("stonecolumn", new RotatedPillarBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block STONE_CUT = register("stonecut", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block STONE_ENGRAVED = register("stoneengraved", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block STONE_PANELS = register("stonepanels", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block STONE_PAVERS = register("stonepavers", new GlazedTerracottaBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block STONE_PILLAR = register("stonepillar", new RotatedPillarBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block STONE_POLISHED = register("stonepolished", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block STONE_ROUGH_CUT = register("stoneroughcut", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block STONE_TILED = register("stonetiled", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block GRANITE_CARVED_CREEPER = register("granitecarvedcreeper", new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)));
    public static Block GRANITE_CARVED_DERP = register("granitecarvedderp", new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)));
    public static Block GRANITE_CARVED_VILLAGER = register("granitecarvedvillager", new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)));
    public static Block GRANITE_CARVED_WITHER = register("granitecarvedwither", new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)));
    public static Block GRANITE_CARVED_WRITING = register("granitecarvedwriting", new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)));
    public static Block GRANITE_COLUMN = register("granitecolumn", new RotatedPillarBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)));
    public static Block GRANITE_CUT = register("granitecut", new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)));
    public static Block GRANITE_ENGRAVED = register("graniteengraved", new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)));
    public static Block GRANITE_PANELS = register("granitepanels", new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)));
    public static Block GRANITE_PAVERS = register("granitepavers", new GlazedTerracottaBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)));
    public static Block GRANITE_PILLAR = register("granitepillar", new RotatedPillarBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)));
    public static Block GRANITE_POLISHED = register("granitepolished", new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)));
    public static Block GRANITE_ROUGH_CUT = register("graniteroughcut", new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)));
    public static Block ANDESITE_CARVED_CREEPER = register("andesitecarvedcreeper", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block ANDESITE_CARVED_DERP = register("andesitecarvedderp", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block ANDESITE_CARVED_VILLAGER = register("andesitecarvedvillager", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block ANDESITE_CARVED_WITHER = register("andesitecarvedwither", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block ANDESITE_CARVED_WRITING = register("andesitecarvedwriting", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block ANDESITE_COLUMN = register("andesitecolumn", new RotatedPillarBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block ANDESITE_CUT = register("andesitecut", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block ANDESITE_ENGRAVED = register("andesiteengraved", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block ANDESITE_PANELS = register("andesitepanels", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block ANDESITE_PAVERS = register("andesitepavers", new GlazedTerracottaBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block ANDESITE_PILLAR = register("andesitepillar", new RotatedPillarBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block ANDESITE_POLISHED = register("andesitepolished", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));
    public static Block ANDESITE_ROUGH_CUT = register("andesiteroughcut", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));

    //public static Block devSlabBlock = register("devslabblock", new SlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));

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
