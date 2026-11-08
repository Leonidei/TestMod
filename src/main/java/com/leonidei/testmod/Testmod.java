package com.leonidei.testmod;

import net.fabricmc.api.ModInitializer;
import com.leonidei.testmod.Items.ModItem;

public class Testmod implements ModInitializer {

    @Override
    public void onInitialize() {
        ModItem.registerModItems();
    }
}
