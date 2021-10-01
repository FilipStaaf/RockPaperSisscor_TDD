package com.example.rockpapersisscor_tdd;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Rock, Paper and Scissors! Let´s play! ");
        GameManager gameManager = new GameManager();
        gameManager.GameManager();
    }

}
