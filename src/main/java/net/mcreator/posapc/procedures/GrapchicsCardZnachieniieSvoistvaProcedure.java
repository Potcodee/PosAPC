package net.mcreator.posapc.procedures;

import net.minecraft.world.item.ItemStack;

public class GrapchicsCardZnachieniieSvoistvaProcedure {
	public static double execute(ItemStack itemstack) {
		if (1 == itemstack.getOrCreateTag().getDouble("type")) {
			return itemstack.getOrCreateTag().getDouble("type");
		} else if (2 == itemstack.getOrCreateTag().getDouble("type")) {
			return itemstack.getOrCreateTag().getDouble("type");
		} else if (3 == itemstack.getOrCreateTag().getDouble("type")) {
			return itemstack.getOrCreateTag().getDouble("type");
		}
		return itemstack.getOrCreateTag().getDouble("type");
	}
}
