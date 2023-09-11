package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameForButton extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    public MyFrameForButton(){
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button1.setBounds(0,0,200,200);
        button2.setBounds(200,0,200,200);
        button3.setBounds(400,0,200,200);
        button4.setBounds(0,200,200,200);
        button5.setBounds(200,200,200,200);
        button6.setBounds(400,200,200,200);
        button7.setBounds(0,400,200,200);
        button8.setBounds(200,400,200,200);
        button9.setBounds(400,400,200,200);
        button1.addActionListener(e -> System.out.println("poo"));
        button2.addActionListener(e -> System.out.println("poo"));
        button3.addActionListener(e -> System.out.println("poo"));
        button4.addActionListener(e -> System.out.println("poo"));
        button5.addActionListener(e -> System.out.println("poo"));
        button6.addActionListener(e -> System.out.println("poo"));
        button7.addActionListener(e -> System.out.println("poo"));
        button8.addActionListener(e -> System.out.println("poo"));
        button9.addActionListener(e -> System.out.println("poo"));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(600,600);
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

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
