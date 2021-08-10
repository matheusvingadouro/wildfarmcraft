package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.entity.WildRabbitMaleEntity;
import net.mcreator.wildfarmcraft.entity.WildRabbitFemaleEntity;
import net.mcreator.wildfarmcraft.entity.WildRabbitBabyEntity;
import net.mcreator.wildfarmcraft.entity.DutchRabbitMaleEntity;
import net.mcreator.wildfarmcraft.entity.DutchRabbitFemaleEntity;
import net.mcreator.wildfarmcraft.entity.DutchRabbitBabyEntity;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class InitialTagsRabbitsProcedure extends WildfarmcraftModElements.ModElement {
	public InitialTagsRabbitsProcedure(WildfarmcraftModElements instance) {
		super(instance, 482);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure InitialTagsRabbits!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((("baby").equals("baby"))) {
			if (((entity instanceof WildRabbitBabyEntity.CustomEntity) || (entity instanceof DutchRabbitBabyEntity.CustomEntity))) {
				entity.getPersistentData().putString("StomachType", "SmallHerb");
				entity.getPersistentData().putString("DropType", "BabyRabbit");
				entity.getPersistentData().putBoolean("isBaby", (true));
			}
		}
		if ((("female").equals("female"))) {
			if (((entity instanceof WildRabbitFemaleEntity.CustomEntity) || (entity instanceof DutchRabbitFemaleEntity.CustomEntity))) {
				entity.getPersistentData().putString("Sex", "female");
				entity.getPersistentData().putString("StomachType", "SmallHerb");
			}
		}
		if ((("male").equals("male"))) {
			if (((entity instanceof WildRabbitMaleEntity.CustomEntity) || (entity instanceof DutchRabbitMaleEntity.CustomEntity))) {
				entity.getPersistentData().putString("Sex", "male");
				entity.getPersistentData().putString("StomachType", "SmallHerb");
			}
		}
		if ((("rabbit").equals("rabbit"))) {
			if ((((entity instanceof WildRabbitFemaleEntity.CustomEntity) || (entity instanceof DutchRabbitFemaleEntity.CustomEntity))
					|| ((entity instanceof WildRabbitMaleEntity.CustomEntity) || (entity instanceof DutchRabbitMaleEntity.CustomEntity)))) {
				entity.getPersistentData().putString("DropType", "Rabbit");
			}
		}
		if ((("rabbitfur").equals("rabbitfur"))) {
			if (((entity instanceof WildRabbitFemaleEntity.CustomEntity) || (entity instanceof WildRabbitMaleEntity.CustomEntity))) {
				entity.getPersistentData().putString("FurType", "WildRabbit");
			}
		}
		if ((("dutchfur").equals("dutchfur"))) {
			if (((entity instanceof DutchRabbitFemaleEntity.CustomEntity) || (entity instanceof DutchRabbitMaleEntity.CustomEntity))) {
				entity.getPersistentData().putString("FurType", "DutchRabbit");
			}
		}
		if ((("permtuft").equals("permtuft"))) {
			if ((((entity instanceof WildRabbitFemaleEntity.CustomEntity) || (entity instanceof DutchRabbitFemaleEntity.CustomEntity))
					|| ((entity instanceof WildRabbitMaleEntity.CustomEntity) || (entity instanceof DutchRabbitMaleEntity.CustomEntity)))) {
				entity.getPersistentData().putBoolean("PermTuft", (true));
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
