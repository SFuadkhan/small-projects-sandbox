package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setVisible(true);
        this.setSize(420,420);
        this.setTitle("Hello");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.getContentPane().setBackground(new Color(123,255,50));
    }
}
