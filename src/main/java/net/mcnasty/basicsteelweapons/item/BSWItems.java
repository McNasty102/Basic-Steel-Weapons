package net.mcnasty.basicsteelweapons.item;

import net.mcnasty.basicsteelweapons.BasicSteelWeapons;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.seacroak.basicweapons.item.*;
import com.seacroak.basicweapons.registry.BWItems;

public class BSWItems {
	public static final DeferredRegister<Item> ITEMS = 
	        DeferredRegister.create(ForgeRegistries.ITEMS, BasicSteelWeapons.MODID);

	    public static final RegistryObject<Item> STEEL_HAMMER = ITEMS.register(
	        "steel_hammer", () -> new HammerItem(SteelTier.STEEL, BWItems.hammerDamage - 1, 
	        		BWItems.hammerSpeed, new Item.Properties()));
	    
	    public static final RegistryObject<Item> STEEL_CLUB = ITEMS.register(
		        "steel_club", () -> new ClubItem(SteelTier.STEEL, BWItems.clubDamage, 
		        		BWItems.clubSpeed, new Item.Properties()));

	    public static final RegistryObject<Item> STEEL_QUARTERSTAFF = ITEMS.register(
		        "steel_quarterstaff", () -> new QuarterstaffItem(SteelTier.STEEL, BWItems.quarterstaffDamage, 
		        		BWItems.quarterstaffSpeed, new Item.Properties()));

	    public static final RegistryObject<Item> STEEL_SPEAR = ITEMS.register(
		        "steel_spear", () -> new SpearItem(SteelTier.STEEL, BWItems.spearDamage, 
		        		BWItems.spearSpeed, new Item.Properties()));

	    public static final RegistryObject<Item> STEEL_GLAIVE = ITEMS.register(
		        "steel_glaive", () -> new GlaiveItem(SteelTier.STEEL, BWItems.glaiveDamage, 
		        		BWItems.glaiveSpeed, new Item.Properties()));

	    public static final RegistryObject<Item> STEEL_DAGGER = ITEMS.register(
		        "steel_dagger", () -> new DaggerItem(SteelTier.STEEL, BWItems.daggerDamage, 
		        		BWItems.daggerSpeed, new Item.Properties()));

	    public static void register(IEventBus eventBus){
	        ITEMS.register(eventBus);
	    }
}
