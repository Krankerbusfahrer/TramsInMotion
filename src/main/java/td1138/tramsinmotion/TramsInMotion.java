package td1138.tramsinmotion;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import td1138.tramsinmotion.core.CommonProxy;
import td1138.tramsinmotion.entities.rollingstock.*;
import td1138.tramsinmotion.entities.trains.*;
import td1138.tramsinmotion.items.TramsInMotiontems;
import td1138.tramsinmotion.library.TramsInMotionInfo;
import td1138.tramsinmotion.recipes.TramsInMotiontemsRecipeHandler;
import train.common.api.AbstractTrains;
import train.common.core.CreativeTabTraincraft;
import train.common.core.handlers.CraftingHandler;
import train.common.library.TraincraftRegistry;

@Mod(modid = TramsInMotionInfo.modID, version = TramsInMotionInfo.modVersion, name = TramsInMotionInfo.modName ,dependencies = "required-after:tc")
public class TramsInMotion {

	public static CreativeTabTraincraft tabTramsInMotion;


	@Mod.Instance(TramsInMotionInfo.modID)
	public static TramsInMotion instance;

	@SidedProxy(clientSide = "td1138.tramsinmotion.core.ClientProxy", serverSide = "td1138.tramsinmotion.core.CommonProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

		tabTramsInMotion = new CreativeTabTraincraft("Trams In Motion", TramsInMotionInfo.modID, "trains/timLogo");
		TraincraftRegistry.registerTransports("", listSteamTrains());
		TraincraftRegistry.registerTransports("", listFreight());
		TraincraftRegistry.registerTransports("", listPassenger());
		TraincraftRegistry.registerTransports("", listTanker());
		TraincraftRegistry.registerTransports("", listElectricTrains());
		TraincraftRegistry.registerTransports("", listDieselTrains());
		TraincraftRegistry.registerTransports("", listTender());

		TramsInMotiontems.init();
		TramsInMotiontemsRecipeHandler.init();

		/* GUI handler initiation */
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);
		FMLCommonHandler.instance().bus().register(new CraftingHandler());

	}


	public static AbstractTrains[] listElectricTrains() {
		return new AbstractTrains[]{
				new EntityLocoElectricCStockEngine(null),
				new EntityLocoElectricDStockEngine(null),
				new EntityLocoElectricClass88(null),
				new EntityLocoElectricHLEClass18(null),
		};
	}

	public static AbstractTrains[] listDieselTrains() {
		return new AbstractTrains[]{
				new EntityLocoDieselClass74(null),
				new EntityLocoDieselClass68(null),
		};
	}

	public static AbstractTrains[] listSteamTrains() {

		return new AbstractTrains[]{
				//new EntityLocoGWRMogul(null),
		};
	}

	public static AbstractTrains[] listPassenger() {

		return new AbstractTrains[]{
				new EntityPassengerCStockPassenger(null),
				new EntityPassengerDStockPassenger(null),
				new EntityPassengerBRMk3Sleeper(null),
				new EntityPassengerSNCBM6(null),
				new EntityPassengerSNCBM6Tail(null),
		};
	}

	public static AbstractTrains[] listFreight() {

		return new AbstractTrains[]{
				new EntityFreightLessCoWagon(null),
		};
	}

	public static AbstractTrains[] listTanker() {

		return new AbstractTrains[]{};
	}

	public static AbstractTrains[] listTender() {

		return new AbstractTrains[]{
				new EntityTenderChurchward3500Gal(null),
		};
	}
}
