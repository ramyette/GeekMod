package dev.ramyette.geekmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GeekMod implements ModInitializer {
	public static final String MOD_ID = "geekmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		ModItems.initialize();
	}
}