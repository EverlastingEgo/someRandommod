package net.kennaye.km.entity.client;

import net.kennaye.km.KennayeMod;
import net.kennaye.km.item.armor.rogue.Rogue1ArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class Rogue1ArmorModel extends AnimatedGeoModel<Rogue1ArmorItem> {


    @Override
    public ResourceLocation getModelLocation(Rogue1ArmorItem object) {
        return new ResourceLocation(KennayeMod.MOD_ID, "geo/rogue_armor1.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Rogue1ArmorItem object) {
        return new ResourceLocation(KennayeMod.MOD_ID, "textures/models/armor/rogue_armor1.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Rogue1ArmorItem animatable) {
        return new ResourceLocation(KennayeMod.MOD_ID, "animations/armor_animation.json");
    }
}
