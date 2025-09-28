package dev.ramyette.geekmod;

import java.util.function.Function;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GEEKBAR = register("geekbar", (settings) -> new GeekbarItem(settings), new Item.Settings());

    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        // Create the item key
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GeekMod.MOD_ID, name));
        
        // Create the item instance
        Item item = itemFactory.apply(settings);

        // Register the item
        Registry.register(Registries.ITEM, itemKey, item);
        
        return item;
    }

    public static void initialize() {}
}
