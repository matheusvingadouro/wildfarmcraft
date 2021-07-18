
package net.mcreator.wildfarmcraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.wildfarmcraft.itemgroup.WFCStuffItemGroup;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;

@WildfarmcraftModElements.ModElement.Tag
public class MortarAndPestleItem extends WildfarmcraftModElements.ModElement {
	@ObjectHolder("wildfarmcraft:mortar_and_pestle")
	public static final Item block = null;
	public MortarAndPestleItem(WildfarmcraftModElements instance) {
		super(instance, 416);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(WFCStuffItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("mortar_and_pestle");
		}

		@Override
		public boolean hasContainerItem() {
			return true;
		}

		@Override
		public ItemStack getContainerItem(ItemStack itemstack) {
			return new ItemStack(this);
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
