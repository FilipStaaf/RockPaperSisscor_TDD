package com.example.rockpapersisscor_tdd;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    private static UserInput userInput = new UserInput();
    private static UserOutput userOutput = new UserOutput();
    private static RandomMovePicker randomMovePicker = new RandomMovePicker();

    public static void main(String[] args) {
        System.out.println("Welcome to Rock, Paper and Scissors! Let´s play! ");
        RPSGame rpsGame = new RPSGame(userInput, userOutput, randomMovePicker);
        rpsGame.playGame();

    }
}
