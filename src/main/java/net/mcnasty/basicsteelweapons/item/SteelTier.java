package net.mcnasty.basicsteelweapons.item;

import java.util.List;

import net.mcnasty.basicsteelweapons.BasicSteelWeapons;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import goldenmaussteeltools.init.GoldenmausSteelToolsModItems;

public class SteelTier {
	public static final Tier STEEL = TierSortingRegistry.registerTier(
			new ForgeTier(3, 500, 7f, 3f, 12, BlockTags.NEEDS_DIAMOND_TOOL, 
					() -> Ingredient.of(GoldenmausSteelToolsModItems.STEEL_INGOT.get())), 
			new ResourceLocation(BasicSteelWeapons.MODID, "steel"), 
			List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
}
