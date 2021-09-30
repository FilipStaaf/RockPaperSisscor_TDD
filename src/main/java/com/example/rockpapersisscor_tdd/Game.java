package com.example.rockpapersisscor_tdd;

public class Game {
    private final Player player2;
    private Player player1;
    public Game(Player user) {
        this.player2 = user;
    }

    public Player getComputerPlayer() {
        return player2;
    }
    public Player getUser() {
        return player1;
    }

    public void join(Player player2) {
    }
}
