package io.github.mooy1.infinitylib.core;

import javax.annotation.Nullable;

import org.mockbukkit.mockbukkit.MockBukkit;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;

public class MockAddon extends AbstractAddon {

    private final MockAddonTest test;

    public MockAddon() {
        this(Environment.LIBRARY_TESTING, null);
    }

    public MockAddon(Environment environment, @Nullable MockAddonTest test) {
        super("Mooy1", "InfinityLib",
                test == MockAddonTest.BAD_GITHUB_PATH ? "[!#$" : "master",
                test == MockAddonTest.MISSING_KEY ? "missing" : "auto-update", environment);
        this.test = test;
        MockBukkit.load(Slimefun.class);
    }

    @Override
    protected void load() {
        if (test == MockAddonTest.THROW_EXCEPTION) {
            throw new RuntimeException();
        }
        else if (test == MockAddonTest.CALL_SUPER) {
            super.onLoad();
        }
    }

    @Override
    protected void enable() {
        if (test == MockAddonTest.THROW_EXCEPTION) {
            throw new RuntimeException();
        }
        else if (test == MockAddonTest.CALL_SUPER) {
            super.onEnable();
        }
    }

    @Override
    protected void disable() {
        if (test == MockAddonTest.THROW_EXCEPTION) {
            throw new RuntimeException();
        }
        else if (test == MockAddonTest.CALL_SUPER) {
            super.onDisable();
        }
    }

}
