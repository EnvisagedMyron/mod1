package name.modid.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;


public class ModFoodComponents {
    public final static FoodComponent TOMATO = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).
            statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION,10),0.25f).build();
}
