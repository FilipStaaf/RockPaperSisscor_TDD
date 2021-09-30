package com.example.rockpapersisscor_tdd;

import com.example.rockpapersisscor_tdd.service.Move;
import com.example.rockpapersisscor_tdd.service.MovePicker;

import java.util.concurrent.ThreadLocalRandom;

public class RandomMovePicker implements MovePicker {

    private static final Move[] MOVES = Move.values();

    @Override
    public Move get() {
        return MOVES[ThreadLocalRandom.current().nextInt(MOVES.length)];
    }
}
