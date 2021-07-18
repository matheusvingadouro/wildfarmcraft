
package net.mcreator.wildfarmcraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.wildfarmcraft.item.BagBigHerbivoreFoodsItem;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;

@WildfarmcraftModElements.ModElement.Tag
public class WildFarmCraftSpawnEggsItemGroup extends WildfarmcraftModElements.ModElement {
	public WildFarmCraftSpawnEggsItemGroup(WildfarmcraftModElements instance) {
		super(instance, 32);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabwild_farm_craft_spawn_eggs") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BagBigHerbivoreFoodsItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
