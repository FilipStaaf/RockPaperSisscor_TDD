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

    @BeforeEach
    void setUp() {
        userInput = mock(UserInput.class);
        userOutput = mock(UserOutput.class);
        randomMovePicker = mock(RandomMovePicker.class);
        player = new Player("", null);
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
        verify(userOutput, times(1));
        System.out.println(eq("Play against the computer press 1"));
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
        verify(userOutput, times(1));
        System.out.println(eq("Play against the computer press 1"));
        assertEquals(GameResult.WIN, rpsGame.getGameResult());
        assertEquals(2,rpsGame.player1points);
 }

    @Test
    void test_user_draw_success() {
        //Given
        when(userInput.readKeyboard()).thenReturn("1", "Arne", "SCISSOR");
        when(randomMovePicker.getMove()).thenReturn(Move.SCISSOR);
        //When
        rpsGame.playGame();
        //Then
        verify(userOutput, times(1)).print(eq("Play against the computer press 1"));
        assertEquals(GameResult.DRAW, rpsGame.getGameResult());
    }

    @Test
    void test_score_board() {
        //Given
        Player player1 = new Player("arne", Move.ROCK);
        rpsGame.player2points = 2;

        //when
        rpsGame.printOutPoints(player1);

        //Then
        verify(userOutput, times(1)).print("arne Score: 0 Computer Score: 2");
    }
}