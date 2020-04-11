package com.ru.rvfch.windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ConnectWindow extends Window {

    JLabel label1, label2;
    JTextField ipTextField;
    JButton buttonConnect, buttonMenu;

    public ConnectWindow() {
        setName("ConnectWindow");

        setBgImageByName("bg");

        label1 = new JLabel("Подключение к игре", JLabel.CENTER);
        label1.setFont(new Font("Arial", Font.BOLD, 48));
        label1.setForeground(Color.white);
        label1.setLayout(null);

        label2 = new JLabel("Введите IP и порт хоста:", JLabel.LEFT);
        label2.setFont(new Font("Arial", Font.PLAIN, 24));
        label2.setForeground(Color.WHITE);
        label2.setLayout(null);

        ipTextField = new JTextField();
        ipTextField.setLayout(null);

        buttonConnect = new JButton("Подключиться");
        buttonConnect.addActionListener(this);
        buttonConnect.setVerticalTextPosition(AbstractButton.CENTER);
        buttonConnect.setHorizontalTextPosition(AbstractButton.LEADING);
        buttonConnect.setActionCommand("CONNECT");
        buttonConnect.setLayout(null);

        buttonMenu = new JButton("В меню");
        buttonMenu.addActionListener(this);
        buttonMenu.setVerticalTextPosition(AbstractButton.CENTER);
        buttonMenu.setHorizontalTextPosition(AbstractButton.LEADING);
        buttonMenu.setActionCommand("MENU");
        buttonMenu.setLayout(null);


        add(label1);
        add(label2);
        add(ipTextField);
        add(buttonConnect);
        add(buttonMenu);


    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        label1.setBounds(this.getWidth() / 2 - 200, 50, 500, 50);
        label2.setBounds(this.getWidth() / 2 - 100, this.getHeight() / 2 - 40, 400, 50);
        ipTextField.setBounds(this.getWidth() / 2 - 50, this.getHeight() / 2 + 10, 200, 30);
        buttonConnect.setBounds(this.getWidth() / 2 - 50, this.getHeight() / 2 + 50, 200, 50);
        buttonMenu.setBounds(this.getWidth() / 2 - 50, this.getHeight() / 2 + 110, 200, 30);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action.equals("MENU")) {
            this.getWindowManager().setCurrentWindowByName("MenuWindow");
        } else if (action.equals("CONNECT")) {
            // TODO
        }
    }
}
