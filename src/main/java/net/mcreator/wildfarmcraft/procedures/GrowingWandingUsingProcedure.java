package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.world.WfcPregnancyTimeGameRule;
import net.mcreator.wildfarmcraft.world.WfcAnimalGrowingTimeGameRule;
import net.mcreator.wildfarmcraft.item.GrowingwandItem;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class GrowingWandingUsingProcedure extends WildfarmcraftModElements.ModElement {
	public GrowingWandingUsingProcedure(WildfarmcraftModElements instance) {
		super(instance, 222);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure GrowingWandingUsing!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency sourceentity for procedure GrowingWandingUsing!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure GrowingWandingUsing!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(GrowingwandItem.block, (int) (1)).getItem())) {
			if ((EntityTypeTags.getCollection().getTagByID(new ResourceLocation(("minecraft:wfc_entities").toLowerCase(java.util.Locale.ENGLISH)))
					.contains(entity.getType()))) {
				if (((entity.getPersistentData().getDouble("Pregnancy")) > 1)) {
					entity.getPersistentData().putDouble("Pregnancy", ((entity.getPersistentData().getDouble("Pregnancy"))
							+ ((world.getWorldInfo().getGameRulesInstance().getInt(WfcPregnancyTimeGameRule.gamerule)) / 2)));
				}
				if (((entity.getPersistentData().getDouble("Age")) > 1)) {
					entity.getPersistentData().putDouble("Age", ((entity.getPersistentData().getDouble("Age"))
							+ ((world.getWorldInfo().getGameRulesInstance().getInt(WfcAnimalGrowingTimeGameRule.gamerule)) / 2)));
				}
				if (((entity.getPersistentData().getDouble("Hatching")) > 1)) {
					entity.getPersistentData().putDouble("Hatching", ((entity.getPersistentData().getDouble("Hatching"))
							+ ((world.getWorldInfo().getGameRulesInstance().getInt(WfcPregnancyTimeGameRule.gamerule)) / 4)));
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
