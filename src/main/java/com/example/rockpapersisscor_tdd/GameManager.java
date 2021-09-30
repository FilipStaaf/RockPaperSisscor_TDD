package com.example.rockpapersisscor_tdd;

public class GameManager {

    public GameManager() {
    }
    public Player createPlayer(String name) {
        return new Player(name);
    }

}
