package Game;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private int width;
    private int height;

    public Frame(String title, int width, int height) throws HeadlessException {
        super(title);
        this.width = width;
        this.height = height;

        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setVisible(true);
        super.setResizable(false);
        super.setSize(this.width, this.height);
    }

}
