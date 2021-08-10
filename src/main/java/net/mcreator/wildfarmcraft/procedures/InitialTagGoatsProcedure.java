package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.entity.SaanenGoatMaleEntity;
import net.mcreator.wildfarmcraft.entity.SaanenGoatFemaleEntity;
import net.mcreator.wildfarmcraft.entity.SaanenGoatBabyEntity;
import net.mcreator.wildfarmcraft.entity.RedNubianGoatMaleEntity;
import net.mcreator.wildfarmcraft.entity.RedNubianGoatFemaleEntity;
import net.mcreator.wildfarmcraft.entity.RedNubianGoatBabyEntity;
import net.mcreator.wildfarmcraft.entity.IbexMaleEntity;
import net.mcreator.wildfarmcraft.entity.IbexFemaleEntity;
import net.mcreator.wildfarmcraft.entity.IbexBabyEntity;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class InitialTagGoatsProcedure extends WildfarmcraftModElements.ModElement {
	public InitialTagGoatsProcedure(WildfarmcraftModElements instance) {
		super(instance, 450);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure InitialTagGoats!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((("baby").equals("baby"))) {
			if ((((entity instanceof IbexBabyEntity.CustomEntity) || (entity instanceof SaanenGoatBabyEntity.CustomEntity))
					|| (entity instanceof RedNubianGoatBabyEntity.CustomEntity))) {
				entity.getPersistentData().putBoolean("isBaby", (true));
				entity.getPersistentData().putString("StomachType", "MediumHerb");
				entity.getPersistentData().putString("DropType", "BabyGoat");
			}
		}
		if ((("female").equals("female"))) {
			if ((((entity instanceof IbexFemaleEntity.CustomEntity) || (entity instanceof SaanenGoatFemaleEntity.CustomEntity))
					|| (entity instanceof RedNubianGoatFemaleEntity.CustomEntity))) {
				entity.getPersistentData().putString("Sex", "female");
				entity.getPersistentData().putString("StomachType", "MediumHerb");
			}
		}
		if ((("male").equals("male"))) {
			if ((((entity instanceof IbexMaleEntity.CustomEntity) || (entity instanceof SaanenGoatMaleEntity.CustomEntity))
					|| (entity instanceof RedNubianGoatMaleEntity.CustomEntity))) {
				entity.getPersistentData().putString("Sex", "male");
				entity.getPersistentData().putString("StomachType", "MediumHerb");
			}
		}
		if ((("skinnysheep").equals("skinnysheep"))) {
			if (((((entity instanceof IbexFemaleEntity.CustomEntity) || (entity instanceof IbexMaleEntity.CustomEntity))
					|| ((entity instanceof RedNubianGoatFemaleEntity.CustomEntity) || (entity instanceof RedNubianGoatMaleEntity.CustomEntity)))
					|| ((entity instanceof SaanenGoatFemaleEntity.CustomEntity) || (entity instanceof SaanenGoatMaleEntity.CustomEntity)))) {
				entity.getPersistentData().putString("DropType", "SkinnyGoat");
			}
		}
		if ((("permtuft").equals("permtuft"))) {
			if (((entity instanceof IbexMaleEntity.CustomEntity)
					|| ((entity instanceof RedNubianGoatMaleEntity.CustomEntity) || (entity instanceof SaanenGoatMaleEntity.CustomEntity)))) {
				entity.getPersistentData().putBoolean("PermTuft", (true));
			}
		}
		if ((("whitefur").equals("whitefur"))) {
			if ((entity instanceof SaanenGoatMaleEntity.CustomEntity)) {
				entity.getPersistentData().putString("FurType", "WhiteFur");
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
