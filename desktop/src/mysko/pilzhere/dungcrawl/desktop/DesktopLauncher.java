package mysko.pilzhere.dungcrawl.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.Color;

import mysko.pilzhere.dungcrawl.DungCrawl;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.title = "DungCrawl";
		config.fullscreen = false;
		config.resizable = true;
		config.width = 1280;
		config.height = 720;
		config.samples = 0;
		config.vSyncEnabled = false;
		config.initialBackgroundColor = Color.WHITE;
		config.foregroundFPS = 60;
		config.backgroundFPS = 60;
//		config.addIcon(path, fileType);
		
		new LwjglApplication(new DungCrawl(), config);
	}
}
