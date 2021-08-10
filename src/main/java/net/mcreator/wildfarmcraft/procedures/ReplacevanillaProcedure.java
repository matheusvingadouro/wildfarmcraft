package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.passive.horse.TraderLlamaEntity;
import net.minecraft.entity.passive.horse.LlamaEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.passive.RabbitEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.passive.MooshroomEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.world.DoWFCReplaceVanillaGameRule;
import net.mcreator.wildfarmcraft.entity.WhiteLlamaMaleEntity;
import net.mcreator.wildfarmcraft.entity.WhiteLlamaFemaleEntity;
import net.mcreator.wildfarmcraft.entity.SpottedSowEntity;
import net.mcreator.wildfarmcraft.entity.SpottedPigMaleEntity;
import net.mcreator.wildfarmcraft.entity.RedRhodeRoosterEntity;
import net.mcreator.wildfarmcraft.entity.RedRhodeHenEntity;
import net.mcreator.wildfarmcraft.entity.PinkSowEntity;
import net.mcreator.wildfarmcraft.entity.PinkPigMaleEntity;
import net.mcreator.wildfarmcraft.entity.PekinDuckMaleEntity;
import net.mcreator.wildfarmcraft.entity.PekinDuckFemaleEntity;
import net.mcreator.wildfarmcraft.entity.NeloreCowEntity;
import net.mcreator.wildfarmcraft.entity.NeloreBullEntity;
import net.mcreator.wildfarmcraft.entity.MerinoRamEntity;
import net.mcreator.wildfarmcraft.entity.MerinoEweEntity;
import net.mcreator.wildfarmcraft.entity.LeghornRoosterEntity;
import net.mcreator.wildfarmcraft.entity.LeghornHenEntity;
import net.mcreator.wildfarmcraft.entity.IberianBullEntity;
import net.mcreator.wildfarmcraft.entity.HolsteinCowEntity;
import net.mcreator.wildfarmcraft.entity.HighlandsCowEntity;
import net.mcreator.wildfarmcraft.entity.HighlandsBullEntity;
import net.mcreator.wildfarmcraft.entity.HampshireRamEntity;
import net.mcreator.wildfarmcraft.entity.DutchRabbitMaleEntity;
import net.mcreator.wildfarmcraft.entity.DutchRabbitFemaleEntity;
import net.mcreator.wildfarmcraft.entity.BrownDuckMaleEntity;
import net.mcreator.wildfarmcraft.entity.BrownDuckFemaleEntity;
import net.mcreator.wildfarmcraft.entity.BlackEweEntity;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.function.Function;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;

@WildfarmcraftModElements.ModElement.Tag
public class ReplacevanillaProcedure extends WildfarmcraftModElements.ModElement {
	public ReplacevanillaProcedure(WildfarmcraftModElements instance) {
		super(instance, 217);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure Replacevanilla!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure Replacevanilla!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure Replacevanilla!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure Replacevanilla!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure Replacevanilla!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private IWorld world;
			public void start(IWorld world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (((world.getWorldInfo().getGameRulesInstance().getBoolean(DoWFCReplaceVanillaGameRule.gamerule)) == (true))) {
					if (((entity instanceof CowEntity) && (!(entity instanceof MooshroomEntity)))) {
						if ((((Entity) world.getEntitiesWithinAABB(VillagerEntity.class,
								new AxisAlignedBB(x - (40 / 2d), y - (40 / 2d), z - (40 / 2d), x + (40 / 2d), y + (40 / 2d), z + (40 / 2d)), null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
							if (((world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getTemperature(new BlockPos((int) x, (int) y, (int) z))
									* 100.f) <= 30)) {
								if ((Math.random() < 0.5)) {
									if (world instanceof ServerWorld) {
										Entity entityToSpawn = new HighlandsBullEntity.CustomEntity(HighlandsBullEntity.entity, (World) world);
										entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof MobEntity)
											((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
													world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
													(ILivingEntityData) null, (CompoundNBT) null);
										world.addEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerWorld) {
										Entity entityToSpawn = new HighlandsCowEntity.CustomEntity(HighlandsCowEntity.entity, (World) world);
										entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof MobEntity)
											((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
													world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
													(ILivingEntityData) null, (CompoundNBT) null);
										world.addEntity(entityToSpawn);
									}
								}
							} else {
								if (((world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getTemperature(new BlockPos((int) x, (int) y, (int) z))
										* 100.f) >= 90)) {
									if ((Math.random() < 0.5)) {
										if (world instanceof ServerWorld) {
											Entity entityToSpawn = new NeloreBullEntity.CustomEntity(NeloreBullEntity.entity, (World) world);
											entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
											if (entityToSpawn instanceof MobEntity)
												((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
														world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
														(ILivingEntityData) null, (CompoundNBT) null);
											world.addEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerWorld) {
											Entity entityToSpawn = new NeloreCowEntity.CustomEntity(NeloreCowEntity.entity, (World) world);
											entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
											if (entityToSpawn instanceof MobEntity)
												((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
														world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
														(ILivingEntityData) null, (CompoundNBT) null);
											world.addEntity(entityToSpawn);
										}
									}
								} else {
									if ((Math.random() < 0.5)) {
										if (world instanceof ServerWorld) {
											Entity entityToSpawn = new IberianBullEntity.CustomEntity(IberianBullEntity.entity, (World) world);
											entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
											if (entityToSpawn instanceof MobEntity)
												((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
														world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
														(ILivingEntityData) null, (CompoundNBT) null);
											world.addEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerWorld) {
											Entity entityToSpawn = new HolsteinCowEntity.CustomEntity(HolsteinCowEntity.entity, (World) world);
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
						}
						if (!entity.world.isRemote())
							entity.remove();
					}
					if ((entity instanceof PigEntity)) {
						if ((((Entity) world.getEntitiesWithinAABB(VillagerEntity.class,
								new AxisAlignedBB(x - (40 / 2d), y - (40 / 2d), z - (40 / 2d), x + (40 / 2d), y + (40 / 2d), z + (40 / 2d)), null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
							if (((world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getTemperature(new BlockPos((int) x, (int) y, (int) z))
									* 100.f) <= 30)) {
								if ((Math.random() < 0.5)) {
									if (world instanceof ServerWorld) {
										Entity entityToSpawn = new SpottedPigMaleEntity.CustomEntity(SpottedPigMaleEntity.entity, (World) world);
										entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof MobEntity)
											((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
													world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
													(ILivingEntityData) null, (CompoundNBT) null);
										world.addEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerWorld) {
										Entity entityToSpawn = new SpottedSowEntity.CustomEntity(SpottedSowEntity.entity, (World) world);
										entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof MobEntity)
											((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
													world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
													(ILivingEntityData) null, (CompoundNBT) null);
										world.addEntity(entityToSpawn);
									}
								}
							} else {
								if ((Math.random() < 0.5)) {
									if (world instanceof ServerWorld) {
										Entity entityToSpawn = new PinkPigMaleEntity.CustomEntity(PinkPigMaleEntity.entity, (World) world);
										entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof MobEntity)
											((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
													world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
													(ILivingEntityData) null, (CompoundNBT) null);
										world.addEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerWorld) {
										Entity entityToSpawn = new PinkSowEntity.CustomEntity(PinkSowEntity.entity, (World) world);
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
						if (!entity.world.isRemote())
							entity.remove();
					}
					if ((entity instanceof SheepEntity)) {
						if ((((Entity) world.getEntitiesWithinAABB(VillagerEntity.class,
								new AxisAlignedBB(x - (40 / 2d), y - (40 / 2d), z - (40 / 2d), x + (40 / 2d), y + (40 / 2d), z + (40 / 2d)), null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
							if (((world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getTemperature(new BlockPos((int) x, (int) y, (int) z))
									* 100.f) <= 30)) {
								if ((Math.random() < 0.5)) {
									if (world instanceof ServerWorld) {
										Entity entityToSpawn = new MerinoRamEntity.CustomEntity(MerinoRamEntity.entity, (World) world);
										entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof MobEntity)
											((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
													world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
													(ILivingEntityData) null, (CompoundNBT) null);
										world.addEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerWorld) {
										Entity entityToSpawn = new MerinoEweEntity.CustomEntity(MerinoEweEntity.entity, (World) world);
										entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof MobEntity)
											((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
													world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
													(ILivingEntityData) null, (CompoundNBT) null);
										world.addEntity(entityToSpawn);
									}
								}
							} else {
								if ((Math.random() < 0.5)) {
									if (world instanceof ServerWorld) {
										Entity entityToSpawn = new HampshireRamEntity.CustomEntity(HampshireRamEntity.entity, (World) world);
										entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof MobEntity)
											((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
													world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
													(ILivingEntityData) null, (CompoundNBT) null);
										world.addEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerWorld) {
										Entity entityToSpawn = new BlackEweEntity.CustomEntity(BlackEweEntity.entity, (World) world);
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
						if (!entity.world.isRemote())
							entity.remove();
					}
					if ((entity instanceof ChickenEntity)) {
						if ((((Entity) world.getEntitiesWithinAABB(VillagerEntity.class,
								new AxisAlignedBB(x - (40 / 2d), y - (40 / 2d), z - (40 / 2d), x + (40 / 2d), y + (40 / 2d), z + (40 / 2d)), null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
							if (((world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getTemperature(new BlockPos((int) x, (int) y, (int) z))
									* 100.f) >= 90)) {
								if ((Math.random() < 0.5)) {
									if ((Math.random() < 0.5)) {
										if (world instanceof ServerWorld) {
											Entity entityToSpawn = new PekinDuckMaleEntity.CustomEntity(PekinDuckMaleEntity.entity, (World) world);
											entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
											if (entityToSpawn instanceof MobEntity)
												((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
														world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
														(ILivingEntityData) null, (CompoundNBT) null);
											world.addEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerWorld) {
											Entity entityToSpawn = new PekinDuckFemaleEntity.CustomEntity(PekinDuckFemaleEntity.entity,
													(World) world);
											entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
											if (entityToSpawn instanceof MobEntity)
												((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
														world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
														(ILivingEntityData) null, (CompoundNBT) null);
											world.addEntity(entityToSpawn);
										}
									}
								} else {
									if ((Math.random() < 0.5)) {
										if (world instanceof ServerWorld) {
											Entity entityToSpawn = new LeghornRoosterEntity.CustomEntity(LeghornRoosterEntity.entity, (World) world);
											entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
											if (entityToSpawn instanceof MobEntity)
												((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
														world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
														(ILivingEntityData) null, (CompoundNBT) null);
											world.addEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerWorld) {
											Entity entityToSpawn = new LeghornHenEntity.CustomEntity(LeghornHenEntity.entity, (World) world);
											entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
											if (entityToSpawn instanceof MobEntity)
												((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
														world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
														(ILivingEntityData) null, (CompoundNBT) null);
											world.addEntity(entityToSpawn);
										}
									}
								}
							} else {
								if ((Math.random() < 0.5)) {
									if ((Math.random() < 0.5)) {
										if (world instanceof ServerWorld) {
											Entity entityToSpawn = new BrownDuckFemaleEntity.CustomEntity(BrownDuckFemaleEntity.entity,
													(World) world);
											entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
											if (entityToSpawn instanceof MobEntity)
												((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
														world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
														(ILivingEntityData) null, (CompoundNBT) null);
											world.addEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerWorld) {
											Entity entityToSpawn = new BrownDuckMaleEntity.CustomEntity(BrownDuckMaleEntity.entity, (World) world);
											entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
											if (entityToSpawn instanceof MobEntity)
												((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
														world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
														(ILivingEntityData) null, (CompoundNBT) null);
											world.addEntity(entityToSpawn);
										}
									}
								} else {
									if ((Math.random() < 0.5)) {
										if (world instanceof ServerWorld) {
											Entity entityToSpawn = new RedRhodeHenEntity.CustomEntity(RedRhodeHenEntity.entity, (World) world);
											entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
											if (entityToSpawn instanceof MobEntity)
												((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
														world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
														(ILivingEntityData) null, (CompoundNBT) null);
											world.addEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerWorld) {
											Entity entityToSpawn = new RedRhodeRoosterEntity.CustomEntity(RedRhodeRoosterEntity.entity,
													(World) world);
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
						}
						if (!entity.world.isRemote())
							entity.remove();
					}
					if ((entity instanceof RabbitEntity)) {
						if ((((Entity) world.getEntitiesWithinAABB(VillagerEntity.class,
								new AxisAlignedBB(x - (40 / 2d), y - (40 / 2d), z - (40 / 2d), x + (40 / 2d), y + (40 / 2d), z + (40 / 2d)), null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
							if ((Math.random() < 0.5)) {
								if (world instanceof ServerWorld) {
									Entity entityToSpawn = new DutchRabbitFemaleEntity.CustomEntity(DutchRabbitFemaleEntity.entity, (World) world);
									entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof MobEntity)
										((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
												world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
												(ILivingEntityData) null, (CompoundNBT) null);
									world.addEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerWorld) {
									Entity entityToSpawn = new DutchRabbitMaleEntity.CustomEntity(DutchRabbitMaleEntity.entity, (World) world);
									entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof MobEntity)
										((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
												world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
												(ILivingEntityData) null, (CompoundNBT) null);
									world.addEntity(entityToSpawn);
								}
							}
						}
						if (!entity.world.isRemote())
							entity.remove();
					}
					if (((entity instanceof LlamaEntity) && (!(entity instanceof TraderLlamaEntity)))) {
						if ((((Entity) world.getEntitiesWithinAABB(VillagerEntity.class,
								new AxisAlignedBB(x - (40 / 2d), y - (40 / 2d), z - (40 / 2d), x + (40 / 2d), y + (40 / 2d), z + (40 / 2d)), null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
							if ((Math.random() < 0.5)) {
								if (world instanceof ServerWorld) {
									Entity entityToSpawn = new WhiteLlamaFemaleEntity.CustomEntity(WhiteLlamaFemaleEntity.entity, (World) world);
									entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof MobEntity)
										((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
												world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
												(ILivingEntityData) null, (CompoundNBT) null);
									world.addEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerWorld) {
									Entity entityToSpawn = new WhiteLlamaMaleEntity.CustomEntity(WhiteLlamaMaleEntity.entity, (World) world);
									entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof MobEntity)
										((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
												world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
												(ILivingEntityData) null, (CompoundNBT) null);
									world.addEntity(entityToSpawn);
								}
							}
						}
						if (!entity.world.isRemote())
							entity.remove();
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 10);
	}

	@SubscribeEvent
	public void onEntitySpawned(EntityJoinWorldEvent event) {
		Entity entity = event.getEntity();
		double i = entity.getPosX();
		double j = entity.getPosY();
		double k = entity.getPosZ();
		World world = event.getWorld();
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
