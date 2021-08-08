package me.imarcss.nora.module.render;

import me.imarcss.nora.module.RenderModule;

public class TestModule extends RenderModule {

	public TestModule() {
		super("TestModule", "Testing the HUD");
	}
	
	@Override
	public void render() {
		fr.drawString("Testing!", getX(), getY(), -1);
	}
	
	@Override
	public void renderDummy() {
		fr.drawString("Testing!", getX(), getY(), -1);
	}
	
	@Override
	public int getWidth() {
		return fr.getStringWidth("Testin!");
	}
	
	@Override
	public int getHeight() {
		return fr.FONT_HEIGHT;
	}

}
