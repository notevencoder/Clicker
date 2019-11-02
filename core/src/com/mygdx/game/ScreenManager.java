package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.mygdx.game.Screens.GameScreen;
import com.mygdx.game.Screens.OptionScreen;
import com.mygdx.game.Screens.TittleScreen;

public class ScreenManager{
    private static TittleScreen tittleScreen;
    private static OptionScreen optionScreen;
    private static GameScreen gameScreen;
    private static Game game;
    private static int width, height;


    public ScreenManager(Game aGame, int Width, int Height){
        width = Width;
        height = Height;
        game = aGame;
        tittleScreen = new TittleScreen(game);
        optionScreen = new OptionScreen(game);
        gameScreen = new GameScreen(game);
    }



    public static void ChangeScreen(String st){
        switch (st){
            case "Tittle":
                game.setScreen(tittleScreen);
                return;
            case "Option":
                game.setScreen(optionScreen);
                return;
            case "Game":
                game.setScreen(gameScreen);
                return;

        }

    }
    public static Screen getScreen(){
        return game.getScreen();

    }

    public static int getWidth(){
        return width;
    }
    public static int getHeight(){
        return height;
    }
}
