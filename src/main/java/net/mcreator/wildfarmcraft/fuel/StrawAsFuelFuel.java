
package net.mcreator.wildfarmcraft.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.wildfarmcraft.block.StrawHayBlock;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;

@WildfarmcraftModElements.ModElement.Tag
public class StrawAsFuelFuel extends WildfarmcraftModElements.ModElement {
	public StrawAsFuelFuel(WildfarmcraftModElements instance) {
		super(instance, 257);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(StrawHayBlock.block, (int) (1)).getItem())
			event.setBurnTime(300);
	}
}
