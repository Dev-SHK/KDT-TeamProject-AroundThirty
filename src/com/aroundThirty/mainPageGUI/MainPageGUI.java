package com.aroundThirty.mainPageGUI;

import com.aroundThirty.myframe.MyJFrame;

import java.awt.*;

import static com.aroundThirty.Resource.Resource.*;

public class MainPageGUI extends MyJFrame {
    Container container;

    public MainPageGUI() {
        super("MainPage", 1280, 720);
        super.setTitle("MainPage");
        super.setBackground(color);
    }

    @Override
    protected void displayLayer() {
        container = getContentPane();
        container.add(BorderLayout.CENTER, new CenterPanel());
        container.add(BorderLayout.NORTH, new TopPanel());
        container.add(BorderLayout.SOUTH, new BottomPanel());
        container.add(BorderLayout.WEST, new LeftPanel());
        container.add(BorderLayout.EAST, new RightPanel());
        container.setBackground(color);
    }

    @Override
    protected void actionEvent() {
    }

    public static void main(String[] args) {
        new MainPageGUI().setVisible(true);
    }
}