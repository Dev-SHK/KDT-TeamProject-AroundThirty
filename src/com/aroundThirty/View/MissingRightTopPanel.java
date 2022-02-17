package com.aroundThirty.View;

import javax.swing.*;
import java.awt.*;

import static com.aroundThirty.Resource.FR.*;

public class MissingRightTopPanel extends JPanel {
    JPanel switchPanel;
    JPanel westPanel;
    JPanel groupPanel;

    public MissingRightTopPanel() {
        switchPanel = new JPanel(cardLayout);
        groupPanel = new JPanel();
        westPanel = new JPanel();
        westPanel.add(missing_AddFile);
        missing_AddFile.setEnabled(false);
        switchPanel.add("수정", missing_ModifyBtn);
        switchPanel.add("완료", missing_PostBtn);
        groupPanel.add(missing_WriteBtn);
        groupPanel.add(switchPanel);
        groupPanel.add(missing_DeleteBtn);

        setBackground(pastelYellow);
        switchPanel.setBackground(pastelYellow);
        westPanel.setBackground(pastelYellow);
        groupPanel.setBackground(pastelYellow);
        setLayout(new BorderLayout());
        add(BorderLayout.EAST, groupPanel);
        add(BorderLayout.WEST, westPanel);
    }
}