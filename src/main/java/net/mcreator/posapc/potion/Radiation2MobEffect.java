
package net.mcreator.posapc.potion;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.posapc.procedures.RadiationPriNalozhieniiEffiektaProcedure;
import net.mcreator.posapc.procedures.RadiationKazhdyiTikVoVriemiaEffiektaProcedure;

import java.util.List;
import java.util.ArrayList;

public class Radiation2MobEffect extends MobEffect {
	public Radiation2MobEffect() {
		super(MobEffectCategory.HARMFUL, -256);
		this.addAttributeModifier(Attributes.ARMOR, "e7c1740c-1560-368f-914f-8926c4532c16", -1000, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, "45eb4946-283f-3a62-bf2f-71c8f7c5bd9f", -10, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "804d9eb2-5966-36bd-8f42-9ff923c8f15e", -0, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.LUCK, "9feedfe3-4835-3646-b40c-5059d78442bc", -1000, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.MAX_HEALTH, "1a1eb20f-0e0f-3ec5-9ddd-deaddf050dfe", -5, AttributeModifier.Operation.ADDITION);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		return cures;
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.addAttributeModifiers(entity, attributeMap, amplifier);
		RadiationPriNalozhieniiEffiektaProcedure.execute(entity.level(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RadiationKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
