
package net.mcreator.posapc.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.posapc.init.PosapcModJeiPlugin;
import net.mcreator.posapc.init.PosapcModBlocks;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class GrapchicCardRecoderRecipeCategory implements IRecipeCategory<GrapchicCardRecoderRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("posapc", "grapchic_card_recoder");
	public final static ResourceLocation TEXTURE = new ResourceLocation("posapc", "textures/screens/grapchic_card_recoder.png");
	private final IDrawable background;
	private final IDrawable icon;

	public GrapchicCardRecoderRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 175, 82);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(PosapcModBlocks.GRAPCHICS_CARD_TABLE.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<GrapchicCardRecoderRecipe> getRecipeType() {
		return PosapcModJeiPlugin.GrapchicCardRecoder_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Grapchic Card Recoder");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, GrapchicCardRecoderRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 16, 26).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 43, 26).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 16, 53).addItemStack(recipe.getResultItem(null));
	}
}
