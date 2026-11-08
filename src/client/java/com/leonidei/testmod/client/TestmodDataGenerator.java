package com.leonidei.testmod.client;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

/**
 * Точка входа генератора данных (Fabric Data Generator).
 * Регистрирует все провайдеры ресурсов для автоматической сборки ассетов.
 */
public class TestmodDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModEnglishLanguageProvider::new);
        pack.addProvider(ModRussianLanguageProvider::new);
    }
}
