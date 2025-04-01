package net.mcreator.posapc.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.posapc.network.PosapcModVariables;
import net.mcreator.posapc.init.PosapcModMobEffects;
import net.mcreator.posapc.PosapcMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OnPlayerDeathProcedure {
	@SubscribeEvent
	public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (PosapcModVariables.MapVariables.get(world).stage >= 1) {
			PosapcMod.queueServerWork(100, () -> {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PosapcModMobEffects.RADIATION_3.get(), 3000, 1));
			});
		}
	}
}
