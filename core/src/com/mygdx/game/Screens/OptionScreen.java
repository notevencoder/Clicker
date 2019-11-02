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
import com.mygdx.game.ScreenManager;

public class OptionScreen extends ScreenParent {

    MenuButton start;
    Game game;
    Table table;

    public OptionScreen(Game aGame){

        super(aGame);
        table = new Table();

        start = new MenuButton("Start"){
            @Override
            public void onClick(){
                ScreenManager.ChangeScreen("Tittle");
            }
        };

        table.add(start);
        table.setPosition(100,100);
        stage.addActor(table);
    }

    @Override
    void update(){
        Gdx.gl.glClearColor(0, 0, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        stage.act();
        stage.draw();
    }
}
