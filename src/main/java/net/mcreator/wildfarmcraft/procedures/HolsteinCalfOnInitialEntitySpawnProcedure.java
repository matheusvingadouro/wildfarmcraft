package net.mcreator.wildfarmcraft.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;

@WildfarmcraftModElements.ModElement.Tag
public class HolsteinCalfOnInitialEntitySpawnProcedure extends WildfarmcraftModElements.ModElement {
	public HolsteinCalfOnInitialEntitySpawnProcedure(WildfarmcraftModElements instance) {
		super(instance, 26);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure HolsteinCalfOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((Math.random() < 0.5)) {
			entity.getPersistentData().putString("Sex", "male");
		} else {
			entity.getPersistentData().putString("Sex", "female");
		}
	}
}
