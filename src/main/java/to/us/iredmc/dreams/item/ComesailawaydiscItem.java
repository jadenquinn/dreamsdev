
package to.us.iredmc.dreams.item;

import to.us.iredmc.dreams.itemgroup.DreamsItemGroup;
import to.us.iredmc.dreams.DreamsModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;

import java.util.List;

@DreamsModElements.ModElement.Tag
public class ComesailawaydiscItem extends DreamsModElements.ModElement {
	@ObjectHolder("dreams:comesailawaydisc")
	public static final Item block = null;
	public ComesailawaydiscItem(DreamsModElements instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, DreamsModElements.sounds.get(new ResourceLocation("dreams:comesailawaysong")),
					new Item.Properties().group(DreamsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("comesailawaydisc");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Enjoy This Copyrighted Music!"));
		}
	}
}
