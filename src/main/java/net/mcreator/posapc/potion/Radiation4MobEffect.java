
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

public class Radiation4MobEffect extends MobEffect {
	public Radiation4MobEffect() {
		super(MobEffectCategory.HARMFUL, -256);
		this.addAttributeModifier(Attributes.ARMOR, "5569ca6f-c6db-3ff2-872b-b08b301019e7", -1000, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, "7143f280-4f55-3db7-9a8e-c43fcdc7dd9c", -10, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "1b4c008f-7fc6-39b3-8151-a24c84aa2853", -50, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.LUCK, "dafa72eb-3940-3faf-b47d-2ef5b7ac3b80", -1000, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.MAX_HEALTH, "47d58698-4358-32c7-8a0b-b8bea5f1c86e", -7, AttributeModifier.Operation.ADDITION);
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
