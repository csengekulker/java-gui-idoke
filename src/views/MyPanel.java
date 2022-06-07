package views;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

public class MyPanel extends JPanel {

    int x;

    public MyPanel () {
        this.x = 20;
        this.setSize(new Dimension(950, 350));
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, 30, 50, 30);

    }

    public void move() {
        this.x += 1;
        // this.g.setColor(Color.BLUE);
        // this.g.fillRect(x, 30, 50, 30);
    }
}
