package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class Clicker extends Game {

	public static ScreenManager screenManager;

	public static Skin gameSkin;
	private final int width, height;

	public Clicker(int width, int height){
		this.width = width;
		this.height = height;
	}

	@Override
	public void create () {
		gameSkin  = new Skin(Gdx.files.internal("skin/glassy-ui.json"));
		new ScreenManager(this, width, height);
		ScreenManager.ChangeScreen("Tittle");

		this.setScreen(screenManager.getScreen());
	}

	@Override
	public void render () {
		super.render();

	}
	
	@Override
	public void dispose () {

	}
}
