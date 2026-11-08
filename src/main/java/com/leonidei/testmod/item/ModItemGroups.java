package com.leonidei.testmod.item;

import com.leonidei.testmod.Testmod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Testmod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItem.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItem.RUBY);
                    }).build());

    public static void registerItemGroups() {
        Testmod.LOGGER.info("Registering Item Groups for " + Testmod.MOD_ID);
    }
}
