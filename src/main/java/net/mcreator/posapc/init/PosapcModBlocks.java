
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.posapc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.posapc.block.SandCobblestoneBlock;
import net.mcreator.posapc.block.GrapchicsCardTableBlock;
import net.mcreator.posapc.block.CursedSandstoneBlock;
import net.mcreator.posapc.block.CoreBlockBlock;
import net.mcreator.posapc.PosapcMod;

public class PosapcModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PosapcMod.MODID);
	public static final RegistryObject<Block> CURSED_COBBLESTONE = REGISTRY.register("cursed_cobblestone", () -> new CursedSandstoneBlock());
	public static final RegistryObject<Block> CORE_BLOCK = REGISTRY.register("core_block", () -> new CoreBlockBlock());
	public static final RegistryObject<Block> SAND_COBBLESTONE = REGISTRY.register("sand_cobblestone", () -> new SandCobblestoneBlock());
	public static final RegistryObject<Block> GRAPCHICS_CARD_TABLE = REGISTRY.register("grapchics_card_table", () -> new GrapchicsCardTableBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
