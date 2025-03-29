
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

public class Radiation3MobEffect extends MobEffect {
	public Radiation3MobEffect() {
		super(MobEffectCategory.HARMFUL, -256);
		this.addAttributeModifier(Attributes.ARMOR, "9f6e16a9-5099-3e25-8dea-d5adbae68c1c", -1000, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, "df1d838c-3f98-3c8a-8c5c-f975feb233bf", -10, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "78ab6ed3-bf02-3dae-86e9-a5d8855758a2", -10, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.LUCK, "566526fb-662d-3379-b528-2b1dc98c1ff5", -1000, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.MAX_HEALTH, "19c80c72-ef05-3261-abd4-4f535320d5a2", -6, AttributeModifier.Operation.ADDITION);
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
