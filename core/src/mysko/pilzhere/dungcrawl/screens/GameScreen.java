/**
 * 
 */
package mysko.pilzhere.dungcrawl.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.FrameBuffer;

import mysko.pilzhere.dungcrawl.DungCrawl;

/**
 * @author PilzHere
 *
 */
public class GameScreen implements Screen{
	public DungCrawl game;
	
	public SpriteBatch batch;
	public FrameBuffer fbo;
	
	public GameScreen(DungCrawl game) {
		this.game = game;
		
		if (fbo != null)
			fbo.dispose();
		fbo = new FrameBuffer(Format.RGB888, 854 / 4, 480 / 4, true);
		fbo.getColorBufferTexture().setFilter(TextureFilter.Nearest, TextureFilter.Nearest);

		if (batch != null)
			batch.dispose();
		batch = new SpriteBatch();
	}
	
	@Override
	public void show() {
		
	}

	private void input(float delta) {
		
	}
	
	private void tick(float delta) {
		input(delta);
	}
	
	@Override
	public void render(float delta) {
		tick(delta);
		
		fbo.begin();
		
		fbo.end();
		
		batch.begin();
		
		batch.draw(fbo.getColorBufferTexture(), Gdx.graphics.getWidth() / 2 - 854 / 2, Gdx.graphics.getHeight() / 2 - 480 / 2 + 120, 854, 480, 0, 0, 1, 1);
		
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void dispose() {
		batch.dispose();
		fbo.dispose();
	}
}
