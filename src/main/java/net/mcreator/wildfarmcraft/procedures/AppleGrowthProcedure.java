package net.mcreator.wildfarmcraft.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.GameRules;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.BoneMealItem;

import net.mcreator.wildfarmcraft.block.AppleLeavesBlock;
import net.mcreator.wildfarmcraft.block.AppleBlossomBlock;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;

@WildfarmcraftModElements.ModElement.Tag
public class AppleGrowthProcedure extends WildfarmcraftModElements.ModElement {
	public AppleGrowthProcedure(WildfarmcraftModElements instance) {
		super(instance, 316);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure AppleGrowth!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure AppleGrowth!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure AppleGrowth!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure AppleGrowth!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == AppleBlossomBlock.block.getDefaultState().getBlock())
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == AppleLeavesBlock.block.getDefaultState()
						.getBlock()))) {
			if ((Math.random() <= (0.0004 * (world.getWorldInfo().getGameRulesInstance().getInt(GameRules.RANDOM_TICK_SPEED))))) {
				if (world instanceof World) {
					if (BoneMealItem.applyBonemeal(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos((int) x, (int) y, (int) z))
							|| BoneMealItem.growSeagrass(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos((int) x, (int) y, (int) z),
									(Direction) null)) {
						if (!world.isRemote())
							((World) world).playEvent(2005, new BlockPos((int) x, (int) y, (int) z), 0);
					}
				}
			}
		}
	}
}
