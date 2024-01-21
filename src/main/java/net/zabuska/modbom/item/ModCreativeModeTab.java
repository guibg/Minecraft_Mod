package net.zabuska.modbom.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MOD_BOM_TAB = new CreativeModeTab("modbom") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_ZAZA.get());
        }
    };
}
