package me.earth.earthhack.impl.core.ducks.network;

public interface ICPacketPlayerDigging {
    boolean isClientSideBreaking();

    void setClientSideBreaking(boolean breaking);

}
