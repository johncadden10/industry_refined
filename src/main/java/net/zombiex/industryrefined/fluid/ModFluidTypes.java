package net.zombiex.industryrefined.fluid;

import net.minecraft.ResourceLocationException;
import net.minecraft.client.searchtree.ResourceLocationSearchTree;
import net.minecraft.commands.arguments.ResourceLocationArgument;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zombiex.industryrefined.IndustryRefined;
import org.joml.Vector3f;

public class ModFluidTypes {

    public static final ResourceLocation WATER_STILL_RL = ResourceLocation.fromNamespaceAndPath("industryrefined", "block/crude_oil_still");
    public static final ResourceLocation WATER_FLOWING_RL = ResourceLocation.fromNamespaceAndPath("industryrefined", "block/crude_oil_flow");
    public static final ResourceLocation OIL_OVERLAY_RL = ResourceLocation.fromNamespaceAndPath("industryrefined", "misc/in_crude_oil");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, IndustryRefined.MOD_ID);

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, OIL_OVERLAY_RL,
                0xFFFFFFFF, new Vector3f(18f /255f, 11f /255f, 15f /255f), properties));
    }

    public static final RegistryObject<FluidType> CRUDE_OIL_FLUID_TYPE = register("crude_oil_fluid",
            FluidType.Properties.create()
                    .lightLevel(0)
                    .density(0)
                    .viscosity(0)
                    .canDrown(true)
                    .canSwim(false)
                    .canPushEntity(false)
                    .supportsBoating(false));

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}


