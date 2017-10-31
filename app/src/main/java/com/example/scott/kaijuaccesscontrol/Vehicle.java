package com.example.scott.kaijuaccesscontrol;

import com.example.scott.kaijuaccesscontrol.Interfaces.Attackable;
import com.example.scott.kaijuaccesscontrol.Interfaces.Damagable;

/**
 * Created by scott on 25/10/2017.
 */

public abstract class Vehicle implements Damagable, Attackable {
    private String type;
    private int healthValue;
    private int attackValue;

    public Vehicle(String type, int healthValue, int attackValue){
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void attack(Damagable kaiju){
        kaiju.takeDamage(this.attackValue);
    }

    public void superAttack(Damagable kaiju) {kaiju.takeDamage(this.attackValue * 2 );}

    public void takeDamage(int value){
        this.healthValue -= value;
    }
}
