package me.earth.earthhack.api.setting;

import com.google.gson.JsonElement;
import me.earth.earthhack.api.config.Jsonable;
import me.earth.earthhack.api.observable.Observable;
import me.earth.earthhack.api.setting.event.SettingEvent;
import me.earth.earthhack.api.setting.event.SettingResult;
import me.earth.earthhack.api.util.interfaces.Nameable;

import java.util.Objects;

// No need for builder pattern as for now, its almost always just 2 parameters.
public abstract class Setting<T> extends Observable<SettingEvent<T>>
        implements Jsonable, Nameable {
    protected final String name;
    protected final T initial;

    protected SettingContainer container;
    protected T value;

    public Setting(String nameIn, T initialValue) {
        this.name = nameIn;
        this.initial = initialValue;
        this.value = initialValue;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public abstract void fromJson(JsonElement element);

    @Override
    public String toJson() {
        return value == null ? "null" : value.toString();
    }

    /**
     * Sets this settings value from String.
     *
     * @param string the string to set the value from.
     * @return true if successful.
     */
    public abstract SettingResult fromString(String string);

    /**
     * Inputs for the command system.
     *
     * @param string command input
     * @return possible inputs.
     */
    public abstract String getInputs(String string);

    public void setValue(T value, boolean withEvent) {
        if (withEvent) {
            SettingEvent<T> event = onChange(new SettingEvent<>(this, value));
            if (!event.isCancelled()) {
                this.value = event.getValue();
            }
        } else {
            this.value = value;
        }
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        setValue(value, true);
    }

    public T getInitial() {
        return initial;
    }

    public void reset() {
        value = initial;
    }

    public SettingContainer getContainer() {
        return container;
    }

    protected void setContainer(SettingContainer container) {
        this.container = container;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj != null && obj.getClass() == this.getClass()) {
            Setting<T> o = (Setting<T>) obj;
            return Objects.equals(o.getName(), this.getName())
                    && Objects.equals(o.getValue(), this.getValue())
                    && Objects.equals(o.getContainer(), this.getContainer())
                    && Objects.equals(o.getInitial(), this.getInitial());
        }

        return false;
    }

}
