package net.kennaye.km.event.client;

import net.kennaye.km.KennayeMod;
import net.kennaye.km.entity.client.Rogue1ArmorRenderer;
import net.kennaye.km.item.armor.rogue.Rogue1ArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = KennayeMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {

    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(Rogue1ArmorItem.class, new Rogue1ArmorRenderer());
    }


}
