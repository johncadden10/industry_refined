package net.zombiex.industryrefined.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.zombiex.industryrefined.IndustryRefined;
import net.zombiex.industryrefined.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IndustryRefined.MOD_ID);

    public static final RegistryObject<CreativeModeTab> INDUSTRY_REFINED_TAB = CREATIVE_MODE_TABS.register("industry_refined_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DENSE_PLASTIC.get()))
                    .title(Component.translatable("creativetab.industryrefined.industry_refined_items"))
                    .displayItems((ItemDisplayParameters, output) -> {
                        output.accept(ModItems.CRUDE_OIL_BUCKET.get());
                        output.accept(ModItems.DENSE_PLASTIC.get());
                        output.accept(ModItems.THIN_PLASTIC.get());
                        output.accept(ModItems.DRY_STEEL_ALLOY.get());
                        output.accept(ModItems.STEEL_INGOT.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> INDUSTRY_REFINED_TEST_TAB = CREATIVE_MODE_TABS.register("industry_refined_test_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.STEEL_BLOCK.get()))
                    .withTabsBefore(INDUSTRY_REFINED_TAB.getId())
                    .title(Component.translatable("creativetab.industryrefined.industry_refined_test"))
                    .displayItems((ItemDisplayParameters, output) -> {
                        output.accept(ModBlocks.REFINERY.get());
                        output.accept(ModBlocks.PLASTIC_BLOCK.get());
                        output.accept(ModBlocks.DRY_STEEL_ALLOY_BLOCK.get());
                        output.accept(ModBlocks.STEEL_BLOCK.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
