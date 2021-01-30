package to.us.jadenswebmc.dreams.procedures;

import to.us.jadenswebmc.dreams.DreamsModElements;
import to.us.jadenswebmc.dreams.DreamsMod;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import java.util.Map;

@DreamsModElements.ModElement.Tag
public class GhostburEntityItIsStruckByLightningProcedure extends DreamsModElements.ModElement {
	public GhostburEntityItIsStruckByLightningProcedure(DreamsModElements instance) {
		super(instance, 25);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DreamsMod.LOGGER.warn("Failed to load dependency x for procedure GhostburEntityItIsStruckByLightning!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DreamsMod.LOGGER.warn("Failed to load dependency y for procedure GhostburEntityItIsStruckByLightning!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DreamsMod.LOGGER.warn("Failed to load dependency z for procedure GhostburEntityItIsStruckByLightning!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DreamsMod.LOGGER.warn("Failed to load dependency world for procedure GhostburEntityItIsStruckByLightning!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof ServerWorld) {
			((World) world).getServer().getCommandManager().handleCommand(new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z),
					Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
					"kill @p");
		}
	}
}
