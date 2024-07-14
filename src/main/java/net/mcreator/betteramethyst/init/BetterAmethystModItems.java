
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betteramethyst.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.betteramethyst.item.AmethystswordItem;
import net.mcreator.betteramethyst.item.AmethystshovelItem;
import net.mcreator.betteramethyst.item.AmethystpickaxeItem;
import net.mcreator.betteramethyst.item.AmethysthoeItem;
import net.mcreator.betteramethyst.item.AmethystaxeItem;
import net.mcreator.betteramethyst.item.AmethystarmorItem;
import net.mcreator.betteramethyst.BetterAmethystMod;

public class BetterAmethystModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BetterAmethystMod.MODID);
	public static final RegistryObject<Item> AMETHYSTSWORD = REGISTRY.register("amethystsword", () -> new AmethystswordItem());
	public static final RegistryObject<Item> AMETHYSTPICKAXE = REGISTRY.register("amethystpickaxe", () -> new AmethystpickaxeItem());
	public static final RegistryObject<Item> AMETHYSTAXE = REGISTRY.register("amethystaxe", () -> new AmethystaxeItem());
	public static final RegistryObject<Item> AMETHYSTSHOVEL = REGISTRY.register("amethystshovel", () -> new AmethystshovelItem());
	public static final RegistryObject<Item> AMETHYSTHOE = REGISTRY.register("amethysthoe", () -> new AmethysthoeItem());
	public static final RegistryObject<Item> AMETHYSTARMOR_HELMET = REGISTRY.register("amethystarmor_helmet", () -> new AmethystarmorItem.Helmet());
	public static final RegistryObject<Item> AMETHYSTARMOR_CHESTPLATE = REGISTRY.register("amethystarmor_chestplate", () -> new AmethystarmorItem.Chestplate());
	public static final RegistryObject<Item> AMETHYSTARMOR_LEGGINGS = REGISTRY.register("amethystarmor_leggings", () -> new AmethystarmorItem.Leggings());
	public static final RegistryObject<Item> AMETHYSTARMOR_BOOTS = REGISTRY.register("amethystarmor_boots", () -> new AmethystarmorItem.Boots());
	// Start of user code block custom items
	// End of user code block custom items
}
