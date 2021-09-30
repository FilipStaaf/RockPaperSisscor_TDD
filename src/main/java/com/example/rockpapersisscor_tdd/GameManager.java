package com.example.rockpapersisscor_tdd;

import com.example.rockpapersisscor_tdd.service.MovePicker;

public class GameManager {

    public GameManager() {
    }

    public Player createPlayer(String name, MovePicker movePicker) {
        return new Player(name, movePicker);
    }

    public Game createGame(Player player) {
        return new Game(player);
    }

}
