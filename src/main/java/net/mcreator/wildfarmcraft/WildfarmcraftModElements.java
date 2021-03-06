/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package net.mcreator.wildfarmcraft;

import net.minecraftforge.forgespi.language.ModFileScanData;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.block.Block;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class WildfarmcraftModElements {
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<EntityType<?>>> entities = new ArrayList<>();
	public final List<Supplier<Enchantment>> enchantments = new ArrayList<>();
	public static Map<ResourceLocation, net.minecraft.util.SoundEvent> sounds = new HashMap<>();
	public WildfarmcraftModElements() {
		sounds.put(new ResourceLocation("wildfarmcraft", "blowing_horn"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("wildfarmcraft", "blowing_horn")));
		sounds.put(new ResourceLocation("wildfarmcraft", "duckamibent"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("wildfarmcraft", "duckamibent")));
		sounds.put(new ResourceLocation("wildfarmcraft", "duckhurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("wildfarmcraft", "duckhurt")));
		sounds.put(new ResourceLocation("wildfarmcraft", "ducklingambient"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("wildfarmcraft", "ducklingambient")));
		sounds.put(new ResourceLocation("wildfarmcraft", "ducklinghurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("wildfarmcraft", "ducklinghurt")));
		sounds.put(new ResourceLocation("wildfarmcraft", "chick"), new net.minecraft.util.SoundEvent(new ResourceLocation("wildfarmcraft", "chick")));
		sounds.put(new ResourceLocation("wildfarmcraft", "chickhurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("wildfarmcraft", "chickhurt")));
		sounds.put(new ResourceLocation("wildfarmcraft", "turkey"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("wildfarmcraft", "turkey")));
		sounds.put(new ResourceLocation("wildfarmcraft", "turkeyhurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("wildfarmcraft", "turkeyhurt")));
		sounds.put(new ResourceLocation("wildfarmcraft", "rooster"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("wildfarmcraft", "rooster")));
		sounds.put(new ResourceLocation("wildfarmcraft", "bison"), new net.minecraft.util.SoundEvent(new ResourceLocation("wildfarmcraft", "bison")));
		sounds.put(new ResourceLocation("wildfarmcraft", "bisonhurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("wildfarmcraft", "bisonhurt")));
		sounds.put(new ResourceLocation("wildfarmcraft", "deer"), new net.minecraft.util.SoundEvent(new ResourceLocation("wildfarmcraft", "deer")));
		sounds.put(new ResourceLocation("wildfarmcraft", "deerdeath"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("wildfarmcraft", "deerdeath")));
		sounds.put(new ResourceLocation("wildfarmcraft", "goatdeath"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("wildfarmcraft", "goatdeath")));
		sounds.put(new ResourceLocation("wildfarmcraft", "goat"), new net.minecraft.util.SoundEvent(new ResourceLocation("wildfarmcraft", "goat")));
		sounds.put(new ResourceLocation("wildfarmcraft", "goathurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("wildfarmcraft", "goathurt")));
		try {
			ModFileScanData modFileInfo = ModList.get().getModFileById("wildfarmcraft").getFile().getScanResult();
			Set<ModFileScanData.AnnotationData> annotations = modFileInfo.getAnnotations();
			for (ModFileScanData.AnnotationData annotationData : annotations) {
				if (annotationData.getAnnotationType().getClassName().equals(ModElement.Tag.class.getName())) {
					Class<?> clazz = Class.forName(annotationData.getClassType().getClassName());
					if (clazz.getSuperclass() == WildfarmcraftModElements.ModElement.class)
						elements.add((WildfarmcraftModElements.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(WildfarmcraftModElements.ModElement::initElements);
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
	private int messageID = 0;
	public <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, PacketBuffer> encoder, Function<PacketBuffer, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		WildfarmcraftMod.PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<EntityType<?>>> getEntities() {
		return entities;
	}

	public List<Supplier<Enchantment>> getEnchantments() {
		return enchantments;
	}
	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}
		protected final WildfarmcraftModElements elements;
		protected final int sortid;
		public ModElement(WildfarmcraftModElements elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLCommonSetupEvent event) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		@OnlyIn(Dist.CLIENT)
		public void clientLoad(FMLClientSetupEvent event) {
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}
