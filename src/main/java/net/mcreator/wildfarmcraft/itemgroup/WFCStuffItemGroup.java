
package net.mcreator.wildfarmcraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.wildfarmcraft.item.BlowinghornItem;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;

@WildfarmcraftModElements.ModElement.Tag
public class WFCStuffItemGroup extends WildfarmcraftModElements.ModElement {
	public WFCStuffItemGroup(WildfarmcraftModElements instance) {
		super(instance, 83);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabwfc_stuff") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BlowinghornItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
