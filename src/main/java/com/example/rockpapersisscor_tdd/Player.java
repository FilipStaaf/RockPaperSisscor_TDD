package com.example.rockpapersisscor_tdd;

import com.example.rockpapersisscor_tdd.service.Move;
import com.example.rockpapersisscor_tdd.service.MovePicker;
import lombok.Value;

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
    public String getMove(Scanner input) {
        System.out.println("Enter your move: ");
        String move = input.nextLine();
        if (move.length() < 1) {
            move = "";
        }
        return move;
    }

 */
}
