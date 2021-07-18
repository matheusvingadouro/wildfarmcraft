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

import net.mcreator.wildfarmcraft.item.RawVenisonItem;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class MeatDropsMammalsProcedure extends WildfarmcraftModElements.ModElement {
	public MeatDropsMammalsProcedure(WildfarmcraftModElements instance) {
		super(instance, 242);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure MeatDropsMammals!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure MeatDropsMammals!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure MeatDropsMammals!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure MeatDropsMammals!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure MeatDropsMammals!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getWorldInfo().getGameRulesInstance().getBoolean(GameRules.DO_MOB_LOOT)) == (true))) {
			if ((((entity.getPersistentData().getString("DropType"))).equals("SkinnyCow"))) {
				if (((entity.getPersistentData().getDouble("Stomach")) >= 50)) {
					for (int index0 = 0; index0 < (int) (4); index0++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.BEEF, (int) (1)));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					for (int index1 = 0; index1 < (int) (2); index1++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.BEEF, (int) (1)));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				}
				for (int index2 = 0; index2 < (int) (2); index2++) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.LEATHER, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
				for (int index3 = 0; index3 < (int) (2); index3++) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.BONE, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if ((((entity.getPersistentData().getString("DropType"))).equals("BeefCow"))) {
				if (((entity.getPersistentData().getDouble("Stomach")) >= 50)) {
					for (int index4 = 0; index4 < (int) (10); index4++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.BEEF, (int) (1)));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					for (int index5 = 0; index5 < (int) (6); index5++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.BEEF, (int) (1)));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				}
				for (int index6 = 0; index6 < (int) (2); index6++) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.LEATHER, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
				for (int index7 = 0; index7 < (int) (2); index7++) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.BONE, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if ((((entity.getPersistentData().getString("DropType"))).equals("BeefySheep"))) {
				if (((entity.getPersistentData().getDouble("Stomach")) >= 50)) {
					for (int index8 = 0; index8 < (int) (4); index8++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.MUTTON, (int) (1)));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					for (int index9 = 0; index9 < (int) (2); index9++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.MUTTON, (int) (1)));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.BONE, (int) (1)));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.LEATHER, (int) (1)));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			}
			if ((((entity.getPersistentData().getString("DropType"))).equals("SkinnySheep"))) {
				if (((entity.getPersistentData().getDouble("Stomach")) >= 50)) {
					for (int index10 = 0; index10 < (int) (2); index10++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.MUTTON, (int) (1)));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					for (int index11 = 0; index11 < (int) (1); index11++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.MUTTON, (int) (1)));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.BONE, (int) (1)));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.LEATHER, (int) (1)));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			}
			if ((((entity.getPersistentData().getString("DropType"))).equals("Pig"))) {
				if (((entity.getPersistentData().getDouble("Stomach")) >= 50)) {
					for (int index12 = 0; index12 < (int) (3); index12++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.PORKCHOP, (int) (1)));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					for (int index13 = 0; index13 < (int) (2); index13++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.PORKCHOP, (int) (1)));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.BONE, (int) (1)));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			}
			if ((((entity.getPersistentData().getString("DropType"))).equals("SkinnyPig"))) {
				if (((entity.getPersistentData().getDouble("Stomach")) >= 50)) {
					for (int index14 = 0; index14 < (int) (2); index14++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.PORKCHOP, (int) (1)));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.PORKCHOP, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.BONE, (int) (1)));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			}
			if ((((entity.getPersistentData().getString("DropType"))).equals("Deer"))) {
				if (((entity.getPersistentData().getDouble("Stomach")) >= 25)) {
					for (int index15 = 0; index15 < (int) (4); index15++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(RawVenisonItem.block, (int) (1)));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					for (int index16 = 0; index16 < (int) (3); index16++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(RawVenisonItem.block, (int) (1)));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.BONE, (int) (1)));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.LEATHER, (int) (1)));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
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
