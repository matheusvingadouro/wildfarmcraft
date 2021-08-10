package net.mcreator.wildfarmcraft.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.world.WfcAnimalProductionTimeGameRule;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class WhiteLlamaMaleTickUpdateProcedure extends WildfarmcraftModElements.ModElement {
	public WhiteLlamaMaleTickUpdateProcedure(WildfarmcraftModElements instance) {
		super(instance, 481);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure WhiteLlamaMaleTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure WhiteLlamaMaleTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure WhiteLlamaMaleTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure WhiteLlamaMaleTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure WhiteLlamaMaleTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("entity", entity);
			LlamaSpitTickUpdateProcedure.executeProcedure($_dependencies);
		}
		if (((entity.getPersistentData().getBoolean("WoolOn")) == (false))) {
			entity.getPersistentData().putDouble("ProducingWool", ((entity.getPersistentData().getDouble("ProducingWool")) + 1));
			if (((entity.getPersistentData().getDouble("ProducingWool")) >= (world.getWorldInfo().getGameRulesInstance()
					.getInt(WfcAnimalProductionTimeGameRule.gamerule)))) {
				if (((entity.getPersistentData().getDouble("Stomach")) >= 25)) {
					entity.getPersistentData().putDouble("ProducingWool", 0);
					entity.getPersistentData().putBoolean("WoolOn", (true));
					entity.getPersistentData().putDouble("Stomach", ((entity.getPersistentData().getDouble("Stomach")) - 5));
				} else {
					entity.getPersistentData().putDouble("ProducingWool", 0);
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
