package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        new Methods(Double.parseDouble(JOptionPane.showInputDialog("Input first num")),
                JOptionPane.showInputDialog("Choose operator:  + - * / %"),
                Double.parseDouble(JOptionPane.showInputDialog("Input second num")));
    }
}
