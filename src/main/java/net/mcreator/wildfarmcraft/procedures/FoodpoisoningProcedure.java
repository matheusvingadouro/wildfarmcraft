package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class FoodpoisoningProcedure extends WildfarmcraftModElements.ModElement {
	public FoodpoisoningProcedure(WildfarmcraftModElements instance) {
		super(instance, 234);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure Foodpoisoning!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency itemstack for procedure Foodpoisoning!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("minecraft:raw_food").toLowerCase(java.util.Locale.ENGLISH)))
				.contains((itemstack).getItem()))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 200, (int) 1));
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
