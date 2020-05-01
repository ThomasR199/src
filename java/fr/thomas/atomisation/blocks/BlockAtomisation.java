package fr.thomas.atomisation.blocks;

import fr.thomas.atomisation.Atomisation;
import fr.thomas.atomisation.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockAtomisation extends Block {

    public BlockAtomisation(String name, Properties properties) {
        super(properties);
        setRegistryName(name);
        ModBlocks.blocks.add(this);
        ModBlocks.blockItems.add((BlockItem) new BlockItem(this,new Item.Properties().group(Atomisation.MFF_GROUP)).setRegistryName(getRegistryName()));
    }
}