package com.leonidei.testmod.client;

import com.leonidei.testmod.item.ModItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

/**
 * Провайдер генерации JSON-моделей предметов и блоков мода (Fabric Data Generation).
 *
 * <p>Позволяет автоматически компилировать файлы моделей (например, {@code ruby.json})
 * без ручного написания boilerplate JSON-кода.</p>
 */
public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // Заглушка для будущих блоков мода
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Генерирует стандартную 2D-модель предмета на основе текстуры
        itemModelGenerator.register(ModItem.RUBY, Models.GENERATED);
    }
}
