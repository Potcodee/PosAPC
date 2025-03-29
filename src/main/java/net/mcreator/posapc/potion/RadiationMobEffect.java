
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

public class RadiationMobEffect extends MobEffect {
	public RadiationMobEffect() {
		super(MobEffectCategory.HARMFUL, -256);
		this.addAttributeModifier(Attributes.ARMOR, "a4b64cdd-98d7-3365-bbe5-422ae664c3b3", -1000, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, "afcfcd29-b8b9-3b0a-9441-5575de1974e9", -5, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "e57b49d3-dfe3-3352-bd13-3430cf243da3", -0, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.LUCK, "b156f15e-333b-3a3e-89f7-d290459a1190", -1000, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.MAX_HEALTH, "e853c28a-f4b5-3c21-919b-23e3b726ec0e", -4, AttributeModifier.Operation.ADDITION);
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
