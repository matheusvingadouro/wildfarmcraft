
package net.mcreator.wildfarmcraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.wildfarmcraft.WildfarmcraftModElements;

@WildfarmcraftModElements.ModElement.Tag
public class CheeseSliceItem extends WildfarmcraftModElements.ModElement {
	@ObjectHolder("wildfarmcraft:cheese_slice")
	public static final Item block = null;
	public CheeseSliceItem(WildfarmcraftModElements instance) {
		super(instance, 248);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(6).saturation(7.2f).build()));
			setRegistryName("cheese_slice");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
