package mysko.pilzhere.dungcrawl;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.physics.box2d.Box2D;

import mysko.pilzhere.dungcrawl.assetmanagers.AssetsManager;
import mysko.pilzhere.dungcrawl.screens.GameScreen;

public class DungCrawl extends Game {	
	@Override
	public void create () {
		AssetsManager.loadFonts();
		AssetsManager.MANAGER.update();
		AssetsManager.MANAGER.finishLoading();
		AssetsManager.loadMaps();
		AssetsManager.MANAGER.update();
		AssetsManager.MANAGER.finishLoading();
		AssetsManager.loadTextures();
		AssetsManager.MANAGER.update();
		AssetsManager.MANAGER.finishLoading();
		AssetsManager.loadSounds();
		AssetsManager.MANAGER.update();
		AssetsManager.MANAGER.finishLoading();
		
		Box2D.init();
		
		this.setScreen(new GameScreen(this));
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(144f/256, 72f/256, 64f/256, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
		
		super.render();
	}
	
	@Override
	public void dispose () {
		super.dispose();
		
		AssetsManager.dispose();
	}
}
