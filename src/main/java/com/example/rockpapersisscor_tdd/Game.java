package com.example.rockpapersisscor_tdd;

public class Game {
    private final Player player1;

    public Game(Player user) {
        this.player1 = user;
    }

    public Player getUser() {
        return player1;
    }
}
