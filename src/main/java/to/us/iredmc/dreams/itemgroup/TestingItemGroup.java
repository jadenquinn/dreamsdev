
package to.us.iredmc.dreams.itemgroup;

import to.us.iredmc.dreams.DreamsModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

@DreamsModElements.ModElement.Tag
public class TestingItemGroup extends DreamsModElements.ModElement {
	public TestingItemGroup(DreamsModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtesting") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.TNT, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
