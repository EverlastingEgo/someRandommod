package net.kennaye.km.item;

import net.kennaye.km.KennayeMod;
import net.kennaye.km.item.custom.StartSword;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KennayeMod.MOD_ID);


    //Resources
    public static final RegistryObject<Item> RAW_CARBON = ITEMS.register("raw_carbon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));

    public static final RegistryObject<Item> CARBON = ITEMS.register("carbon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));

    public static final RegistryObject<Item> RAW_BRONZE = ITEMS.register("raw_bronze",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));
    public static final RegistryObject<Item> BRONZE = ITEMS.register("bronze",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));

    //public static final RegistryObject<Item> START_SWORD = ITEMS.register("start_sword",
            //() -> new StartSword(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));


    //Starter Weapons
    public static final RegistryObject<Item> GREAT_SWORD = ITEMS.register("great_sword",
            () -> new SwordItem(ModTiers.STARTGREATSWORD,2,-3.1f,
                    new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));

    public static final RegistryObject<Item> START_HAMMER = ITEMS.register("start_hammer",
            () -> new SwordItem(ModTiers.STARTHAMMER,2,-2.0f,
                    new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));
    public static final RegistryObject<Item> START_SWORD = ITEMS.register("start_sword",
            () -> new SwordItem(ModTiers.STARTSWORD,2,-1.5f,
                    new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));







    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);


    }
}
