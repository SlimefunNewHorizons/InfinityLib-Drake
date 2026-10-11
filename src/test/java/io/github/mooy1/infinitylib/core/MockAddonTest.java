package io.github.mooy1.infinitylib.core;

/**
 * Escenario que ejecuta el {@code MockAddon} en los tests. Debe ser publico:
 * MockBukkit 4.x genera la subclase proxy en otro classloader y ByteBuddy
 * rechaza tipos de parametro invisibles ("Invisible parameter type").
 */
public enum MockAddonTest {

    BAD_GITHUB_PATH,
    CALL_SUPER,
    THROW_EXCEPTION,
    MISSING_KEY

}
