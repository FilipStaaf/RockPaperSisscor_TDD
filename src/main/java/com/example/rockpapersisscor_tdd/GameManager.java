package com.example.rockpapersisscor_tdd;

import com.example.rockpapersisscor_tdd.service.MovePicker;

import java.util.Scanner;

enum numberSelect {
    ONE,
    TWO
}

public class GameManager {

    Scanner scan = new Scanner(System.in);
    RandomMovePicker randomMovePicker;
    ConsoleMovePicker consoleMovePicker;
    Game game;
    String userChoice = "";

    public void GameManager() {
        numberSelect nS1 = numberSelect.ONE;
        numberSelect nS2 = numberSelect.TWO;
        System.out.println("Play against the computer press 1, play against another player press 2");
        userChoice = scan.nextLine();
        if (userChoice.equals(nS1)) {
            System.out.println(" GMB1 " + game.getUser());
            Player player = game.getComputerPlayer();
            game.getComputerPlayer();
            game.Winner("Arne", "Ironman");
            System.out.println(player + " GM1 " + game.getUser() + game.getComputerPlayer());
        }
        if (userChoice.equals(nS2)) {
            System.out.println(" GMB2 " + game.getUser());
            Player player = game.getUser();
            game.getUser().makeUserMove();
            System.out.println(player + " GM " + game.getUser());
        }
    }

    public Player createPlayer(String name, MovePicker movePicker) {
        return new Player(name, movePicker);
    }

    public Game createGame(Player player) {
        return new Game(player);
    }

}
