package net.mcreator.wildfarmcraft.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;

@WildfarmcraftModElements.ModElement.Tag
public class WildCowSetRandomBabyProcedure extends WildfarmcraftModElements.ModElement {
	public WildCowSetRandomBabyProcedure(WildfarmcraftModElements instance) {
		super(instance, 350);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure WildCowSetRandomBaby!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure WildCowSetRandomBaby!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure WildCowSetRandomBaby!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure WildCowSetRandomBaby!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure WildCowSetRandomBaby!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getTemperature(new BlockPos((int) x, (int) y, (int) z)) * 100.f) <= 30)) {
			entity.getPersistentData().putString("BabySpecie", "Highlands");
		} else {
			if (((world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getTemperature(new BlockPos((int) x, (int) y, (int) z)) * 100.f) >= 90)) {
				if ((Math.random() < 0.5)) {
					entity.getPersistentData().putString("BabySpecie", "Gir");
				} else {
					entity.getPersistentData().putString("BabySpecie", "Nelore");
				}
			} else {
				if ((Math.random() < 0.3)) {
					entity.getPersistentData().putString("BabySpecie", "Simmental");
				} else {
					if ((Math.random() < 0.5)) {
						entity.getPersistentData().putString("BabySpecie", "Holstein");
					} else {
						entity.getPersistentData().putString("BabySpecie", "Iberian");
					}
				}
			}
		}
	}
}
