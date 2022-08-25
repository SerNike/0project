package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pane extends JFrame {
    private JTextField f1 = new JTextField();
    private JTextField f2 = new JTextField();
    private JTextField f3 = new JTextField();
    private JTextField f4 = new JTextField();
    private JLabel l1 = new JLabel();
    private JLabel l2 = new JLabel();
    private JLabel l3 = new JLabel();
    private JLabel l4 = new JLabel();
    private JLabel l5 = new JLabel();
    private JLabel l6 = new JLabel();
    private JLabel l7 = new JLabel();
    private JRadioButton d1 = new JRadioButton("Men", true);
    private JRadioButton d2 = new JRadioButton("Women");
    private JComboBox q = new JComboBox();
    private JButton go = new JButton();
    private JButton end = new JButton();
    private JRadioButton d3 = new JRadioButton("10", true);
    private JRadioButton d4 = new JRadioButton("12");
    private JRadioButton d5 = new JRadioButton("9");
    private JRadioButton d6 = new JRadioButton("100");
    private JRadioButton d7 = new JRadioButton("20");
    private JRadioButton d8 = new JRadioButton("99");
    private JRadioButton d9 = new JRadioButton("5");
    private JRadioButton d10 = new JRadioButton("6");
    private JRadioButton d11 = new JRadioButton("3");

    public Pane() {
        super("DateBase");
        this.setBounds(1, 1, 1000, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.getContentPane().setLayout(null);


        f1.setBounds(100, 50, 200, 20);
        add(f1);
        f2.setBounds(400, 50, 200, 20);
        add(f2);
        f3.setBounds(100, 100, 200, 20);
        add(f3);
        f4.setBounds(400, 100, 200, 20);
        add(f4);
        l1.setBounds(50, 50, 200, 20);
        l1.setText("Name");
        add(l1);
        l2.setBounds(320, 50, 200, 20);
        l2.setText("Surname");
        add(l2);
        l3.setBounds(50, 100, 200, 20);
        l3.setText("Login");
        add(l3);
        l4.setBounds(320, 100, 200, 20);
        l4.setText("password");
        add(l4);

        ButtonGroup group = new ButtonGroup();
        group.add(d1);
        group.add(d2);
        d1.setVisible(true);
        d2.setVisible(true);
        d1.setBounds(200, 150, 50, 20);
        d2.setBounds(300, 150, 70, 20);
        add(d1);
        add(d2);

        for (int i = 1; i < 100; i++) {
            q.addItem(i);
            q.setVisible(true);
            q.setBounds(250, 200, 60, 40);
            add(q);
        }
            go.setBounds(300, 300, 75, 30);
            go.setText("GO");
            add(go);
            go.addActionListener (new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFrame pane2 = new JFrame();
                    pane2.setVisible(true);
                    pane2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    pane2.setSize(500, 650);
                    pane2.getContentPane().setLayout(null);


                    l5.setBounds(1, 1, 50, 50);
                    l5.setText("5+5");
                    pane2.add(l5);
                    ButtonGroup group1 = new ButtonGroup();
                    group1.add(d3);
                    group1.add(d4);
                    group1.add(d5);
                    d3.setVisible(true);
                    d4.setVisible(true);
                    d5.setVisible(true);
                    d3.setBounds(1, 50, 50, 50);
                    d4.setBounds(1, 100, 50, 50);
                    d5.setBounds(1, 150, 50, 50);
                    pane2.add(d3);
                    pane2.add(d4);
                    pane2.add(d5);

                    l6.setBounds(1, 200, 50, 50);
                    l6.setText("10*10");
                    pane2.add(l6);
                    ButtonGroup group2 = new ButtonGroup();
                    group2.add(d6);
                    group2.add(d7);
                    group2.add(d8);
                    d6.setVisible(true);
                    d7.setVisible(true);
                    d8.setVisible(true);
                    d6.setBounds(1, 250, 50, 50);
                    d7.setBounds(1, 300, 50, 50);
                    d8.setBounds(1, 350, 50, 50);
                    pane2.add(d6);
                    pane2.add(d7);
                    pane2.add(d8);

                    l7.setBounds(1, 400, 50, 50);
                    l7.setText("10/2");
                    pane2.add(l7);
                    ButtonGroup group3 = new ButtonGroup();
                    group3.add(d9);
                    group3.add(d10);
                    group3.add(d11);
                    d9.setVisible(true);
                    d10.setVisible(true);
                    d11.setVisible(true);
                    d9.setBounds(1, 450, 50, 50);
                    d10.setBounds(1, 500, 50, 50);
                    d11.setBounds(1, 550, 50, 50);
                    pane2.add(d9);
                    pane2.add(d10);
                    pane2.add(d11);

                    end.setBounds(400, 600, 75, 30);
                    end.setText("end");
                    add(end);
                }
            });
    }
}












