package com.aroundThirty.View;

import javax.swing.*;
import java.awt.*;

import static com.aroundThirty.Resource.FR.*;

public class RightTopPanel extends JPanel {
    JPanel mainPanel;

    public RightTopPanel() {
        mainPanel = new JPanel();
        mainPanel.add(writing);

        setBackground(pastelGreen);
        mainPanel.setBackground(pastelGreen);
        setLayout(new BorderLayout());
        add(BorderLayout.EAST, mainPanel);
        writing.setBorderPainted(false);
    }
}