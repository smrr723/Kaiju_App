package com.example.scott.kaijuaccesscontrol;

import com.example.scott.kaijuaccesscontrol.Interfaces.Damagable;

/**
 * Created by scott on 25/10/2017.
 */

public class KingKong extends Kaiju {

    public KingKong(String name, int healthValue, int attackValue){
        super(name, healthValue, attackValue);
    }

    @Override
    public String roar() {
        return "Roaaarrr!";
    }

    public String move() {
        return "Swing, crash, swing!";
    }
    public void attack(Damagable enemy){
        enemy.takeDamage(this.attackValue);
    }


}
