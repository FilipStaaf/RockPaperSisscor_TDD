package com.example.rockpapersisscor_tdd;

public class Game {
    private static Player player2;
    private static Player player1;

    public Game(Player user) {
        this.player2 = user;
    }

    public static Player getComputerPlayer() {
        return player2;
    }

    public static Player getUser() {
        return player1;
    }

    public void join(Player player2) {
    }


}
