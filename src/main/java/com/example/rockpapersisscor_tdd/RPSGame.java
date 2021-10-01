package com.example.rockpapersisscor_tdd;

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
    }
}
