package com.aroundThirty.mainPageGUI;

import javax.swing.*;
import java.awt.*;

import static com.aroundThirty.Resource.FR.*;

public class BottomPanel extends JPanel {
    JPanel centerPan = new JPanel();

    public BottomPanel() {
        JPanel gridPan = new JPanel(new GridBagLayout());
        RoundJTextField missingCount = new RoundJTextField(25);
        missingCount.setText("찾고있어요 :");
        missingCount.setEnabled(false);
        missingCount.setHorizontalAlignment(JTextField.CENTER);
        RoundJTextField protectedCount = new RoundJTextField(25);
        protectedCount.setText("보호중이에요 :");
        protectedCount.setEnabled(false);
        protectedCount.setHorizontalAlignment(JTextField.CENTER);
        JTabbedPane empty = new JTabbedPane();
        JTabbedPane empty01 = new JTabbedPane();
        gridPan.add(missingCount);
        gridPan.add(empty);
        gridPan.add(empty01);
        gridPan.add(protectedCount);
        gridPan.setBackground(color);

        centerPan.add(gridPan);
        centerPan.setBackground(color);

        this.setBackground(color);
        this.add(BorderLayout.CENTER, centerPan);
    }
}