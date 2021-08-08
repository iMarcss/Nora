package me.imarcss.nora.gui;

import java.awt.Color;
import java.io.IOException;

import me.imarcss.nora.Nora;
import me.imarcss.nora.module.RenderModule;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class MoveModuleScreen extends GuiScreen {
	
	private RenderModule dragging;
	private int dragX, dragY;
	
	@Override
	public void initGui() {
		super.initGui();
	}
	
	@Override
	public void onGuiClosed() {
		super.onGuiClosed();
	}
	
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		super.drawScreen(mouseX, mouseY, partialTicks);
		
		for(RenderModule m : Nora.modules.getRenderModules()) {
			if (m.isEnabled()) {
				m.renderDummy();
				Gui.drawRect(m.getX() - 2, m.getY() - 2, m.getX() + m.getWidth() + 2, m.getY() + m.getHeight() + 2, new Color(255,255,255,40).getRGB());
				if(m == dragging) {
					m.setX(dragX + mouseX);
		            m.setY(dragY + mouseY);
				}
			}
		}
	}
	
	@Override
	protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
		super.mouseClicked(mouseX, mouseY, mouseButton);
		for(RenderModule m : Nora.modules.getRenderModules()) {
			if (m.isHovered(mouseX, mouseY) && mouseButton == 0) {
				dragging = m;
	            dragX = m.getX() - mouseX;
	            dragY = m.getY() - mouseY;
	        }
		}
	}
	

	
	@Override
    public void mouseReleased(int mouseX, int mouseY, int state) {
		dragging = null;
    }
	
	@Override
	public boolean doesGuiPauseGame() {
		return true;
	}

	public static boolean isHover(int X, int Y, int W, int H, int mX, int mY) {
		return mX >= X && mX <= X + W && mY >= Y && mY <= Y + H;
	}

}
