package com.flynn21.knockmod.items;

import com.flynn21.knockmod.utils.ModItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class MaterialItem extends Item {
     public MaterialItem() {
         super(new Item.Properties().group(ModItemGroup.MOD_MATERIALS_TAB));
     }

}
