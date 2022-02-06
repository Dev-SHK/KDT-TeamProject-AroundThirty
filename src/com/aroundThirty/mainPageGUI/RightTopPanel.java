package com.aroundThirty.mainPageGUI;

import javax.swing.*;
import java.awt.*;

import static com.aroundThirty.Resource.FR.*;

public class RightTopPanel extends JPanel {
    JPanel mainPanel;

    public RightTopPanel() {
        mainPanel = new JPanel();
        mainPanel.add(writing);

        setBackground(color);
        mainPanel.setBackground(color);
        setLayout(new BorderLayout());
        add(BorderLayout.EAST, mainPanel);
        writing.setBorderPainted(false);
    }
}