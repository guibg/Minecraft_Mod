package net.zabuska.modbom.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zabuska.modbom.ModBom;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModBom.MODID);

    public static final RegistryObject<Item> RAW_ZAZA = ITEMS.register("raw_zaza",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_BOM_TAB)));
    
    public static final RegistryObject<Item> ZAZA = ITEMS.register("zaza",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_BOM_TAB)));
    
    public static void Register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
