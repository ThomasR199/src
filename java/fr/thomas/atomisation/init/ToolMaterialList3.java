package fr.thomas.atomisation.init;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum ToolMaterialList3 implements IItemTier {
    obamium3(20.0f,30.0f,-1,3,30,ModItems.obamium);
    private float attackDamage, efficiency;
    private int durability, harvestLevel, enchantability;
    private Item repairMaterial;
    private ToolMaterialList3(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Item repairMaterial){
        this.attackDamage = attackDamage;
        this.efficiency = efficiency;
        this.durability = durability;
        this.harvestLevel = harvestLevel;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getMaxUses() {
        return this.durability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(this.repairMaterial);
    }
}
