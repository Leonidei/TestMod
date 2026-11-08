package com.leonidei.testmod;

import com.leonidei.testmod.item.ModItem;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Главная точка входа мода TestMod.
 *
 * <h3>Архитектурные особенности Fabric ModInitializer:</h3>
 * <ul>
 *   <li>Интерфейс {@link ModInitializer} объявляется в {@code fabric.mod.json} как общая точка
 *       входа ("main"), которая выполняется как на логическом сервере, так и на клиенте.</li>
 *   <li><b>Логирование SLF4J:</b> Рекомендуется использовать параметризованный логгер вместо конкатенации
 *       строк (например, {@code LOGGER.info("Загрузка: {}", MOD_ID);}), так как это снижает нагрузку на сборщик мусора.</li>
 * </ul>
 */
public class Testmod implements ModInitializer {

    /**
     * Уникальный строковый идентификатор мода (Namespace).
     * Должен совпадать со значением "id" в {@code fabric.mod.json} и содержать только строчные символы и дефисы/подчеркивания.
     */
    public static final String MOD_ID = "testmod";

    /**
     * Центральный логгер мода на базе SLF4J.
     */
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    /**
     * Основной метод жизненного цикла, вызываемый Fabric Loader при инициализации мода.
     */
    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric World from {}!", MOD_ID);

        // Регистрация кастомных предметов мода
        ModItem.registerModItems();
    }
}
