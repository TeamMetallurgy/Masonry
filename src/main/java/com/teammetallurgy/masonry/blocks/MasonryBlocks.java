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

    public static final Block DARK_PRISMARINE_TILED_WALL = register("darkprismarinetiledwall", new WallBlock(Block.Properties.from(DARK_PRISMARINE_TILED)));
    public static final Block DIORITE_TILED_WALL = register("dioritetiledwall", new WallBlock(Block.Properties.from(DIORITE_TILED)));
    public static final Block END_STONE_TILED_WALL = register("endstonetiledwall", new WallBlock(Block.Properties.from(END_STONE_TILED)));
    public static final Block NETHERRACK_TILED_WALL = register("netherracktiledwall", new WallBlock(Block.Properties.from(NETHERRACK_TILED)));
    public static final Block OBSIDIAN_TILED_WALL = register("obsidiantiledwall", new WallBlock(Block.Properties.from(OBSIDIAN_TILED)));
    public static final Block PRISMARINE_TILED_WALL = register("prismarinetiledwall", new WallBlock(Block.Properties.from(PRISMARINE_TILED)));
    public static final Block STONE_CARVED_CREEPER_WALL = register("stonecarvedcreeperwall", new WallBlock(Block.Properties.from(STONE_CARVED_CREEPER)));
    public static final Block STONE_CARVED_DERP_WALL = register("stonecarvedderpwall", new WallBlock(Block.Properties.from(STONE_CARVED_DERP)));
    public static final Block STONE_CARVED_VILLAGER_WALL = register("stonecarvedvillagerwall", new WallBlock(Block.Properties.from(STONE_CARVED_VILLAGER)));
    public static final Block STONE_CARVED_WITHER_WALL = register("stonecarvedwitherwall", new WallBlock(Block.Properties.from(STONE_CARVED_WITHER)));
    public static final Block STONE_CARVED_WRITING_WALL = register("stonecarvedwritingwall", new WallBlock(Block.Properties.from(STONE_CARVED_WRITING)));
    public static final Block STONE_COLUMN_WALL = register("stonecolumnwall", new WallBlock(Block.Properties.from(STONE_COLUMN)));
    public static final Block STONE_CUT_WALL = register("stonecutwall", new WallBlock(Block.Properties.from(STONE_CUT)));
    public static final Block STONE_ENGRAVED_WALL = register("stoneengravedwall", new WallBlock(Block.Properties.from(STONE_ENGRAVED)));
    public static final Block STONE_PANELS_WALL = register("stonepanelswall", new WallBlock(Block.Properties.from(STONE_PANELS)));
    public static final Block STONE_PAVERS_WALL = register("stonepaverswall", new WallBlock(Block.Properties.from(STONE_PAVERS)));
    public static final Block STONE_PILLAR_WALL = register("stonepillarwall", new WallBlock(Block.Properties.from(STONE_PILLAR)));
    public static final Block STONE_POLISHED_WALL = register("stonepolishedwall", new WallBlock(Block.Properties.from(STONE_POLISHED)));
    public static final Block STONE_ROUGH_CUT_WALL = register("stoneroughcutwall", new WallBlock(Block.Properties.from(STONE_ROUGH_CUT)));
    public static final Block STONE_TILED_WALL = register("stonetiledwall", new WallBlock(Block.Properties.from(STONE_TILED)));
    public static final Block GRANITE_CARVED_CREEPER_WALL = register("granitecarvedcreeperwall", new WallBlock(Block.Properties.from(GRANITE_CARVED_CREEPER)));
    public static final Block GRANITE_CARVED_DERP_WALL = register("granitecarvedderpwall", new WallBlock(Block.Properties.from(GRANITE_CARVED_DERP)));
    public static final Block GRANITE_CARVED_VILLAGER_WALL = register("granitecarvedvillagerwall", new WallBlock(Block.Properties.from(GRANITE_CARVED_VILLAGER)));
    public static final Block GRANITE_CARVED_WITHER_WALL = register("granitecarvedwitherwall", new WallBlock(Block.Properties.from(GRANITE_CARVED_WITHER)));
    public static final Block GRANITE_CARVED_WRITING_WALL = register("granitecarvedwritingwall", new WallBlock(Block.Properties.from(GRANITE_CARVED_WRITING)));
    public static final Block GRANITE_COLUMN_WALL = register("granitecolumnwall", new WallBlock(Block.Properties.from(GRANITE_COLUMN)));
    public static final Block GRANITE_CUT_WALL = register("granitecutwall", new WallBlock(Block.Properties.from(GRANITE_CUT)));
    public static final Block GRANITE_ENGRAVED_WALL = register("graniteengravedwall", new WallBlock(Block.Properties.from(GRANITE_ENGRAVED)));
    public static final Block GRANITE_PANELS_WALL = register("granitepanelswall", new WallBlock(Block.Properties.from(GRANITE_PANELS)));
    public static final Block GRANITE_PAVERS_WALL = register("granitepaverswall", new WallBlock(Block.Properties.from(GRANITE_PAVERS)));
    public static final Block GRANITE_PILLAR_WALL = register("granitepillarwall", new WallBlock(Block.Properties.from(GRANITE_PILLAR)));
    public static final Block GRANITE_POLISHED_WALL = register("granitepolishedwall", new WallBlock(Block.Properties.from(GRANITE_POLISHED)));
    public static final Block GRANITE_ROUGH_CUT_WALL = register("graniteroughcutwall", new WallBlock(Block.Properties.from(GRANITE_ROUGH_CUT)));
    public static final Block GRANITE_TILED_WALL = register("granitetiledwall", new WallBlock(Block.Properties.from(GRANITE_TILED)));
    public static final Block ANDESITE_CARVED_CREEPER_WALL = register("andesitecarvedcreeperwall", new WallBlock(Block.Properties.from(ANDESITE_CARVED_CREEPER)));
    public static final Block ANDESITE_CARVED_DERP_WALL = register("andesitecarvedderpwall", new WallBlock(Block.Properties.from(ANDESITE_CARVED_DERP)));
    public static final Block ANDESITE_CARVED_VILLAGER_WALL = register("andesitecarvedvillagerwall", new WallBlock(Block.Properties.from(ANDESITE_CARVED_VILLAGER)));
    public static final Block ANDESITE_CARVED_WITHER_WALL = register("andesitecarvedwitherwall", new WallBlock(Block.Properties.from(ANDESITE_CARVED_WITHER)));
    public static final Block ANDESITE_CARVED_WRITING_WALL = register("andesitecarvedwritingwall", new WallBlock(Block.Properties.from(ANDESITE_CARVED_WRITING)));
    public static final Block ANDESITE_COLUMN_WALL = register("andesitecolumnwall", new WallBlock(Block.Properties.from(ANDESITE_COLUMN)));
    public static final Block ANDESITE_CUT_WALL = register("andesitecutwall", new WallBlock(Block.Properties.from(ANDESITE_CUT)));
    public static final Block ANDESITE_ENGRAVED_WALL = register("andesiteengravedwall", new WallBlock(Block.Properties.from(ANDESITE_ENGRAVED)));
    public static final Block ANDESITE_PANELS_WALL = register("andesitepanelswall", new WallBlock(Block.Properties.from(ANDESITE_PANELS)));
    public static final Block ANDESITE_PAVERS_WALL = register("andesitepaverswall", new WallBlock(Block.Properties.from(ANDESITE_PAVERS)));
    public static final Block ANDESITE_PILLAR_WALL = register("andesitepillarwall", new WallBlock(Block.Properties.from(ANDESITE_PILLAR)));
    public static final Block ANDESITE_POLISHED_WALL = register("andesitepolishedwall", new WallBlock(Block.Properties.from(ANDESITE_POLISHED)));
    public static final Block ANDESITE_ROUGH_CUT_WALL = register("andesiteroughcutwall", new WallBlock(Block.Properties.from(ANDESITE_ROUGH_CUT)));
    public static final Block ANDESITE_TILED_WALL = register("andesitetiledwall", new WallBlock(Block.Properties.from(ANDESITE_TILED)));

    public static final Block DARK_PRISMARINE_TILED_SLAB = register("darkprismarinetiledslab", new SlabBlock(Block.Properties.from(DARK_PRISMARINE_TILED)));
    public static final Block DIORITE_TILED_SLAB = register("dioritetiledslab", new SlabBlock(Block.Properties.from(DIORITE_TILED)));
    public static final Block END_STONE_TILED_SLAB = register("endstonetiledslab", new SlabBlock(Block.Properties.from(END_STONE_TILED)));
    public static final Block NETHERRACK_TILED_SLAB = register("netherracktiledslab", new SlabBlock(Block.Properties.from(NETHERRACK_TILED)));
    public static final Block OBSIDIAN_TILED_SLAB = register("obsidiantiledslab", new SlabBlock(Block.Properties.from(OBSIDIAN_TILED)));
    public static final Block PRISMARINE_TILED_SLAB = register("prismarinetiledslab", new SlabBlock(Block.Properties.from(PRISMARINE_TILED)));
    public static final Block STONE_CARVED_CREEPER_SLAB = register("stonecarvedcreeperslab", new SlabBlock(Block.Properties.from(STONE_CARVED_CREEPER)));
    public static final Block STONE_CARVED_DERP_SLAB = register("stonecarvedderpslab", new SlabBlock(Block.Properties.from(STONE_CARVED_DERP)));
    public static final Block STONE_CARVED_VILLAGER_SLAB = register("stonecarvedvillagerslab", new SlabBlock(Block.Properties.from(STONE_CARVED_VILLAGER)));
    public static final Block STONE_CARVED_WITHER_SLAB = register("stonecarvedwitherslab", new SlabBlock(Block.Properties.from(STONE_CARVED_WITHER)));
    public static final Block STONE_CARVED_WRITING_SLAB = register("stonecarvedwritingslab", new SlabBlock(Block.Properties.from(STONE_CARVED_WRITING)));
    public static final Block STONE_COLUMN_SLAB = register("stonecolumnslab", new SlabBlock(Block.Properties.from(STONE_COLUMN)));
    public static final Block STONE_CUT_SLAB = register("stonecutslab", new SlabBlock(Block.Properties.from(STONE_CUT)));
    public static final Block STONE_ENGRAVED_SLAB = register("stoneengravedslab", new SlabBlock(Block.Properties.from(STONE_ENGRAVED)));
    public static final Block STONE_PANELS_SLAB = register("stonepanelsslab", new SlabBlock(Block.Properties.from(STONE_PANELS)));
    public static final Block STONE_PAVERS_SLAB = register("stonepaversslab", new SlabBlock(Block.Properties.from(STONE_PAVERS)));
    public static final Block STONE_PILLAR_SLAB = register("stonepillarslab", new SlabBlock(Block.Properties.from(STONE_PILLAR)));
    public static final Block STONE_POLISHED_SLAB = register("stonepolishedslab", new SlabBlock(Block.Properties.from(STONE_POLISHED)));
    public static final Block STONE_ROUGH_CUT_SLAB = register("stoneroughcutslab", new SlabBlock(Block.Properties.from(STONE_ROUGH_CUT)));
    public static final Block STONE_TILED_SLAB = register("stonetiledslab", new SlabBlock(Block.Properties.from(STONE_TILED)));
    public static final Block GRANITE_CARVED_CREEPER_SLAB = register("granitecarvedcreeperslab", new SlabBlock(Block.Properties.from(GRANITE_CARVED_CREEPER)));
    public static final Block GRANITE_CARVED_DERP_SLAB = register("granitecarvedderpslab", new SlabBlock(Block.Properties.from(GRANITE_CARVED_DERP)));
    public static final Block GRANITE_CARVED_VILLAGER_SLAB = register("granitecarvedvillagerslab", new SlabBlock(Block.Properties.from(GRANITE_CARVED_VILLAGER)));
    public static final Block GRANITE_CARVED_WITHER_SLAB = register("granitecarvedwitherslab", new SlabBlock(Block.Properties.from(GRANITE_CARVED_WITHER)));
    public static final Block GRANITE_CARVED_WRITING_SLAB = register("granitecarvedwritingslab", new SlabBlock(Block.Properties.from(GRANITE_CARVED_WRITING)));
    public static final Block GRANITE_COLUMN_SLAB = register("granitecolumnslab", new SlabBlock(Block.Properties.from(GRANITE_COLUMN)));
    public static final Block GRANITE_CUT_SLAB = register("granitecutslab", new SlabBlock(Block.Properties.from(GRANITE_CUT)));
    public static final Block GRANITE_ENGRAVED_SLAB = register("graniteengravedslab", new SlabBlock(Block.Properties.from(GRANITE_ENGRAVED)));
    public static final Block GRANITE_PANELS_SLAB = register("granitepanelsslab", new SlabBlock(Block.Properties.from(GRANITE_PANELS)));
    public static final Block GRANITE_PAVERS_SLAB = register("granitepaversslab", new SlabBlock(Block.Properties.from(GRANITE_PAVERS)));
    public static final Block GRANITE_PILLAR_SLAB = register("granitepillarslab", new SlabBlock(Block.Properties.from(GRANITE_PILLAR)));
    public static final Block GRANITE_POLISHED_SLAB = register("granitepolishedslab", new SlabBlock(Block.Properties.from(GRANITE_POLISHED)));
    public static final Block GRANITE_ROUGH_CUT_SLAB = register("graniteroughcutslab", new SlabBlock(Block.Properties.from(GRANITE_ROUGH_CUT)));
    public static final Block GRANITE_TILED_SLAB = register("granitetiledslab", new SlabBlock(Block.Properties.from(GRANITE_TILED)));
    public static final Block ANDESITE_CARVED_CREEPER_SLAB = register("andesitecarvedcreeperslab", new SlabBlock(Block.Properties.from(ANDESITE_CARVED_CREEPER)));
    public static final Block ANDESITE_CARVED_DERP_SLAB = register("andesitecarvedderpslab", new SlabBlock(Block.Properties.from(ANDESITE_CARVED_DERP)));
    public static final Block ANDESITE_CARVED_VILLAGER_SLAB = register("andesitecarvedvillagerslab", new SlabBlock(Block.Properties.from(ANDESITE_CARVED_VILLAGER)));
    public static final Block ANDESITE_CARVED_WITHER_SLAB = register("andesitecarvedwitherslab", new SlabBlock(Block.Properties.from(ANDESITE_CARVED_WITHER)));
    public static final Block ANDESITE_CARVED_WRITING_SLAB = register("andesitecarvedwritingslab", new SlabBlock(Block.Properties.from(ANDESITE_CARVED_WRITING)));
    public static final Block ANDESITE_COLUMN_SLAB = register("andesitecolumnslab", new SlabBlock(Block.Properties.from(ANDESITE_COLUMN)));
    public static final Block ANDESITE_CUT_SLAB = register("andesitecutslab", new SlabBlock(Block.Properties.from(ANDESITE_CUT)));
    public static final Block ANDESITE_ENGRAVED_SLAB = register("andesiteengravedslab", new SlabBlock(Block.Properties.from(ANDESITE_ENGRAVED)));
    public static final Block ANDESITE_PANELS_SLAB = register("andesitepanelsslab", new SlabBlock(Block.Properties.from(ANDESITE_PANELS)));
    public static final Block ANDESITE_PAVERS_SLAB = register("andesitepaversslab", new SlabBlock(Block.Properties.from(ANDESITE_PAVERS)));
    public static final Block ANDESITE_PILLAR_SLAB = register("andesitepillarslab", new SlabBlock(Block.Properties.from(ANDESITE_PILLAR)));
    public static final Block ANDESITE_POLISHED_SLAB = register("andesitepolishedslab", new SlabBlock(Block.Properties.from(ANDESITE_POLISHED)));
    public static final Block ANDESITE_ROUGH_CUT_SLAB = register("andesiteroughcutslab", new SlabBlock(Block.Properties.from(ANDESITE_ROUGH_CUT)));
    public static final Block ANDESITE_TILED_SLAB = register("andesitetiledslab", new SlabBlock(Block.Properties.from(ANDESITE_TILED)));





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
