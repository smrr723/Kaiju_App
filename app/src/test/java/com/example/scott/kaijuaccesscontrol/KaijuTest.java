package com.example.scott.kaijuaccesscontrol;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by scott on 25/10/2017.
 */

public class KaijuTest {

    Godzilla godzilla;
    KingKong kingKong;
    Tank tank;
    Jet jet;

    @Before
    public void before() {
        godzilla = new Godzilla("Godzilla", 100, 50);
        kingKong = new KingKong("King Kong", 100, 50);
        tank = new Tank("Tank", 100, 50);
    }

    @Test
    public void canRoar(){
        assertEquals("Screeeech!", godzilla.roar());
        assertEquals("Roaaarrr!", kingKong.roar());
    }

    @Test
    public void canMove(){
        assertEquals("Bang, boom, crash", godzilla.move());
        assertEquals("Swing, crash, swing!", kingKong.move());
    }

    @Test
    public void canAttackTank(){
        godzilla.attack(tank);
        assertEquals(50, tank.getHealthValue());
    }
    @Test
    public void canTakeDamage(){
        tank.attack(godzilla);
        assertEquals(50, godzilla.getHealthValue());
    }
}
