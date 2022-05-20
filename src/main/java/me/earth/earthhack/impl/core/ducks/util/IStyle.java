package me.earth.earthhack.impl.core.ducks.util;

import net.minecraft.util.text.event.ClickEvent;

import java.util.function.Supplier;

/**
 * Duck interface for {@link net.minecraft.util.text.Style}.
 */
public interface IStyle {
    ClickEvent getRightClickEvent();

    void setRightClickEvent(ClickEvent event);

    ClickEvent getMiddleClickEvent();

    void setMiddleClickEvent(ClickEvent event);

    void setSuppliedInsertion(Supplier<String> insertion);

    String getRightInsertion();

    void setRightInsertion(Supplier<String> rightInsertion);

    String getMiddleInsertion();

    void setMiddleInsertion(Supplier<String> middleInsertion);

}
