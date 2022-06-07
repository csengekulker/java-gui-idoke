package views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class MainFrame extends JFrame {
  JPanel mainPanel;
  public MyPanel trackPanel;
  public JButton startButton;

  public MainFrame() {

    setComponents();
    setMainPanel();
    setFrame();
  }

  private void setComponents() {
    startButton = new JButton("START");
    trackPanel = new MyPanel();

  }

  private void setMainPanel() {
    this.mainPanel = new JPanel();

    // layout for mainPanel
    this.mainPanel.setLayout(new BorderLayout());

    this.mainPanel.add(startButton, BorderLayout.NORTH);
    this.mainPanel.add(trackPanel, BorderLayout.CENTER);
  }

  private void setFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(1000, 400);
    this.setTitle("JAVA GUI TEMPLATE");
    this.setVisible(true);

    // layout for window
    this.setLayout(new BorderLayout());

    this.add(this.mainPanel, BorderLayout.CENTER);

  }
}