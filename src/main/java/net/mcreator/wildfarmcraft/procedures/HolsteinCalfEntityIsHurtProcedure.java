package net.mcreator.wildfarmcraft.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.world.Difficulty;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.entity.SimmentalCowEntity;
import net.mcreator.wildfarmcraft.entity.NeloreCowEntity;
import net.mcreator.wildfarmcraft.entity.IberianCowEntity;
import net.mcreator.wildfarmcraft.entity.HolsteinCowEntity;
import net.mcreator.wildfarmcraft.entity.HighlandsCowEntity;
import net.mcreator.wildfarmcraft.entity.GirCowEntity;
import net.mcreator.wildfarmcraft.entity.BisonCowEntity;
import net.mcreator.wildfarmcraft.entity.AurochsCowEntity;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

@WildfarmcraftModElements.ModElement.Tag
public class HolsteinCalfEntityIsHurtProcedure extends WildfarmcraftModElements.ModElement {
	public HolsteinCalfEntityIsHurtProcedure(WildfarmcraftModElements instance) {
		super(instance, 279);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure HolsteinCalfEntityIsHurt!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure HolsteinCalfEntityIsHurt!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure HolsteinCalfEntityIsHurt!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure HolsteinCalfEntityIsHurt!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((!(world.getDifficulty() == Difficulty.PEACEFUL))) {
			if (((((Entity) world
					.getEntitiesWithinAABB(AurochsCowEntity.CustomEntity.class,
							new AxisAlignedBB(x - (20 / 2d), y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) && (!((((Entity) world
							.getEntitiesWithinAABB(AurochsCowEntity.CustomEntity.class,
									new AxisAlignedBB(x - (20 / 2d), y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TameableEntity)
									? ((TameableEntity) ((Entity) world
											.getEntitiesWithinAABB(AurochsCowEntity.CustomEntity.class, new AxisAlignedBB(x - (20 / 2d),
													y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
											.stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator
															.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
												}
											}.compareDistOf(x, y, z)).findFirst().orElse(null))).isTamed()
									: false)))) {
				((Entity) world
						.getEntitiesWithinAABB(AurochsCowEntity.CustomEntity.class,
								new AxisAlignedBB(x - (20 / 2d), y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putBoolean("isAngry", (true));
			} else {
				if (((((Entity) world
						.getEntitiesWithinAABB(BisonCowEntity.CustomEntity.class,
								new AxisAlignedBB(x - (20 / 2d), y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)
						&& (!((((Entity) world.getEntitiesWithinAABB(BisonCowEntity.CustomEntity.class,
								new AxisAlignedBB(x - (20 / 2d), y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TameableEntity)
										? ((TameableEntity) ((Entity) world
												.getEntitiesWithinAABB(BisonCowEntity.CustomEntity.class, new AxisAlignedBB(x - (20 / 2d),
														y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator
																.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null))).isTamed()
										: false)))) {
					((Entity) world
							.getEntitiesWithinAABB(BisonCowEntity.CustomEntity.class,
									new AxisAlignedBB(x - (20 / 2d), y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putBoolean("isAngry", (true));
				} else {
					if (((((Entity) world
							.getEntitiesWithinAABB(IberianCowEntity.CustomEntity.class,
									new AxisAlignedBB(x - (20 / 2d), y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)
							&& (!((((Entity) world.getEntitiesWithinAABB(IberianCowEntity.CustomEntity.class,
									new AxisAlignedBB(x - (20 / 2d), y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(x, y,
											z))
									.findFirst().orElse(null)) instanceof TameableEntity)
											? ((TameableEntity) ((Entity) world
													.getEntitiesWithinAABB(IberianCowEntity.CustomEntity.class, new AxisAlignedBB(x - (20 / 2d),
															y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparing(
																	(Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null))).isTamed()
											: false)))) {
						((Entity) world.getEntitiesWithinAABB(IberianCowEntity.CustomEntity.class,
								new AxisAlignedBB(x - (20 / 2d), y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putBoolean("isAngry", (true));
					} else {
						if (((((Entity) world.getEntitiesWithinAABB(NeloreCowEntity.CustomEntity.class,
								new AxisAlignedBB(x - (20 / 2d), y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)
								&& (!((((Entity) world.getEntitiesWithinAABB(NeloreCowEntity.CustomEntity.class,
										new AxisAlignedBB(x - (20 / 2d), y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)),
										null).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator
														.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
											}
										}.compareDistOf(x, y,
												z))
										.findFirst().orElse(null)) instanceof TameableEntity)
												? ((TameableEntity) ((Entity) world
														.getEntitiesWithinAABB(NeloreCowEntity.CustomEntity.class, new AxisAlignedBB(x - (20 / 2d),
																y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
														.stream().sorted(new Object() {
															Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																return Comparator.comparing(
																		(Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
															}
														}.compareDistOf(x, y, z)).findFirst().orElse(null))).isTamed()
												: false)))) {
							((Entity) world.getEntitiesWithinAABB(NeloreCowEntity.CustomEntity.class,
									new AxisAlignedBB(x - (20 / 2d), y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putBoolean("isAngry", (true));
						} else {
							if (((((Entity) world.getEntitiesWithinAABB(GirCowEntity.CustomEntity.class,
									new AxisAlignedBB(x - (20 / 2d), y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)
									&& (!((((Entity) world.getEntitiesWithinAABB(GirCowEntity.CustomEntity.class, new AxisAlignedBB(x - (20 / 2d),
											y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null).stream()
											.sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator
															.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
												}
											}.compareDistOf(x, y, z)).findFirst().orElse(
													null)) instanceof TameableEntity)
															? ((TameableEntity) ((Entity) world
																	.getEntitiesWithinAABB(GirCowEntity.CustomEntity.class,
																			new AxisAlignedBB(x - (20 / 2d), y - (20 / 2d), z - (20 / 2d),
																					x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)),
																			null)
																	.stream().sorted(new Object() {
																		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																			return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd
																					.getDistanceSq(_x, _y, _z)));
																		}
																	}.compareDistOf(x, y, z)).findFirst().orElse(null))).isTamed()
															: false)))) {
								((Entity) world.getEntitiesWithinAABB(GirCowEntity.CustomEntity.class,
										new AxisAlignedBB(x - (20 / 2d), y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)),
										null).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator
														.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
											}
										}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putBoolean("isAngry", (true));
							} else {
								if (((((Entity) world.getEntitiesWithinAABB(HighlandsCowEntity.CustomEntity.class,
										new AxisAlignedBB(x - (20 / 2d), y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)),
										null).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator
														.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
											}
										}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) && (!((((Entity) world
												.getEntitiesWithinAABB(HighlandsCowEntity.CustomEntity.class, new AxisAlignedBB(x - (20 / 2d),
														y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator
																.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(
														null)) instanceof TameableEntity)
																? ((TameableEntity) ((Entity) world
																		.getEntitiesWithinAABB(HighlandsCowEntity.CustomEntity.class,
																				new AxisAlignedBB(x - (20 / 2d), y - (20 / 2d), z - (20 / 2d),
																						x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)),
																				null)
																		.stream().sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator
																						.comparing((Function<Entity, Double>) (_entcnd -> _entcnd
																								.getDistanceSq(_x, _y, _z)));
																			}
																		}.compareDistOf(x, y, z)).findFirst().orElse(null))).isTamed()
																: false)))) {
									((Entity) world
											.getEntitiesWithinAABB(HighlandsCowEntity.CustomEntity.class, new AxisAlignedBB(x - (20 / 2d),
													y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
											.stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator
															.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
												}
											}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putBoolean("isAngry", (true));
								} else {
									if (((((Entity) world
											.getEntitiesWithinAABB(SimmentalCowEntity.CustomEntity.class, new AxisAlignedBB(x - (20 / 2d),
													y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
											.stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator
															.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
												}
											}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) && (!((((Entity) world
													.getEntitiesWithinAABB(SimmentalCowEntity.CustomEntity.class, new AxisAlignedBB(x - (20 / 2d),
															y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparing(
																	(Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TameableEntity)
															? ((TameableEntity) ((Entity) world
																	.getEntitiesWithinAABB(SimmentalCowEntity.CustomEntity.class,
																			new AxisAlignedBB(x - (20 / 2d), y - (20 / 2d), z - (20 / 2d),
																					x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)),
																			null)
																	.stream().sorted(new Object() {
																		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																			return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd
																					.getDistanceSq(_x, _y, _z)));
																		}
																	}.compareDistOf(x, y, z)).findFirst().orElse(null))).isTamed()
															: false)))) {
										((Entity) world
												.getEntitiesWithinAABB(SimmentalCowEntity.CustomEntity.class, new AxisAlignedBB(x - (20 / 2d),
														y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator
																.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putBoolean("isAngry", (true));
									} else {
										if (((((Entity) world
												.getEntitiesWithinAABB(HolsteinCowEntity.CustomEntity.class, new AxisAlignedBB(x - (20 / 2d),
														y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator
																.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) && (!((((Entity) world
														.getEntitiesWithinAABB(HolsteinCowEntity.CustomEntity.class, new AxisAlignedBB(x - (20 / 2d),
																y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
														.stream().sorted(new Object() {
															Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																return Comparator.comparing(
																		(Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
															}
														}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TameableEntity)
																? ((TameableEntity) ((Entity) world
																		.getEntitiesWithinAABB(HolsteinCowEntity.CustomEntity.class,
																				new AxisAlignedBB(x - (20 / 2d), y - (20 / 2d), z - (20 / 2d),
																						x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)),
																				null)
																		.stream().sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator
																						.comparing((Function<Entity, Double>) (_entcnd -> _entcnd
																								.getDistanceSq(_x, _y, _z)));
																			}
																		}.compareDistOf(x, y, z)).findFirst().orElse(null))).isTamed()
																: false)))) {
											((Entity) world
													.getEntitiesWithinAABB(HolsteinCowEntity.CustomEntity.class, new AxisAlignedBB(x - (20 / 2d),
															y - (20 / 2d), z - (20 / 2d), x + (20 / 2d), y + (20 / 2d), z + (20 / 2d)), null)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparing(
																	(Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putBoolean("isAngry",
															(true));
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
