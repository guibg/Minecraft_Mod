package net.zabuska.modbom.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zabuska.modbom.ModBom;
import net.zabuska.modbom.item.ModCreativeModeTab;
import net.zabuska.modbom.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModBom.MODID);

    public static final RegistryObject<Block> ZAZA_BLOCK = RegisterBlock("zaza_block",
            () -> new Block(BlockBehaviour.Properties.of(net.minecraft.world.level.material.Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MOD_BOM_TAB);

    public static final RegistryObject<Block> ZAZA_ORE = RegisterBlock("zaza_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(net.minecraft.world.level.material.Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3,7)), ModCreativeModeTab.MOD_BOM_TAB);
    public static final RegistryObject<Block> DEEPSLATE_ZAZA_ORE = RegisterBlock("deepslate_zaza_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(net.minecraft.world.level.material.Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3,7)), ModCreativeModeTab.MOD_BOM_TAB);
    public static final RegistryObject<Block> ENDSTONE_ZAZA_ORE = RegisterBlock("endstone_zaza_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(net.minecraft.world.level.material.Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3,7)), ModCreativeModeTab.MOD_BOM_TAB);
    public static final RegistryObject<Block> NETHERRACK_ZAZA_ORE = RegisterBlock("netherrack_zaza_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(net.minecraft.world.level.material.Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3,7)), ModCreativeModeTab.MOD_BOM_TAB);



    private static <T extends Block> RegistryObject<T> RegisterBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        RegisterBlockItem(name, toReturn, tab);
        return toReturn;
    }
    
    private static <T extends Block> RegistryObject<Item> RegisterBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void Register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
