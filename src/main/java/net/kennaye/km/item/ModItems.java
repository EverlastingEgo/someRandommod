package net.kennaye.km.item;

import net.kennaye.km.KennayeMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KennayeMod.MOD_ID);


    public static final RegistryObject<Item> BRONZE = ITEMS.register("bronze",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));







    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);


    }
}
