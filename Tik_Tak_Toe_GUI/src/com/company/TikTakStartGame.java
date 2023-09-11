package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.*;

public class TikTakStartGame extends JFrame implements ActionListener {
    char[][] symbols = new char[3][3];
    static char player = 'x';

    TikTakStartGame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(600, 600);
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();
        JButton button5 = new JButton();
        JButton button6 = new JButton();
        JButton button7 = new JButton();
        JButton button8 = new JButton();
        JButton button9 = new JButton();
        button1.setBounds(0, 0, 200, 200);
        button2.setBounds(200, 0, 200, 200);
        button3.setBounds(400, 0, 200, 200);
        button4.setBounds(0, 200, 200, 200);
        button5.setBounds(200, 200, 200, 200);
        button6.setBounds(400, 200, 200, 200);
        button7.setBounds(0, 400, 200, 200);
        button8.setBounds(200, 400, 200, 200);
        button9.setBounds(400, 400, 200, 200);
        button1.addActionListener(e -> {
            gameStart(symbols, 0, 0);
            button1.setText(String.valueOf(player));
            changePlayer();
        });
        button2.addActionListener(e -> {
            gameStart(symbols, 0, 1);
            button2.setText(String.valueOf(player));
            changePlayer();
        });
        button3.addActionListener(e -> {
            gameStart(symbols, 0, 2);
            button3.setText(String.valueOf(player));
            changePlayer();
        });
        button4.addActionListener(e -> {
            gameStart(symbols, 1, 0);
            button4.setText(String.valueOf(player));
            changePlayer();
        });
        button5.addActionListener(e -> {
            gameStart(symbols, 1, 1);
            button5.setText(String.valueOf(player));
            changePlayer();
        });
        button6.addActionListener(e -> {
            gameStart(symbols, 1, 2);
            button6.setText(String.valueOf(player));
            changePlayer();
        });
        button7.addActionListener(e -> {
            gameStart(symbols, 2, 0);
            button7.setText(String.valueOf(player));
            changePlayer();
        });
        button8.addActionListener(e -> {
            gameStart(symbols, 2, 1);
            button8.setText(String.valueOf(player));
            changePlayer();
        });
        button9.addActionListener(e -> {
            gameStart(symbols, 2, 2);
            button9.setText(String.valueOf(player));
            changePlayer();
        });
        this.setLayout(null);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button7);
        this.add(button8);
        this.add(button9);
    }

    private void changePlayer() {
        player = player == 'x' ? 'o' : 'x';
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public void gameStart(char[][] symbols, int row, int column) {
        symbols[row][column] = player;
        check(symbols);
    }

    public static void check(char[][] symbols) {
        int count1;
        int count2;
        for (int i = 0; i < 3; i++) {
            count1 = 0;
            count2 = 0;
            for (int j = 0; j < 3; j++) {
                if (symbols[i][j] == 'x') {
                    count1++;
                } else if (symbols[i][j] == 'o') {
                    count2++;
                }
                if (count1 == 3) {
                    JOptionPane.showInputDialog("Game over\nPlayer1 is winner");
                    exit(0);
                } else if (count2 == 3) {
                    JOptionPane.showInputDialog("Game over\nPlayer2 is winner");
                    exit(0);
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            count1 = 0;
            count2 = 0;
            for (int j = 0; j < 3; j++) {
                if (symbols[j][i] == 'x') {
                    count1++;
                } else if (symbols[j][i] == 'o') {
                    count2++;
                }
                if (count1 == 3) {
                    JOptionPane.showInputDialog("Game over\nPlayer1 is winner");
                    exit(0);
                } else if (count2 == 3) {
                    JOptionPane.showInputDialog("Game over\nPlayer2 is winner");
                    exit(0);
                }
            }
        }
        if ((symbols[0][0] == 'x' && symbols[1][1] == 'x' && symbols[2][2] == 'x') ||
                (symbols[0][2] == 'x' && symbols[1][1] == 'x' && symbols[2][0] == 'x')) {
            JOptionPane.showInputDialog("Game over\nPlayer1 is winner");
            exit(0);

        } else if ((symbols[0][0] == 'o' && symbols[1][1] == 'o' && symbols[2][2] == 'o') ||
                (symbols[0][2] == 'o' && symbols[1][1] == 'o' && symbols[2][0] == 'o')) {
            JOptionPane.showInputDialog("Game over\nPlayer2 is winner");
            exit(0);
        }
    }
}
