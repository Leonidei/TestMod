package com.leonidei.testmod;

import com.leonidei.testmod.item.ModItem;
import com.leonidei.testmod.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Testmod implements ModInitializer {
    public static final String MOD_ID = "testmod";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric World from {}!", MOD_ID);

        ModItemGroups.registerItemGroups();
        ModItem.registerModItems();
    }
}
