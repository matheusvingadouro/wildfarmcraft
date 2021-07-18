package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.wildfarmcraft.item.WoolTuftWhiteItem;
import net.mcreator.wildfarmcraft.item.WoolTuftItem;
import net.mcreator.wildfarmcraft.item.WoolTuftBlackItem;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class ShearingProcedure extends WildfarmcraftModElements.ModElement {
	public ShearingProcedure(WildfarmcraftModElements instance) {
		super(instance, 310);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure Shearing!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency sourceentity for procedure Shearing!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure Shearing!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure Shearing!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure Shearing!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure Shearing!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((entity.getPersistentData().getBoolean("WoolOn")) == (true))) {
			if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Items.SHEARS, (int) (1)).getItem())) {
				if ((((entity.getPersistentData().getString("WoolType"))).equals("Brown"))) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Blocks.BROWN_WOOL, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				} else {
					if ((((entity.getPersistentData().getString("WoolType"))).equals("Merino"))) {
						for (int index0 = 0; index0 < (int) (3); index0++) {
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Blocks.WHITE_WOOL, (int) (1)));
								entityToSpawn.setPickupDelay((int) 10);
								world.addEntity(entityToSpawn);
							}
						}
					} else {
						if ((((entity.getPersistentData().getString("WoolType"))).equals("Black"))) {
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Blocks.BLACK_WOOL, (int) (1)));
								entityToSpawn.setPickupDelay((int) 10);
								world.addEntity(entityToSpawn);
							}
						} else {
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Blocks.WHITE_WOOL, (int) (1)));
								entityToSpawn.setPickupDelay((int) 10);
								world.addEntity(entityToSpawn);
							}
						}
					}
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.sheep.shear")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.sheep.shear")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				entity.getPersistentData().putBoolean("WoolOn", (false));
			}
		}
		if (((entity.getPersistentData().getBoolean("TuftOn")) == (true))) {
			if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Items.SHEARS, (int) (1)).getItem())) {
				if (((world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getTemperature(new BlockPos((int) x, (int) y, (int) z))
						* 100.f) < 90)) {
					if ((((entity.getPersistentData().getString("FurType"))).equals("WildRabbit"))) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(WoolTuftItem.block, (int) (1)));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if ((((entity.getPersistentData().getString("FurType"))).equals("DutchRabbit"))) {
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(WoolTuftWhiteItem.block, (int) (1)));
								entityToSpawn.setPickupDelay((int) 10);
								world.addEntity(entityToSpawn);
							}
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(WoolTuftBlackItem.block, (int) (1)));
								entityToSpawn.setPickupDelay((int) 10);
								world.addEntity(entityToSpawn);
							}
						} else {
							for (int index1 = 0; index1 < (int) (2); index1++) {
								if (world instanceof World && !world.isRemote()) {
									ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(WoolTuftItem.block, (int) (1)));
									entityToSpawn.setPickupDelay((int) 10);
									world.addEntity(entityToSpawn);
								}
							}
						}
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.sheep.shear")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.sheep.shear")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					entity.getPersistentData().putBoolean("TuftOn", (false));
				}
			}
		}
	}

	@SubscribeEvent
	public void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		Entity entity = event.getTarget();
		PlayerEntity sourceentity = event.getPlayer();
		if (event.getHand() != sourceentity.getActiveHand()) {
			return;
		}
		double i = event.getPos().getX();
		double j = event.getPos().getY();
		double k = event.getPos().getZ();
		IWorld world = event.getWorld();
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
