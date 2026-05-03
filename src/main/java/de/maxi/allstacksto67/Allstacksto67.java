package de.maxi.allstacksto67;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Allstacksto67 implements ModInitializer {

	public static final String MOD_ID = "allstacksto67";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("AllStacksTo67 loaded - all stackable items now stack to 67!");
	}
}
