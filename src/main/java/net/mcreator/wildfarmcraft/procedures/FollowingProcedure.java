package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class FollowingProcedure extends WildfarmcraftModElements.ModElement {
	public FollowingProcedure(WildfarmcraftModElements instance) {
		super(instance, 73);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure Following!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency sourceentity for procedure Following!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if ((EntityTypeTags.getCollection().getTagByID(new ResourceLocation(("minecraft:wfc_entities").toLowerCase(java.util.Locale.ENGLISH)))
				.contains(entity.getType()))) {
			if ((sourceentity == ((entity instanceof TameableEntity) ? ((TameableEntity) entity).getOwner() : null))) {
				if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == (ItemStack.EMPTY).getItem())) {
					if (((entity.getPersistentData().getBoolean("following")) == (true))) {
						entity.getPersistentData().putBoolean("following", (false));
						if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
							((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent("unfollowing"), (false));
						}
					} else {
						entity.getPersistentData().putBoolean("following", (true));
						if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
							((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent("Following"), (false));
						}
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
