package com.example.rockpapersisscor_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class PlayerTest {

    private Player player;
    private UserInput userInput;
    private RPSGame rpsGame;
    @BeforeEach
    void setUp() {
        player = new Player("", "");
        userInput = mock(UserInput.class);
        rpsGame = mock(RPSGame.class);
    }

    @Test
    void test_name() {
        Player player = new Player("Ironman", "ROCK");
        player.getName();
        assertEquals("Ironman", player.getName());
        System.out.println("Name is correct in test_name: " + player.getName());
    }

    @Test
    void test_move() {
        Player player = new Player("Ironman", "ROCK");
        player.getMove();
        assertEquals("ROCK", player.getMove());
        System.out.println("Move is correct in test_move: " + player.getMove());
    }
}