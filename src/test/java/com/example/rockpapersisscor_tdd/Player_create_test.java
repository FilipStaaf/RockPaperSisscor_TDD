package com.example.rockpapersisscor_tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Player_create_test {

    private GameManager gameManager;

    @Before
    public void setUp() {
        gameManager = new GameManager();
    }

    @Test
    public void test_player_is_created() {

        Player player = gameManager.createPlayer("IronMan");

        Assert.assertNotNull(player);

    }
}
