package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    String[][] gameField = new String[3][3];
    int playersSteps = 0;
    public static boolean check = true;
    public static void main(String[] args) {
        System.out.println("enter position");
        var scanner = new Scanner(System.in);

        var main = new Main();

        while (check) {
            main.addPosition(scanner.nextInt(), scanner.nextInt(), 0);
            main.drawField();
            main.checkEndOfGame();
            main.addPosition(scanner.nextInt(), scanner.nextInt(), 1);
            main.drawField();
            main.checkEndOfGame();
        }
    }

    private void addPosition(int x, int y, int player) {
        if (player == 0) {
            gameField[y][x] = "x";
            return;
        }
        gameField[y][x] = "o";
    }

    private void drawField() {
        for (int i = 0; i < 3; i++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(gameField[i][y]);
                if (y != 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }

    private void checkEndOfGame() {
        if (playersSteps >= 5) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0, count1 = 0, count2 = 0; j < 3; j++) {
                    if (Objects.equals(gameField[i][j], "x")) {
                        count1++;
                    }
                    if (Objects.equals(gameField[j][i], "o")) {
                        count2++;
                    }
                    if (count1 == 3) {
                        System.out.println("p1");
                        check = false;
                    }
                    if (count2 == 3) {
                        System.out.println("p2");
                        check = false;
                    }
                }
            }
        }
    }

}
