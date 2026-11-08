package com.leonidei.testmod.item;

import com.leonidei.testmod.Testmod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * Класс регистрации предметов мода TestMod.
 *
 * <h3>Архитектурные стандарты Java & Fabric:</h3>
 * <ul>
 *   <li><b>Именование пакетов:</b> В Java имена пакетов всегда пишутся строго строчными
 *       буквами (lowercase), например {@code com.leonidei.testmod.item}, а не {@code Items}.
 *       Это требование спецификации Java (Oracle Code Conventions), чтобы исключить путаницу
 *       между именами классов (PascalCase) и пакетами.</li>
 *   <li><b>Импорты в Java vs C#:</b> В Java отсутствует механизм "глобальных импортов" (в отличие
 *       от директив {@code global using} в C#). Каждый {@code .java} файл обязан самостоятельно
 *       и явно объявлять только те классы, которые он использует (JLS §7.5). Это гарантирует
 *       полную предсказуемость сборщика javac и исключает коллизии классов с одинаковыми именами.</li>
 *   <li><b>Именование констант:</b> Экземпляры статических неизменяемых предметов именуются
 *       в {@code UPPER_SNAKE_CASE} (например, {@link #RUBY}).</li>
 * </ul>
 */
public final class ModItem {

    private ModItem() {
        // Приватный конструктор: утилитный класс реестра не должен инстанциироваться
    }

    /**
     * Рубин — кастомный предмет мода.
     * Создается с базовыми настройками {@link FabricItemSettings}.
     */
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));

    /**
     * Вспомогательный метод для регистрации предмета в ванильном реестре Minecraft.
     *
     * @param name ID предмета (например, "ruby"). В реестре будет зарегистрирован как "testmod:ruby".
     * @param item Экземпляр регистрируемого предмета.
     * @return Зарегистрированный предмет.
     */
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Testmod.MOD_ID, name), item);
    }

    /**
     * Метод инициализации предметов мода.
     * Вызывается из основного класса {@link Testmod#onInitialize()} при старте сервера/клиента.
     * Также добавляет предметы в соответствующие вкладки творческого режима (Creative Tabs).
     */
    public static void registerModItems() {
        Testmod.LOGGER.info("Регистрация предметов мода для {}", Testmod.MOD_ID);

        // Добавляем рубин во вкладку "Ингредиенты" (Ingredients)
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RUBY);
        });
    }
}
