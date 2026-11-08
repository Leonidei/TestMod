package com.leonidei.testmod.client;

import com.leonidei.testmod.item.ModItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

/**
 * Провайдер генерации локализации для английского языка (en_us).
 */
public class ModEnglishLanguageProvider extends FabricLanguageProvider {

    public ModEnglishLanguageProvider(FabricDataOutput output) {
        super(output, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItem.RUBY, "Ruby");
        translationBuilder.add("itemgroup.ruby", "Ruby Group");
    }
}
