package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.entity.DeerMaleEntity;
import net.mcreator.wildfarmcraft.entity.DeerFemaleEntity;
import net.mcreator.wildfarmcraft.entity.DeerBabyEntity;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class InitialTagDeersAndWildsProcedure extends WildfarmcraftModElements.ModElement {
	public InitialTagDeersAndWildsProcedure(WildfarmcraftModElements instance) {
		super(instance, 380);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure InitialTagDeersAndWilds!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((("baby").equals("baby"))) {
			if ((entity instanceof DeerBabyEntity.CustomEntity)) {
				entity.getPersistentData().putBoolean("isBaby", (true));
				entity.getPersistentData().putString("StomachType", "MediumHerb");
				entity.getPersistentData().putString("DropType", "BabyDeer");
			}
		}
		if ((("female").equals("female"))) {
			if ((entity instanceof DeerFemaleEntity.CustomEntity)) {
				entity.getPersistentData().putString("Sex", "female");
				entity.getPersistentData().putString("StomachType", "MediumHerb");
			}
		}
		if ((("male").equals("male"))) {
			if ((entity instanceof DeerMaleEntity.CustomEntity)) {
				entity.getPersistentData().putString("Sex", "male");
				entity.getPersistentData().putString("StomachType", "MediumHerb");
			}
		}
		if ((("deermeat").equals("deermeat"))) {
			if (((entity instanceof DeerFemaleEntity.CustomEntity) || (entity instanceof DeerMaleEntity.CustomEntity))) {
				entity.getPersistentData().putString("DropType", "Deer");
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
