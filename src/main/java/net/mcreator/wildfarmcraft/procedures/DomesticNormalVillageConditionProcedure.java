package net.mcreator.wildfarmcraft.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

@WildfarmcraftModElements.ModElement.Tag
public class DomesticNormalVillageConditionProcedure extends WildfarmcraftModElements.ModElement {
	public DomesticNormalVillageConditionProcedure(WildfarmcraftModElements instance) {
		super(instance, 231);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure DomesticNormalVillageCondition!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure DomesticNormalVillageCondition!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure DomesticNormalVillageCondition!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure DomesticNormalVillageCondition!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		return (((BlockTags.getCollection().getTagByID(new ResourceLocation(("minecraft:mobspawnable").toLowerCase(java.util.Locale.ENGLISH)))
				.contains((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock()))
				&& (((Entity) world
						.getEntitiesWithinAABB(VillagerEntity.class,
								new AxisAlignedBB(x - (50 / 2d), y - (50 / 2d), z - (50 / 2d), x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null))
				&& (((world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getTemperature(new BlockPos((int) x, (int) y, (int) z)) * 100.f) > 30)
						&& ((world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getTemperature(new BlockPos((int) x, (int) y, (int) z))
								* 100.f) < 90)));
	}
}
