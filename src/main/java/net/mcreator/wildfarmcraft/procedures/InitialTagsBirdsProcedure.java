package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.entity.WildTurkeyMaleEntity;
import net.mcreator.wildfarmcraft.entity.WildTurkeyFemaleEntity;
import net.mcreator.wildfarmcraft.entity.WildTurkeyBabyEntity;
import net.mcreator.wildfarmcraft.entity.WildDucklingEntity;
import net.mcreator.wildfarmcraft.entity.WildDuckMaleEntity;
import net.mcreator.wildfarmcraft.entity.WildDuckFemaleEntity;
import net.mcreator.wildfarmcraft.entity.RedRhodeRoosterEntity;
import net.mcreator.wildfarmcraft.entity.RedRhodeHenEntity;
import net.mcreator.wildfarmcraft.entity.RedRhodeChickEntity;
import net.mcreator.wildfarmcraft.entity.PekinDucklingEntity;
import net.mcreator.wildfarmcraft.entity.PekinDuckMaleEntity;
import net.mcreator.wildfarmcraft.entity.PekinDuckFemaleEntity;
import net.mcreator.wildfarmcraft.entity.LeghornRoosterEntity;
import net.mcreator.wildfarmcraft.entity.LeghornHenEntity;
import net.mcreator.wildfarmcraft.entity.LeghornChickEntity;
import net.mcreator.wildfarmcraft.entity.JunglefowlMaleEntity;
import net.mcreator.wildfarmcraft.entity.JunglefowlFemaleEntity;
import net.mcreator.wildfarmcraft.entity.JunglefowlChickEntity;
import net.mcreator.wildfarmcraft.entity.DomesticTurkeyMaleEntity;
import net.mcreator.wildfarmcraft.entity.DomesticTurkeyFemaleEntity;
import net.mcreator.wildfarmcraft.entity.DomesticTurkeyChickEntity;
import net.mcreator.wildfarmcraft.entity.BrownDucklingEntity;
import net.mcreator.wildfarmcraft.entity.BrownDuckMaleEntity;
import net.mcreator.wildfarmcraft.entity.BrownDuckFemaleEntity;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class InitialTagsBirdsProcedure extends WildfarmcraftModElements.ModElement {
	public InitialTagsBirdsProcedure(WildfarmcraftModElements instance) {
		super(instance, 228);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure InitialTagsBirds!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((("baby").equals("baby"))) {
			if (((entity instanceof WildDucklingEntity.CustomEntity) || ((entity instanceof PekinDucklingEntity.CustomEntity)
					|| ((entity instanceof JunglefowlChickEntity.CustomEntity) || ((entity instanceof LeghornChickEntity.CustomEntity)
							|| ((entity instanceof WildTurkeyBabyEntity.CustomEntity) || ((entity instanceof DomesticTurkeyChickEntity.CustomEntity)
									|| ((entity instanceof RedRhodeChickEntity.CustomEntity)
											|| (entity instanceof BrownDucklingEntity.CustomEntity))))))))) {
				entity.getPersistentData().putString("StomachType", "SmallHerb");
				entity.getPersistentData().putString("DropType", "BabyBird");
				entity.getPersistentData().putBoolean("isBaby", (true));
			}
		}
		if ((("female").equals("female"))) {
			if (((entity instanceof WildDuckFemaleEntity.CustomEntity)
					|| ((entity instanceof PekinDuckFemaleEntity.CustomEntity) || ((entity instanceof JunglefowlFemaleEntity.CustomEntity)
							|| ((entity instanceof LeghornHenEntity.CustomEntity) || ((entity instanceof WildTurkeyFemaleEntity.CustomEntity)
									|| ((entity instanceof DomesticTurkeyFemaleEntity.CustomEntity)
											|| ((entity instanceof RedRhodeHenEntity.CustomEntity)
													|| (entity instanceof BrownDuckFemaleEntity.CustomEntity))))))))) {
				entity.getPersistentData().putString("Sex", "female");
				entity.getPersistentData().putString("StomachType", "SmallHerb");
			}
		}
		if ((("male").equals("male"))) {
			if (((entity instanceof WildDuckMaleEntity.CustomEntity) || ((entity instanceof PekinDuckMaleEntity.CustomEntity)
					|| ((entity instanceof JunglefowlMaleEntity.CustomEntity) || ((entity instanceof LeghornRoosterEntity.CustomEntity)
							|| ((entity instanceof WildTurkeyMaleEntity.CustomEntity) || ((entity instanceof DomesticTurkeyMaleEntity.CustomEntity)
									|| ((entity instanceof RedRhodeRoosterEntity.CustomEntity)
											|| (entity instanceof BrownDuckMaleEntity.CustomEntity))))))))) {
				entity.getPersistentData().putString("Sex", "male");
				entity.getPersistentData().putString("StomachType", "SmallHerb");
			}
		}
		if ((("permfeathers").equals("permfeathers"))) {
			if (((entity instanceof WildDuckFemaleEntity.CustomEntity) || ((entity instanceof WildDuckMaleEntity.CustomEntity)
					|| ((entity instanceof PekinDuckFemaleEntity.CustomEntity) || ((entity instanceof PekinDuckMaleEntity.CustomEntity)
							|| ((entity instanceof JunglefowlFemaleEntity.CustomEntity) || ((entity instanceof JunglefowlMaleEntity.CustomEntity)
									|| ((entity instanceof LeghornHenEntity.CustomEntity) || ((entity instanceof LeghornRoosterEntity.CustomEntity)
											|| ((entity instanceof WildTurkeyFemaleEntity.CustomEntity)
													|| ((entity instanceof WildTurkeyMaleEntity.CustomEntity)
															|| ((entity instanceof DomesticTurkeyFemaleEntity.CustomEntity)
																	|| ((entity instanceof DomesticTurkeyMaleEntity.CustomEntity)
																			|| ((entity instanceof RedRhodeHenEntity.CustomEntity)
																					|| ((entity instanceof RedRhodeRoosterEntity.CustomEntity)
																							|| ((entity instanceof BrownDuckFemaleEntity.CustomEntity)
																									|| (entity instanceof BrownDuckMaleEntity.CustomEntity))))))))))))))))) {
				entity.getPersistentData().putBoolean("PermFeathers", (true));
			}
		}
		if ((("duckmeat").equals("duckmeat"))) {
			if ((((entity instanceof WildDuckMaleEntity.CustomEntity) || (entity instanceof BrownDuckMaleEntity.CustomEntity))
					|| ((entity instanceof WildDuckFemaleEntity.CustomEntity) || (entity instanceof BrownDuckFemaleEntity.CustomEntity)))) {
				entity.getPersistentData().putString("DropType", "Duck");
			}
		}
		if ((("bigduck").equals("bigduck"))) {
			if (((entity instanceof PekinDuckMaleEntity.CustomEntity) || (entity instanceof PekinDuckFemaleEntity.CustomEntity))) {
				entity.getPersistentData().putString("DropType", "BigDuck");
			}
		}
		if ((("skinnychicken").equals("skinnychicken"))) {
			if ((((entity instanceof LeghornHenEntity.CustomEntity) || (entity instanceof JunglefowlFemaleEntity.CustomEntity))
					|| ((entity instanceof LeghornRoosterEntity.CustomEntity) || (entity instanceof JunglefowlMaleEntity.CustomEntity)))) {
				entity.getPersistentData().putString("DropType", "SkinnyChicken");
			}
		}
		if ((("bigchicken").equals("bigchicken"))) {
			if (((entity instanceof RedRhodeHenEntity.CustomEntity) || (entity instanceof RedRhodeRoosterEntity.CustomEntity))) {
				entity.getPersistentData().putString("DropType", "BigChicken");
			}
		}
		if ((("skinnyturkey").equals("skinnyturkey"))) {
			if (((entity instanceof WildTurkeyMaleEntity.CustomEntity) || (entity instanceof WildTurkeyFemaleEntity.CustomEntity))) {
				entity.getPersistentData().putString("DropType", "SkinnyTurkey");
			}
		}
		if ((("turkey").equals("turkey"))) {
			if (((entity instanceof DomesticTurkeyFemaleEntity.CustomEntity) || (entity instanceof DomesticTurkeyMaleEntity.CustomEntity))) {
				entity.getPersistentData().putString("DropType", "BigTurkey");
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
