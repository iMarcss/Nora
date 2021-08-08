package me.imarcss.nora.module;

import net.minecraft.client.gui.FontRenderer;

public class RenderModule extends Module {
	
	public FontRenderer fr;
	public int xPos = 10;
	public int yPos = 10;

	public RenderModule(String name, String description) {
		super(name, description);
		fr = mc.fontRendererObj;
		this.enabled = true;
	}

	public boolean isHovered(int mouseX, int mouseY) {
		return mouseX >= xPos && mouseX <= xPos + getWidth() && mouseY >= yPos && mouseY <= yPos + getHeight();
	}
	
	public int getX() {
		return xPos;
	}
	
	public int getY() {
		return yPos;
	}
	
	public void setX(int x) {
		this.xPos = x;
	}
	
	public void setY(int y) {
		this.yPos = y;
	}
	
	public int getWidth() {
		return 0;
	}
	
	public int getHeight() {
		return 0;
	}
	
	public void render() {
		
	}
	
	public void renderDummy() {
		
	}
	
}
