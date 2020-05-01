package fr.thomas.atomisation.init;

import com.google.common.collect.Lists;
import fr.thomas.atomisation.Atomisation;
import fr.thomas.atomisation.blocks.BlockAtomisation;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = Atomisation.MODID)
public class ModBlocks {
    public static final ModBlocks INSTANCE = new ModBlocks();
    public static List<Block> blocks;
    public static List<BlockItem> blockItems;
    public static Block electron_ore;
    public static Block fusionner;
    public static Block quark_up_ore;
    public static Block quark_up_block;
    public static Block quark_down_ore;
    public static Block quark_down_block;
    public static Block radioactive_ore;
    public static Block radioactive_block;
    private static void init(){
        blocks = Lists.newArrayList();
        blockItems = Lists.newArrayList();
        }
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        init();
        event.getRegistry().registerAll(
            electron_ore = new BlockAtomisation("electron_ore", Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(3f,15f).harvestTool(ToolType.PICKAXE).harvestLevel(3)),
            fusionner = new BlockAtomisation("fusionner", Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.5f,2.5f).harvestTool(ToolType.AXE).harvestLevel(3)),
            quark_up_ore = new BlockAtomisation("quark_up_ore", Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(3f,15f).harvestTool(ToolType.PICKAXE).harvestLevel(3)),
            quark_up_block = new BlockAtomisation("quark_up_block", Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5f,30f).harvestTool(ToolType.PICKAXE).harvestLevel(3)),
            quark_down_ore = new BlockAtomisation("quark_down_ore", Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(3f,15f).harvestTool(ToolType.PICKAXE).harvestLevel(3)),
            quark_down_block = new BlockAtomisation("quark_down_block", Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5f,30f).harvestTool(ToolType.PICKAXE).harvestLevel(3)),
            radioactive_ore = new BlockAtomisation("radioactive_ore", Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(3f,15f).harvestTool(ToolType.PICKAXE).harvestLevel(3).lightValue(8)),
            radioactive_block = new BlockAtomisation("radioactive_block", Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5f,30f).harvestTool(ToolType.PICKAXE).harvestLevel(3).lightValue(15))
        );
    }
    @SubscribeEvent
    public static void registerBlockItems(RegistryEvent.Register<Item> event){
        for(BlockItem bi : blockItems){
            event.getRegistry().register(bi);
        }
    }
}
