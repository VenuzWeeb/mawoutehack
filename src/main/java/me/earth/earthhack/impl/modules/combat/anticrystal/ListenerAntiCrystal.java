package me.earth.earthhack.impl.modules.combat.anticrystal;

import me.earth.earthhack.impl.modules.combat.selftrap.SelfTrap;
import me.earth.earthhack.impl.util.helpers.blocks.ObbyListener;

final class ListenerAntiCrystal extends ObbyListener<AntiCrystal> {
    public ListenerAntiCrystal(AntiCrystal module) {
        super(module, -9);
    }
}
