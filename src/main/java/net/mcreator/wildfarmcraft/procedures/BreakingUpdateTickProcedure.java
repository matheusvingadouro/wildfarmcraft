package net.mcreator.wildfarmcraft.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.wildfarmcraft.block.BreakingBlock;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;

@WildfarmcraftModElements.ModElement.Tag
public class BreakingUpdateTickProcedure extends WildfarmcraftModElements.ModElement {
	public BreakingUpdateTickProcedure(WildfarmcraftModElements instance) {
		super(instance, 48);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure BreakingUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure BreakingUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure BreakingUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure BreakingUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BreakingBlock.block.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			if (world instanceof World)
				((World) world).notifyNeighborsOfStateChange(new BlockPos((int) x, (int) y, (int) z),
						((World) world).getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock());
		}
	}
}
