package me.earth.earthhack.impl;

import me.earth.earthhack.api.util.interfaces.Globals;
import me.earth.earthhack.impl.core.ducks.IMinecraft;
import me.earth.earthhack.impl.managers.Managers;
import me.earth.earthhack.impl.managers.thread.GlobalExecutor;
import me.earth.earthhack.impl.util.math.geocache.Sphere;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;

public class Chulohack implements Globals {
    public static final String NAME = "Chulohack";
    public static final String VERSION = "1.0.0";
    private static final Logger LOGGER = LogManager.getLogger("ChuloHackKingHackMawoute");

    public static void preInit() {
        GlobalExecutor.EXECUTOR.submit(() -> Sphere.cacheSphere(LOGGER));
    }

    public static void init() {
        LOGGER.info("\n\nInitializing MawouteClient.");
        Display.setTitle(NAME + " - " + VERSION);
        Managers.load();
        LOGGER.info("\nMawoute initialized.\n");
    }

    public static void postInit() {
        // For Plugins if they need it.
    }

    public static Logger getLogger() {
        return LOGGER;
    }

    public static boolean isRunning() {
        return ((IMinecraft) mc).isEarthhackRunning();
    }

}