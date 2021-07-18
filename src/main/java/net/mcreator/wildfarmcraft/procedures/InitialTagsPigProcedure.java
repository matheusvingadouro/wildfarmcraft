package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.entity.SpottedSowEntity;
import net.mcreator.wildfarmcraft.entity.SpottedPigletEntity;
import net.mcreator.wildfarmcraft.entity.SpottedPigMaleEntity;
import net.mcreator.wildfarmcraft.entity.PinkSowEntity;
import net.mcreator.wildfarmcraft.entity.PinkPigletEntity;
import net.mcreator.wildfarmcraft.entity.PinkPigMaleEntity;
import net.mcreator.wildfarmcraft.entity.BoarSowEntity;
import net.mcreator.wildfarmcraft.entity.BoarPigletEntity;
import net.mcreator.wildfarmcraft.entity.BoarMaleEntity;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class InitialTagsPigProcedure extends WildfarmcraftModElements.ModElement {
	public InitialTagsPigProcedure(WildfarmcraftModElements instance) {
		super(instance, 227);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure InitialTagsPig!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((("baby").equals("baby"))) {
			if (((entity instanceof SpottedPigletEntity.CustomEntity)
					|| ((entity instanceof PinkPigletEntity.CustomEntity) || (entity instanceof BoarPigletEntity.CustomEntity)))) {
				entity.getPersistentData().putString("StomachType", "MediumOmni");
				entity.getPersistentData().putString("DropType", "Piglet");
				entity.getPersistentData().putBoolean("isBaby", (true));
			}
		}
		if ((("female").equals("female"))) {
			if (((entity instanceof SpottedSowEntity.CustomEntity)
					|| ((entity instanceof BoarSowEntity.CustomEntity) || (entity instanceof PinkSowEntity.CustomEntity)))) {
				entity.getPersistentData().putString("StomachType", "MediumOmni");
				entity.getPersistentData().putString("Sex", "female");
			}
		}
		if ((("male").equals("male"))) {
			if (((entity instanceof SpottedPigMaleEntity.CustomEntity)
					|| ((entity instanceof PinkPigMaleEntity.CustomEntity) || (entity instanceof BoarMaleEntity.CustomEntity)))) {
				entity.getPersistentData().putString("StomachType", "MediumOmni");
				entity.getPersistentData().putString("Sex", "male");
			}
		}
		if ((("pigmeat").equals("pigmeat"))) {
			if ((((entity instanceof SpottedSowEntity.CustomEntity) || (entity instanceof SpottedPigMaleEntity.CustomEntity))
					|| ((entity instanceof PinkPigMaleEntity.CustomEntity) || (entity instanceof PinkSowEntity.CustomEntity)))) {
				entity.getPersistentData().putString("DropType", "Pig");
			}
		}
		if ((("skinnypig").equals("skinnypig"))) {
			if (((entity instanceof BoarSowEntity.CustomEntity) || (entity instanceof BoarMaleEntity.CustomEntity))) {
				entity.getPersistentData().putString("DropType", "SkinnyPig");
			}
		}
	}

	@SubscribeEvent
	public void onEntityJoin(EntityJoinWorldEvent event) {
		World world = event.getWorld();
		Entity entity = event.getEntity();
		double i = entity.getPosX();
		double j = entity.getPosY();
		double k = entity.getPosZ();
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
