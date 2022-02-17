package com.aroundThirty.View;

import javax.swing.*;
import java.awt.*;

import static com.aroundThirty.Resource.FR.*;

public class TemporaryRightTopPanel extends JPanel {
    JPanel switchPanel;
    JPanel westPanel;
    JPanel groupPanel;

    public TemporaryRightTopPanel() {
        switchPanel = new JPanel(cardLayout);
        groupPanel = new JPanel();
        westPanel = new JPanel();
        westPanel.add(temporary_AddFile);
        temporary_AddFile.setEnabled(false);
        switchPanel.add("수정", temporary_ModifyBtn);
        switchPanel.add("완료", temporary_PostBtn);
        groupPanel.add(temporary_WriteBtn);
        groupPanel.add(switchPanel);
        groupPanel.add(temporary_DeleteBtn);

        setBackground(pastelYellow);
        switchPanel.setBackground(pastelYellow);
        westPanel.setBackground(pastelYellow);
        groupPanel.setBackground(pastelYellow);
        setLayout(new BorderLayout());
        add(BorderLayout.EAST, groupPanel);
        add(BorderLayout.WEST, westPanel);
    }
}