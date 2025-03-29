package net.mcreator.posapc.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.posapc.world.inventory.GrapchicsCardGUIMenu;
import net.mcreator.posapc.network.GrapchicsCardGUIButtonMessage;
import net.mcreator.posapc.PosapcMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GrapchicsCardGUIScreen extends AbstractContainerScreen<GrapchicsCardGUIMenu> {
	private final static HashMap<String, Object> guistate = GrapchicsCardGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox Recoder;
	Button button_try_to_record;

	public GrapchicsCardGUIScreen(GrapchicsCardGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("posapc:textures/screens/grapchics_card_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		Recoder.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("posapc:textures/screens/core_lens.png"), this.leftPos + 78, this.topPos + 7, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (Recoder.isFocused())
			return Recoder.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		Recoder.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String RecoderValue = Recoder.getValue();
		super.resize(minecraft, width, height);
		Recoder.setValue(RecoderValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		Recoder = new EditBox(this.font, this.leftPos + 43, this.topPos + 53, 118, 18, Component.translatable("gui.posapc.grapchics_card_gui.Recoder"));
		Recoder.setMaxLength(32767);
		guistate.put("text:Recoder", Recoder);
		this.addWidget(this.Recoder);
		button_try_to_record = Button.builder(Component.translatable("gui.posapc.grapchics_card_gui.button_try_to_record"), e -> {
			if (true) {
				PosapcMod.PACKET_HANDLER.sendToServer(new GrapchicsCardGUIButtonMessage(0, x, y, z));
				GrapchicsCardGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 42, this.topPos + 25, 92, 20).build();
		guistate.put("button:button_try_to_record", button_try_to_record);
		this.addRenderableWidget(button_try_to_record);
	}
}
