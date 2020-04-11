package com.ru.rvfch.windows;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class WindowManager {

    private List<Window> windows = new ArrayList<>();

    private Window currentWindow = null;

    private JFrame frame;

    public WindowManager(JFrame frame) {
        this.frame = frame;
    }

    public void addWindow(Window window) {
        if (!windows.contains(window)) {
            windows.add(window);
            if (currentWindow == null)
                setCurrentWindow(window);
        }
    }

    public void removeWindow(Window window) {
        windows.remove(window);
    }

    public Window getCurrentWindow() {
        return currentWindow;
    }

    public void setCurrentWindow(Window window) {
        if (window == null) return;

        this.currentWindow = window;

        frame.setContentPane(getCurrentWindow());
        frame.revalidate();
        frame.repaint();
    }

    public void setCurrentWindowByName(String name) {
        setCurrentWindow(this.windows.stream().filter(x -> x.getName().equals(name)).findAny().orElse(null));
    }

}
