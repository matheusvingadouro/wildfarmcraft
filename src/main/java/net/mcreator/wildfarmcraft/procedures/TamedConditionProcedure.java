package net.mcreator.wildfarmcraft.procedures;

import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;

@WildfarmcraftModElements.ModElement.Tag
public class TamedConditionProcedure extends WildfarmcraftModElements.ModElement {
	public TamedConditionProcedure(WildfarmcraftModElements instance) {
		super(instance, 77);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure TamedCondition!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		return ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false);
	}
}
