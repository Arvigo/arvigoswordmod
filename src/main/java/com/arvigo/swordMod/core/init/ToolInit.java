package com.arvigo.swordMod.core.init;


import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;


public class ToolInit {
	public static SwordItem SWORD = new SwordItem(ItemTier.DIAMOND, 1000, 1000.0f,
			new Item.Properties()
			.tab(ItemGroup.TAB_COMBAT)
			.durability(1000));
	
}
