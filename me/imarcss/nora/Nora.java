package me.imarcss.nora;

import me.imarcss.nora.event.Event;
import me.imarcss.nora.event.impl.EventTick;
import me.imarcss.nora.gui.MoveModuleScreen;
import me.imarcss.nora.module.ModuleManager;
import net.minecraft.client.Minecraft;

public class Nora {
	
	private static Minecraft mc = Minecraft.getMinecraft();
	
	public static String name = "Nora", version = "1.0";
	
	public static ModuleManager modules;
	
	public static void start() {
		System.out.println("Nora client started!");
		
		modules = new ModuleManager();
	}
	
	public static void stop() {
		System.out.println("Nora client shutdown!");
	}
	
	public static void onEvent(Event e) {
		if(e instanceof EventTick) {
			if(mc.gameSettings.CLICK_GUI.isPressed()) {
				mc.displayGuiScreen(new MoveModuleScreen());
			}
		}
	}

}
