package net.mcreator.wildfarmcraft.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;

@WildfarmcraftModElements.ModElement.Tag
public class CalmingDownProcedure extends WildfarmcraftModElements.ModElement {
	public CalmingDownProcedure(WildfarmcraftModElements instance) {
		super(instance, 291);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure CalmingDown!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getPersistentData().getBoolean("isAngry")) == (true))) {
			entity.getPersistentData().putDouble("Calming", ((entity.getPersistentData().getDouble("Calming")) + 1));
			if (((entity.getPersistentData().getDouble("Calming")) >= 600)) {
				entity.getPersistentData().putBoolean("isAngry", (false));
				entity.getPersistentData().putDouble("Calming", 0);
			}
		}
	}
}
