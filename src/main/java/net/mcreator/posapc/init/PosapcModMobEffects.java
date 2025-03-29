
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.posapc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.posapc.potion.RadiationMobEffect;
import net.mcreator.posapc.potion.Radiation6MobEffect;
import net.mcreator.posapc.potion.Radiation5MobEffect;
import net.mcreator.posapc.potion.Radiation4MobEffect;
import net.mcreator.posapc.potion.Radiation3MobEffect;
import net.mcreator.posapc.potion.Radiation2MobEffect;
import net.mcreator.posapc.PosapcMod;

public class PosapcModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PosapcMod.MODID);
	public static final RegistryObject<MobEffect> RADIATION = REGISTRY.register("radiation", () -> new RadiationMobEffect());
	public static final RegistryObject<MobEffect> RADIATION_2 = REGISTRY.register("radiation_2", () -> new Radiation2MobEffect());
	public static final RegistryObject<MobEffect> RADIATION_3 = REGISTRY.register("radiation_3", () -> new Radiation3MobEffect());
	public static final RegistryObject<MobEffect> RADIATION_4 = REGISTRY.register("radiation_4", () -> new Radiation4MobEffect());
	public static final RegistryObject<MobEffect> RADIATION_5 = REGISTRY.register("radiation_5", () -> new Radiation5MobEffect());
	public static final RegistryObject<MobEffect> RADIATION_6 = REGISTRY.register("radiation_6", () -> new Radiation6MobEffect());
}
