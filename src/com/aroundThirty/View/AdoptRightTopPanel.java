package com.aroundThirty.View;

import javax.swing.*;
import java.awt.*;

import static com.aroundThirty.Resource.FR.*;

public class AdoptRightTopPanel extends JPanel {
    JPanel switchPanel;
    JPanel westPanel;
    JPanel groupPanel;

    public AdoptRightTopPanel() {
        switchPanel = new JPanel(cardLayout);
        groupPanel = new JPanel();
        westPanel = new JPanel();
        westPanel.add(adopt_AddFile);
        adopt_AddFile.setEnabled(false);
        switchPanel.add("수정", adopt_ModifyBtn);
        switchPanel.add("완료", adopt_PostBtn);
        groupPanel.add(adopt_WriteBtn);
        groupPanel.add(switchPanel);
        groupPanel.add(adopt_DeleteBtn);

        setBackground(pastelYellow);
        switchPanel.setBackground(pastelYellow);
        westPanel.setBackground(pastelYellow);
        groupPanel.setBackground(pastelYellow);
        setLayout(new BorderLayout());
        add(BorderLayout.EAST, groupPanel);
        add(BorderLayout.WEST, westPanel);
    }
}