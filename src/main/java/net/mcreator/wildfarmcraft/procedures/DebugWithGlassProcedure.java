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

import net.mcreator.wildfarmcraft.world.WfcPregnancyTimeGameRule;
import net.mcreator.wildfarmcraft.world.WfcAnimalGrowingTimeGameRule;
import net.mcreator.wildfarmcraft.item.DebugGlassItem;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class DebugWithGlassProcedure extends WildfarmcraftModElements.ModElement {
	public DebugWithGlassProcedure(WildfarmcraftModElements instance) {
		super(instance, 40);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure DebugWithGlass!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency sourceentity for procedure DebugWithGlass!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure DebugWithGlass!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(DebugGlassItem.block, (int) (1)).getItem())) {
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent("***ANIMAL DETAILS:"), (false));
			}
			if ((((entity.getPersistentData().getString("Sex"))).equals("male"))) {
				if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
					((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent("Sex: it's a male!"), (false));
				}
			} else if ((((entity.getPersistentData().getString("Sex"))).equals("female"))) {
				if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
					((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent("Sex: it's a female!"), (false));
				}
			}
			if (((entity.getPersistentData().getBoolean("isPregnant")) == (true))) {
				if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
					((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent((("PregnancyTime:") + ""
							+ ((((((entity.getPersistentData().getDouble("Pregnancy"))
									/ (world.getWorldInfo().getGameRulesInstance().getInt(WfcPregnancyTimeGameRule.gamerule))) * 100)) + ""
									+ ("%"))))),
							(false));
				}
			}
			if (((entity.getPersistentData().getDouble("MilkAmount")) >= 1)) {
				if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
					((PlayerEntity) sourceentity).sendStatusMessage(
							new StringTextComponent((("Milk Amout:") + ""
									+ ((new java.text.DecimalFormat("##.##").format((entity.getPersistentData().getDouble("MilkAmount"))))))),
							(false));
				}
			}
			if (((entity.getPersistentData().getBoolean("WoolOn")) == (true))) {
				if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
					((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent("Wool: full of wool!"), (false));
				}
			}
			if (((entity.getPersistentData().getBoolean("FeathersOn")) == (true))) {
				if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
					((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent("Feathers: With Feathers"), (false));
				}
			}
			if ((((entity.getPersistentData().getString("StomachType"))).equals("BigHerb"))) {
				if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
					((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent(
							(("Stomach:") + "" + ((((new java.text.DecimalFormat("##.##").format((entity.getPersistentData().getDouble("Stomach")))))
									+ "" + ("/100"))))),
							(false));
				}
			}
			if ((((entity.getPersistentData().getString("StomachType"))).equals("MediumHerb"))) {
				if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
					((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent((("Stomach:") + ""
							+ ((((new java.text.DecimalFormat("##.##").format((entity.getPersistentData().getDouble("Stomach"))))) + "" + ("/50"))))),
							(false));
				}
			}
			if ((((entity.getPersistentData().getString("StomachType"))).equals("MediumOmni"))) {
				if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
					((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent((("Stomach:") + ""
							+ ((((new java.text.DecimalFormat("##.##").format((entity.getPersistentData().getDouble("Stomach"))))) + "" + ("/50"))))),
							(false));
				}
			}
			if ((((entity.getPersistentData().getString("StomachType"))).equals("SmallHerb"))) {
				if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
					((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent((("Stomach:") + ""
							+ ((((new java.text.DecimalFormat("##.##").format((entity.getPersistentData().getDouble("Stomach"))))) + "" + ("/30"))))),
							(false));
				}
			}
			if (((entity.getPersistentData().getDouble("Age")) >= 1)) {
				if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
					((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent((("growth: ") + ""
							+ ((((((entity.getPersistentData().getDouble("Age"))
									/ (world.getWorldInfo().getGameRulesInstance().getInt(WfcAnimalGrowingTimeGameRule.gamerule))) * 100)) + ""
									+ ("%"))))),
							(false));
				}
			}
			if ((EntityTypeTags.getCollection().getTagByID(new ResourceLocation(("minecraft:nests").toLowerCase(java.util.Locale.ENGLISH)))
					.contains(entity.getType()))) {
				if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
					((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent((("Hatching: ") + ""
							+ ((((((entity.getPersistentData().getDouble("Hatching"))
									/ (world.getWorldInfo().getGameRulesInstance().getInt(WfcPregnancyTimeGameRule.gamerule))) * 200)) + ""
									+ ("%"))))),
							(false));
				}
			}
			if (((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false)) {
				if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
					((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent("Tamed!"), (false));
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
