package com.aroundThirty.mainPageGUI;

import com.aroundThirty.boardPage.*;
import com.aroundThirty.myframe.MyJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.aroundThirty.Resource.FR.*;

public class MainPageGUI extends MyJFrame {
    public static Container container;
    public static CenterPanel cp;
    public static LeftPanel lp;
    public static RightPanel rp;
    public static BottomPanel bp;
    public static TopPanel tp;
    JScrollPane scrollPane;

    public MainPageGUI() {
        super("MainPage", 1440, 900);
        super.setTitle("MainPage");
        super.setBackground(color);
    }

    @Override
    protected void displayLayer() {
        container = getContentPane();
        cp = new CenterPanel();
        tp = new TopPanel();
        lp = new LeftPanel();
        rp = new RightPanel();
        bp = new BottomPanel();
        tp = new TopPanel();
        jPanel = cp;
        container.add(BorderLayout.CENTER, cp);
        container.add(BorderLayout.NORTH, tp);
        container.add(BorderLayout.SOUTH, bp);
        container.add(BorderLayout.WEST, lp);
//        container.add(BorderLayout.EAST, rp);
        container.setBackground(color);
        scrollPane = new JScrollPane(cp);
        container.add(scrollPane);
        scrollPane.setViewportView(cp);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getVerticalScrollBar().setUnitIncrement(15);
        writing.setEnabled(false);

        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
    }

    @Override
    protected void actionEvent() {
        loginMain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (new LoginPage().isVisible()) {
                    loginMain.setEnabled(false);
                }
            }
        });

        mainMenuBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                container.remove(scrollPane);
                container.add(BorderLayout.CENTER, cp);
                scrollPane = new JScrollPane(cp);
                container.add(scrollPane);
                scrollPane.setViewportView(cp);
                scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
                scrollPane.getVerticalScrollBar().setUnitIncrement(15);
                jPanel = cp;
                revalidate();
                repaint();
                writing.setEnabled(false);
            }
        });

        noticeBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                container.remove(scrollPane);
                container.add(BorderLayout.CENTER, np);
                scrollPane = new JScrollPane(np);
                container.add(scrollPane);
                scrollPane.setViewportView(np);
                scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
                scrollPane.getVerticalScrollBar().setUnitIncrement(15);
                jPanel = np;
                revalidate();
                repaint();
                writing.setEnabled(false);
            }
        });

        reportBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                container.remove(scrollPane);
                container.add(BorderLayout.CENTER, rep);
                scrollPane = new JScrollPane(rep);
                container.add(scrollPane);
                scrollPane.setViewportView(rep);
                scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
                scrollPane.getVerticalScrollBar().setUnitIncrement(15);
                jPanel = rep;
                revalidate();
                repaint();
                writing.setEnabled(true);
            }
        });

        missingBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                container.remove(scrollPane);
                container.add(BorderLayout.CENTER, mp);
                scrollPane = new JScrollPane(mp);
                container.add(scrollPane);
                scrollPane.setViewportView(mp);
                scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
                scrollPane.getVerticalScrollBar().setUnitIncrement(15);
                jPanel = mp;
                revalidate();
                repaint();
                writing.setEnabled(true);
            }
        });

        tempBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                container.remove(scrollPane);
                container.add(BorderLayout.CENTER, tep);
                scrollPane = new JScrollPane(tep);
                container.add(scrollPane);
                scrollPane.setViewportView(tep);
                scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
                scrollPane.getVerticalScrollBar().setUnitIncrement(15);
                jPanel = tep;
                revalidate();
                repaint();
                writing.setEnabled(true);
            }
        });

        adoptBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                container.remove(scrollPane);
                container.add(BorderLayout.CENTER, ap);
                scrollPane = new JScrollPane(ap);
                container.add(scrollPane);
                scrollPane.setViewportView(ap);
                scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
                scrollPane.getVerticalScrollBar().setUnitIncrement(15);
                jPanel = ap;
                revalidate();
                repaint();
                writing.setEnabled(true);
            }
        });

        loginPopup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        searchBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public static void main(String[] args) {

        new MainPageGUI().setVisible(true);
    }
}
