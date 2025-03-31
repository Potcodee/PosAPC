
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.posapc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.posapc.PosapcMod;

public class PosapcModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PosapcMod.MODID);
	public static final RegistryObject<CreativeModeTab> POS_APC = REGISTRY.register("pos_apc",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.posapc.pos_apc")).icon(() -> new ItemStack(PosapcModBlocks.SAND_COBBLESTONE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PosapcModItems.SAND_POWDER.get());
				tabData.accept(PosapcModItems.SANDSOTNE_PICKAXE.get());
				tabData.accept(PosapcModBlocks.CURSED_COBBLESTONE.get().asItem());
				tabData.accept(PosapcModBlocks.CORE_BLOCK.get().asItem());
				tabData.accept(PosapcModItems.GRAPCHICS_CARD.get());
				tabData.accept(PosapcModItems.LENS.get());
				tabData.accept(PosapcModBlocks.SAND_COBBLESTONE.get().asItem());
				tabData.accept(PosapcModBlocks.GRAPCHICS_CARD_TABLE.get().asItem());
			}).build());
}
