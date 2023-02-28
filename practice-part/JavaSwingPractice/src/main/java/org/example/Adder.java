package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Adder extends JFrame implements ActionListener {
    JButton b1;
    JButton b2;
    JTextField tf1;
    JTextField tf2;
    JTextField tf3;

    public Adder() {
        super("Simple Adder and Sub");
        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 20);
        tf2 = new JTextField();
        tf2.setBounds(50, 100, 150, 20);
        tf3 = new JTextField();
        tf3.setBounds(50, 150, 150, 20);
        tf3.setEditable(false);

        b1 = new JButton("+");
        b1.setBounds(50, 200, 50, 50);
        b2 = new JButton("-");
        b2.setBounds(120, 200, 50, 50);

        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);
        add(b2);
        add(tf1);
        add(tf2);
        add(tf3);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int number1 = Integer.parseInt(tf1.getText());
        int number2 = Integer.parseInt(tf2.getText());
        int number3 = 0;

        Object source = e.getSource();
        if (source.equals(b1)) {
            number3 = number1 + number2;
        } else if (source.equals(b2)) {
            number3 = number1 - number2;
        }

        tf3.setText(String.valueOf(number3));
    }
}
