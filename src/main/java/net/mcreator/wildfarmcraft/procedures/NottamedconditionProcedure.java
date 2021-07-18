package net.mcreator.wildfarmcraft.procedures;

import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;

@WildfarmcraftModElements.ModElement.Tag
public class NottamedconditionProcedure extends WildfarmcraftModElements.ModElement {
	public NottamedconditionProcedure(WildfarmcraftModElements instance) {
		super(instance, 75);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure Nottamedcondition!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((!((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false))
				&& ((entity.getPersistentData().getBoolean("isAngry")) == (false)))) {
			return (true);
		} else {
			return (false);
		}
	}
}
