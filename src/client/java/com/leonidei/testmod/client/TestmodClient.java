package com.leonidei.testmod.client;

import net.fabricmc.api.ClientModInitializer;

/**
 * Клиентская точка входа мода.
 * Выполняется только на физическом клиенте (не вызывается на выделенном сервере).
 */
public class TestmodClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // Инициализация клиентских компонентов (рендереры, экраны, частицы)
    }
}
