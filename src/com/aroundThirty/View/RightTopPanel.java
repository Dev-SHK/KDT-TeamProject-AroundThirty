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
        addFile.setEnabled(false);
        switchPanel.add("수정", modifyBtn);
        switchPanel.add("완료", postBtn);
        groupPanel.add(writeBtn);
        groupPanel.add(switchPanel);
        groupPanel.add(deleteBtn);

        setBackground(pastelYellow);
        switchPanel.setBackground(pastelYellow);
        westPanel.setBackground(pastelYellow);
        groupPanel.setBackground(pastelYellow);
        setLayout(new BorderLayout());
        add(BorderLayout.EAST, groupPanel);
        add(BorderLayout.WEST, westPanel);
    }
}