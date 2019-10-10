package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Field {

    Texture tx;

    public Field(){
        tx = new Texture("background.jpg");
    }

    public void render(SpriteBatch batch){
        batch.draw(tx, 0, 0);
    }

}
