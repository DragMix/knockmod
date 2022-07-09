package com.flynn21.knockmod.init;

import com.flynn21.knockmod.items.MaterialItem;
import com.flynn21.knockmod.knockmod;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, knockmod.MOD_ID);

    public static final RegistryObject<Item> NEPHRITE = ITEMS.register("nephrite", MaterialItem::new);
}
