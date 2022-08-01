package net.kennaye.km.item;

import net.kennaye.km.KennayeMod;
import net.kennaye.km.entity.ModEntityTypes;
import net.kennaye.km.item.armor.rogue.Rogue1ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
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


        //Bronze
        public static final RegistryObject<Item> RAW_BRONZE = ITEMS.register("raw_bronze",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));
        public static final RegistryObject<Item> BRONZE = ITEMS.register("bronze",
             () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));

        //Steel
        public static final RegistryObject<Item> RAW_STEEL = ITEMS.register("raw_steel",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));
        public static final RegistryObject<Item> STEEL = ITEMS.register("steel",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));

        //Cobalt
        public static final RegistryObject<Item> RAW_COBALT = ITEMS.register("raw_cobalt",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));
        public static final RegistryObject<Item> COBALT = ITEMS.register("cobalt",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));

        //Purple Jasper
        public static final RegistryObject<Item> RAW_PURPLE_JASPER = ITEMS.register("raw_purple_jasper",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));
        public static final RegistryObject<Item> PURPLE_JASPER = ITEMS.register("purple_jasper",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));



    //Crafting Materials

        //Tools
        public static final RegistryObject<Item> TOOL_HANDLE = ITEMS.register("tool_handle",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB).stacksTo(24)));

        public static final RegistryObject<Item> BINDING = ITEMS.register("binding",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));






    //Tools

        //Crafting
        public static final RegistryObject<Item> ANVIL_HAMMER_IRON = ITEMS.register("anvil_hammer_iron",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB).stacksTo(1).durability(42)));

        public static final RegistryObject<Item> ANVIL_HAMMER_BRONZE = ITEMS.register("anvil_hammer_bronze",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB).stacksTo(1).durability(56)));

        public static final RegistryObject<Item> ANVIL_HAMMER_STEEL = ITEMS.register("anvil_hammer_steel",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB).stacksTo(1).durability(75)));

        public static final RegistryObject<Item> ANVIL_HAMMER_DIAMOND = ITEMS.register("anvil_hammer_diamond",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB).stacksTo(1).durability(85)));

        public static final RegistryObject<Item> ANVIL_HAMMER_COBALT = ITEMS.register("anvil_hammer_cobalt",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB).stacksTo(1).durability(100)));






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






    // Weapons


    public static final RegistryObject<Item> PJ_SWORD = ITEMS.register("pj_sword",
            () -> new SwordItem(ModTiers.PJ,2,-1.5f,
                    new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));










    //Class Armor


    //Rogue

    public static final RegistryObject<Item> ROGUE_ARMOR1_HELMET = ITEMS.register("rogue_armor1_helmet",
            () -> new Rogue1ArmorItem(ModArmorMaterials.ROUGE1, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));

    public static final RegistryObject<Item> ROGUE_ARMOR1_BODY = ITEMS.register("rogue_armor1_body",
            () -> new Rogue1ArmorItem(ModArmorMaterials.ROUGE1, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));

    public static final RegistryObject<Item> ROGUE_ARMOR1_LEGS = ITEMS.register("rogue_armor1_legs",
            () -> new Rogue1ArmorItem(ModArmorMaterials.ROUGE1, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));

    public static final RegistryObject<Item> ROGUE_ARMOR1_FEET = ITEMS.register("rogue_armor1_feet",
            () -> new Rogue1ArmorItem(ModArmorMaterials.ROUGE1, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));




















    //Mob Stuff

        //Spawn Eggs

            public static final RegistryObject<Item> TIGER_SPAWN_EGG = ITEMS.register("tiger_spawn_egg",
                    () -> new ForgeSpawnEggItem(ModEntityTypes.TIGER,0xEE7802, 0x2B2B2B,
                            new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));


        //Drops


            public static final RegistryObject<Item> RAW_TIGER_MEAT = ITEMS.register("raw_tiger_meat",
                    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB).stacksTo(16).food(ModFoods.RAW_TIGER_MEAT)));

            public static final RegistryObject<Item> COOKED_TIGER_MEAT = ITEMS.register("cooked_tiger_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB).stacksTo(16).food(ModFoods.RAW_TIGER_MEAT)));

            public static final RegistryObject<Item> HIDE = ITEMS.register("hide",
                    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENNAYE_TAB)));



        //Tamming / Feeds






        //Armors / Saddles


















    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);


    }
}
