package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.world.GameType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.block.Blocks;

import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class TamingProcedure extends WildfarmcraftModElements.ModElement {
	public TamingProcedure(WildfarmcraftModElements instance) {
		super(instance, 72);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure Taming!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency sourceentity for procedure Taming!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure Taming!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure Taming!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure Taming!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure Taming!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((!((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false))) {
			if ((((entity.getPersistentData().getString("DropType"))).equals("Calf"))) {
				if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(Items.APPLE, (int) (1)).getItem())) {
					if ((entity instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
						((TameableEntity) entity).setTamed(true);
						((TameableEntity) entity).setTamedBy((PlayerEntity) sourceentity);
					}
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
							ItemStack _stktoremove = new ItemStack(Items.APPLE, (int) (1));
							((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) sourceentity).container.func_234641_j_());
						}
					}
					{
						Map<String, Object> $_dependencies = new HashMap<>();
						$_dependencies.put("x", x);
						$_dependencies.put("y", y);
						$_dependencies.put("z", z);
						$_dependencies.put("world", world);
						ParticlesProcedure.executeProcedure($_dependencies);
					}
				}
			}
			if (((((((entity.getPersistentData().getString("DropType"))).equals("BabyDeer"))
					|| (((entity.getPersistentData().getString("DropType"))).equals("Lamb")))
					|| (((entity.getPersistentData().getString("DropType"))).equals("BabyGoat")))
					|| (((entity.getPersistentData().getString("DropType"))).equals("BabyLlama")))) {
				if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(Blocks.SWEET_BERRY_BUSH, (int) (1)).getItem())) {
					if ((entity instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
						((TameableEntity) entity).setTamed(true);
						((TameableEntity) entity).setTamedBy((PlayerEntity) sourceentity);
					}
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
							ItemStack _stktoremove = new ItemStack(Blocks.SWEET_BERRY_BUSH, (int) (1));
							((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) sourceentity).container.func_234641_j_());
						}
					}
					{
						Map<String, Object> $_dependencies = new HashMap<>();
						$_dependencies.put("x", x);
						$_dependencies.put("y", y);
						$_dependencies.put("z", z);
						$_dependencies.put("world", world);
						ParticlesProcedure.executeProcedure($_dependencies);
					}
				}
			}
			if ((((entity.getPersistentData().getString("DropType"))).equals("Piglet"))) {
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("mushroom").toLowerCase(java.util.Locale.ENGLISH)))
						.contains(((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem()))) {
					if ((entity instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
						((TameableEntity) entity).setTamed(true);
						((TameableEntity) entity).setTamedBy((PlayerEntity) sourceentity);
					}
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
							ItemStack _stktoremove = ((sourceentity instanceof LivingEntity)
									? ((LivingEntity) sourceentity).getHeldItemMainhand()
									: ItemStack.EMPTY);
							((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) sourceentity).container.func_234641_j_());
						}
					}
					{
						Map<String, Object> $_dependencies = new HashMap<>();
						$_dependencies.put("x", x);
						$_dependencies.put("y", y);
						$_dependencies.put("z", z);
						$_dependencies.put("world", world);
						ParticlesProcedure.executeProcedure($_dependencies);
					}
				}
			}
			if ((((entity.getPersistentData().getString("DropType"))).equals("BabyBird"))) {
				if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(Items.PUMPKIN_SEEDS, (int) (1)).getItem())) {
					if ((entity instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
						((TameableEntity) entity).setTamed(true);
						((TameableEntity) entity).setTamedBy((PlayerEntity) sourceentity);
					}
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
							ItemStack _stktoremove = new ItemStack(Items.PUMPKIN_SEEDS, (int) (1));
							((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) sourceentity).container.func_234641_j_());
						}
					}
					{
						Map<String, Object> $_dependencies = new HashMap<>();
						$_dependencies.put("x", x);
						$_dependencies.put("y", y);
						$_dependencies.put("z", z);
						$_dependencies.put("world", world);
						ParticlesProcedure.executeProcedure($_dependencies);
					}
				}
			}
			if ((((entity.getPersistentData().getString("DropType"))).equals("BabyRabbit"))) {
				if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(Items.CARROT, (int) (1)).getItem())) {
					if ((entity instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
						((TameableEntity) entity).setTamed(true);
						((TameableEntity) entity).setTamedBy((PlayerEntity) sourceentity);
					}
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
							ItemStack _stktoremove = new ItemStack(Items.CARROT, (int) (1));
							((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) sourceentity).container.func_234641_j_());
						}
					}
					{
						Map<String, Object> $_dependencies = new HashMap<>();
						$_dependencies.put("x", x);
						$_dependencies.put("y", y);
						$_dependencies.put("z", z);
						$_dependencies.put("world", world);
						ParticlesProcedure.executeProcedure($_dependencies);
					}
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
