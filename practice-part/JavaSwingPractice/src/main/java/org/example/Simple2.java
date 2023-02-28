package org.example;

import javax.swing.*;
import java.awt.*;

public class Simple2 extends JFrame {

    public Simple2() {
        setTitle("Simple 2 Button Example");
        JButton b = new JButton("click");
        b.setBounds(130,100,100,40);
        add(b);
        setSize(400,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
