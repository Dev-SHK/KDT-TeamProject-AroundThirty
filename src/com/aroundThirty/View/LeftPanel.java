package com.aroundThirty.View;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;

import static com.aroundThirty.Resource.FR.*;

public class LeftPanel extends JPanel {
    public JTabbedPane tabbedPane;
    JPanel centerPan;

    public LeftPanel() {

        Insets insets = UIManager.getInsets("TabbedPane.contentBorderInsets");
        insets.bottom = -1;
        insets.left = -1;
        insets.right = -1;
        UIManager.put("TabbedPane.contentBorderInsets", insets);

        tabbedPane = new JTabbedPane();
        cp = new CenterPanel();
        mrp = new MainRightPanel();
//        switchPan = mrp;

        tabbedPane.addTab("메인메뉴", cp);
        tabbedPane.addTab("발견했어요", rep);
        tabbedPane.addTab("잃어버렸어요", mp);
        tabbedPane.addTab("보호중이에요", tep);
        tabbedPane.addTab("새 가족을 찾아요", ap);
        tabbedPane.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
        tabbedPane.setOpaque(true);
        tabbedPane.setBackground(pastelYellow);
        tabbedPane.setPreferredSize(new Dimension(840, 780));
        tabbedPane.setBorder(null);
//        tabbedPane.addChangeListener(new ChangeListener() {
//            @Override
//            public void stateChanged(ChangeEvent e) {
//                JTabbedPane tabbedPane = (JTabbedPane) e.getSource();
//                switch (tabbedPane.getSelectedIndex()) {
//                    case 0:
////                        MainView.container.add(BorderLayout.EAST, mrp);
//
//                        mrp.add(BorderLayout.CENTER, mrp.centerPanel);
//                        switchPan = mrp.centerPanel;
//                        mrp.revalidate();
//                        mrp.repaint();
//                        System.out.println("'메인메뉴' 탭으로 이동함");
//                        break;
//                    case 1:
////                        MainView.container.add(BorderLayout.EAST, rp);
//                        mrp.remove(switchPan);
//                        mrp.add(BorderLayout.CENTER, rp.centerPanel);
//                        switchPan = rp.centerPanel;
//                        mrp.revalidate();
//                        mrp.repaint();
//                        System.out.println("'발견했어요' 탭으로 이동함");
//                        break;
//                    case 2:
//                        System.out.println("'잃어버렸어요' 탭으로 이동함");
//                        break;
//                    case 3:
//                        System.out.println("'보호중이에요' 탭으로 이동함");
//                        break;
//                    case 4:
//                        System.out.println("'새 가족을 찾아요' 탭으로 이동함");
//                        break;
//                }
//            }
//        });

        centerPan = new JPanel();
        centerPan.add(tabbedPane);
        centerPan.setBackground(pastelYellow);
        add(centerPan, BorderLayout.CENTER);
        setBackground(pastelYellow);
    }
}
