package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.entity.MouflonRamEntity;
import net.mcreator.wildfarmcraft.entity.MouflonLambEntity;
import net.mcreator.wildfarmcraft.entity.MouflonEweEntity;
import net.mcreator.wildfarmcraft.entity.MerinoRamEntity;
import net.mcreator.wildfarmcraft.entity.MerinoLambEntity;
import net.mcreator.wildfarmcraft.entity.MerinoEweEntity;
import net.mcreator.wildfarmcraft.entity.HampshireRamEntity;
import net.mcreator.wildfarmcraft.entity.HampshireLambEntity;
import net.mcreator.wildfarmcraft.entity.HampshireEweEntity;
import net.mcreator.wildfarmcraft.entity.BlackRamEntity;
import net.mcreator.wildfarmcraft.entity.BlackLambEntity;
import net.mcreator.wildfarmcraft.entity.BlackEweEntity;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class InitialTagsSheepProcedure extends WildfarmcraftModElements.ModElement {
	public InitialTagsSheepProcedure(WildfarmcraftModElements instance) {
		super(instance, 226);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure InitialTagsSheep!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((("baby").equals("baby"))) {
			if (((((entity instanceof HampshireLambEntity.CustomEntity) || (entity instanceof BlackLambEntity.CustomEntity))
					|| (entity instanceof MouflonLambEntity.CustomEntity)) || (entity instanceof MerinoLambEntity.CustomEntity))) {
				entity.getPersistentData().putBoolean("isBaby", (true));
				entity.getPersistentData().putString("StomachType", "MediumHerb");
				entity.getPersistentData().putString("DropType", "Lamb");
			}
		}
		if ((("female").equals("female"))) {
			if (((((entity instanceof MerinoEweEntity.CustomEntity) || (entity instanceof HampshireEweEntity.CustomEntity))
					|| (entity instanceof MouflonEweEntity.CustomEntity)) || (entity instanceof BlackEweEntity.CustomEntity))) {
				entity.getPersistentData().putString("Sex", "female");
				entity.getPersistentData().putString("StomachType", "MediumHerb");
			}
		}
		if ((("male").equals("male"))) {
			if (((((entity instanceof MerinoRamEntity.CustomEntity) || (entity instanceof HampshireRamEntity.CustomEntity))
					|| (entity instanceof MouflonRamEntity.CustomEntity)) || (entity instanceof BlackRamEntity.CustomEntity))) {
				entity.getPersistentData().putString("Sex", "male");
				entity.getPersistentData().putString("StomachType", "MediumHerb");
			}
		}
		if ((("merinowool").equals("merinowool"))) {
			if (((entity instanceof MerinoRamEntity.CustomEntity) || (entity instanceof MerinoEweEntity.CustomEntity))) {
				entity.getPersistentData().putString("WoolType", "Merino");
			}
		}
		if ((("blackwool").equals("blackwool"))) {
			if (((entity instanceof BlackRamEntity.CustomEntity) || (entity instanceof BlackEweEntity.CustomEntity))) {
				entity.getPersistentData().putString("WoolType", "Black");
			}
		}
		if ((("beefysheep").equals("beefysheep"))) {
			if (((entity instanceof HampshireRamEntity.CustomEntity) || (entity instanceof HampshireEweEntity.CustomEntity))) {
				entity.getPersistentData().putString("DropType", "BeefySheep");
			}
		}
		if ((("skinnysheep").equals("skinnysheep"))) {
			if (((((entity instanceof MerinoEweEntity.CustomEntity) || (entity instanceof MouflonEweEntity.CustomEntity))
					|| (entity instanceof BlackEweEntity.CustomEntity))
					|| (((entity instanceof MerinoRamEntity.CustomEntity) || (entity instanceof MouflonRamEntity.CustomEntity))
							|| (entity instanceof BlackRamEntity.CustomEntity)))) {
				entity.getPersistentData().putString("DropType", "SkinnySheep");
			}
		}
		if ((("permtuft").equals("permtuft"))) {
			if (((entity instanceof MouflonEweEntity.CustomEntity) || (entity instanceof MouflonRamEntity.CustomEntity))) {
				entity.getPersistentData().putBoolean("PermTuft", (true));
			}
		}
		if ((("permwool").equals("permwool"))) {
			if (((((entity instanceof MerinoEweEntity.CustomEntity) || (entity instanceof HampshireEweEntity.CustomEntity))
					|| (entity instanceof BlackEweEntity.CustomEntity))
					|| (((entity instanceof MerinoRamEntity.CustomEntity) || (entity instanceof HampshireRamEntity.CustomEntity))
							|| (entity instanceof BlackRamEntity.CustomEntity)))) {
				entity.getPersistentData().putBoolean("PermWool", (true));
			}
		}
		if ((("whitewool").equals("whitewool"))) {
			if (((entity instanceof HampshireEweEntity.CustomEntity) || (entity instanceof HampshireRamEntity.CustomEntity))) {
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
