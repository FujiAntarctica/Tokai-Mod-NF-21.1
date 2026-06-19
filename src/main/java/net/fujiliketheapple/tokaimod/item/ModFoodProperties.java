package net.fujiliketheapple.tokaimod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties COTTON_CANDY = new FoodProperties.Builder().nutrition(1).saturationModifier(0.25f)
            .alwaysEdible().fast().effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 200), 1f).build();
    public static final FoodProperties HOT_DOG = new FoodProperties.Builder().nutrition(3).saturationModifier(0.0625f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100), 1f).build();
    public static final FoodProperties SODA = new FoodProperties.Builder().nutrition(1).saturationModifier(0.25f)
            .alwaysEdible().fast().effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 1f).build();
    public static final FoodProperties POPCORN = new FoodProperties.Builder().nutrition(1).saturationModifier(0.25f)
            .alwaysEdible().fast().effect(() -> new MobEffectInstance(MobEffects.JUMP, 200), 1f).build();
    public static final FoodProperties PEANUTS = new FoodProperties.Builder().nutrition(1).saturationModifier(0.25f)
            .alwaysEdible().fast().effect(() -> new MobEffectInstance(MobEffects.POISON, 100), 1f).build();



}
