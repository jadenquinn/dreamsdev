
package to.us.iredmc.dreams.item;

import to.us.iredmc.dreams.itemgroup.DreamsItemGroup;
import to.us.iredmc.dreams.DreamsModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

@DreamsModElements.ModElement.Tag
public class ChokingwheezediscItem extends DreamsModElements.ModElement {
	@ObjectHolder("dreams:chokingwheezedisc")
	public static final Item block = null;
	public ChokingwheezediscItem(DreamsModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, DreamsModElements.sounds.get(new ResourceLocation("dreams:chokingwheeze")),
					new Item.Properties().group(DreamsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("chokingwheezedisc");
		}
	}
}
