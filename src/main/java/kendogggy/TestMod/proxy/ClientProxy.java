package kendogggy.TestMod.proxy;


import kendogggy.TestMod.client.itemModelRegistry;

public class ClientProxy extends common {
	
	@Override
	public void registerRenderers()
	{
		itemModelRegistry.init();

	}

}
