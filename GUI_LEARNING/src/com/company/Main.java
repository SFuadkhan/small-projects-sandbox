package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        new MyFrameForButton();
    }

    public static void jFrame(MyFrame myFrame) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(420,420);
        frame.setTitle("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.getContentPane().setBackground(new Color(123,255,50));
//        new MyFrame();
    }
    public static void jLabel(){
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.green,3);
        ImageIcon imageIcon = new ImageIcon("p.png");
        label.setIcon(imageIcon);
        label.setText("Bro, do you even code?");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.YELLOW);
        label.setFont(new Font("MV BoIi",Font.PLAIN,20));
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(100,0,250,250);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.add(label);
//        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();

    }
    public static void jPanel(){
        JLabel jLabel = new JLabel();
        jLabel.setText("HI");

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,250,250);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setTitle("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        redPanel.add(jLabel);
    }
}
