package kendogggy.TestMod.registry;

import kendogggy.TestMod.items.OpIngot;
import kendogggy.TestMod.items.opPick;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Project: Test Mod
 * Created By: Kendogggy
 * DATE: 23/12/2016
 */
public class ItemRegistry
{
    public static Item.ToolMaterial OPITE = EnumHelper.addToolMaterial("OPITE",10,-1,200.0F, 200.0F,22);
    public static Item OPPick;
    public static Item OPIngot;



    public static void init() {

        //ITEMS
        //OP INGOT
        OPIngot = new OpIngot();
        GameRegistry.register(OPIngot);
        GameRegistry.addShapelessRecipe(new ItemStack(OPIngot, 1), new ItemStack(Blocks.DIAMOND_BLOCK), new ItemStack(Blocks.GOLD_BLOCK), new ItemStack(Blocks.IRON_BLOCK));

        //BLOCKS


        //TOOLS
        //OP PICKAXE
        OPPick = new opPick();
        GameRegistry.register(OPPick);
        GameRegistry.addRecipe(new ShapedOreRecipe(OPPick, "ooo", " s ", " s ", 'o', OPIngot, 's', Items.STICK));



    }
}
