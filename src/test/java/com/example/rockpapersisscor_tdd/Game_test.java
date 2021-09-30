package com.example.rockpapersisscor_tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Game_test {
    private GameManager gameManager;

    @Before
    public void setUp() {
        gameManager = new GameManager();
    }


    @Test
    public void test_game_is_created() {
        Player player = gameManager.createPlayer("SomeName");
        Game game = gameManager.createGame(player);
        Assert.assertNotNull(game);

    }

    @Test
    public void test_game_user_is_correct() {
        Player player = gameManager.createPlayer("SnabbeHandMannen");

        //given   gives a player

        //then    create a game with that player

        //when    a game is started for that user

        Game game = gameManager.createGame(player);

        Assert.assertEquals(player, game.getUser());

    }
}
