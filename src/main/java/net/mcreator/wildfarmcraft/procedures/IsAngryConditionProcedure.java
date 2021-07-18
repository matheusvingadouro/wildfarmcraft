package net.mcreator.wildfarmcraft.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;

@WildfarmcraftModElements.ModElement.Tag
public class IsAngryConditionProcedure extends WildfarmcraftModElements.ModElement {
	public IsAngryConditionProcedure(WildfarmcraftModElements instance) {
		super(instance, 278);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure IsAngryCondition!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getPersistentData().getBoolean("isAngry")) == (true))) {
			return (true);
		} else {
			return (false);
		}
	}
}
