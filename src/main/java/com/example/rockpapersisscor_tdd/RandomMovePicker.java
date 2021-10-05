package com.example.rockpapersisscor_tdd;

import com.example.rockpapersisscor_tdd.service.Move;
import com.example.rockpapersisscor_tdd.service.MovePicker;

import java.util.concurrent.ThreadLocalRandom;

public class RandomMovePicker implements MovePicker {

    private static final Move[] MOVES = Move.values();

    @Override
    public Move getMove() {
        return MOVES[ThreadLocalRandom.current().nextInt(MOVES.length)];
    }

    @Override
    public Move setMove() {
        return null;
    }

}
