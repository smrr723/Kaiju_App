package com.example.scott.kaijuaccesscontrol;

import com.example.scott.kaijuaccesscontrol.Interfaces.Attackable;
import com.example.scott.kaijuaccesscontrol.Interfaces.Damagable;

/**
 * Created by scott on 25/10/2017.
 */

public abstract class Kaiju implements Attackable, Damagable {
    String name;
    int healthValue;
    int attackValue;

    public Kaiju(String name, int healthValue, int attackValue){
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public abstract String move();

    public void attack(Damagable victim){
        victim.takeDamage(this.attackValue);
    }

    public void takeDamage(int value){
        this.healthValue -= value;
    }

    public abstract String roar();
//    set different roar in subclass files
}
