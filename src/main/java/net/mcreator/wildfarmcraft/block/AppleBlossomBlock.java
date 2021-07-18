
package net.mcreator.wildfarmcraft.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.wildfarmcraft.procedures.AppleGrowthProcedure;
import net.mcreator.wildfarmcraft.itemgroup.WFCStuffItemGroup;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class AppleBlossomBlock extends WildfarmcraftModElements.ModElement {
	@ObjectHolder("wildfarmcraft:apple_blossom")
	public static final Block block = null;
	public AppleBlossomBlock(WildfarmcraftModElements instance) {
		super(instance, 331);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(WFCStuffItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends LeavesBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT).hardnessAndResistance(0.2f, 0.2f).setLightLevel(s -> 0).notSolid());
			setRegistryName("apple_blossom");
		}

		@Override
		public MaterialColor getMaterialColor() {
			return MaterialColor.FOLIAGE;
		}

		@Override
		public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean moving) {
			super.onBlockAdded(state, world, pos, oldState, moving);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			world.getPendingBlockTicks().scheduleTick(new BlockPos(x, y, z), this, 10);
		}

		@Override
		public void tick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
			super.tick(state, world, pos, random);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AppleGrowthProcedure.executeProcedure($_dependencies);
			}
			world.getPendingBlockTicks().scheduleTick(new BlockPos(x, y, z), this, 10);
		}
	}
}
