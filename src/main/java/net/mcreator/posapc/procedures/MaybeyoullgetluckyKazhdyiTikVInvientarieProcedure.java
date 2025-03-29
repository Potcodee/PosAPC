package net.mcreator.posapc.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.posapc.init.PosapcModItems;

public class MaybeyoullgetluckyKazhdyiTikVInvientarieProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double randomint = 0;
		randomint = Mth.nextInt(RandomSource.create(), 1, 4);
		if (1 == randomint) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.STICK).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (2 == randomint) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PosapcModItems.SAND_POWDER.get()).copy();
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		itemstack.shrink(1);
	}
}
