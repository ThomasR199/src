package fr.thomas.atomisation.items;

import fr.thomas.atomisation.Atomisation;
import fr.thomas.atomisation.init.ModItems;
import net.minecraft.item.Item;

public class ItemAtomisation extends Item {
    public ItemAtomisation(String name) {
        super(new Properties().group(Atomisation.MFF_GROUP));
        setRegistryName(name);
        ModItems.items.add(this);
    }
}
