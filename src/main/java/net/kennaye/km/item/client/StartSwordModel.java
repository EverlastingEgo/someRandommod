package net.kennaye.km.item.client;

import net.kennaye.km.KennayeMod;
import net.kennaye.km.item.custom.StartSword;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class StartSwordModel extends AnimatedGeoModel<StartSword> {


    @Override
    public ResourceLocation getModelLocation(StartSword object) {
        return new ResourceLocation(KennayeMod.MOD_ID, "geo/start_sword.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(StartSword object) {
        return new ResourceLocation(KennayeMod.MOD_ID, "textures/item/start_sword.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(StartSword animatable) {
        return new ResourceLocation(KennayeMod.MOD_ID, "animations/start_sword.animation.json");
    }
}
