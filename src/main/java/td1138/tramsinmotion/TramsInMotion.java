package td1138.tramsinmotion;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import td1138.tramsinmotion.blocks.TramsIMBlocks;
import td1138.tramsinmotion.core.CommonProxy;
import td1138.tramsinmotion.entities.rollingstock.*;
import td1138.tramsinmotion.entities.trains.*;
import td1138.tramsinmotion.items.TramsInMotiontems;
import td1138.tramsinmotion.library.TramsInMotionInfo;
import td1138.tramsinmotion.recipes.TramsInMotiontemsRecipeHandler;
import td1138.tramsinmotion.tile.poles.TileCenteredPole;
import td1138.tramsinmotion.tile.poles.TileLFPlatformFenced;
import td1138.tramsinmotion.tile.poles.TileLFPlatformShelter;
import train.common.api.AbstractTrains;
import train.common.blocks.TCBlocks;
import train.common.core.CreativeTabTraincraft;
import train.common.core.handlers.CraftingHandler;
import train.common.core.handlers.PacketHandler;
import train.common.items.TCItems;
import train.common.library.TraincraftRegistry;

@Mod(modid = TramsInMotionInfo.modID, version = TramsInMotionInfo.modVersion, name = TramsInMotionInfo.modName ,dependencies = "required-after:tc")
public class TramsInMotion {

	public static CreativeTabTraincraft tabTramsInMotion;


	@Mod.Instance(TramsInMotionInfo.modID)
	public static TramsInMotion instance;

	@SidedProxy(clientSide = "td1138.tramsinmotion.core.ClientProxy", serverSide = "td1138.tramsinmotion.core.CommonProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void init(FMLPreInitializationEvent event) {

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
		TramsIMBlocks.init();

		/* GUI handler initiation */
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);
		FMLCommonHandler.instance().bus().register(new CraftingHandler());
		proxy.registerTileEntities();
		GameRegistry.registerTileEntity(TileCenteredPole.class, "TileCenteredPole");
		GameRegistry.registerTileEntity(TileLFPlatformFenced.class, "TileLFPlatformFenced");
		GameRegistry.registerTileEntity(TileLFPlatformShelter.class, "TileLFPlatformShelter");
		proxy.registerBookHandler();
		PacketHandler.init();
		proxy.registerRenderInformation();
		proxy.registerEvents(event);
	}


	public static AbstractTrains[] listElectricTrains() {
		return new AbstractTrains[]{
				new EntityLocoElectricGT6ERLoco(null),
				new EntityLocoElectricPT8Loco(null),
				new EntityLocoElectricMGTKLoco(null),
				new EntityLocoElectricB80DLoco(null),
				new EntityLocoElectricGT8NCDULoco(null),
		};
	}

	public static AbstractTrains[] listDieselTrains() {
		return new AbstractTrains[]{
		};
	}

	public static AbstractTrains[] listSteamTrains() {

		return new AbstractTrains[]{
		};
	}

	public static AbstractTrains[] listPassenger() {

		return new AbstractTrains[]{
				new EntityPassengerGT6ERTail(null),
				new EntityPassengerPT8Middle(null),
				new EntityPassengerMGTKTail(null),
				new EntityPassengerB80DTail(null),
				new EntityPassengerGT8NCDUMiddle(null),

		};
	}

	public static AbstractTrains[] listFreight() {

		return new AbstractTrains[]{
		};
	}

	public static AbstractTrains[] listTanker() {

		return new AbstractTrains[]{};
	}

	public static AbstractTrains[] listTender() {

		return new AbstractTrains[]{
		};
	}
}
