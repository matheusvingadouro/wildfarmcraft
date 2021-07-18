package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.entity.SimmentalCowEntity;
import net.mcreator.wildfarmcraft.entity.SimmentalCalfEntity;
import net.mcreator.wildfarmcraft.entity.SimmentalBullEntity;
import net.mcreator.wildfarmcraft.entity.NeloreCowEntity;
import net.mcreator.wildfarmcraft.entity.NeloreCalfEntity;
import net.mcreator.wildfarmcraft.entity.NeloreBullEntity;
import net.mcreator.wildfarmcraft.entity.IberianCowEntity;
import net.mcreator.wildfarmcraft.entity.IberianCalfEntity;
import net.mcreator.wildfarmcraft.entity.IberianBullEntity;
import net.mcreator.wildfarmcraft.entity.HolsteinCowEntity;
import net.mcreator.wildfarmcraft.entity.HolsteinCalfEntity;
import net.mcreator.wildfarmcraft.entity.HolsteinBullEntity;
import net.mcreator.wildfarmcraft.entity.HighlandsCowEntity;
import net.mcreator.wildfarmcraft.entity.HighlandsCalfEntity;
import net.mcreator.wildfarmcraft.entity.HighlandsBullEntity;
import net.mcreator.wildfarmcraft.entity.GirCowEntity;
import net.mcreator.wildfarmcraft.entity.GirCalfEntity;
import net.mcreator.wildfarmcraft.entity.GirBullEntity;
import net.mcreator.wildfarmcraft.entity.BisonCowEntity;
import net.mcreator.wildfarmcraft.entity.BisonCalfEntity;
import net.mcreator.wildfarmcraft.entity.BisonBullEntity;
import net.mcreator.wildfarmcraft.entity.AurochsCowEntity;
import net.mcreator.wildfarmcraft.entity.AurochsCalfEntity;
import net.mcreator.wildfarmcraft.entity.AurochsBullEntity;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class InitialTagsCowsProcedure extends WildfarmcraftModElements.ModElement {
	public InitialTagsCowsProcedure(WildfarmcraftModElements instance) {
		super(instance, 225);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure InitialTagsCows!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((("baby").equals("baby"))) {
			if (((entity instanceof HolsteinCalfEntity.CustomEntity)
					|| ((entity instanceof AurochsCalfEntity.CustomEntity) || ((entity instanceof IberianCalfEntity.CustomEntity)
							|| ((entity instanceof NeloreCalfEntity.CustomEntity) || ((entity instanceof SimmentalCalfEntity.CustomEntity)
									|| ((entity instanceof GirCalfEntity.CustomEntity) || ((entity instanceof HighlandsCalfEntity.CustomEntity)
											|| (entity instanceof BisonCalfEntity.CustomEntity))))))))) {
				entity.getPersistentData().putString("StomachType", "BigHerb");
				entity.getPersistentData().putString("DropType", "Calf");
				entity.getPersistentData().putBoolean("isBaby", (true));
			}
		}
		if ((("female").equals("female"))) {
			if (((entity instanceof HolsteinCowEntity.CustomEntity)
					|| ((entity instanceof AurochsCowEntity.CustomEntity) || ((entity instanceof IberianCowEntity.CustomEntity)
							|| ((entity instanceof NeloreCowEntity.CustomEntity) || ((entity instanceof SimmentalCowEntity.CustomEntity)
									|| ((entity instanceof GirCowEntity.CustomEntity) || ((entity instanceof HighlandsCowEntity.CustomEntity)
											|| (entity instanceof BisonCowEntity.CustomEntity))))))))) {
				entity.getPersistentData().putString("StomachType", "BigHerb");
				entity.getPersistentData().putString("Sex", "female");
			}
		}
		if ((("male").equals("male"))) {
			if (((entity instanceof HolsteinBullEntity.CustomEntity)
					|| ((entity instanceof AurochsBullEntity.CustomEntity) || ((entity instanceof IberianBullEntity.CustomEntity)
							|| ((entity instanceof NeloreBullEntity.CustomEntity) || ((entity instanceof SimmentalBullEntity.CustomEntity)
									|| ((entity instanceof GirBullEntity.CustomEntity) || ((entity instanceof HighlandsBullEntity.CustomEntity)
											|| (entity instanceof BisonBullEntity.CustomEntity))))))))) {
				entity.getPersistentData().putString("StomachType", "BigHerb");
				entity.getPersistentData().putString("Sex", "male");
			}
		}
		if ((("skinnycow").equals("skinnycow"))) {
			if ((((entity instanceof HolsteinCowEntity.CustomEntity)
					|| ((entity instanceof AurochsCowEntity.CustomEntity) || (entity instanceof IberianCowEntity.CustomEntity)))
					|| ((entity instanceof HolsteinBullEntity.CustomEntity) || (entity instanceof AurochsBullEntity.CustomEntity)))) {
				entity.getPersistentData().putString("DropType", "SkinnyCow");
			}
		}
		if ((("beefcow").equals("beefcow"))) {
			if ((((((((((((entity instanceof BisonCowEntity.CustomEntity) || (entity instanceof BisonBullEntity.CustomEntity))
					|| (entity instanceof HighlandsCowEntity.CustomEntity)) || (entity instanceof HighlandsBullEntity.CustomEntity))
					|| (entity instanceof GirCowEntity.CustomEntity)) || (entity instanceof GirBullEntity.CustomEntity))
					|| (entity instanceof SimmentalCowEntity.CustomEntity)) || (entity instanceof SimmentalBullEntity.CustomEntity))
					|| (entity instanceof IberianBullEntity.CustomEntity)) || (entity instanceof NeloreBullEntity.CustomEntity))
					|| (entity instanceof NeloreCowEntity.CustomEntity))) {
				entity.getPersistentData().putString("DropType", "BeefCow");
			}
		}
		if ((("bighorncow").equals("bighorncow"))) {
			if (((entity instanceof AurochsBullEntity.CustomEntity) || ((entity instanceof AurochsCowEntity.CustomEntity)
					|| ((entity instanceof HighlandsBullEntity.CustomEntity) || (entity instanceof HighlandsCowEntity.CustomEntity))))) {
				entity.getPersistentData().putBoolean("bighorncow", (true));
			}
		}
		if ((("brownwool").equals("brownwool"))) {
			if ((((entity instanceof BisonBullEntity.CustomEntity) || (entity instanceof HighlandsBullEntity.CustomEntity))
					|| (entity instanceof HighlandsCowEntity.CustomEntity))) {
				entity.getPersistentData().putString("WoolType", "Brown");
			}
		}
		if ((("permwool").equals("permwool"))) {
			if ((((entity instanceof BisonBullEntity.CustomEntity) || (entity instanceof HighlandsBullEntity.CustomEntity))
					|| (entity instanceof HighlandsCowEntity.CustomEntity))) {
				entity.getPersistentData().putBoolean("PermWool", (true));
			}
		}
		if ((("permtuft").equals("permtuft"))) {
			if ((entity instanceof BisonCowEntity.CustomEntity)) {
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
