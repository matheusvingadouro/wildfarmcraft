package net.mcreator.wildfarmcraft.world;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import net.mcreator.wildfarmcraft.WildfarmcraftModElements;

import java.lang.reflect.Method;

@WildfarmcraftModElements.ModElement.Tag
public class DoWFCReplaceVanillaGameRule extends WildfarmcraftModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.BooleanValue> gamerule = GameRules.register("doWFCReplaceVanilla", GameRules.Category.MOBS,
			create(true));
	public DoWFCReplaceVanillaGameRule(WildfarmcraftModElements instance) {
		super(instance, 216);
	}

	public static GameRules.RuleType<GameRules.BooleanValue> create(boolean defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.BooleanValue.class, "func_223568_b", boolean.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.BooleanValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
