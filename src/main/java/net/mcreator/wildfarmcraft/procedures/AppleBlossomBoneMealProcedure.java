package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.Blocks;

import net.mcreator.wildfarmcraft.block.AppleStage3Block;
import net.mcreator.wildfarmcraft.block.AppleStage2Block;
import net.mcreator.wildfarmcraft.block.AppleStage1Block;
import net.mcreator.wildfarmcraft.block.AppleBlossomBlock;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class AppleBlossomBoneMealProcedure extends WildfarmcraftModElements.ModElement {
	public AppleBlossomBoneMealProcedure(WildfarmcraftModElements instance) {
		super(instance, 335);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure AppleBlossomBoneMeal!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure AppleBlossomBoneMeal!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure AppleBlossomBoneMeal!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure AppleBlossomBoneMeal!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((BlockTags.getCollection().getTagByID(new ResourceLocation(("sereneseasons:spring_crops").toLowerCase(java.util.Locale.ENGLISH)))
				.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))
				|| ((BlockTags.getCollection().getTagByID(new ResourceLocation(("sereneseasons:summer_crops").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))
						|| ((BlockTags.getCollection()
								.getTagByID(new ResourceLocation(("sereneseasons:autumn_crops").toLowerCase(java.util.Locale.ENGLISH)))
								.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))
								|| (BlockTags.getCollection()
										.getTagByID(new ResourceLocation(("sereneseasons:winter_crops").toLowerCase(java.util.Locale.ENGLISH)))
										.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock())))))) {
			for (int index0 = 0; index0 < (int) (1); index0++) {
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == AppleBlossomBlock.block.getDefaultState()
						.getBlock())) {
					if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), AppleStage1Block.block.getDefaultState(), 3);
					} else {
						if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == AppleStage1Block.block
								.getDefaultState().getBlock())) {
							world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), AppleStage2Block.block.getDefaultState(), 3);
						} else {
							if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == AppleStage2Block.block
									.getDefaultState().getBlock())) {
								world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), AppleStage3Block.block.getDefaultState(), 3);
							}
						}
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onBonemeal(BonemealEvent event) {
		PlayerEntity entity = event.getPlayer();
		double i = event.getPos().getX();
		double j = event.getPos().getY();
		double k = event.getPos().getZ();
		World world = event.getWorld();
		ItemStack itemstack = event.getStack();
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("itemstack", itemstack);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
