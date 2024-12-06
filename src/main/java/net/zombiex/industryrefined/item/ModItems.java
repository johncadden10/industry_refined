package net.zombiex.industryrefined.item;

import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zombiex.industryrefined.IndustryRefined;
import net.zombiex.industryrefined.fluid.ModFluids;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, IndustryRefined.MOD_ID);

    public static final RegistryObject<Item> DENSE_PLASTIC = ITEMS.register("dense_plastic",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THIN_PLASTIC = ITEMS.register( "thin_plastic",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRY_STEEL_ALLOY = ITEMS.register( "dry_steel_alloy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register( "steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUDE_OIL_BUCKET = ITEMS.register( "crude_oil_bucket",
            () -> new BucketItem(ModFluids.SOURCE_CRUDE_OIL,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
