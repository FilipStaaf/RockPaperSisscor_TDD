package com.example.rockpapersisscor_tdd;

import com.example.rockpapersisscor_tdd.service.Move;
import com.example.rockpapersisscor_tdd.service.MovePicker;
import lombok.Value;

import java.util.Locale;
import java.util.Scanner;

@Value
public class Player {
    private String name;
    private Move move;

    public Player(String name, Move move) {
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
    public Move getMove(Scanner input) {
        System.out.println("Enter your move: ");
        String stringMove = input.nextLine().toUpperCase(Locale.ROOT);
        if (stringMove.equals("ROCK")) return Move.ROCK;
        if (stringMove.equals("SCISSOR")){return Move.SCISSOR;}
        if (stringMove.equals("PAPER")){return Move.PAPER;}
        else{
            return null;
        }


    }

}
