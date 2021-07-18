
package net.mcreator.wildfarmcraft.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.wildfarmcraft.item.PastureSeedItem;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;

@WildfarmcraftModElements.ModElement.Tag
public class StrawSeedsAsFuelFuel extends WildfarmcraftModElements.ModElement {
	public StrawSeedsAsFuelFuel(WildfarmcraftModElements instance) {
		super(instance, 258);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(PastureSeedItem.block, (int) (1)).getItem())
			event.setBurnTime(50);
	}
}
