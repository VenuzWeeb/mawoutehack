package me.earth.earthhack.impl.modules.player.automine.util;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;

import java.util.concurrent.Future;

public interface IAutomine {
    // TODO: use for terrain calc?
    boolean isValid(IBlockState state);

    void offer(IConstellation constellation);

    void attackPos(BlockPos pos);

    BlockPos getCurrent();

    void setCurrent(BlockPos pos);

    void setFuture(Future<?> future);

    float getMinDmg();

    float getMaxSelfDmg();

    double getBreakTrace();

    boolean getNewVEntities();

    boolean shouldMineObby();

    boolean isSuicide();

    boolean canBigCalcsBeImproved();

}
