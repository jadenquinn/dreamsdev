
package to.us.jadenswebmc.dreams.item;

import to.us.jadenswebmc.dreams.itemgroup.DreamsItemGroup;
import to.us.jadenswebmc.dreams.DreamsModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

@DreamsModElements.ModElement.Tag
public class ImgonnapeemyselfdiscItem extends DreamsModElements.ModElement {
	@ObjectHolder("dreams:imgonnapeemyselfdisc")
	public static final Item block = null;
	public ImgonnapeemyselfdiscItem(DreamsModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, DreamsModElements.sounds.get(new ResourceLocation("dreams:imgonnapeemyself")),
					new Item.Properties().group(DreamsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("imgonnapeemyselfdisc");
		}
	}
}
