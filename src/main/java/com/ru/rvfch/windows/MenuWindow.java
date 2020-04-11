package com.ru.rvfch.windows;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class MenuWindow extends Window {

    JButton buttonPlay, buttonExit;

    public MenuWindow() {
        setName("MenuWindow");

        setBgImageByName("bg");

        buttonPlay = new JButton("Играть");
        buttonPlay.addActionListener(this);
        buttonPlay.setVerticalTextPosition(AbstractButton.CENTER);
        buttonPlay.setHorizontalTextPosition(AbstractButton.LEADING);
        buttonPlay.setActionCommand("PLAY");
        buttonPlay.setLayout(null);
        add(buttonPlay);

        buttonExit = new JButton("Выход");
        buttonExit.addActionListener(this);
        buttonExit.setVerticalTextPosition(AbstractButton.CENTER);
        buttonExit.setHorizontalTextPosition(AbstractButton.LEADING);
        buttonExit.setActionCommand("EXIT");
        buttonExit.setLayout(null);
        add(buttonExit);

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // drawing menu
        buttonPlay.setBounds(this.getWidth() / 2 - 50, this.getHeight() / 2 - 30, 200, 30);
        buttonExit.setBounds(this.getWidth() / 2 - 50, this.getHeight() / 2 + 5, 200, 30);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action.equals("EXIT")) {
            System.exit(0);
        } else if (action.equals("PLAY")) {
            this.getWindowManager().setCurrentWindowByName("ConnectWindow");
        }
    }
}
