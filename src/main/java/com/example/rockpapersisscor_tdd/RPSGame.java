package com.example.rockpapersisscor_tdd;

import com.example.rockpapersisscor_tdd.service.Move;

import java.util.Scanner;

public class RPSGame {

    private UserInput userInput;
    private UserOutput userOutput;
    private RandomMovePicker randomMovePicker;
    private GameResult gameResult;

    public RPSGame(UserInput userInput, UserOutput userOutput, RandomMovePicker randomMovePicker) {

        this.userInput = userInput;
        this.userOutput = userOutput;
        this.randomMovePicker = randomMovePicker;
    }

    public void playGame() {

        userOutput.print("Play against the computer press 1, play against another player press 2");
        String command = userInput.readKeyboard();

        if (command.equals("1") ) {
           // userOutput.print(" GMB1 " + Game.getUser());
           // Player player = Game.getComputerPlayer();
          //  Game.getComputerPlayer();
            // game.Winner("Arne", "Ironman");
           // System.out.println(player + " GM1 " + Game.getUser() + Game.getComputerPlayer());
            gameResult = GameResult.LOSE;
        }
        /*
        if (command.equals("2")) {
            System.out.println(" GMB2 " + Game.getUser());
            Player player = Game.getUser();
            Game.getUser().makeUserMove();
            System.out.println(player + " GM " + Game.getUser());
        }

         */
    }
    public GameResult getGameResult() {
        return gameResult;
    }
}
