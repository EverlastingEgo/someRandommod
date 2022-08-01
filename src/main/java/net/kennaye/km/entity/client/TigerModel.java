package net.kennaye.km.entity.client;

import net.kennaye.km.KennayeMod;
import net.kennaye.km.entity.custom.TigerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class TigerModel extends AnimatedGeoModel<TigerEntity> {

    @Override
    public ResourceLocation getModelLocation(TigerEntity object) {
        return new ResourceLocation(KennayeMod.MOD_ID, "geo/tiger_base.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(TigerEntity object) {
        return new ResourceLocation(KennayeMod.MOD_ID, "texture/textures/entity/tiger_base.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(TigerEntity animatable) {
        return new ResourceLocation(KennayeMod.MOD_ID, "animations/tiger.animation.json");
    }
/*
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(TigerEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("tiger.json");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }


     */
}
