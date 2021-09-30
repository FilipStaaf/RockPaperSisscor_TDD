package com.example.rockpapersisscor_tdd;

import com.example.rockpapersisscor_tdd.service.Move;
import com.example.rockpapersisscor_tdd.service.MovePicker;

import java.util.Scanner;

public class ConsoleMovePicker implements MovePicker {
    @Override
    public Move get() {
        Scanner scanner = new Scanner(System.in);

        Move usersMove = Move.valueOf(scanner.nextLine().toUpperCase());

        return usersMove;
    }
}
