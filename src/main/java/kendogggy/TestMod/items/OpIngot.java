package kendogggy.TestMod.items;

import kendogggy.TestMod.TestMod;
import net.minecraft.item.Item;

/**
 * Project: TestMod
 * Package: kendogggy.TestMod.items
 * Created By: Kendogggy
 * DATE: 23/12/2016
 */
public class OpIngot extends Item
{
    public OpIngot()
    {
        super();
        setCreativeTab(TestMod.tabTestMod);
        setUnlocalizedName("opingot");
        setRegistryName(TestMod.MODID,"opingot");
    }
}
