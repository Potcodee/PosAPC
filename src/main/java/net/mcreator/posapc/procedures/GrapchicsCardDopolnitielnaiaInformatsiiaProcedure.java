package net.mcreator.posapc.procedures;

import net.minecraft.world.item.ItemStack;

public class GrapchicsCardDopolnitielnaiaInformatsiiaProcedure {
	public static String execute(ItemStack itemstack) {
		if (1 == itemstack.getOrCreateTag().getDouble("type")) {
			return "\u00A7c\u041E\u0448\u0438\u0431\u043A\u0430: \u043A\u0440\u0435\u0442\u0438\u0447\u0435\u0441\u043A\u0438\u0439 \u043F\u0435\u0440\u0435\u0433\u0440\u0435\u0432 \u043F\u0440\u043E\u0446\u0435\u0441\u0441\u043E\u0440\u0430.";
		} else if (2 == itemstack.getOrCreateTag().getDouble("type")) {
			return "\u00A7c\u041E\u0448\u0438\u0431\u043A\u0430: \u043A\u043E\u043D\u043D\u0435\u043A\u0442\u043E\u0440 \u0443\u043D\u0438\u0447\u0442\u043E\u0436\u0435\u043D.";
		} else if (3 == itemstack.getOrCreateTag().getDouble("type")) {
			return "\u00A7c\u041E\u0448\u0438\u0431\u043A\u0430: \u043D\u0435\u0438\u0437\u0432\u0435\u0441\u0442\u043D\u0430\u044F \u043E\u0448\u0438\u0431\u043A\u0430";
		}
		return "\u00A7a\u0412 \u044D\u0442\u043E\u0439 \u043A\u0430\u0440\u0442\u0435 \u043D\u0435\u0442 \u043E\u0448\u0438\u0431\u043E\u043A.";
	}
}
