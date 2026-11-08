package com.leonidei.testmod.Items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import com.leonidei.testmod.Testmod;

public class ModItem {
    public static final Item RUBY = regisretItem("ruby", new Item(new FabricItemSettings()));

    private static Item regisretItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Testmod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Testmod.LOGGER.info("Register Mod Items for " + Testmod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RUBY);
        });
    }
}
