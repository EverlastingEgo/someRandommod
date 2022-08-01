package net.kennaye.km.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties RAW_TIGER_MEAT = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.2f)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).meat().build();

    public static final FoodProperties COOKED_TIGER_MEAT = (new FoodProperties.Builder()).nutrition(9).saturationMod(0.8f).meat().build();
}
