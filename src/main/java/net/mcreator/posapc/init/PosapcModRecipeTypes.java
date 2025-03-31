package net.mcreator.posapc.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeSerializer;

import net.mcreator.posapc.jei_recipes.GrapchicCardRecoderRecipe;
import net.mcreator.posapc.PosapcMod;

@Mod.EventBusSubscriber(modid = PosapcMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PosapcModRecipeTypes {
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, "posapc");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		event.enqueueWork(() -> {
			SERIALIZERS.register(bus);
			SERIALIZERS.register("grapchic_card_recoder", () -> GrapchicCardRecoderRecipe.Serializer.INSTANCE);
		});
	}
}
