package net.mcreator.wildfarmcraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.state.Property;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.wildfarmcraft.block.PastureGrownBlock;
import net.mcreator.wildfarmcraft.block.PastureBlock;
import net.mcreator.wildfarmcraft.block.BreakingBlock;
import net.mcreator.wildfarmcraft.WildfarmcraftModElements;
import net.mcreator.wildfarmcraft.WildfarmcraftMod;

import java.util.Map;
import java.util.HashMap;

@WildfarmcraftModElements.ModElement.Tag
public class MedHerbivoreFeedProcedure extends WildfarmcraftModElements.ModElement {
	public MedHerbivoreFeedProcedure(WildfarmcraftModElements instance) {
		super(instance, 59);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency entity for procedure MedHerbivoreFeed!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency x for procedure MedHerbivoreFeed!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency y for procedure MedHerbivoreFeed!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency z for procedure MedHerbivoreFeed!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				WildfarmcraftMod.LOGGER.warn("Failed to load dependency world for procedure MedHerbivoreFeed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((entity.getPersistentData().getDouble("Stomach")) <= (-25))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 1200, (int) 1));
		}
		if (((entity.getPersistentData().getDouble("Stomach")) > 50)) {
			entity.getPersistentData().putDouble("Stomach", 50);
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ParticlesProcedure.executeProcedure($_dependencies);
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).setHealth((float) ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1));
		}
		if ((Math.random() < 0.05)) {
			if (((entity.getPersistentData().getDouble("Stomach")) < 50)) {
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.GRASS.getDefaultState().getBlock())) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						BlockState _bs = BreakingBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 1, false);
					}
					entity.getPersistentData().putDouble("Stomach", ((entity.getPersistentData().getDouble("Stomach")) + 5));
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND.getDefaultState()
						.getBlock())) {
					if ((!(((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
							|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == PastureGrownBlock.block
									.getDefaultState().getBlock())
									|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == PastureBlock.block
											.getDefaultState().getBlock()))))) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = Blocks.AIR.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")),
									SoundCategory.NEUTRAL, (float) 0.5, (float) 1);
						} else {
							((World) world).playSound(x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")),
									SoundCategory.NEUTRAL, (float) 0.5, (float) 1, false);
						}
						entity.getPersistentData().putDouble("Stomach", ((entity.getPersistentData().getDouble("Stomach")) + 10));
					}
				}
				if ((BlockTags.getCollection().getTagByID(new ResourceLocation(("flowers").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						BlockState _bs = BreakingBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					{
						BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
						BlockState _bs = BreakingBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 1, false);
					}
					entity.getPersistentData().putDouble("Stomach", ((entity.getPersistentData().getDouble("Stomach")) + 5));
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.TALL_GRASS.getDefaultState().getBlock())) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						BlockState _bs = BreakingBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					{
						BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
						BlockState _bs = BreakingBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 1, false);
					}
					entity.getPersistentData().putDouble("Stomach", ((entity.getPersistentData().getDouble("Stomach")) + 10));
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.MELON.getDefaultState().getBlock())) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
						BlockState _bs = BreakingBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 1, false);
					}
					entity.getPersistentData().putDouble("Stomach", ((entity.getPersistentData().getDouble("Stomach")) + 15));
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.PUMPKIN.getDefaultState()
						.getBlock())) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
						BlockState _bs = BreakingBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 1, false);
					}
					entity.getPersistentData().putDouble("Stomach", ((entity.getPersistentData().getDouble("Stomach")) + 15));
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.SWEET_BERRY_BUSH.getDefaultState()
						.getBlock())) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						BlockState _bs = BreakingBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 1, false);
					}
					entity.getPersistentData().putDouble("Stomach", ((entity.getPersistentData().getDouble("Stomach")) + 15));
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.HAY_BLOCK.getDefaultState()
						.getBlock())) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
						BlockState _bs = BreakingBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 1, false);
					}
					entity.getPersistentData().putDouble("Stomach", ((entity.getPersistentData().getDouble("Stomach")) + 100));
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == PastureGrownBlock.block.getDefaultState()
						.getBlock())) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						BlockState _bs = PastureBlock.block.getDefaultState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
							if (_property != null && _bs.get(_property) != null)
								try {
									_bs = _bs.with(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlockState(_bp, _bs, 3);
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 1, false);
					}
					entity.getPersistentData().putDouble("Stomach", ((entity.getPersistentData().getDouble("Stomach")) + 5));
				}
			}
		}
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("entity", entity);
			CalmingDownProcedure.executeProcedure($_dependencies);
		}
	}
}
