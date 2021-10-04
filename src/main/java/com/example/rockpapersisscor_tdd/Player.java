package com.example.rockpapersisscor_tdd;

import com.example.rockpapersisscor_tdd.service.Move;
import com.example.rockpapersisscor_tdd.service.MovePicker;
import lombok.Value;

@Value
public class Player {
    private String name;
    private String move;

    public Player(String name, String move) {
        this.name = name;
        this.move= move;
    }

    public String getName() {
        return name;
    }

/*
    public void makeMove() {
        Move move = movePicker.get();

    }
    public void makeUserMove() {
        Move move = movePicker.get();

    }

 */
}
