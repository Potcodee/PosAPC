package net.mcreator.posapc.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.posapc.init.PosapcModMobEffects;

public class AntidotZnachieniieSvoistvaProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(PosapcModMobEffects.RADIATION.get()) || entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(PosapcModMobEffects.RADIATION_2.get())
				|| entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(PosapcModMobEffects.RADIATION_3.get()) || entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(PosapcModMobEffects.RADIATION_4.get())
				|| entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(PosapcModMobEffects.RADIATION_5.get()) || entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(PosapcModMobEffects.RADIATION_6.get())) {
			return 1;
		}
		return 0;
	}
}
