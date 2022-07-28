package net.kennaye.km.block;

import net.kennaye.km.KennayeMod;
import net.kennaye.km.item.ModCreativeModeTab;
import net.kennaye.km.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, KennayeMod.MOD_ID);


    //Blocks
    public static final RegistryObject<Block> CARBON_ORE = registerBlock("carbon_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3F).requiresCorrectToolForDrops()), ModCreativeModeTab.KENNAYE_TAB);

    public static final RegistryObject<Block> CARBON_BLOCK = registerBlock("carbon_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6.2F).requiresCorrectToolForDrops()), ModCreativeModeTab.KENNAYE_TAB);


    public static final RegistryObject<Block> BRONZE_ORE = registerBlock("bronze_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4F).requiresCorrectToolForDrops()), ModCreativeModeTab.KENNAYE_TAB);

    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9F).requiresCorrectToolForDrops()), ModCreativeModeTab.KENNAYE_TAB);









    private static <T extends Block> RegistryObject<T>registerBlock(String name, Supplier<T> block, CreativeModeTab tab){

        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item>registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab){

        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));

    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }


}
