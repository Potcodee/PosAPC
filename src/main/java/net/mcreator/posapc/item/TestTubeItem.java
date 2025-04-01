
package net.mcreator.posapc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;

import net.mcreator.posapc.procedures.TestTubeKoghdaPriedmietVybroshienIghrokomProcedure;

public class TestTubeItem extends Item {
	public TestTubeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		TestTubeKoghdaPriedmietVybroshienIghrokomProcedure.execute(entity.level());
		return true;
	}
}
