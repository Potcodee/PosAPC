
package net.mcreator.posapc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EmptyinkectorItem extends Item {
	public EmptyinkectorItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
