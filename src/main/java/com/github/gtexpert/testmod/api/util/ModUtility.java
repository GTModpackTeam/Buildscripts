package com.github.gtexpert.testmod.api.util;

import com.github.gtexpert.testmod.api.ModValues;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class ModUtility {
    public static @NotNull ResourceLocation id(String path) {
        return new ResourceLocation(ModValues.MODID, path);
    }
}
