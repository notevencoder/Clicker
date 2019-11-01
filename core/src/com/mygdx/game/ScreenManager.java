package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.mygdx.game.Screens.OptionScreen;
import com.mygdx.game.Screens.TittleScreen;

public class ScreenManager{
    private static TittleScreen tittleScreen;
    private static OptionScreen optionScreen;
    private static Game game;


    public ScreenManager(Game aGame){
        game = aGame;
        tittleScreen = new TittleScreen(game);
        optionScreen = new OptionScreen(game);
    }



    public static void ChangeScreen(String st){
        switch (st){
            case "Tittle": {game.setScreen(tittleScreen);
                return;}
            case "Option": {game.setScreen(optionScreen);
                return;}

        }

    }
    public static Screen getScreen(){
        return game.getScreen();

    }


}
