package com.example.rockpapersisscor_tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Player_test {

    private GameManager gameManager;
    private RandomMovePicker randomMovePicker ;
    @Before
    public void setUp() {
        gameManager = new GameManager();
        randomMovePicker = new RandomMovePicker();
    }

    @Test
    public void test_player_is_created() {

        Player player = gameManager.createPlayer("IronMan", randomMovePicker);
        Assert.assertNotNull(player);
        System.out.println("Player have been created" + player);
    }

    @Test
    public void test_player_name_is_correct() {

        String name = "IronMan";
        Player player = gameManager.createPlayer(name, randomMovePicker);
        Assert.assertEquals(name, player.getName());

    }


}
