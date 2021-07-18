
package net.mcreator.wildfarmcraft.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.wildfarmcraft.itemgroup.WFCStuffItemGroup;
import net.mcreator.wildfarmcraft.item.PastureSeedItem;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;

import java.util.List;
import java.util.Collections;

@WildfarmcraftModElements.ModElement.Tag
public class StrawHayBlock extends WildfarmcraftModElements.ModElement {
	@ObjectHolder("wildfarmcraft:straw_hay")
	public static final Block block = null;
	public StrawHayBlock(WildfarmcraftModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(WFCStuffItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ORGANIC).sound(SoundType.PLANT).hardnessAndResistance(0.5f, 0.5f).setLightLevel(s -> 0));
			setRegistryName("straw_hay");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 60;
		}

		@Override
		public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 1;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(PastureSeedItem.block, (int) (4)));
		}
	}
}
