package net.mcreator.posapc.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.posapc.init.PosapcModItems;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class OnRecordPressedProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if (("Reboot; Reinstall;").equals(guistate.containsKey("text:Recoder") ? ((EditBox) guistate.get("text:Recoder")).getValue() : "")) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(PosapcModItems.GRAPCHICS_CARD.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
