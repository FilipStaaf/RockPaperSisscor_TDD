package com.example.rockpapersisscor_tdd;

import java.util.Scanner;

public class UserInput {
    Scanner scan = new Scanner(System.in);

    public String readKeyboard() {
        return scan.nextLine();
    }
}
