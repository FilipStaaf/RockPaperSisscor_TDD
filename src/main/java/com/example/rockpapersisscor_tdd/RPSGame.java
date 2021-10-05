package com.example.rockpapersisscor_tdd;

import com.example.rockpapersisscor_tdd.service.Move;
import com.example.rockpapersisscor_tdd.service.MovePicker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class RPSGame {

    private UserInput userInput;
    private UserOutput userOutput;
    private Move move;
    private RandomMovePicker randomMovePicker = new RandomMovePicker();
    private GameResult gameResult;
    MovePicker movePicker;

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
            boolean whilechecker = false;
            while (!whilechecker){
            userOutput.print("Type in Rock , Paper or Scissor");
            String movechoice = userInput.readKeyboard().toUpperCase(Locale.ROOT);
            if (movechoice.equals("ROCK")){move = Move.ROCK; testing(userName,move); whilechecker = true;}
            if (movechoice.equals("SCISSOR")){move = Move.SCISSOR;testing(userName,move); whilechecker = true;}
            if (movechoice.equals("PAPER")){move = Move.PAPER;testing(userName,move); whilechecker = true;}
            else{
                userOutput.print("Wrong input");
            }
            }
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

        if (player1.getMove() == player2.getMove()) {
            userOutput.print("Its a draw!");
            return GameResult.DRAW;
        }

        if (player1.getMove().equals(Move.ROCK) && player2.getMove().equals(Move.SCISSOR) ||
                player1.getMove().equals(Move.PAPER) && player2.getMove().equals(Move.ROCK)||
                player1.getMove().equals(Move.SCISSOR) && player2.getMove().equals(Move.PAPER) ) {
            userOutput.print("You won the round!");
            player1points++;
            return GameResult.WIN;
        } else {
            player2points++;
            userOutput.print("You lost the round");
            System.out.println(player1.getMove() + " " + player2.getMove() + " Computer Score: " + player2points);
            return GameResult.LOSE;
        }
    }

    public void getWins(){

    }
    public void getLose(){

    }
    public void testing(String userName,Move move){
        Player player1 = createPlayer(userName, move);
        Player computer = createPlayer("Computer", randomMovePicker.get());
        gameResult = winnerEvaluator(player1, computer);
        points.add(gameResult);
    }



    public Player createPlayer(String name, Move move) {
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
