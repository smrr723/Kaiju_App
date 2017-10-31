package com.example.scott.kaijuaccesscontrol;

/**
 * Created by scott on 25/10/2017.
 */

public class Godzilla extends Kaiju {

    public Godzilla(String name, int healthValue, int attackValue){
        super(name, healthValue, attackValue);
    }

    @Override
    public String roar() {
        return "Screeeech!";
    }

    public String move(){
        return "Bang, boom, crash";
    }

}
