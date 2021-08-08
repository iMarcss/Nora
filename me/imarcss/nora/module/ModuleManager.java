package me.imarcss.nora.module;

import java.util.ArrayList;
import java.util.List;

import me.imarcss.nora.gui.MoveModuleScreen;
import me.imarcss.nora.module.render.TestModule;
import net.minecraft.client.Minecraft;

public class ModuleManager {
	
    public Minecraft mc = Minecraft.getMinecraft();
	
	public ArrayList<Module> modules = new ArrayList<>();
	
	public ModuleManager() {
		modules.add(new TestModule());
	}
	
	public List<RenderModule> getRenderModules() {
		List<RenderModule> renders = new ArrayList<>();
		for(Module m : modules) {
			if(m instanceof RenderModule) {
				renders.add((RenderModule) m);
			}
		}
		return renders;
	}
	
	public void renderHook() {
    	for(RenderModule m : getRenderModules()) {
			if (m.isEnabled() && !(mc.currentScreen instanceof MoveModuleScreen)) {
    			m.render();
    		}
    	}
    }

}
