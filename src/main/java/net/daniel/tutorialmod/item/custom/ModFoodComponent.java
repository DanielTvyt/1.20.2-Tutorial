package net.daniel.tutorialmod.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponent {
    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).
            statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 200),0.25f).build();
}
