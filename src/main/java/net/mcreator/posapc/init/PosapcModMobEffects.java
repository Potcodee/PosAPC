
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.posapc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.posapc.potion.RadiationMobEffect;
import net.mcreator.posapc.PosapcMod;

public class PosapcModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PosapcMod.MODID);
	public static final RegistryObject<MobEffect> RADIATION = REGISTRY.register("radiation", () -> new RadiationMobEffect());
}
