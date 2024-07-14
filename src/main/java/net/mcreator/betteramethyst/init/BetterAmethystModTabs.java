
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betteramethyst.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.betteramethyst.BetterAmethystMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BetterAmethystModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterAmethystMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(BetterAmethystModItems.AMETHYSTSWORD.get());
			tabData.accept(BetterAmethystModItems.AMETHYSTARMOR_HELMET.get());
			tabData.accept(BetterAmethystModItems.AMETHYSTARMOR_CHESTPLATE.get());
			tabData.accept(BetterAmethystModItems.AMETHYSTARMOR_LEGGINGS.get());
			tabData.accept(BetterAmethystModItems.AMETHYSTARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(BetterAmethystModItems.AMETHYSTPICKAXE.get());
			tabData.accept(BetterAmethystModItems.AMETHYSTAXE.get());
			tabData.accept(BetterAmethystModItems.AMETHYSTSHOVEL.get());
			tabData.accept(BetterAmethystModItems.AMETHYSTHOE.get());
		}
	}
}
