
package net.mcreator.wildfarmcraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.wildfarmcraft.WildfarmcraftModElements;

@WildfarmcraftModElements.ModElement.Tag
public class BeetrootStewRawItem extends WildfarmcraftModElements.ModElement {
	@ObjectHolder("wildfarmcraft:beetroot_stew_raw")
	public static final Item block = null;
	public BeetrootStewRawItem(WildfarmcraftModElements instance) {
		super(instance, 103);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("beetroot_stew_raw");
		}

		@Override
		public boolean hasContainerItem() {
			return true;
		}

		@Override
		public ItemStack getContainerItem(ItemStack itemstack) {
			return new ItemStack(Items.BOWL, (int) (1));
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
