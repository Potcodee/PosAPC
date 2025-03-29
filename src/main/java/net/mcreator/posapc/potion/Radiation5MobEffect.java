
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

public class Radiation5MobEffect extends MobEffect {
	public Radiation5MobEffect() {
		super(MobEffectCategory.HARMFUL, -256);
		this.addAttributeModifier(Attributes.ARMOR, "65948900-4674-3391-a494-ca791b8273ee", -1000, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, "3abfa1dd-fe34-3164-ae7c-e7c8c1eb9436", -10, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "7d4386ec-272e-38c9-a7e7-4189e724844c", -100, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.LUCK, "e7ad5c48-a2f2-3ac2-bb8e-91efe08f53ab", -1000, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.MAX_HEALTH, "5063302b-c8dd-3ef4-927a-025a4fd9ba0c", -8, AttributeModifier.Operation.ADDITION);
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
