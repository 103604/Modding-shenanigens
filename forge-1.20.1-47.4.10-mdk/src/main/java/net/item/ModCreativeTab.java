package net.item;

import net.ruben.tutorialmod.TutorialMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> Creative_Mode_Tabs =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, net.ruben.tutorialmod.TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TutorialMod_TAB = Creative_Mode_Tabs.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.SAPPHIRE.get()))
            .title(Component.translatable("creativetab.tutorial_tab"))
            .displayItems((pParameters, pOutput) ->{
                pOutput.accept(Moditems.SAPPHIRE.get());
                pOutput.accept(Moditems.RAW_SAPHHIRE.get());
            })
            .build());
    public static void register(IEventBus eventBus){
        Creative_Mode_Tabs.register(eventBus);
    }
}
