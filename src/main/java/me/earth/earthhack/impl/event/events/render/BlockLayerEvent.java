package me.earth.earthhack.impl.event.events.render;

import net.minecraft.block.Block;
import net.minecraft.util.BlockRenderLayer;

public class BlockLayerEvent {
    private final Block block;
    private BlockRenderLayer layer = null;

    public BlockLayerEvent(Block block) {
        this.block = block;
    }

    public BlockRenderLayer getLayer() {
        return this.layer;
    }

    public void setLayer(BlockRenderLayer layer) {
        this.layer = layer;
    }

    public Block getBlock() {
        return block;
    }

}
