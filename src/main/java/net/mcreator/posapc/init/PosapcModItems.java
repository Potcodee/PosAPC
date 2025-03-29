
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.posapc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.posapc.item.TestTubeWithSmeltSandItem;
import net.mcreator.posapc.item.TestTubeWithSandItem;
import net.mcreator.posapc.item.TestTubeItem;
import net.mcreator.posapc.item.SandsotnePickaxeItem;
import net.mcreator.posapc.item.SandPowderItem;
import net.mcreator.posapc.PosapcMod;

public class PosapcModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PosapcMod.MODID);
	public static final RegistryObject<Item> SAND_POWDER = REGISTRY.register("sand_powder", () -> new SandPowderItem());
	public static final RegistryObject<Item> TEST_TUBE = REGISTRY.register("test_tube", () -> new TestTubeItem());
	public static final RegistryObject<Item> TEST_TUBE_WITH_SAND = REGISTRY.register("test_tube_with_sand", () -> new TestTubeWithSandItem());
	public static final RegistryObject<Item> SANDSOTNE_PICKAXE = REGISTRY.register("sandsotne_pickaxe", () -> new SandsotnePickaxeItem());
	public static final RegistryObject<Item> TEST_TUBE_WITH_SMELT_SAND = REGISTRY.register("test_tube_with_smelt_sand", () -> new TestTubeWithSmeltSandItem());
	// Start of user code block custom items
	// End of user code block custom items
}
