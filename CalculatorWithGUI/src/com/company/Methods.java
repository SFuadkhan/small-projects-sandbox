package com.company;

import javax.swing.*;

public class Methods {

    Methods(double a, String o, double b) {
        String A ;
        switch (o) {
            case "+" -> {
                double c = a + b;
                A = JOptionPane.showInputDialog("Your answer is: " + c);

            }
            case "-" -> {
                double c = a - b;
                A = JOptionPane.showInputDialog("Your answer is: " + c);
            }

            case "*" -> {
                double c = a * b;
                A = JOptionPane.showInputDialog("Your answer is: " + c );
            }
            case "/" -> {
                double c = a / b;
                A = JOptionPane.showInputDialog("Your answer is: " + c );
            }
            case "%" -> {
                int c = (int) a & (int) b;
                A = JOptionPane.showInputDialog("Your answer is: " + c );
            }
            default -> {
                System.out.println("Wrong operator");
                System.exit(0);
            }
        }
    }
}


