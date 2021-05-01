package to.us.iredmc.dreams.procedures;

import to.us.iredmc.dreams.entity.DeltaNinjaDreamEntity;
import to.us.iredmc.dreams.DreamsModElements;
import to.us.iredmc.dreams.DreamsMod;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import java.util.Map;

@DreamsModElements.ModElement.Tag
public class GeorgenotfoundItIsStruckByLightningProcedure extends DreamsModElements.ModElement {
	public GeorgenotfoundItIsStruckByLightningProcedure(DreamsModElements instance) {
		super(instance, 11);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DreamsMod.LOGGER.warn("Failed to load dependency x for procedure GeorgenotfoundItIsStruckByLightning!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DreamsMod.LOGGER.warn("Failed to load dependency y for procedure GeorgenotfoundItIsStruckByLightning!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DreamsMod.LOGGER.warn("Failed to load dependency z for procedure GeorgenotfoundItIsStruckByLightning!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DreamsMod.LOGGER.warn("Failed to load dependency world for procedure GeorgenotfoundItIsStruckByLightning!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new DeltaNinjaDreamEntity.CustomEntity(DeltaNinjaDreamEntity.entity, (World) world);
			entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
	}
}
