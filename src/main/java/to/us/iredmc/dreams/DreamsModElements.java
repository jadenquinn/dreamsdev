/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package to.us.iredmc.dreams;

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

public class DreamsModElements {
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<EntityType<?>>> entities = new ArrayList<>();
	public final List<Supplier<Enchantment>> enchantments = new ArrayList<>();
	public static Map<ResourceLocation, net.minecraft.util.SoundEvent> sounds = new HashMap<>();
	public DreamsModElements() {
		sounds.put(new ResourceLocation("dreams", "mlgking"), new net.minecraft.util.SoundEvent(new ResourceLocation("dreams", "mlgking")));
		sounds.put(new ResourceLocation("dreams", "chokingwheeze"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dreams", "chokingwheeze")));
		sounds.put(new ResourceLocation("dreams", "chunkit"), new net.minecraft.util.SoundEvent(new ResourceLocation("dreams", "chunkit")));
		sounds.put(new ResourceLocation("dreams", "imgonnapeemyself"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dreams", "imgonnapeemyself")));
		sounds.put(new ResourceLocation("dreams", "mytrap"), new net.minecraft.util.SoundEvent(new ResourceLocation("dreams", "mytrap")));
		sounds.put(new ResourceLocation("dreams", "youjustgotpranked"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dreams", "youjustgotpranked")));
		sounds.put(new ResourceLocation("dreams", "dreamliterallychill"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dreams", "dreamliterallychill")));
		sounds.put(new ResourceLocation("dreams", "dreamhurt"), new net.minecraft.util.SoundEvent(new ResourceLocation("dreams", "dreamhurt")));
		sounds.put(new ResourceLocation("dreams", "dreamnoooo"), new net.minecraft.util.SoundEvent(new ResourceLocation("dreams", "dreamnoooo")));
		sounds.put(new ResourceLocation("dreams", "skelehole"), new net.minecraft.util.SoundEvent(new ResourceLocation("dreams", "skelehole")));
		sounds.put(new ResourceLocation("dreams", "georgecomingforme"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dreams", "georgecomingforme")));
		sounds.put(new ResourceLocation("dreams", "georgedeath"), new net.minecraft.util.SoundEvent(new ResourceLocation("dreams", "georgedeath")));
		sounds.put(new ResourceLocation("dreams", "georgehurt"), new net.minecraft.util.SoundEvent(new ResourceLocation("dreams", "georgehurt")));
		sounds.put(new ResourceLocation("dreams", "georgehurt2"), new net.minecraft.util.SoundEvent(new ResourceLocation("dreams", "georgehurt2")));
		sounds.put(new ResourceLocation("dreams", "georgedrinkingstahp"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dreams", "georgedrinkingstahp")));
		sounds.put(new ResourceLocation("dreams", "sapnapidle"), new net.minecraft.util.SoundEvent(new ResourceLocation("dreams", "sapnapidle")));
		sounds.put(new ResourceLocation("dreams", "sapnapdead"), new net.minecraft.util.SoundEvent(new ResourceLocation("dreams", "sapnapdead")));
		sounds.put(new ResourceLocation("dreams", "baddead1"), new net.minecraft.util.SoundEvent(new ResourceLocation("dreams", "baddead1")));
		sounds.put(new ResourceLocation("dreams", "comesailawaysong"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("dreams", "comesailawaysong")));
		try {
			ModFileScanData modFileInfo = ModList.get().getModFileById("dreams").getFile().getScanResult();
			Set<ModFileScanData.AnnotationData> annotations = modFileInfo.getAnnotations();
			for (ModFileScanData.AnnotationData annotationData : annotations) {
				if (annotationData.getAnnotationType().getClassName().equals(ModElement.Tag.class.getName())) {
					Class<?> clazz = Class.forName(annotationData.getClassType().getClassName());
					if (clazz.getSuperclass() == DreamsModElements.ModElement.class)
						elements.add((DreamsModElements.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(DreamsModElements.ModElement::initElements);
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
	private int messageID = 0;
	public <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, PacketBuffer> encoder, Function<PacketBuffer, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		DreamsMod.PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
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
		protected final DreamsModElements elements;
		protected final int sortid;
		public ModElement(DreamsModElements elements, int sortid) {
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
