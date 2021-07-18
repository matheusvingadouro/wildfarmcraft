package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.world.GameType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.Minecraft;

import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class BoneMealWFCPlantsProcedure extends WildfarmcraftModElements.ModElement {
	public BoneMealWFCPlantsProcedure(WildfarmcraftModElements instance) {
		super(instance, 318);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure BoneMealWFCPlants!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure BoneMealWFCPlants!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure BoneMealWFCPlants!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure BoneMealWFCPlants!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure BoneMealWFCPlants!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((BlockTags.getCollection().getTagByID(new ResourceLocation(("forge:wfc_plants").toLowerCase(java.util.Locale.ENGLISH)))
				.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))
				&& (!(BlockTags.getCollection().getTagByID(new ResourceLocation(("wildfarmcraft:grown_crops").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))))
				&& ((BlockTags.getCollection().getTagByID(new ResourceLocation(("sereneseasons:spring_crops").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))
						|| ((BlockTags.getCollection()
								.getTagByID(new ResourceLocation(("sereneseasons:summer_crops").toLowerCase(java.util.Locale.ENGLISH)))
								.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))
								|| ((BlockTags.getCollection()
										.getTagByID(new ResourceLocation(("sereneseasons:autumn_crops").toLowerCase(java.util.Locale.ENGLISH)))
										.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))
										|| (BlockTags.getCollection()
												.getTagByID(
														new ResourceLocation(("sereneseasons:winter_crops").toLowerCase(java.util.Locale.ENGLISH)))
												.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))))))) {
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Items.BONE_MEAL, (int) (1)).getItem())) {
				if ((!(new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayerEntity) {
							return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.CREATIVE;
						} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
							NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
									.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
							return _npi != null && _npi.getGameType() == GameType.CREATIVE;
						}
						return false;
					}
				}.checkGamemode(entity)))) {
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private IWorld world;
						public void start(IWorld world, int waitTicks) {
							this.waitTicks = waitTicks;
							MinecraftForge.EVENT_BUS.register(this);
							this.world = world;
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								this.ticks += 1;
								if (this.ticks >= this.waitTicks)
									run();
							}
						}

						private void run() {
							if (entity instanceof PlayerEntity) {
								ItemStack _stktoremove = new ItemStack(Items.BONE_MEAL, (int) (1));
								((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
										((PlayerEntity) entity).container.func_234641_j_());
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 10);
				}
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.HAPPY_VILLAGER, (x + 0.5), (y + 1), (z + 0.5), (int) 5, 0.1, 0.1, 0.1, 1);
				}
			}
		}
	}

	@SubscribeEvent
	public void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		PlayerEntity entity = event.getPlayer();
		if (event.getHand() != entity.getActiveHand()) {
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
		dependencies.put("direction", event.getFace());
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
