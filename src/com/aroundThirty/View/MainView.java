package com.aroundThirty.View;

import javax.swing.*;
import java.awt.*;

import static com.aroundThirty.Resource.FR.*;

public class MainView extends JFrame {
    public static Container container;

    public MainView() {
        setSize(1440, 900);
        setTitle("MainPage");
        setBackground(pastelYellow);
        setResizable(true);
        displayLayer();
    }

    protected void displayLayer() {
        lp = new LeftPanel();
        rp = new RightPanel();
        container = getContentPane();
        bp = new BottomPanel();

        container.add(BorderLayout.SOUTH, bp);
        container.add(BorderLayout.WEST, lp);
        container.add(BorderLayout.EAST, rp);
        container.setBackground(pastelYellow);
        writing.setEnabled(false);
        setBackground(pastelYellow);

        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
    }

    public static void main(String[] args) {

        new MainView().setVisible(true);
    }
}