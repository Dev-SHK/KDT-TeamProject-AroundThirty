package com.aroundThirty.View;

import javax.swing.*;
import java.awt.*;

import static com.aroundThirty.Resource.FR.*;

public class RightTopPanel extends JPanel {
    JPanel switchPanel;
    JPanel westPanel;
    JPanel groupPanel;

    public RightTopPanel() {
        switchPanel = new JPanel(cardLayout);
        groupPanel = new JPanel();
        westPanel = new JPanel();
        westPanel.add(addFile);
        switchPanel.add("수정", modifyBtn);
        switchPanel.add("완료", postBtn);
        groupPanel.add(switchPanel);
        groupPanel.add(deleteBtn);

        setBackground(pastelGreen);
        switchPanel.setBackground(pastelGreen);
        westPanel.setBackground(pastelGreen);
        groupPanel.setBackground(pastelGreen);
        setLayout(new BorderLayout());
        add(BorderLayout.EAST, groupPanel);
        add(BorderLayout.WEST, westPanel);
    }
}