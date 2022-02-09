package net.Nephty.FoodSupplyMod.item;

import net.Nephty.FoodSupplyMod.FoodSupplyMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.Nephty.FoodSupplyMod.FoodSupplyMod.MODID;

public class ModItem {

    public static final Item BANANA = registerItem("banana", new Item(
            new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(3).saturationModifier(1f).build()).group(ItemGroup.FOOD)));
    public static final Item STRAWBERRY = registerItem("strawberry", new Item(
            new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(1).saturationModifier(0.2f).build()).group(ItemGroup.FOOD)));
    public static final Item PEAR = registerItem("pear", new Item(
            new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()).group(ItemGroup.FOOD)));
    public static final Item ORANGE = registerItem("orange", new Item(
            new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()).group(ItemGroup.FOOD)));
    public static final Item APRICOT = registerItem("apricot", new Item(
            new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()).group(ItemGroup.FOOD)));
    public static final Item LEMON = registerItem("lemon", new Item(
            new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()).group(ItemGroup.FOOD)));
    public static final Item CHERRY = registerItem("cherry", new Item(
            new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(1).saturationModifier(0.2f).build()).group(ItemGroup.FOOD)));
    public static final Item GRAPES = registerItem("grapes", new Item(
            new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).build()).group(ItemGroup.FOOD)));
    public static final Item PEACH = registerItem("peach", new Item(
            new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()).group(ItemGroup.FOOD)));
    public static final Item PINEAPPLE = registerItem("pineapple", new Item(
            new FabricItemSettings().group(ItemGroup.FOOD)));
    public static final Item PINEAPPLE_SLICE = registerItem("pineapple_slice", new Item(
            new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()).group(ItemGroup.FOOD)));
    public static final Item MANGO = registerItem("mango", new Item(
            new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(3).saturationModifier(0.8f).build()).group(ItemGroup.FOOD)));
    public static final Item CANTALOUPE = registerItem("cantaloupe", new Item(
            new FabricItemSettings().group(ItemGroup.FOOD)));
    public static final Item CANTALOUPE_SLICE = registerItem("cantaloupe_slice", new Item(
            new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()).group(ItemGroup.FOOD)));
    public static final Item COCONUT = registerItem("coconut", new Item(
            new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(3).saturationModifier(1.5f).build()).group(ItemGroup.FOOD)));
    public static final Item TOMATO = registerItem("tomato", new Item(
            new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()).group(ItemGroup.FOOD)));

    // Use this method in the code
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FoodSupplyMod.MODID, name), item);
    }

    // Call this once
    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + MODID);
    }
}
