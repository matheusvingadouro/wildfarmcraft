package net.mcreator.wildfarmcraft.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.world.WfcPregnancyTimeGameRule;
import net.mcreator.wildfarmcraft.world.WfcAnimalProductionTimeGameRule;
import net.mcreator.wildfarmcraft.entity.MerinoLambEntity;
import net.mcreator.wildfarmcraft.entity.HampshireLambEntity;
import net.mcreator.wildfarmcraft.entity.BlackLambEntity;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class MouflonEweTickUpdateProcedure extends WildfarmcraftModElements.ModElement {
	public MouflonEweTickUpdateProcedure(WildfarmcraftModElements instance) {
		super(instance, 155);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure MouflonEweTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure MouflonEweTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure MouflonEweTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure MouflonEweTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure MouflonEweTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((entity.getPersistentData().getBoolean("TuftOn")) == (false))) {
			entity.getPersistentData().putDouble("ProducingTuft", ((entity.getPersistentData().getDouble("ProducingTuft")) + 1));
			if (((entity.getPersistentData().getDouble("ProducingTuft")) >= (world.getWorldInfo().getGameRulesInstance()
					.getInt(WfcAnimalProductionTimeGameRule.gamerule)))) {
				if (((entity.getPersistentData().getDouble("Stomach")) >= 25)) {
					entity.getPersistentData().putDouble("ProducingTuft", 0);
					entity.getPersistentData().putBoolean("TuftOn", (true));
					entity.getPersistentData().putDouble("Stomach", ((entity.getPersistentData().getDouble("Stomach")) - 5));
				} else {
					entity.getPersistentData().putDouble("ProducingTuft", 0);
				}
			}
		}
		if (((entity.getPersistentData().getBoolean("isPregnant")) == (false))) {
			if (((entity.getPersistentData().getDouble("Stomach")) >= 50)) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					SheepSetPartnerProcedure.executeProcedure($_dependencies);
				}
				if ((((entity.getPersistentData().getString("Partner"))).equals("Mouflon"))) {
					if ((Math.random() < 0.9)) {
						entity.getPersistentData().putString("BabySpecie", (entity.getPersistentData().getString("Partner")));
					} else {
						entity.getPersistentData().putString("BabySpecie", "RandomDomestic");
					}
				} else {
					if ((Math.random() < 0.5)) {
						entity.getPersistentData().putString("BabySpecie", "Mouflon");
					} else {
						entity.getPersistentData().putString("BabySpecie", "RandomDomestic");
					}
				}
			}
		}
		if (((entity.getPersistentData().getBoolean("isPregnant")) == (true))) {
			entity.getPersistentData().putDouble("Pregnancy", ((entity.getPersistentData().getDouble("Pregnancy")) + 1));
			if (((entity.getPersistentData().getDouble("Pregnancy")) >= (world.getWorldInfo().getGameRulesInstance()
					.getInt(WfcPregnancyTimeGameRule.gamerule)))) {
				if ((((entity.getPersistentData().getString("BabySpecie"))).equals("RandomDomestic"))) {
					for (int index0 = 0; index0 < (int) (2); index0++) {
						if (((world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getTemperature(new BlockPos((int) x, (int) y, (int) z))
								* 100.f) <= 30)) {
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new MerinoLambEntity.CustomEntity(MerinoLambEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
						} else {
							if ((Math.random() < 0.5)) {
								if (world instanceof ServerWorld) {
									Entity entityToSpawn = new HampshireLambEntity.CustomEntity(HampshireLambEntity.entity, (World) world);
									entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof MobEntity)
										((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
												world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
												(ILivingEntityData) null, (CompoundNBT) null);
									world.addEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerWorld) {
									Entity entityToSpawn = new BlackLambEntity.CustomEntity(BlackLambEntity.entity, (World) world);
									entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof MobEntity)
										((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
												world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
												(ILivingEntityData) null, (CompoundNBT) null);
									world.addEntity(entityToSpawn);
								}
							}
						}
					}
				} else {
					for (int index1 = 0; index1 < (int) (2); index1++) {
						{
							Map<String, Object> $_dependencies = new HashMap<>();
							$_dependencies.put("entity", entity);
							$_dependencies.put("x", x);
							$_dependencies.put("y", y);
							$_dependencies.put("z", z);
							$_dependencies.put("world", world);
							SheepBirthProcedure.executeProcedure($_dependencies);
						}
					}
				}
				entity.getPersistentData().putDouble("Pregnancy", 0);
				entity.getPersistentData().putBoolean("isPregnant", (false));
				entity.getPersistentData().putString("BabySpecie", "NoBaby");
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.HEART, x, y, z, (int) 5, 3, 3, 3, 1);
				}
			}
		}
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("entity", entity);
			$_dependencies.put("x", x);
			$_dependencies.put("y", y);
			$_dependencies.put("z", z);
			$_dependencies.put("world", world);
			MedHerbivoreFeedProcedure.executeProcedure($_dependencies);
		}
	}
}
