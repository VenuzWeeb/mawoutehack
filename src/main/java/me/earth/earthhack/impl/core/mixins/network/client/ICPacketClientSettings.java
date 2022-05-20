package me.earth.earthhack.impl.core.mixins.network.client;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.client.CPacketClientSettings;
import net.minecraft.util.EnumHandSide;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(CPacketClientSettings.class)
public interface ICPacketClientSettings {
    @Accessor("lang")
    String getLang();

    @Accessor("lang")
    void setLang(String lang);

    @Accessor("view")
    int getView();

    @Accessor("view")
    void setView(int view);

    @Accessor("chatVisibility")
    EntityPlayer.EnumChatVisibility getChatVisibility();

    @Accessor("chatVisibility")
    void setChatVisibility(EntityPlayer.EnumChatVisibility chatVisibility);

    @Accessor("enableColors")
    boolean getEnableColors();

    @Accessor("enableColors")
    void setEnableColors(boolean enableColors);

    @Accessor("modelPartFlags")
    int getModelPartFlags();

    @Accessor("modelPartFlags")
    void setModelPartFlags(int modelPartFlags);

    @Accessor("mainHand")
    EnumHandSide getMainHand();

    @Accessor("mainHand")
    void setMainHand(EnumHandSide mainHand);

}
