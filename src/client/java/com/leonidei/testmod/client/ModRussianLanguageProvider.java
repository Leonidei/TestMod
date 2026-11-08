package com.leonidei.testmod.client;

import com.leonidei.testmod.Items.ModItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModRussianLanguageProvider extends FabricLanguageProvider {
    public ModRussianLanguageProvider(FabricDataOutput output) {
        super(output, "ru_ru");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItem.RUBY, "Рубин");
    }
}
