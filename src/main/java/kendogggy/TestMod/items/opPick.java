package kendogggy.TestMod.items;

import kendogggy.TestMod.TestMod;
import kendogggy.TestMod.registry.ItemRegistry;
import net.minecraft.item.ItemPickaxe;

/**
 * Created by kenny on 23/12/2016.
 */
public class opPick extends ItemPickaxe {

    public opPick() {
        super(ItemRegistry.OPITE);
        setCreativeTab(TestMod.tabTestMod);
        setUnlocalizedName("oppick");
        setRegistryName(TestMod.MODID, "oppick");

    }

}
