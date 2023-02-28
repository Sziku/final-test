package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

public class IpSearch extends JFrame implements ActionListener {
    JLabel l;
    JButton b;
    JTextField tf;

    public IpSearch()  {
        super("Ip Search App");
        tf = new JTextField();
        tf.setBounds(50,50,150,20);
        l = new JLabel();
        l.setBounds(50,100,250,20);
        b = new JButton("Find IP");
        b.setBounds(50,150,95,30);
        b.addActionListener(this);
        add(l);
        add(b);
        add(tf);
        setSize(400,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of "+host+" is "+ip);
        } catch (UnknownHostException ex) {
            throw new RuntimeException(ex);
        }
    }
}
