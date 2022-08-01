package net.kennaye.km.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier STARTGREATSWORD = new ForgeTier(2,400,-3.1f,
            9f,0, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.BRONZE.get()));

    public static final ForgeTier STARTHAMMER = new ForgeTier(2,400,-2.0f,
            5f,0, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.BRONZE.get()));

    public static final ForgeTier STARTSWORD = new ForgeTier(2,400,-2.0f,
            4f,0, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.BRONZE.get()));


    public static final ForgeTier PJ = new ForgeTier(3,650,-1.6f,
            7f,0, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.BRONZE.get()));

}
