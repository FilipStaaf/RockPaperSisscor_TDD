package com.example.rockpapersisscor_tdd;

import lombok.Value;

import java.util.Scanner;

@Value
public class Player {
    //create name and move
    private String name;
    private String move;

    //create player and go to game
    public Player(String name, String move) {
        this.name = name;
        this.move = move;
    }

    static String getName(Scanner input) {
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        if (name.length() < 1) {
            name = "";
        }
        return name;
    }

    //get the moves
    public String getMove(Scanner input) {
        System.out.println("Enter your move: ");
        String move = input.nextLine();
        if (move.length() < 1) {
            move = "";
        }
        return move;
    }

}
