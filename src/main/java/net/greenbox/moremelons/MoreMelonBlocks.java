package net.greenbox.moremelons;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.greenbox.moremelons.crop.DirtMelonCrop;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MoreMelonBlocks {

    public static final Block DIRT_MELON_CROP = registerBlockWithoutItem("dirt_melon_crop", new DirtMelonCrop(FabricBlockSettings.copyOf(Blocks.MELON_STEM)));

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(MoreMelonsMod.MODID, name), block);
    }

    public static void load() {
    }

}
