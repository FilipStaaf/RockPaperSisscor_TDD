package com.example.rockpapersisscor_tdd;

import com.example.rockpapersisscor_tdd.service.Move;
//import com.example.rockpapersisscor_tdd.service.WinnerEvaluater;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Game_test {
    private GameManager gameManager;
    private RandomMovePicker randomMovePicker;
    private MockMovePicker mockMovePicker;
    @Before
    public void setUp() {
        gameManager = new GameManager();
        randomMovePicker = new RandomMovePicker();
        mockMovePicker = new MockMovePicker();
    }
/*
    @Test
    public void test_game_is_created() {
        Player player = gameManager.createPlayer("SomeName", randomMovePicker);
        Game game = gameManager.createGame(player);
        Assert.assertNotNull(game);
        System.out.println("The game have been created");

    }

    @Test
    public void test_game_user_is_correct() {
        Player player = gameManager.createPlayer("SnabbeHandMannen", randomMovePicker);

        //given   gives a player

        //then    create a game with that player

        //when    a game is started for that user

        Game game = gameManager.createGame(player);
        Assert.assertEquals(player, game.getComputerPlayer());
        System.out.println(" en av spelarna " + player);
    }

    @Test
    public void test_winner_is_correct() {
        Player player1 = gameManager.createPlayer("ifor", mockMovePicker);
        Player player2 = gameManager.createPlayer("jforoje", mockMovePicker);

        Game game = gameManager.createGame(player1);
        game.join(player2);

        mockMovePicker.setMove(Move.ROCK);
        player1.makeMove();
        mockMovePicker.setMove(Move.PAPER);
        player2.makeMove();

      // Assert.assertEquals(player2, WinnerEvaluater.getWinner());
    }

 */
}


