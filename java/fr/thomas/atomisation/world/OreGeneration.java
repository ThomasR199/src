package fr.thomas.atomisation.world;

import fr.thomas.atomisation.init.ModBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

public class OreGeneration {
    public static void setupOreGeneration(){
        for(Biome biome : ForgeRegistries.BIOMES){
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    Biome.createDecoratedFeature(Feature.ORE,
                            new OreFeatureConfig(
                                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                    ModBlocks.radioactive_ore.getDefaultState(),5), Placement.COUNT_RANGE,
                            new CountRangeConfig(5,0,0,60)));
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    Biome.createDecoratedFeature(Feature.ORE,
                            new OreFeatureConfig(
                                    OreFeatureConfig.FillerBlockType.NETHERRACK,
                                    ModBlocks.radioactive_ore.getDefaultState(),5),Placement.COUNT_RANGE,
                            new CountRangeConfig(5,0,0,128)));
        }
        for (Biome biome : ForgeRegistries.BIOMES){
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    Biome.createDecoratedFeature(Feature.ORE,
                            new OreFeatureConfig(
                                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                    ModBlocks.quark_up_ore.getDefaultState(),5), Placement.COUNT_RANGE,
                            new CountRangeConfig(5,0,0,60)));
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    Biome.createDecoratedFeature(Feature.ORE,
                            new OreFeatureConfig(
                                    OreFeatureConfig.FillerBlockType.NETHERRACK,
                                    ModBlocks.quark_up_ore.getDefaultState(),5), Placement.COUNT_RANGE,
                            new CountRangeConfig(5,0,0,128)));
        }
        for (Biome biome : ForgeRegistries.BIOMES){
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    Biome.createDecoratedFeature(Feature.ORE,
                            new OreFeatureConfig(
                                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                    ModBlocks.quark_down_ore.getDefaultState(),5), Placement.COUNT_RANGE,
                            new CountRangeConfig(5,0,0,60)));
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    Biome.createDecoratedFeature(Feature.ORE,
                            new OreFeatureConfig(
                                    OreFeatureConfig.FillerBlockType.NETHERRACK,
                                    ModBlocks.quark_down_ore.getDefaultState(),5), Placement.COUNT_RANGE,
                            new CountRangeConfig(5,0,0,128)));
        }
        for (Biome biome : ForgeRegistries.BIOMES){
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    Biome.createDecoratedFeature(Feature.ORE,
                            new OreFeatureConfig(
                                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                    ModBlocks.electron_ore.getDefaultState(),5), Placement.COUNT_RANGE,
                            new CountRangeConfig(5,0,0,60)));
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    Biome.createDecoratedFeature(Feature.ORE,
                            new OreFeatureConfig(
                                    OreFeatureConfig.FillerBlockType.NETHERRACK,
                                    ModBlocks.electron_ore.getDefaultState(),5), Placement.COUNT_RANGE,
                            new CountRangeConfig(5,0,0,128)));
        }
    }
}
