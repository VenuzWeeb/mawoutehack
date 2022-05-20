package me.earth.earthhack.impl.modules.combat.feetobby;

import me.earth.earthhack.impl.util.helpers.blocks.data.ObbyData;

final class FeetObbyData extends ObbyData<FeetObby> {
    public FeetObbyData(FeetObby module) {
        super(module);
        register(module.antiSelfobby, "hace q no te targetee a vo el modulo.");
        register(module.target, "-Closest va a targetear al mas cercano." +
                "\n-Untrapped targetea al mas cercano q no tenga ya obby en los pies (useless).");
        register(module.targetRange,
                "Rango en el q los jugadores seran targeteados.");
    }

    @Override
    public String getDescription() {
        return "ponle obby en las patas a los papus.";
    }

}
