package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.GameRules;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.item.RawTurkeyItem;
import net.mcreator.wildfarmcraft.item.RawDuckItem;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class MeatDropsBirdsProcedure extends WildfarmcraftModElements.ModElement {
	public MeatDropsBirdsProcedure(WildfarmcraftModElements instance) {
		super(instance, 243);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure MeatDropsBirds!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure MeatDropsBirds!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure MeatDropsBirds!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure MeatDropsBirds!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure MeatDropsBirds!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getWorldInfo().getGameRulesInstance().getBoolean(GameRules.DO_MOB_LOOT)) == (true))) {
			if ((((entity.getPersistentData().getString("DropType"))).equals("SkinnyChicken"))) {
				if (((entity.getPersistentData().getDouble("Stomach")) >= 15)) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.CHICKEN, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				} else {
					if ((Math.random() < 0.5)) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.CHICKEN, (int) (1)));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				}
			}
			if ((((entity.getPersistentData().getString("DropType"))).equals("BigChicken"))) {
				if (((entity.getPersistentData().getDouble("Stomach")) >= 15)) {
					for (int index0 = 0; index0 < (int) (2); index0++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.CHICKEN, (int) (1)));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.CHICKEN, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if ((((entity.getPersistentData().getString("DropType"))).equals("SkinnyTurkey"))) {
				if (((entity.getPersistentData().getDouble("Stomach")) >= 15)) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(RawTurkeyItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				} else {
					if ((Math.random() < 0.5)) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(RawTurkeyItem.block, (int) (1)));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				}
			}
			if ((((entity.getPersistentData().getString("DropType"))).equals("BigTurkey"))) {
				if (((entity.getPersistentData().getDouble("Stomach")) >= 15)) {
					for (int index1 = 0; index1 < (int) (2); index1++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(RawTurkeyItem.block, (int) (1)));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(RawTurkeyItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if ((((entity.getPersistentData().getString("DropType"))).equals("Duck"))) {
				if (((entity.getPersistentData().getDouble("Stomach")) >= 15)) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(RawDuckItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				} else {
					if ((Math.random() < 0.5)) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(RawDuckItem.block, (int) (1)));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				}
			}
			if ((((entity.getPersistentData().getString("DropType"))).equals("BigDuck"))) {
				if (((entity.getPersistentData().getDouble("Stomach")) >= 15)) {
					for (int index2 = 0; index2 < (int) (2); index2++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(RawDuckItem.block, (int) (1)));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(RawDuckItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			Entity sourceentity = event.getSource().getTrueSource();
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			World world = entity.world;
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("sourceentity", sourceentity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
