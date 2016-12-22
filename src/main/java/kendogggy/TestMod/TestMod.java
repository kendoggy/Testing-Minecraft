package kendogggy.TestMod;

import kendogggy.TestMod.proxy.common;
import kendogggy.TestMod.registry.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TestMod.MODID, version = TestMod.VERSION)
public class TestMod
{
    public static final String MODID = "testmod";
    public static final String VERSION = "0.01";
    
    @SidedProxy(clientSide="kendogggy.TestMod.proxy.ClientProxy", serverSide="kendogggy.TestMod.proxy.common")
    public static common proxy;

    public static CreativeTabs tabTestMod = new CreativeTabs(MODID) {

        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Blocks.DIAMOND_BLOCK);
        }
    };

    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
        ItemRegistry.init();
        proxy.registerRenderers();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
}
