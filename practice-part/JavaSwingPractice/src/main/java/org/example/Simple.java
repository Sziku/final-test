package org.example;

import javax.swing.*;

public class Simple {
    JFrame f;

    public Simple() {
        f = new JFrame("Simple Button Example");
        final JTextField tf = new JTextField();
        tf.setBounds(50,50,150,20);
        JButton b = new JButton("click");
        b.setBounds(130,100,100,40);
        b.addActionListener(actionEvent -> tf.setText("Welcaome to Hell"));
        f.add(b);
        f.add(tf);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
