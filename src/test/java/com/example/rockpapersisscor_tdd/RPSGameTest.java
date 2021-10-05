package com.example.rockpapersisscor_tdd;

import com.example.rockpapersisscor_tdd.service.Move;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RPSGameTest {
    RPSGame rpsGame;
    private UserInput userInput;
    private UserOutput userOutput;
    private Player player;

    private RandomMovePicker randomMovePicker;
    private ConsoleMovePicker consoleMovePicker;

    @BeforeEach
    void setUp() {
        userInput = mock(UserInput.class);
        userOutput = mock(UserOutput.class);
        randomMovePicker = mock(RandomMovePicker.class);
        consoleMovePicker = mock(ConsoleMovePicker.class);
        player = new Player("", "");
        rpsGame = new RPSGame(userInput, userOutput, randomMovePicker);
    }

    @Test
    void test_user_loose_success() {
        //Given
        when(userInput.readKeyboard()).thenReturn("1", "Arne", "ROCK");
        when(randomMovePicker.getMove()).thenReturn(Move.PAPER);
        //When
        rpsGame.playGame();
        //Then
        verify(userOutput, times(1)).print(eq("Play against the computer press 1, play against another player press 2 "));
        assertEquals(GameResult.LOSE, rpsGame.getGameResult());
    }

    @Test
    void test_user_win_success() {
        //Given
        when(userInput.readKeyboard()).thenReturn("1", "Arne", "ROCK");
        when(randomMovePicker.getMove()).thenReturn(Move.SCISSOR);
        //When
        rpsGame.playGame();
        //Then
        verify(userOutput, times(1)).print(eq("Play against the computer press 1, play against another player press 2 "));
        assertEquals(GameResult.WIN, rpsGame.getGameResult());
    }

    @Test
    void test_user_draw_success() {
//        //Given
//        when(userOutput.readKeyboard()).thenReturn("1", "Arne", "SCISSOR");
//        when(consoleMovePicker.getMove()).thenReturn(Move.SCISSOR);
//        //When
//        rpsGame.playGame();
//        //Then
//        verify(userOutput, times(1)).print(eq("Play against the computer press 1, play against another player press 2 "));
//        assertEquals(GameResult.DRAW, rpsGame.getGameResult());
    }

    @Test
    void win() {
        //Given want to give the gameResult and return winner
        when(rpsGame.getGameResult()).thenReturn(rpsGame.getWins());
        //When the game is played
        rpsGame.playGame();
        //Then expect the result values to winner or losers
        assertEquals(GameResult.values(), rpsGame.getWins());
    }
}