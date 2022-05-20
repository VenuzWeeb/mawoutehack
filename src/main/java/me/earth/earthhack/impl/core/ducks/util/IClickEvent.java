package me.earth.earthhack.impl.core.ducks.util;

/**
 * Duck interface for {@link net.minecraft.util.text.event.ClickEvent}.
 */
public interface IClickEvent {

    Runnable getRunnable();

    void setRunnable(Runnable runnable);

}
