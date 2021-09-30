package com.example.rockpapersisscor_tdd;

import com.example.rockpapersisscor_tdd.service.Move;
import com.example.rockpapersisscor_tdd.service.MovePicker;

public class MockMovePicker implements MovePicker {

    private Move move;

    @Override
    public Move get() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }
}

