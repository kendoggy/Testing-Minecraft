package kendogggy.TestMod.registry;

import kendogggy.TestMod.blocks.Opite;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Project: Testing-Minecraft
 * Package: ${PACKAGE_NAME}
 * Created By: Kendogggy
 * DATE: 23/12/2016
 */
public class BlockRegistry
{
    public static Block blockOPite;



    public static void init()
    {
        blockOPite = new Opite();
        GameRegistry.register(blockOPite);
        GameRegistry.register(new ItemBlock(blockOPite).setRegistryName(blockOPite.getRegistryName()));
        GameRegistry.addRecipe(new ItemStack(blockOPite), "ooo",
                                                          "ooo",
                                                          "ooo",'o',ItemRegistry.OPIngot);


    }
}
