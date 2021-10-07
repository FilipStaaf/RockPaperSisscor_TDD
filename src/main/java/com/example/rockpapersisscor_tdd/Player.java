package com.example.rockpapersisscor_tdd;

import com.example.rockpapersisscor_tdd.service.Move;
import lombok.Value;

@Value
public class Player {
    private String name;
    private Move move;

    public Player(String name, Move move) {
        this.name = name;
        this.move = move;
    }
}
