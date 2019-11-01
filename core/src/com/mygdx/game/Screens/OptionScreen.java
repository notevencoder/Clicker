package com.mygdx.game.Screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.mygdx.game.Buttons.MenuButton;
import com.mygdx.game.Clicker;

public class OptionScreen implements Screen {

    Stage stage;
    Table table;
    Sprite sprite;
    MenuButton start;
    Game game;
    SpriteBatch batch;


    public OptionScreen(Game aGame){
        game = aGame;
        table = new Table();
        stage = new Stage();



        start = new MenuButton("Start"){
            @Override
            public void onClick(){
                Clicker.screenManager.ChangeScreen("Tittle");
            }
        };

        table.add(start);
        table.setPosition(100,100);
        stage.addActor(table);
        //stage.huy();
    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        stage.getViewport().update(width, height, true);
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

    }
}
