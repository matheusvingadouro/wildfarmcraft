package net.mcreator.wildfarmcraft.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.world.WfcPregnancyTimeGameRule;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class NeloreCowTickUpdateProcedure extends WildfarmcraftModElements.ModElement {
	public NeloreCowTickUpdateProcedure(WildfarmcraftModElements instance) {
		super(instance, 138);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure NeloreCowTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure NeloreCowTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure NeloreCowTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure NeloreCowTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure NeloreCowTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((entity.getPersistentData().getBoolean("isPregnant")) == (false))) {
			if (((entity.getPersistentData().getDouble("Stomach")) >= 100)) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					CowSetPartnerProcedure.executeProcedure($_dependencies);
				}
				if ((Math.random() < 0.5)) {
					entity.getPersistentData().putString("BabySpecie", (entity.getPersistentData().getString("Partner")));
				} else {
					entity.getPersistentData().putString("BabySpecie", "Nelore");
				}
			}
		}
		if (((entity.getPersistentData().getBoolean("isPregnant")) == (true))) {
			entity.getPersistentData().putDouble("Pregnancy", ((entity.getPersistentData().getDouble("Pregnancy")) + 1));
			if (((entity.getPersistentData().getDouble("Pregnancy")) >= (world.getWorldInfo().getGameRulesInstance()
					.getInt(WfcPregnancyTimeGameRule.gamerule)))) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					CowBirthProcedure.executeProcedure($_dependencies);
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
			BigHerbivoreFeedProcedure.executeProcedure($_dependencies);
		}
	}
}
