package views;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

public class MyPanel extends JPanel {
    Graphics g;
    int x = 0;

    public MyPanel () {
        this.x = 0;
    }

    @Override
    public void paint(Graphics g) {
        this.g = g;

    }

    public void move() {
        this.g.setColor(Color.BLUE);
        this.g.fillRect(x, 30, 50, 30);
    }
}
