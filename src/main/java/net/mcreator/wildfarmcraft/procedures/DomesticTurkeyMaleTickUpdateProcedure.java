package net.mcreator.wildfarmcraft.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.world.WfcAnimalProductionTimeGameRule;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class DomesticTurkeyMaleTickUpdateProcedure extends WildfarmcraftModElements.ModElement {
	public DomesticTurkeyMaleTickUpdateProcedure(WildfarmcraftModElements instance) {
		super(instance, 209);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure DomesticTurkeyMaleTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure DomesticTurkeyMaleTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure DomesticTurkeyMaleTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure DomesticTurkeyMaleTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure DomesticTurkeyMaleTickUpdate!");
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
