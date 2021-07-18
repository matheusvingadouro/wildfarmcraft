package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.world.GameType;
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

import net.mcreator.wildfarmcraft.item.MediumOmnivoreSlopItem;
import net.mcreator.wildfarmcraft.item.EmptyBagItem;
import net.mcreator.wildfarmcraft.item.BagSmallHerbivoreItem;
import net.mcreator.wildfarmcraft.item.BagMedHerbivoreFoodItem;
import net.mcreator.wildfarmcraft.item.BagBigHerbivoreFoodsItem;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class HungerGeneralProcedure extends WildfarmcraftModElements.ModElement {
	public HungerGeneralProcedure(WildfarmcraftModElements instance) {
		super(instance, 34);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure HungerGeneral!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency sourceentity for procedure HungerGeneral!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure HungerGeneral!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure HungerGeneral!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure HungerGeneral!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure HungerGeneral!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity.getPersistentData().getString("StomachType"))).equals("BigHerb"))) {
			if (((entity.getPersistentData().getDouble("Stomach")) < 100)) {
				if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(BagBigHerbivoreFoodsItem.block, (int) (1)).getItem())) {
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
					}.checkGamemode(sourceentity)))) {
						if (sourceentity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(BagBigHerbivoreFoodsItem.block, (int) (1));
							((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) sourceentity).container.func_234641_j_());
						}
						if (sourceentity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(EmptyBagItem.block, (int) (1));
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
						}
					}
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(ParticleTypes.HEART, x, y, z, (int) 5, 3, 3, 3, 1);
					}
					entity.getPersistentData().putDouble("Stomach", ((entity.getPersistentData().getDouble("Stomach")) + 100));
					entity.getPersistentData().putBoolean("isAngry", (false));
				}
			}
		}
		if ((((entity.getPersistentData().getString("StomachType"))).equals("MediumHerb"))) {
			if (((entity.getPersistentData().getDouble("Stomach")) < 50)) {
				if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(BagMedHerbivoreFoodItem.block, (int) (1)).getItem())) {
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
					}.checkGamemode(sourceentity)))) {
						if (sourceentity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(BagMedHerbivoreFoodItem.block, (int) (1));
							((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) sourceentity).container.func_234641_j_());
						}
						if (sourceentity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(EmptyBagItem.block, (int) (1));
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
						}
					}
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(ParticleTypes.HEART, x, y, z, (int) 5, 3, 3, 3, 1);
					}
					entity.getPersistentData().putDouble("Stomach", ((entity.getPersistentData().getDouble("Stomach")) + 50));
					entity.getPersistentData().putBoolean("isAngry", (false));
				}
			}
		}
		if ((((entity.getPersistentData().getString("StomachType"))).equals("MediumOmni"))) {
			if (((entity.getPersistentData().getDouble("Stomach")) < 50)) {
				if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(MediumOmnivoreSlopItem.block, (int) (1)).getItem())) {
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
					}.checkGamemode(sourceentity)))) {
						if (sourceentity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(MediumOmnivoreSlopItem.block, (int) (1));
							((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) sourceentity).container.func_234641_j_());
						}
						if (sourceentity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Items.BOWL, (int) (1));
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
						}
					}
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(ParticleTypes.HEART, x, y, z, (int) 5, 3, 3, 3, 1);
					}
					entity.getPersistentData().putDouble("Stomach", ((entity.getPersistentData().getDouble("Stomach")) + 50));
					entity.getPersistentData().putBoolean("isAngry", (false));
				}
			}
		}
		if ((((entity.getPersistentData().getString("StomachType"))).equals("SmallHerb"))) {
			if (((entity.getPersistentData().getDouble("Stomach")) < 30)) {
				if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(BagSmallHerbivoreItem.block, (int) (1)).getItem())) {
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
					}.checkGamemode(sourceentity)))) {
						if (sourceentity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(BagSmallHerbivoreItem.block, (int) (1));
							((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) sourceentity).container.func_234641_j_());
						}
						if (sourceentity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(EmptyBagItem.block, (int) (1));
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
						}
					}
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(ParticleTypes.HEART, x, y, z, (int) 5, 3, 3, 3, 1);
					}
					entity.getPersistentData().putDouble("Stomach", ((entity.getPersistentData().getDouble("Stomach")) + 30));
					entity.getPersistentData().putBoolean("isAngry", (false));
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
