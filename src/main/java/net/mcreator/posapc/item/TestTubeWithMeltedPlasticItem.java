
package net.mcreator.posapc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.posapc.init.PosapcModItems;

public class TestTubeWithMeltedPlasticItem extends Item {
	public TestTubeWithMeltedPlasticItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		return new ItemStack(PosapcModItems.TEST_TUBE.get());
	}
}
