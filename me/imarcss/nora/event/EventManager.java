package me.imarcss.nora.event;

import me.imarcss.nora.Nora;

public class EventManager {
	
	public static void call(Event e) {
		Nora.onEvent(e);
	}

}
