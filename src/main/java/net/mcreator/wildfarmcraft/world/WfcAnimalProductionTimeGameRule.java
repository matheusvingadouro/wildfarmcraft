package net.mcreator.wildfarmcraft.world;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import net.mcreator.wildfarmcraft.WildfarmcraftModElements;

import java.lang.reflect.Method;

@WildfarmcraftModElements.ModElement.Tag
public class WfcAnimalProductionTimeGameRule extends WildfarmcraftModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.IntegerValue> gamerule = GameRules.register("wfcAnimalProductionTime", GameRules.Category.MOBS,
			create(6000));
	public WfcAnimalProductionTimeGameRule(WildfarmcraftModElements instance) {
		super(instance, 392);
	}

	public static GameRules.RuleType<GameRules.IntegerValue> create(int defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.IntegerValue.class, "func_223559_b", int.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.IntegerValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
