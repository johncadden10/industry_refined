package net.zombiex.industryrefined.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zombiex.industryrefined.IndustryRefined;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, IndustryRefined.MOD_ID);

    public static final RegistryObject<Item> DENSE_PLASTIC = ITEMS.register("dense_plastic",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THIN_PLASTIC = ITEMS.register( "thin_plastic",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
