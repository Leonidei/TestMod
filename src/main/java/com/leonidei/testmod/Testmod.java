package com.leonidei.testmod;

import net.fabricmc.api.ModInitializer;
import com.leonidei.testmod.Items.ModItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Testmod implements ModInitializer {
    public static final String MOD_ID = "testmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hell Fabric World!");
        ModItem.registerModItems();
    }
}
