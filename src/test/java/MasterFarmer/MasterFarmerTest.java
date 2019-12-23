package MasterFarmer;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class MasterFarmerTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(MasterFarmerPlugin.class);
		RuneLite.main(args);
	}
}