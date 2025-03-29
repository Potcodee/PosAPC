
package net.mcreator.posapc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TestTubeWithSandItem extends Item {
	public TestTubeWithSandItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
