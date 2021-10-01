package com.example.rockpapersisscor_tdd;

import com.example.rockpapersisscor_tdd.service.Move;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class RPSGameTest {
    RPSGame rpsGame;
    private UserInput userInput;
    private UserOutput userOutput;

    private RandomMovePicker randomMovePicker;

    @BeforeEach
    void setUp() {
        userInput = mock(UserInput.class);
        userOutput = new UserOutput();
        randomMovePicker = mock(RandomMovePicker.class);
        rpsGame = new RPSGame(userInput, userOutput, randomMovePicker);

    }

    @Test
    void name() {

        //given
        when(userInput.readKeyboard()).thenReturn("1", "Arne", "ROCK");
        when(randomMovePicker.get()).thenReturn(Move.PAPER);

        //when
        rpsGame.playGame();

        //then
        assertEquals(GameResult.LOSE, rpsGame.getGameResult(GameResult.LOSE));

    }


    /*
    System.out.println("Play against the computer press 1, play against another player press 2");
        userChoice = scan.nextLine();
        if (userChoice == "1") {
            System.out.println(" GMB1 " + game.getUser());
            Player player = game.getComputerPlayer();
            game.getComputerPlayer();
           // game.Winner("Arne", "Ironman");
            System.out.println(player + " GM1 " + game.getUser() + game.getComputerPlayer());
        }
        if (userChoice == "2") {
            System.out.println(" GMB2 " + game.getUser());
            Player player = game.getUser();
            game.getUser().makeUserMove();
            System.out.println(player + " GM " + game.getUser());
        }
     */
}