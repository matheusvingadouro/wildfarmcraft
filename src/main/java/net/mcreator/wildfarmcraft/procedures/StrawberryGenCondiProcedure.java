package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.RegistryKey;

import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;

@WildfarmcraftModElements.ModElement.Tag
public class StrawberryGenCondiProcedure extends WildfarmcraftModElements.ModElement {
	public StrawberryGenCondiProcedure(WildfarmcraftModElements instance) {
		super(instance, 424);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure StrawberryGenCondi!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure StrawberryGenCondi!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure StrawberryGenCondi!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure StrawberryGenCondi!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		return ((world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
				&& BiomeDictionary
						.hasType(
								RegistryKey
										.getOrCreateKey(Registry.BIOME_KEY,
												world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world
														.getBiome(new BlockPos((int) x, (int) y, (int) z)))),
								BiomeDictionary.Type.FOREST))
				|| (world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
						&& BiomeDictionary
								.hasType(
										RegistryKey.getOrCreateKey(Registry.BIOME_KEY,
												world.func_241828_r().getRegistry(Registry.BIOME_KEY)
														.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))),
										BiomeDictionary.Type.CONIFEROUS)));
	}
}
