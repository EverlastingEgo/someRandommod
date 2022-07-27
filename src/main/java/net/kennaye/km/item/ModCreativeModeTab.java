package net.kennaye.km.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MinecartItem;

public class ModCreativeModeTab {

    public static final CreativeModeTab KENNAYE_TAB = new CreativeModeTab("kennayetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BRONZE.get());
        }
    };
}
