package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

@WildfarmcraftModElements.ModElement.Tag
public class MilkTankUpdateTickProcedure extends WildfarmcraftModElements.ModElement {
	public MilkTankUpdateTickProcedure(WildfarmcraftModElements instance) {
		super(instance, 292);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure MilkTankUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure MilkTankUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure MilkTankUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure MilkTankUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((new Object() {
			public double getValue(IWorld world, BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "MilkAmount")) < 50)) {
			if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.HOPPER.getDefaultState().getBlock())) {
				if ((((Entity) world.getEntitiesWithinAABB(AnimalEntity.class,
						new AxisAlignedBB(x - (4 / 2d), (y + 2) - (4 / 2d), z - (4 / 2d), x + (4 / 2d), (y + 2) + (4 / 2d), z + (4 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, (y + 2), z)).findFirst().orElse(null)) != null)) {
					if (((((Entity) world.getEntitiesWithinAABB(AnimalEntity.class,
							new AxisAlignedBB(x - (4 / 2d), (y + 2) - (4 / 2d), z - (4 / 2d), x + (4 / 2d), (y + 2) + (4 / 2d), z + (4 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, (y + 2), z)).findFirst().orElse(null)).getPersistentData().getDouble("MilkAmount")) >= 1)) {
						((Entity) world.getEntitiesWithinAABB(AnimalEntity.class,
								new AxisAlignedBB(x - (4 / 2d), (y + 2) - (4 / 2d), z - (4 / 2d), x + (4 / 2d), (y + 2) + (4 / 2d), z + (4 / 2d)),
								null).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, (y + 2), z)).findFirst().orElse(
										null)).getPersistentData()
												.putDouble("MilkAmount",
														((((Entity) world
																.getEntitiesWithinAABB(AnimalEntity.class,
																		new AxisAlignedBB(x - (4 / 2d), (y + 2) - (4 / 2d), z - (4 / 2d),
																				x + (4 / 2d), (y + 2) + (4 / 2d), z + (4 / 2d)),
																		null)
																.stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd
																				.getDistanceSq(_x, _y, _z)));
																	}
																}.compareDistOf(x, (y + 2), z)).findFirst().orElse(null)).getPersistentData()
																		.getDouble("MilkAmount"))
																- 1));
						if (!world.isRemote()) {
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().putDouble("MilkAmount", ((new Object() {
									public double getValue(IWorld world, BlockPos pos, String tag) {
										TileEntity tileEntity = world.getTileEntity(pos);
										if (tileEntity != null)
											return tileEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "MilkAmount")) + 1));
							if (world instanceof World)
								((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cow.milk")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
						} else {
							((World) world).playSound(x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cow.milk")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
						}
						if (((((((Entity) world.getEntitiesWithinAABB(AnimalEntity.class,
								new AxisAlignedBB(x - (4 / 2d), (y + 2) - (4 / 2d), z - (4 / 2d), x + (4 / 2d), (y + 2) + (4 / 2d), z + (4 / 2d)),
								null).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, (y + 2), z)).findFirst().orElse(null)).getPersistentData().getString("DropType")))
										.equals("SkinnyCow"))
								|| (((((Entity) world.getEntitiesWithinAABB(AnimalEntity.class, new AxisAlignedBB(x - (4 / 2d), (y + 2) - (4 / 2d),
										z - (4 / 2d), x + (4 / 2d), (y + 2) + (4 / 2d), z + (4 / 2d)), null).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator
														.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
											}
										}.compareDistOf(x, (y + 2), z)).findFirst().orElse(null)).getPersistentData().getString("DropType")))
												.equals("BeefCow")))) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("CowMilk", ((new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "CowMilk")) + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
				}
			}
		}
	}
}
