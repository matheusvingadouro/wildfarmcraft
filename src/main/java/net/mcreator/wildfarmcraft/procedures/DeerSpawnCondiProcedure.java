package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistryKey;
import net.minecraft.tags.BlockTags;

import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;

@WildfarmcraftModElements.ModElement.Tag
public class DeerSpawnCondiProcedure extends WildfarmcraftModElements.ModElement {
	public DeerSpawnCondiProcedure(WildfarmcraftModElements instance) {
		super(instance, 382);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure DeerSpawnCondi!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure DeerSpawnCondi!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure DeerSpawnCondi!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure DeerSpawnCondi!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		return ((BlockTags.getCollection().getTagByID(new ResourceLocation(("minecraft:mobspawnable").toLowerCase(java.util.Locale.ENGLISH)))
				.contains((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock()))
				&& ((((((world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
						&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
								.equals(new ResourceLocation("snowy_tundra")))
						|| (world.func_241828_r().getRegistry(Registry.BIOME_KEY)
								.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
								&& BiomeDictionary
										.hasType(RegistryKey.getOrCreateKey(Registry.BIOME_KEY,
												world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(
														new BlockPos((int) x, (int) y, (int) z)))),
												BiomeDictionary.Type.CONIFEROUS)))
						|| ((world.func_241828_r().getRegistry(Registry.BIOME_KEY)
								.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
								&& BiomeDictionary.hasType(
										RegistryKey.getOrCreateKey(Registry.BIOME_KEY,
												world.func_241828_r().getRegistry(Registry.BIOME_KEY)
														.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))),
										BiomeDictionary.Type.MOUNTAIN))
								&& ((world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getTemperature(new BlockPos((int) x, (int) y, (int) z))
										* 100.f) < 90)))
						|| ((world.func_241828_r().getRegistry(Registry.BIOME_KEY)
								.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
								&& BiomeDictionary.hasType(
										RegistryKey.getOrCreateKey(Registry.BIOME_KEY,
												world.func_241828_r().getRegistry(Registry.BIOME_KEY)
														.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))),
										BiomeDictionary.Type.PLAINS))
								&& ((world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getTemperature(new BlockPos((int) x, (int) y, (int) z))
										* 100.f) < 90)))
						|| (world.func_241828_r().getRegistry(Registry.BIOME_KEY)
								.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
								&& BiomeDictionary
										.hasType(
												RegistryKey.getOrCreateKey(Registry.BIOME_KEY,
														world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(
																new BlockPos((int) x, (int) y, (int) z)))),
												BiomeDictionary.Type.SWAMP)))
						|| ((world.func_241828_r().getRegistry(Registry.BIOME_KEY)
								.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
								&& BiomeDictionary.hasType(
										RegistryKey.getOrCreateKey(Registry.BIOME_KEY,
												world.func_241828_r().getRegistry(Registry.BIOME_KEY)
														.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))),
										BiomeDictionary.Type.FOREST))
								&& ((world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getTemperature(new BlockPos((int) x, (int) y, (int) z))
										* 100.f) < 90))));
	}
}
