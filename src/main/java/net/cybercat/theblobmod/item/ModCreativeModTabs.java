package net.cybercat.theblobmod.item;

import net.cybercat.theblobmod.TheBlobMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheBlobMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> THEBLOB_TAB = CREATIVE_MODE_TABS.register("theblob_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.SLIME_BLOCK))
                    .title(Component.translatable("creativetab.theblob_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Add items into creative tab
                        output.accept(ModItems.BLOBFOOD.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
