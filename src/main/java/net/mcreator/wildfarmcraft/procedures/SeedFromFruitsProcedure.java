package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.item.AppleSeedsItem;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class SeedFromFruitsProcedure extends WildfarmcraftModElements.ModElement {
	public SeedFromFruitsProcedure(WildfarmcraftModElements instance) {
		super(instance, 338);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure SeedFromFruits!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency itemstack for procedure SeedFromFruits!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((Math.random() < 0.05)) {
			if (((itemstack).getItem() == new ItemStack(Items.APPLE, (int) (1)).getItem())) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(AppleSeedsItem.block, (int) (1));
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
		}
	}

	@SubscribeEvent
	public void onUseItemStart(LivingEntityUseItemEvent.Finish event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			double duration = event.getDuration();
			ItemStack itemstack = event.getItem();
			World world = entity.world;
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("itemstack", itemstack);
			dependencies.put("duration", duration);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
