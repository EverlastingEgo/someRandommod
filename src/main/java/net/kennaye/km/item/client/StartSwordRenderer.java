package net.kennaye.km.item.client;

import net.kennaye.km.item.custom.StartSword;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class StartSwordRenderer extends GeoItemRenderer<StartSword> {


    public StartSwordRenderer() {
        super(new StartSwordModel());
    }
}
