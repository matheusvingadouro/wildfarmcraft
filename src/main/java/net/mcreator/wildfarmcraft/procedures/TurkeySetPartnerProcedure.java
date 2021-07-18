package net.mcreator.wildfarmcraft.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.entity.WildTurkeyMaleEntity;
import net.mcreator.wildfarmcraft.entity.DomesticTurkeyMaleEntity;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.function.Function;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;

@WildfarmcraftModElements.ModElement.Tag
public class TurkeySetPartnerProcedure extends WildfarmcraftModElements.ModElement {
	public TurkeySetPartnerProcedure(WildfarmcraftModElements instance) {
		super(instance, 199);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure TurkeySetPartner!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure TurkeySetPartner!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure TurkeySetPartner!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure TurkeySetPartner!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure TurkeySetPartner!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((Entity) world
				.getEntitiesWithinAABB(DomesticTurkeyMaleEntity.CustomEntity.class,
						new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
			if (((((Entity) world
					.getEntitiesWithinAABB(DomesticTurkeyMaleEntity.CustomEntity.class,
							new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getDouble("Stomach")) >= 30)) {
				entity.getPersistentData().putBoolean("IsMated", (true));
				((Entity) world
						.getEntitiesWithinAABB(DomesticTurkeyMaleEntity.CustomEntity.class,
								new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("Stomach",
								((((Entity) world.getEntitiesWithinAABB(DomesticTurkeyMaleEntity.CustomEntity.class,
										new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
										.stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator
														.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
											}
										}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getDouble("Stomach")) - 15));
				entity.getPersistentData().putDouble("Stomach", ((entity.getPersistentData().getDouble("Stomach")) - 15));
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ParticlesProcedure.executeProcedure($_dependencies);
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 2));
				}
				entity.getPersistentData().putString("Partner", "Domestic");
			}
		}
		if ((((Entity) world
				.getEntitiesWithinAABB(WildTurkeyMaleEntity.CustomEntity.class,
						new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
			if (((((Entity) world
					.getEntitiesWithinAABB(WildTurkeyMaleEntity.CustomEntity.class,
							new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getDouble("Stomach")) >= 30)) {
				entity.getPersistentData().putBoolean("IsMated", (true));
				((Entity) world
						.getEntitiesWithinAABB(WildTurkeyMaleEntity.CustomEntity.class,
								new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("Stomach",
								((((Entity) world.getEntitiesWithinAABB(WildTurkeyMaleEntity.CustomEntity.class,
										new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
										.stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator
														.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
											}
										}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getDouble("Stomach")) - 15));
				entity.getPersistentData().putDouble("Stomach", ((entity.getPersistentData().getDouble("Stomach")) - 15));
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ParticlesProcedure.executeProcedure($_dependencies);
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 2));
				}
				entity.getPersistentData().putString("Partner", "Wild");
			}
		}
	}
}
