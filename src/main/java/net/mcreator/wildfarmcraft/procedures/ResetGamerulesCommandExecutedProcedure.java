package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.Util;
import net.minecraft.server.MinecraftServer;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.wildfarmcraft.world.WfcPregnancyTimeGameRule;
import net.mcreator.wildfarmcraft.world.WfcAnimalProductionTimeGameRule;
import net.mcreator.wildfarmcraft.world.WfcAnimalGrowingTimeGameRule;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;

@WildfarmcraftModElements.ModElement.Tag
public class ResetGamerulesCommandExecutedProcedure extends WildfarmcraftModElements.ModElement {
	public ResetGamerulesCommandExecutedProcedure(WildfarmcraftModElements instance) {
		super(instance, 393);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure ResetGamerulesCommandExecuted!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof ServerWorld && ((World) world).getServer() != null) {
			((World) world).getServer().getCommandManager().handleCommand(
					new CommandSource(ICommandSource.DUMMY, Vector3d.ZERO, Vector2f.ZERO, ((ServerWorld) world).getWorld(), 4, "",
							new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
					String.format("gamerule %s %d", (WfcPregnancyTimeGameRule.gamerule).toString(), 24000));
		}
		if (world instanceof ServerWorld && ((World) world).getServer() != null) {
			((World) world).getServer().getCommandManager().handleCommand(
					new CommandSource(ICommandSource.DUMMY, Vector3d.ZERO, Vector2f.ZERO, ((ServerWorld) world).getWorld(), 4, "",
							new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
					String.format("gamerule %s %d", (WfcAnimalGrowingTimeGameRule.gamerule).toString(), 48000));
		}
		if (world instanceof ServerWorld && ((World) world).getServer() != null) {
			((World) world).getServer().getCommandManager().handleCommand(
					new CommandSource(ICommandSource.DUMMY, Vector3d.ZERO, Vector2f.ZERO, ((ServerWorld) world).getWorld(), 4, "",
							new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
					String.format("gamerule %s %d", (WfcAnimalProductionTimeGameRule.gamerule).toString(), 6000));
		}
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent("WFC time gamerules were reset!"), ChatType.SYSTEM, Util.DUMMY_UUID);
		}
	}
}
