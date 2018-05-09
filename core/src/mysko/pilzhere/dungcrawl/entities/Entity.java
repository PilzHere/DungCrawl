/**
 * 
 */
package mysko.pilzhere.dungcrawl.entities;

import mysko.pilzhere.dungcrawl.screens.GameScreen;

/**
 * @author PilzHere
 *
 */
public class Entity {
	private GameScreen screen;
	
	public boolean render = false;
	
	public Entity(GameScreen screen) {
		this.screen = screen;
		
	}
	
	public void input(float delta) {
		
	}
	
	public void tick(float delta) {
		
	}
	
	public void render(float delta) {
		
	}
}
