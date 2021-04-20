package com.arvigo.swordMod.core.init;

import com.arvigo.swordMod.SwordMod;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,			
			SwordMod.MOD_ID);			//makes blank DeferredRegister, which is how stuff is passed in 
	
	public static final RegistryObject<Item> example_item = ITEMS.register("example_item", 
				() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
	
										//assigns stuff to DeferredRegister, but it doesn't exist yet, need to call register in main class

	//BlockItems, so that the blocks can actually be used
	public static final RegistryObject<BlockItem> EXAMPLE_BLOCK = ITEMS.register("example_block", 
			() -> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	
	//public static final DeferredRegister<Item> SWORD = DeferredRegister.create(ForgeRegistries.ITEMS, SwordMod.MOD_ID); 
	
	public static final RegistryObject<SwordItem> EXAMPLE_SWORD = ITEMS.register("example_sword",
			() -> new SwordItem(ItemTier.DIAMOND, 1000, 1000.0f,
			new Item.Properties()
			.tab(ItemGroup.TAB_COMBAT)
			.durability(1000))); 
	
}
