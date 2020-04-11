package com.ru.rvfch;

import com.ru.rvfch.windows.*;

import javax.swing.*;

public class App extends JFrame {

    private void initUI() {
        // showing windows
        WindowManager windowManager = new WindowManager(this);

        Window menuWindow = new MenuWindow();
        Window gameWindow = new GameWindow();
        Window connectWindow = new ConnectWindow();

        menuWindow.setWindowManager(windowManager);
        gameWindow.setWindowManager(windowManager);
        connectWindow.setWindowManager(windowManager);

        windowManager.addWindow(menuWindow);
        windowManager.addWindow(gameWindow);
        windowManager.addWindow(connectWindow);


        // default size
        setSize(800, 600);
        // maximaze window
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("Svoya Igra");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        // showing
        setVisible(true);

    }

    public App() {

    }

    public void start() {
        initUI();
    }


}
