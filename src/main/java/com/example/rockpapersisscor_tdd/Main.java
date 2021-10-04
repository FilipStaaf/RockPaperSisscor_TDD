package com.example.rockpapersisscor_tdd;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    private static UserInput userInput  = new UserInput();
    private static UserOutput userOutput = new UserOutput();
    private static RandomMovePicker randomMovePicker = new RandomMovePicker();

    static RPSGame rpsGame = new RPSGame(userInput,userOutput, randomMovePicker);
    public static void main(String[] args) {
        System.out.println("Welcome to Rock, Paper and Scissors! Let´s play! ");
        RPSGame rpsGame = new RPSGame(userInput,userOutput,randomMovePicker);
        rpsGame.playGame();

       // GameManager gameManager = new GameManager();
        //gameManager.GameManager();
    }
    // problemet vi har nu är att vi inte kan starta upp spelet pga att värdena vi kör spelet på initializeras efter spelet startas.
    // vilket betyder att vi inte har något rum spelet körs i eftersom värdena är null innan spelet har startat
}
