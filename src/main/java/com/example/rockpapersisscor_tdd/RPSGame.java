package com.example.rockpapersisscor_tdd;

import com.example.rockpapersisscor_tdd.service.Move;

import java.util.ArrayList;
import java.util.List;

public class RPSGame {
    private UserInput userInput;
    private UserOutput userOutput;
    private RandomMovePicker randomMovePicker;
    private GameResult gameResult;
    private Player player;
    List<GameResult> points = new ArrayList<>();

    public RPSGame(UserInput userInput, UserOutput userOutput, RandomMovePicker randomMovePicker) {
        this.userInput = userInput;
        this.userOutput = userOutput;
        this.randomMovePicker = randomMovePicker;
    }

    public void playGame() {
        String name = player.getName(userInput.scan);
        userOutput.print("Hello " + name);
        userOutput.print("Play against the computer press 1, play against another player press 2 ");
        String command = userInput.readKeyboard();
        if (command.equals("1")) {
            userOutput.print("Type in Rock, Paper or Scissor ");
            String userName = userInput.readKeyboard();
            userOutput.print("Type in Rock, Paper or Scissor ");
            String move = userInput.readKeyboard();

            Player player1 = createPlayer(userName, move);
            Player computer = createPlayer("Computer", RandomGenerator());
            System.out.println(" reslutet " + gameResult + "POINTS" + points);
            points.add(gameResult);
            gameResult = winnerEvaluator(player1, computer);
            System.out.println(gameResult + "RR" + points);
        }
    }

    public GameResult getGameResult() {
        return gameResult;
    }

    public GameResult getWins() {
        System.out.println(" reslutet " + gameResult);
        return gameResult;
    }

    public GameResult getLoose() {
        System.out.println(" reslutet " + gameResult);
        return gameResult;
    }

    public GameResult winnerEvaluator(Player player1, Player player2) {
        String ROCK = String.valueOf(Move.ROCK);
        String PAPER = String.valueOf(Move.PAPER);
        String SCISSOR = String.valueOf(Move.SCISSOR);

        if (player1.getMove() == player2.getMove()) {
            System.out.println(player1.getMove() + " " + player2.getMove());
            return GameResult.DRAW;
        }
        if (player1.getMove() == ROCK && player2.getMove() == SCISSOR ||
                player1.getMove() == PAPER && player2.getMove() == ROCK ||
                player1.getMove() == SCISSOR && player2.getMove() == PAPER) {
            return GameResult.WIN;
        } else {
            System.out.println(player1.getMove() + " " + player2.getMove() + " Computer Score: " + points);
            return GameResult.LOSE;
        }
    }

//    public Move moveObject(String value) {
//        switch (value) {
//            case "ROCK" -> setMove(Move.ROCK);
//            case "PAPER" -> setMove(Move.PAPER);
//            case "SCISSOR" -> setMove(Move.SCISSOR);
//            default -> throw new RuntimeException("Not an option");
//        }
//        return getGameResult();
//    }

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
