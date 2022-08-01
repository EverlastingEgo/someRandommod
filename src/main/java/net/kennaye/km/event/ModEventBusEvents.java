package net.kennaye.km.event;

import net.kennaye.km.KennayeMod;
import net.kennaye.km.entity.ModEntityTypes;
import net.kennaye.km.entity.custom.TigerEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = KennayeMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.TIGER.get(), TigerEntity.setAttributes());
    }

}
