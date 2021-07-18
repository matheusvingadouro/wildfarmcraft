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

import net.mcreator.wildfarmcraft.world.WfcAnimalProductionTimeGameRule;
import net.mcreator.wildfarmcraft.item.ProductionwandItem;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class ProductionWandUsingProcedure extends WildfarmcraftModElements.ModElement {
	public ProductionWandUsingProcedure(WildfarmcraftModElements instance) {
		super(instance, 224);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure ProductionWandUsing!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency sourceentity for procedure ProductionWandUsing!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure ProductionWandUsing!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ProductionwandItem.block, (int) (1)).getItem())) {
			if ((EntityTypeTags.getCollection().getTagByID(new ResourceLocation(("minecraft:wfc_entities").toLowerCase(java.util.Locale.ENGLISH)))
					.contains(entity.getType()))) {
				if (((entity.getPersistentData().getDouble("ProducingMilk")) > 1)) {
					entity.getPersistentData().putDouble("ProducingMilk", ((entity.getPersistentData().getDouble("ProducingMilk"))
							+ (world.getWorldInfo().getGameRulesInstance().getInt(WfcAnimalProductionTimeGameRule.gamerule))));
				}
				if (((entity.getPersistentData().getDouble("ProducingWool")) > 1)) {
					entity.getPersistentData().putDouble("ProducingWool", ((entity.getPersistentData().getDouble("ProducingWool"))
							+ (world.getWorldInfo().getGameRulesInstance().getInt(WfcAnimalProductionTimeGameRule.gamerule))));
				}
				if (((entity.getPersistentData().getDouble("ProducingFeathers")) > 1)) {
					entity.getPersistentData().putDouble("ProducingFeathers", ((entity.getPersistentData().getDouble("ProducingFeathers"))
							+ (world.getWorldInfo().getGameRulesInstance().getInt(WfcAnimalProductionTimeGameRule.gamerule))));
				}
				if (((entity.getPersistentData().getDouble("ProducingEgg")) > 1)) {
					entity.getPersistentData().putDouble("ProducingEgg", ((entity.getPersistentData().getDouble("ProducingEgg"))
							+ (world.getWorldInfo().getGameRulesInstance().getInt(WfcAnimalProductionTimeGameRule.gamerule))));
				}
				if (((entity.getPersistentData().getDouble("ProducingTuft")) > 1)) {
					entity.getPersistentData().putDouble("ProducingTuft", ((entity.getPersistentData().getDouble("ProducingTuft"))
							+ (world.getWorldInfo().getGameRulesInstance().getInt(WfcAnimalProductionTimeGameRule.gamerule))));
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
