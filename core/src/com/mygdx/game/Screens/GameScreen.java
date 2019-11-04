package com.mygdx.game.Screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.Align;
import com.mygdx.game.Buttons.MenuButton;
import com.mygdx.game.Clicker;
import com.mygdx.game.ScreenManager;

public class GameScreen extends ScreenParent {

    MenuButton tapButton, goToMenu, reset;
    int score;
    Table table;
    Label scoreText;
    Preferences prefs;

    public GameScreen(Game aGame){
        super(aGame);
        prefs = Gdx.app.getPreferences("ClickerScoreSave");

        if (!prefs.contains("Score")){
            prefs.putInteger("Score", 0);
            prefs.flush();
        }

        table = new Table();

        scoreText = new Label(String.valueOf(score), Clicker.gameSkin);



        tapButton = new MenuButton("TAP ME"){
            @Override
            public void onClick(){
                prefs.putInteger("Score", prefs.getInteger("Score") + 1);
                prefs.flush();
            }
        };
        reset = new MenuButton("reset"){
            @Override
            public void onClick(){
                prefs.putInteger("Score", 0);
                prefs.flush();
            }
        };
        goToMenu = new MenuButton("Menu"){
            @Override
            public void onClick(){
                ScreenManager.ChangeScreen("Tittle");
            }
        };

        table.add(scoreText);
        table.row();
        table.add(tapButton);
        table.row();
        table.add(reset);



        table.debugCell();
        table.setPosition((width - table.getWidth())/2,(height - table.getHeight()) / 2);
        stage.addActor(table);

        goToMenu.setBounds(0, height * 9 / 10, width / 10, height / 10);
        stage.addActor(goToMenu);
    }


    void update(){

        Gdx.gl.glClearColor(0, 1, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        scoreText.setText(prefs.getInteger("Score"));

        stage.act();
        stage.draw();
    }
}
