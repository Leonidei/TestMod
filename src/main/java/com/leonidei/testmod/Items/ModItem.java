package com.leonidei.testmod.Items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class ModItem {
    public static final Item RUBY = regisretItem("ruby", new Item(new Item.Settings()));

    private static Item regisretItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier("testmod", name), item);
    }
    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RUBY);
        });
    }
}
