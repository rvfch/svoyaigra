package com.ru.rvfch.windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GameWindow extends Window {

    public GameWindow() {
        setName("GameWindow");
    }

    public void paint(Graphics g) {
        g.drawRect(200,200,200,200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
