package com.example.rockpapersisscor_tdd;

import com.example.rockpapersisscor_tdd.service.Move;
import com.example.rockpapersisscor_tdd.service.MovePicker;
import lombok.Value;

@Value
public class Player {
    private String name;
    private MovePicker movePicker;

    public Player(String name, MovePicker movePicker) {
        this.name = name;
        this.movePicker = movePicker;
    }

    public String getName() {
        return name;
    }

    public void makeMove() {
        Move move = movePicker.get();

    }
    public void makeUserMove() {
        Move move = movePicker.get();

    }
}
