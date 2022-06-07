package controllers;

import javax.swing.Timer;

import models.MainModel;
import views.MainFrame;

public class MainController {
  MainFrame mainFrame;
  MainModel mainModel;
  Timer timer;
  
  public MainController() {
    this.mainFrame = new MainFrame();
    this.mainModel = new MainModel();
    this.mainFrame.startButton.addActionListener(action -> startButtonAction());
    timer = new Timer(500, action -> onTime());
  }

  private void startButtonAction() {
    this.timer.start();
  }

  private void onTime() {
    // System.out.println("ido van");
    this.mainFrame.trackPanel.move();
  }
}