package net.mcnasty.basicsteelweapons.item;

import net.mcnasty.basicsteelweapons.BasicSteelWeapons;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BSWItem {
	public static final DeferredRegister<Item> ITEMS = 
	        DeferredRegister.create(ForgeRegistries.ITEMS, BasicSteelWeapons.MODID);

	    public static final RegistryObject<Item> STEEL_HAMMER = ITEMS.register(
	        "steel_hammer", 
	        () -> new Item(new Item.Properties())
	    );
	    
	    public static final RegistryObject<Item> STEEL_CLUB = ITEMS.register(
	        "steel_club", 
	        () -> new Item(new Item.Properties())
	    );

	    public static final RegistryObject<Item> STEEL_QUARTERSTAFF = ITEMS.register(
	        "steel_quarterstaff", 
	        () -> new Item(new Item.Properties())
	    );

	    public static final RegistryObject<Item> STEEL_SPEAR = ITEMS.register(
	        "steel_spear", 
	        () -> new Item(new Item.Properties())
	    );

	    public static final RegistryObject<Item> STEEL_GLAIVE = ITEMS.register(
	        "steel_glaive", 
	        () -> new Item(new Item.Properties())
	    );

	    public static final RegistryObject<Item> STEEL_DAGGER = ITEMS.register(
	        "steel_dagger", 
	        () -> new Item(new Item.Properties())
	    );

	    public static void register(IEventBus eventBus){
	        ITEMS.register(eventBus);
	    }
}
