package net.mcreator.wildfarmcraft.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.world.WfcAnimalProductionTimeGameRule;
import net.mcreator.wildfarmcraft.item.ChickenEggItem;
import net.mcreator.wildfarmcraft.entity.ChickenNestEntity;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.function.Function;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;

@WildfarmcraftModElements.ModElement.Tag
public class JunglefowlFemaleTickUpdateProcedure extends WildfarmcraftModElements.ModElement {
	public JunglefowlFemaleTickUpdateProcedure(WildfarmcraftModElements instance) {
		super(instance, 176);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure JunglefowlFemaleTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure JunglefowlFemaleTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure JunglefowlFemaleTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure JunglefowlFemaleTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure JunglefowlFemaleTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		entity.getPersistentData().putDouble("ProducingFeathers", ((entity.getPersistentData().getDouble("ProducingFeathers")) + 1));
		if (((entity.getPersistentData().getDouble(
				"ProducingFeathers")) >= ((world.getWorldInfo().getGameRulesInstance().getInt(WfcAnimalProductionTimeGameRule.gamerule)) * 4))) {
			if (((entity.getPersistentData().getDouble("Stomach")) >= 20)) {
				entity.getPersistentData().putDouble("ProducingFeathers", 0);
				entity.getPersistentData().putDouble("Stomach", ((entity.getPersistentData().getDouble("Stomach")) - 1));
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.FEATHER, (int) (1)));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			} else {
				entity.getPersistentData().putDouble("ProducingFeathers", 0);
			}
		}
		if ((!(entity.isPassenger()))) {
			entity.getPersistentData().putDouble("ProducingEgg", ((entity.getPersistentData().getDouble("ProducingEgg")) + 1));
			if (((entity.getPersistentData().getDouble(
					"ProducingEgg")) >= ((world.getWorldInfo().getGameRulesInstance().getInt(WfcAnimalProductionTimeGameRule.gamerule)) * 2))) {
				if (((entity.getPersistentData().getDouble("Stomach")) >= 10)) {
					entity.getPersistentData().putDouble("ProducingEgg", 0);
					entity.getPersistentData().putDouble("Stomach", ((entity.getPersistentData().getDouble("Stomach")) - 5));
					if (((entity.getPersistentData().getBoolean("IsMated")) == (true))) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new ChickenNestEntity.CustomEntity(ChickenNestEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
						if ((((Entity) world
								.getEntitiesWithinAABB(ChickenNestEntity.CustomEntity.class,
										new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
							entity.startRiding(((Entity) world.getEntitiesWithinAABB(ChickenNestEntity.CustomEntity.class,
									new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)));
						}
						entity.getPersistentData().putBoolean("IsMated", (false));
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ChickenEggItem.block, (int) (1)));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					entity.getPersistentData().putDouble("ProducingEgg", 0);
				}
			}
		}
		if (((entity.getPersistentData().getBoolean("IsMated")) == (false))) {
			if (((entity.getPersistentData().getDouble("Stomach")) >= 30)) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ChickenSetPartnerProcedure.executeProcedure($_dependencies);
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
			SmallHerbivoreFeedProcedure.executeProcedure($_dependencies);
		}
	}
}
