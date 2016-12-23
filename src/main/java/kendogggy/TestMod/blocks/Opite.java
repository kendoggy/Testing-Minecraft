package kendogggy.TestMod.blocks;

import kendogggy.TestMod.TestMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Project: Testing-Minecraft
 * Package: kendogggy.TestMod.blocks
 * Created By: Kendogggy
 * DATE: 24/12/2016
 */
public class Opite extends Block
{
    public Opite()
    {
        super(Material.IRON);
        setUnlocalizedName("opite");
        setRegistryName(TestMod.MODID,"opite");
    }
}
