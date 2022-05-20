package me.earth.earthhack.impl.core.ducks.entity;

/**
 * Duck interface for {@link net.minecraft.client.entity.EntityPlayerSP}.
 */
public interface IEntityPlayerSP {
    double getLastReportedX();

    double getLastReportedY();

    double getLastReportedZ();

    float getLastReportedYaw();

    void setLastReportedYaw(float yaw);

    float getLastReportedPitch();

    void setLastReportedPitch(float pitch);

    boolean getLastOnGround();

    int getPositionUpdateTicks();

    void superUpdate();

    void invokeUpdateWalkingPlayer();

    void setHorseJumpPower(float jumpPower);

}
