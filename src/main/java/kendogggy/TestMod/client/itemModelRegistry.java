package kendogggy.TestMod.client;

import kendogggy.TestMod.registry.ItemRegistry;
import kendogggy.TestMod.util.BlockModelResolver;
import kendogggy.TestMod.util.ModelHelper;
import net.minecraftforge.common.MinecraftForge;

/**
 * Project: Test Mod
 * Created By: Kendogggy
 * DATE: 23/12/2016
 */
public class itemModelRegistry {

    public static void init()
    {
        ModelHelper.registerItemModel(ItemRegistry.OPPick,0);
        ModelHelper.registerItemModel(ItemRegistry.OPIngot,0);
        MinecraftForge.EVENT_BUS.register(new BlockModelResolver());


    }
}
