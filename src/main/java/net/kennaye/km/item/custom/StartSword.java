package net.kennaye.km.item.custom;

import com.mojang.datafixers.types.Type;
import net.kennaye.km.item.client.StartSwordRenderer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.IItemRenderProperties;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import java.util.function.Consumer;

public class StartSword extends Item implements IAnimatable {
    public AnimationFactory factory = new AnimationFactory(this);


    public StartSword(Properties pProperties){
        super(pProperties);
    }

    @Override
    public void initializeClient(Consumer<IItemRenderProperties> consumer){
        super.initializeClient(consumer);
        consumer.accept(new IItemRenderProperties() {
            private final BlockEntityWithoutLevelRenderer renderer = new StartSwordRenderer();

            @Override
            public BlockEntityWithoutLevelRenderer getItemStackRenderer() {
                return renderer;
            }

        });
    }

    @Override
    public void registerControllers(AnimationData data){
        data.addAnimationController(new AnimationController(this, "controller",
                0,this::predicate));

    }

    private <E extends IAnimatable>PlayState predicate(AnimationEvent<E> event){
        event.getController().setAnimation(new AnimationBuilder().addAnimation("idle",true));

        return PlayState.CONTINUE;
    }


    @Override
    public AnimationFactory getFactory(){
        return this.factory;
    }


}
