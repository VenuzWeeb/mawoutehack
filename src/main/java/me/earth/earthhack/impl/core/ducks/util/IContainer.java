package me.earth.earthhack.impl.core.ducks.util;

/**
 * Duck interface for {@link net.minecraft.inventory.Container}.
 */
public interface IContainer {

    short getTransactionID();

    void setTransactionID(short id);

}
