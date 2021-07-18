package net.mcreator.wildfarmcraft.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.world.WfcPregnancyTimeGameRule;
import net.mcreator.wildfarmcraft.item.ChickenEggItem;
import net.mcreator.wildfarmcraft.entity.RedRhodeHenEntity;
import net.mcreator.wildfarmcraft.entity.RedRhodeChickEntity;
import net.mcreator.wildfarmcraft.entity.LeghornHenEntity;
import net.mcreator.wildfarmcraft.entity.LeghornChickEntity;
import net.mcreator.wildfarmcraft.entity.JunglefowlFemaleEntity;
import net.mcreator.wildfarmcraft.entity.JunglefowlChickEntity;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

@WildfarmcraftModElements.ModElement.Tag
public class ChickenNestOnEntityTickUpdateProcedure extends WildfarmcraftModElements.ModElement {
	public ChickenNestOnEntityTickUpdateProcedure(WildfarmcraftModElements instance) {
		super(instance, 180);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure ChickenNestOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure ChickenNestOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure ChickenNestOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure ChickenNestOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure ChickenNestOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		entity.getPersistentData().putDouble("Hatching", ((entity.getPersistentData().getDouble("Hatching")) + 1));
		if ((((((Entity) world
				.getEntitiesWithinAABB(RedRhodeHenEntity.CustomEntity.class,
						new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) || ((((Entity) world
						.getEntitiesWithinAABB(JunglefowlFemaleEntity.CustomEntity.class,
								new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) || (((Entity) world
								.getEntitiesWithinAABB(LeghornHenEntity.CustomEntity.class,
										new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)))
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getLightValue()) >= 14))) {
			if (((entity.getPersistentData()
					.getDouble("Hatching")) >= ((world.getWorldInfo().getGameRulesInstance().getInt(WfcPregnancyTimeGameRule.gamerule)) / 2))) {
				if ((((entity.getPersistentData().getString("Specie"))).equals("RedRhode"))) {
					for (int index0 = 0; index0 < (int) (3); index0++) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new RedRhodeChickEntity.CustomEntity(RedRhodeChickEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					}
				}
				if ((((entity.getPersistentData().getString("Specie"))).equals("Leghorn"))) {
					for (int index1 = 0; index1 < (int) (3); index1++) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new LeghornChickEntity.CustomEntity(LeghornChickEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					}
				}
				if ((((entity.getPersistentData().getString("Specie"))).equals("Wild"))) {
					if ((Math.random() < 0.9)) {
						for (int index2 = 0; index2 < (int) (3); index2++) {
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new JunglefowlChickEntity.CustomEntity(JunglefowlChickEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
						}
					} else {
						for (int index3 = 0; index3 < (int) (3); index3++) {
							if ((Math.random() < 0.5)) {
								if (world instanceof ServerWorld) {
									Entity entityToSpawn = new RedRhodeChickEntity.CustomEntity(RedRhodeChickEntity.entity, (World) world);
									entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof MobEntity)
										((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
												world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
												(ILivingEntityData) null, (CompoundNBT) null);
									world.addEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerWorld) {
									Entity entityToSpawn = new LeghornChickEntity.CustomEntity(LeghornChickEntity.entity, (World) world);
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
		}
		if ((((Entity) world
				.getEntitiesWithinAABB(PlayerEntity.class,
						new AxisAlignedBB(x - (3 / 2d), y - (3 / 2d), z - (3 / 2d), x + (3 / 2d), y + (3 / 2d), z + (3 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
			if ((((Entity) world
					.getEntitiesWithinAABB(LeghornHenEntity.CustomEntity.class,
							new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
				if (((!((((Entity) world
						.getEntitiesWithinAABB(LeghornHenEntity.CustomEntity.class,
								new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(
								null)) instanceof TameableEntity)
										? ((TameableEntity) ((Entity) world
												.getEntitiesWithinAABB(LeghornHenEntity.CustomEntity.class, new AxisAlignedBB(x - (4 / 2d),
														y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator
																.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null))).isTamed()
										: false))
						&& (((Entity) world
								.getEntitiesWithinAABB(LeghornHenEntity.CustomEntity.class,
										new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).isPassenger()))) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ChickenEggItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					if (!entity.world.isRemote())
						entity.remove();
				}
			}
			if ((((Entity) world
					.getEntitiesWithinAABB(JunglefowlFemaleEntity.CustomEntity.class,
							new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
				if (((!((((Entity) world
						.getEntitiesWithinAABB(JunglefowlFemaleEntity.CustomEntity.class,
								new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(
								null)) instanceof TameableEntity)
										? ((TameableEntity) ((Entity) world
												.getEntitiesWithinAABB(JunglefowlFemaleEntity.CustomEntity.class, new AxisAlignedBB(x - (4 / 2d),
														y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator
																.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null))).isTamed()
										: false))
						&& (((Entity) world
								.getEntitiesWithinAABB(JunglefowlFemaleEntity.CustomEntity.class,
										new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).isPassenger()))) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ChickenEggItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					if (!entity.world.isRemote())
						entity.remove();
				}
			}
			if ((((Entity) world
					.getEntitiesWithinAABB(RedRhodeHenEntity.CustomEntity.class,
							new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
				if (((!((((Entity) world
						.getEntitiesWithinAABB(RedRhodeHenEntity.CustomEntity.class,
								new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(
								null)) instanceof TameableEntity)
										? ((TameableEntity) ((Entity) world
												.getEntitiesWithinAABB(RedRhodeHenEntity.CustomEntity.class, new AxisAlignedBB(x - (4 / 2d),
														y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator
																.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null))).isTamed()
										: false))
						&& (((Entity) world
								.getEntitiesWithinAABB(RedRhodeHenEntity.CustomEntity.class,
										new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).isPassenger()))) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ChickenEggItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					if (!entity.world.isRemote())
						entity.remove();
				}
			}
		}
	}
}
