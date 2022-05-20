package me.earth.earthhack.api.event.bus.api;

public interface ICancellable {
    boolean isCancelled();

    void setCancelled(boolean cancelled);

}
