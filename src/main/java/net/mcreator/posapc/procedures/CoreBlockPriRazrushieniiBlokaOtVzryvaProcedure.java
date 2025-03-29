package net.mcreator.posapc.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class CoreBlockPriRazrushieniiBlokaOtVzryvaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double randint = 0;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"summon item ~ ~ ~ {Item:{id:\"posapc:lens\",Count:1b}}");
		randint = Mth.nextInt(RandomSource.create(), 1, 3);
		if (1 == randint) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/summon item ~ ~ ~ {Item:{id:\"posapc:grapchics_card\",Count:1b,tag:{type:1}}}");
		} else if (2 == randint) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/summon item ~ ~ ~ {Item:{id:\"posapc:grapchics_card\",Count:1b,tag:{type:2}}}");
		} else if (3 == randint) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/summon item ~ ~ ~ {Item:{id:\"posapc:grapchics_card\",Count:1b,tag:{type:3}}}");
		}
	}
}
