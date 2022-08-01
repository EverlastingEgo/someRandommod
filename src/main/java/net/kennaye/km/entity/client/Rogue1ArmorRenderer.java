package net.kennaye.km.entity.client;

import net.kennaye.km.item.armor.rogue.Rogue1ArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class Rogue1ArmorRenderer extends GeoArmorRenderer<Rogue1ArmorItem> {


    public Rogue1ArmorRenderer() {
        super(new Rogue1ArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";

    }


}
