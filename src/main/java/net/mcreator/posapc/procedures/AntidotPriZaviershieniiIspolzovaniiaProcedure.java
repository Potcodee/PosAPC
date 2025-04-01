package net.mcreator.posapc.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.posapc.init.PosapcModItems;
import net.mcreator.posapc.PosapcMod;

public class AntidotPriZaviershieniiIspolzovaniiaProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		ItemStack temp = ItemStack.EMPTY;
		entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("posapc:ionizating")))), 1);
		entity.clearFire();
		PosapcMod.queueServerWork(20, () -> {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 60, 1));
			entity.setTicksFrozen(40);
			PosapcMod.queueServerWork(20, () -> {
				entity.setTicksFrozen(40);
				PosapcMod.queueServerWork(20, () -> {
					entity.setTicksFrozen(40);
					PosapcMod.queueServerWork(20, () -> {
						entity.setTicksFrozen(40);
						PosapcMod.queueServerWork(20, () -> {
							entity.setTicksFrozen(40);
							PosapcMod.queueServerWork(20, () -> {
								entity.setTicksFrozen(40);
								PosapcMod.queueServerWork(20, () -> {
									entity.setTicksFrozen(40);
									PosapcMod.queueServerWork(20, () -> {
										entity.setTicksFrozen(40);
										PosapcMod.queueServerWork(20, () -> {
											entity.setTicksFrozen(40);
											PosapcMod.queueServerWork(20, () -> {
												entity.setTicksFrozen(40);
												PosapcMod.queueServerWork(20, () -> {
													entity.setTicksFrozen(40);
													PosapcMod.queueServerWork(20, () -> {
														entity.setTicksFrozen(40);
														PosapcMod.queueServerWork(20, () -> {
															entity.setTicksFrozen(40);
															if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
																_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 60, 1));
															PosapcMod.queueServerWork(20, () -> {
																entity.setTicksFrozen(40);
																PosapcMod.queueServerWork(20, () -> {
																	entity.setTicksFrozen(40);
																	PosapcMod.queueServerWork(20, () -> {
																		entity.setTicksFrozen(40);
																		PosapcMod.queueServerWork(20, () -> {
																			entity.setTicksFrozen(40);
																			PosapcMod.queueServerWork(20, () -> {
																				entity.setTicksFrozen(40);
																				PosapcMod.queueServerWork(20, () -> {
																					entity.setTicksFrozen(40);
																					PosapcMod.queueServerWork(20, () -> {
																						entity.setTicksFrozen(40);
																						PosapcMod.queueServerWork(20, () -> {
																							entity.setTicksFrozen(40);
																							PosapcMod.queueServerWork(20, () -> {
																								entity.setTicksFrozen(40);
																								PosapcMod.queueServerWork(20, () -> {
																									entity.setTicksFrozen(40);
																									PosapcMod.queueServerWork(20, () -> {
																										entity.setTicksFrozen(40);
																										PosapcMod.queueServerWork(20, () -> {
																											entity.setTicksFrozen(40);
																											PosapcMod.queueServerWork(20, () -> {
																												entity.setTicksFrozen(40);
																												PosapcMod.queueServerWork(20, () -> {
																													entity.setTicksFrozen(40);
																													if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
																														_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 60, 1));
																													PosapcMod.queueServerWork(20, () -> {
																														entity.setTicksFrozen(40);
																														PosapcMod.queueServerWork(20, () -> {
																															entity.setTicksFrozen(40);
																															PosapcMod.queueServerWork(20, () -> {
																																entity.setTicksFrozen(40);
																																PosapcMod.queueServerWork(20, () -> {
																																	entity.setTicksFrozen(40);
																																	PosapcMod.queueServerWork(20, () -> {
																																		entity.setTicksFrozen(40);
																																		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
																																			_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 60, 1));
																																	});
																																});
																															});
																														});
																													});
																												});
																											});
																										});
																									});
																								});
																							});
																						});
																					});
																				});
																			});
																		});
																	});
																});
															});
														});
													});
												});
											});
										});
									});
								});
							});
						});
					});
				});
			});
		});
		if (entity instanceof LivingEntity _entity)
			_entity.removeAllEffects();
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(PosapcModItems.ANTIDOT.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		temp = new ItemStack(PosapcModItems.EMPTYINKECTOR.get()).copy();
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(temp.getItem(), 1000);
		if (entity instanceof Player _player) {
			ItemStack _setstack = temp.copy();
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}
