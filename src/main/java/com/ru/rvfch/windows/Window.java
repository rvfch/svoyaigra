package com.ru.rvfch.windows;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public abstract class Window extends JPanel implements ActionListener {

    private BufferedImage bg = null;

    private WindowManager windowManager;

    public void setWindowManager(WindowManager windowManager) {
        this.windowManager = windowManager;
    }

    protected WindowManager getWindowManager() {
        return this.windowManager;
    }

    protected void setBgImageByName(String imgName) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(getClass().getResource("/images/" + imgName + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setBgImage(img);
    }

    protected void setBgImage(BufferedImage img) {
        this.bg = img;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (bg != null) {
            g.drawImage(this.bg, 0,0, this.getWidth(), this.getHeight(), this);
        }
    }
}
