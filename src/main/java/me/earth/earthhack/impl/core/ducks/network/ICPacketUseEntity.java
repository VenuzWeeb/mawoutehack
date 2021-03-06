package me.earth.earthhack.impl.core.ducks.network;

import net.minecraft.entity.Entity;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;

/**
 * Duck Interface for {@link CPacketUseEntity}.
 */
public interface ICPacketUseEntity {
    void setEntityId(int entityId);

    void setVec(Vec3d vec3d);

    int getEntityID();

    CPacketUseEntity.Action getAction();

    void setAction(CPacketUseEntity.Action action);

    Vec3d getHitVec();

    EnumHand getHand();

    void setHand(EnumHand hand);

    Entity getAttackedEntity();

}
