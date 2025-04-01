package net.mcreator.posapc.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.posapc.network.PosapcModVariables;

public class TestTubeKoghdaPriedmietVybroshienIghrokomProcedure {
	public static void execute(LevelAccessor world) {
		PosapcModVariables.MapVariables.get(world).stage = 1;
		PosapcModVariables.MapVariables.get(world).syncData(world);
	}
}
