
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
public class CookedVenisonItem extends WildfarmcraftModElements.ModElement {
	@ObjectHolder("wildfarmcraft:cooked_venison")
	public static final Item block = null;
	public CookedVenisonItem(WildfarmcraftModElements instance) {
		super(instance, 385);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(8).saturation(12.8f).meat().build()));
			setRegistryName("cooked_venison");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
