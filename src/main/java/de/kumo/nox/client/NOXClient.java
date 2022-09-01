package de.kumo.nox.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

@Environment(EnvType.CLIENT)
public class NOXClient implements ClientModInitializer {
     /* Declare and initialize our custom block instance.
       We set our block material to `METAL`, which requires a pickaxe to efficiently break.

       `strength` sets both the hardness and the resistance of a block to the same value.
       Hardness determines how long the block takes to break, and resistance determines how strong the block is against blast damage (e.g. explosions).
       Stone has a hardness of 1.5f and a resistance of 6.0f, while Obsidian has a hardness of 50.0f and a resistance of 1200.0f.

       You can find the stats of all vanilla blocks in the class `Blocks`, where you can also reference other blocks.
    */

    public static final Block NOX_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));

    @Override
    public void onInitializeClient() {
        Registry.register(Registry.BLOCK, new Identifier("NOX_BLOCK", "example_block"), NOX_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("NOX_BLOCK", "example_block"), new BlockItem(NOX_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
    }
}