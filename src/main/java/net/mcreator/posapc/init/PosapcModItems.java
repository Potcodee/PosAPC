
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.posapc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.mcreator.posapc.procedures.GrapchicsCardZnachieniieSvoistvaProcedure;
import net.mcreator.posapc.item.TestTubeWithSmeltSandItem;
import net.mcreator.posapc.item.TestTubeWithSandItem;
import net.mcreator.posapc.item.TestTubeItem;
import net.mcreator.posapc.item.SandsotnePickaxeItem;
import net.mcreator.posapc.item.SandPowderItem;
import net.mcreator.posapc.item.MaybeyoullgetluckyItem;
import net.mcreator.posapc.item.LensItem;
import net.mcreator.posapc.item.GrapchicsCardItem;
import net.mcreator.posapc.PosapcMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PosapcModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PosapcMod.MODID);
	public static final RegistryObject<Item> SAND_POWDER = REGISTRY.register("sand_powder", () -> new SandPowderItem());
	public static final RegistryObject<Item> TEST_TUBE = REGISTRY.register("test_tube", () -> new TestTubeItem());
	public static final RegistryObject<Item> TEST_TUBE_WITH_SAND = REGISTRY.register("test_tube_with_sand", () -> new TestTubeWithSandItem());
	public static final RegistryObject<Item> SANDSOTNE_PICKAXE = REGISTRY.register("sandsotne_pickaxe", () -> new SandsotnePickaxeItem());
	public static final RegistryObject<Item> TEST_TUBE_WITH_SMELT_SAND = REGISTRY.register("test_tube_with_smelt_sand", () -> new TestTubeWithSmeltSandItem());
	public static final RegistryObject<Item> MAYBEYOULLGETLUCKY = REGISTRY.register("maybeyoullgetlucky", () -> new MaybeyoullgetluckyItem());
	public static final RegistryObject<Item> CURSED_COBBLESTONE = block(PosapcModBlocks.CURSED_COBBLESTONE);
	public static final RegistryObject<Item> CORE_BLOCK = block(PosapcModBlocks.CORE_BLOCK);
	public static final RegistryObject<Item> GRAPCHICS_CARD = REGISTRY.register("grapchics_card", () -> new GrapchicsCardItem());
	public static final RegistryObject<Item> LENS = REGISTRY.register("lens", () -> new LensItem());
	public static final RegistryObject<Item> SAND_COBBLESTONE = block(PosapcModBlocks.SAND_COBBLESTONE);
	public static final RegistryObject<Item> GRAPCHICS_CARD_TABLE = block(PosapcModBlocks.GRAPCHICS_CARD_TABLE);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(GRAPCHICS_CARD.get(), new ResourceLocation("posapc:grapchics_card_type"), (itemStackToRender, clientWorld, entity, itemEntityId) -> (float) GrapchicsCardZnachieniieSvoistvaProcedure.execute(itemStackToRender));
		});
	}
}
