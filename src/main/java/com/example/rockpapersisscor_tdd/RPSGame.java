package com.example.rockpapersisscor_tdd;

import com.example.rockpapersisscor_tdd.service.Move;

import java.util.Scanner;

public class RPSGame {

    private UserInput userInput;
    private UserOutput userOutput;
    private RandomMovePicker randomMovePicker;

    public RPSGame(UserInput userInput, UserOutput userOutput, RandomMovePicker randomMovePicker) {

        this.userInput = userInput;
        this.userOutput = userOutput;
        this.randomMovePicker = randomMovePicker;
    }

    public void playGame() {


        System.out.println("Play against the computer press 1, play against another player press 2");

        if (userInput.equals("1") ) {
            System.out.println(" GMB1 " + Game.getUser());
            Player player = Game.getComputerPlayer();
            Game.getComputerPlayer();
            // game.Winner("Arne", "Ironman");
            System.out.println(player + " GM1 " + Game.getUser() + Game.getComputerPlayer());
        }
        if (userInput.equals("2")) {
            System.out.println(" GMB2 " + Game.getUser());
            Player player = Game.getUser();
            Game.getUser().makeUserMove();
            System.out.println(player + " GM " + Game.getUser());
        }
    }
    // player2.moves.contains
    public GameResult getGameResult(GameResult gameResult) {




        return GameResult.LOSE;
    }
}
