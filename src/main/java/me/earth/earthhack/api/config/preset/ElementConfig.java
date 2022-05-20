package me.earth.earthhack.api.config.preset;

import me.earth.earthhack.api.config.Config;
import me.earth.earthhack.api.hud.HudElement;
import me.earth.earthhack.api.register.Register;
import me.earth.earthhack.api.util.IdentifiedNameable;

import java.util.ArrayList;
import java.util.List;

public class ElementConfig extends IdentifiedNameable implements Config {

    private List<HudValuePreset> presets = new ArrayList<>();

    public ElementConfig(String name) {
        super(name);
    }

    public static ElementConfig create(String name, Register<HudElement> elements) {
        ElementConfig config = new ElementConfig(name);
        for (HudElement element : elements.getRegistered()) {
            HudValuePreset preset = HudValuePreset.snapshot(name, element);
            config.presets.add(preset);
        }

        return config;
    }

    public List<HudValuePreset> getPresets() {
        return presets;
    }

    public void setPresets(List<HudValuePreset> presets) {
        if (presets != null) {
            this.presets = presets;
        }
    }

    @Override
    public void apply() {
        for (ModulePreset<HudElement> preset : presets) {
            preset.apply();
        }
    }

}
