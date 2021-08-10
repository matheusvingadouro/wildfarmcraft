package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.entity.WhiteLlamaMaleEntity;
import net.mcreator.wildfarmcraft.entity.WhiteLlamaFemaleEntity;
import net.mcreator.wildfarmcraft.entity.WhiteLlamaBabyEntity;
import net.mcreator.wildfarmcraft.entity.GuanacoMaleEntity;
import net.mcreator.wildfarmcraft.entity.GuanacoFemaleEntity;
import net.mcreator.wildfarmcraft.entity.GuanacoBabyEntity;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class InitialTagLlamasProcedure extends WildfarmcraftModElements.ModElement {
	public InitialTagLlamasProcedure(WildfarmcraftModElements instance) {
		super(instance, 483);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure InitialTagLlamas!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((("baby").equals("baby"))) {
			if (((entity instanceof WhiteLlamaBabyEntity.CustomEntity) || (entity instanceof GuanacoBabyEntity.CustomEntity))) {
				entity.getPersistentData().putBoolean("isBaby", (true));
				entity.getPersistentData().putString("StomachType", "MediumHerb");
				entity.getPersistentData().putString("DropType", "BabyLlama");
			}
		}
		if ((("female").equals("female"))) {
			if (((entity instanceof WhiteLlamaFemaleEntity.CustomEntity) || (entity instanceof GuanacoFemaleEntity.CustomEntity))) {
				entity.getPersistentData().putString("Sex", "female");
				entity.getPersistentData().putString("StomachType", "MediumHerb");
			}
		}
		if ((("male").equals("male"))) {
			if (((entity instanceof WhiteLlamaMaleEntity.CustomEntity) || (entity instanceof GuanacoMaleEntity.CustomEntity))) {
				entity.getPersistentData().putString("Sex", "male");
				entity.getPersistentData().putString("StomachType", "MediumHerb");
			}
		}
		if ((("llamameat").equals("llamameat"))) {
			if ((((entity instanceof WhiteLlamaFemaleEntity.CustomEntity) || (entity instanceof GuanacoFemaleEntity.CustomEntity))
					|| ((entity instanceof WhiteLlamaMaleEntity.CustomEntity) || (entity instanceof GuanacoMaleEntity.CustomEntity)))) {
				entity.getPersistentData().putString("DropType", "Llama");
			}
		}
		if ((("permtuft").equals("permtuft"))) {
			if (((entity instanceof GuanacoFemaleEntity.CustomEntity) || (entity instanceof GuanacoMaleEntity.CustomEntity))) {
				entity.getPersistentData().putBoolean("PermTuft", (true));
			}
		}
		if ((("permwool").equals("permwool"))) {
			if (((entity instanceof WhiteLlamaFemaleEntity.CustomEntity) || (entity instanceof WhiteLlamaMaleEntity.CustomEntity))) {
				entity.getPersistentData().putBoolean("PermWool", (true));
			}
		}
		if ((("whitewool").equals("whitewool"))) {
			if (((entity instanceof WhiteLlamaFemaleEntity.CustomEntity) || (entity instanceof WhiteLlamaMaleEntity.CustomEntity))) {
				entity.getPersistentData().putString("WoolType", "White");
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
