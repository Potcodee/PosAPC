
package net.mcreator.posapc.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.posapc.jei_recipes.GrapchicCardRecoderRecipeCategory;
import net.mcreator.posapc.jei_recipes.GrapchicCardRecoderRecipe;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

@JeiPlugin
public class PosapcModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<GrapchicCardRecoderRecipe> GrapchicCardRecoder_Type = new mezz.jei.api.recipe.RecipeType<>(GrapchicCardRecoderRecipeCategory.UID, GrapchicCardRecoderRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("posapc:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new GrapchicCardRecoderRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<GrapchicCardRecoderRecipe> GrapchicCardRecoderRecipes = recipeManager.getAllRecipesFor(GrapchicCardRecoderRecipe.Type.INSTANCE);
		registration.addRecipes(GrapchicCardRecoder_Type, GrapchicCardRecoderRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(PosapcModBlocks.GRAPCHICS_CARD_TABLE.get().asItem()), GrapchicCardRecoder_Type);
	}
}
