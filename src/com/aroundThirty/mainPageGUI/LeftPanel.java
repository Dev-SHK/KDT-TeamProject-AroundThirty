package com.aroundThirty.mainPageGUI;

import javax.swing.*;

import java.awt.*;

import static com.aroundThirty.Resource.FR.*;

public class LeftPanel extends JPanel {
    JTabbedPane tabbedPane;
    JPanel centerPan;

    public LeftPanel() {
        tabbedPane = new JTabbedPane();
        cp = new CenterPanel();

        tabbedPane.addTab("메인메뉴", cp);
        tabbedPane.addTab("발견했어요", rep);
        tabbedPane.addTab("잃어버렸어요", mp);
        tabbedPane.addTab("보호중이에요", tep);
        tabbedPane.addTab("새 가족을 찾아요", ap);
        tabbedPane.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
        tabbedPane.setOpaque(false);
        tabbedPane.setBackground(color);
        tabbedPane.setPreferredSize(new Dimension(840, 780));

        centerPan = new JPanel();
        centerPan.add(tabbedPane);
        centerPan.setBackground(color);
        add(centerPan, BorderLayout.CENTER);
        setBackground(color);
    }
}
