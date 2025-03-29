
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.posapc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.posapc.world.inventory.GrapchicsCardGUIMenu;
import net.mcreator.posapc.PosapcMod;

public class PosapcModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, PosapcMod.MODID);
	public static final RegistryObject<MenuType<GrapchicsCardGUIMenu>> GRAPCHICS_CARD_GUI = REGISTRY.register("grapchics_card_gui", () -> IForgeMenuType.create(GrapchicsCardGUIMenu::new));
}
