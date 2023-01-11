package net.greenbox.moremelons;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MoreMelonsItems {

    public static final Item DIRT_MELON_SEEDS = registrItem("dirt_melon_seeds",
            new AliasedBlockItem(MoreMelonBlocks.DIRT_MELON_CROP, new FabricItemSettings()));

    public static final Item DIRT_MELON_SLICE = registrItem("dirt_melon_slice",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(2f).build())));

    private static Item registrItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoreMelonsMod.MODID, name), item);
    }
    public static void load() {
    }
}
