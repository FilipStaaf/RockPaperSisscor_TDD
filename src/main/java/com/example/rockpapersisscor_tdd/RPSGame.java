package com.example.rockpapersisscor_tdd;

import com.example.rockpapersisscor_tdd.service.Move;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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

        if (command.equals("1")) {
            userOutput.print(" Type in user name ");
            String userName = userInput.readKeyboard();
            userOutput.print("Type in Rock , Paper or Scissor");
            String move = userInput.readKeyboard().toUpperCase(Locale.ROOT);
            Player player1 = createPlayer(userName, move);
            Player computer = createPlayer("Computer", RandomGenerator());
            gameResult = winnerEvaluator(player1, computer);
            System.out.println(" reslutet " + gameResult);
            points.add(gameResult);
        }
    }

    public GameResult getGameResult() {
        return gameResult;
    }

    List<GameResult> points = new ArrayList<>();

    int player1points;
    int player2points;
    /*
    int[] pointsArray = new int[1];
    pointsArray[0] = player1points;
    pointsArray[1] = player2points;
*/
    public GameResult winnerEvaluator(Player player1, Player player2) {
        String ROCK = String.valueOf(Move.ROCK);
        String PAPER = String.valueOf(Move.PAPER);
        String SCISSOR = String.valueOf(Move.SCISSOR);

        if (player1.getMove() == player2.getMove()) {
            System.out.println(player1.getMove() + " " + player2.getMove());
            return GameResult.DRAW;
        }
        if (player1.getMove() == ROCK && player2.getMove() == SCISSOR) {
            player1points++;
            return GameResult.WIN;
        }
        if (player1.getMove() == PAPER && player2.getMove() == ROCK) {
            player1points++;
            return GameResult.WIN;
        }
        if (player1.getMove() == SCISSOR && player2.getMove() == PAPER) {
            player1points++;
            return GameResult.WIN;
        } else {
            player2points++;
            System.out.println(player1.getMove() + " " + player2.getMove() + " Computer Score: " + player2points);
            return GameResult.LOSE;
        }
    }

    public void getWins(){

    }
    public void getLose(){

    }



    public Player createPlayer(String name, String move) {
        return new Player(name, move);
    }

    public String RandomGenerator() {
        int rand = (int) (Math.random() * 3);
        if (rand == 0) {
            return "ROCK";
        }
        if (rand == 1) {
            return "PAPER";
        } else {
            return "SCISSOR";
        }
    }
}
