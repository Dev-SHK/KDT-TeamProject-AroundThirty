package com.aroundThirty.mainPageGUI;

import com.aroundThirty.boardPage.*;
import com.aroundThirty.myframe.MyJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.aroundThirty.Resource.Resource.*;

public class MainPageGUI extends MyJFrame {
    public static Container container;
    public static CenterPanel cp;
    public static LeftPanel lp;
    public static RightPanel rp;
    public static BottomPanel bp;
    public static TopPanel tp;

    public MainPageGUI() {
        super("MainPage", 1920, 1080);
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
        container.add(BorderLayout.CENTER, cp);
        container.add(BorderLayout.NORTH, tp);
        container.add(BorderLayout.SOUTH, bp);
        container.add(BorderLayout.WEST, lp);
        container.add(BorderLayout.EAST, rp);
        container.setBackground(color);
    }


    @Override
    protected void actionEvent() {
        loginMain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginPage();
            }
        });

        mainMenuBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                container.remove(cp);
                container.add(BorderLayout.CENTER, new MainMenuPage());
                revalidate();
                repaint();
                // main
            }
        });

        noticeBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                container.remove(cp);
                container.add(BorderLayout.CENTER, new NoticePage());
                revalidate();
                repaint();
            }
        });

        discoverBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                container.remove(cp);
                container.add(BorderLayout.CENTER, new DiscoveryPage());
                revalidate();
                repaint();
            }
        });

        missBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                container.remove(cp);
                container.add(BorderLayout.CENTER, new MissPage());
                revalidate();
                repaint();
            }
        });

        protectBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                container.remove(cp);
                container.add(BorderLayout.CENTER, new ProtectPage());
                revalidate();
                repaint();
            }
        });

        newFamBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                container.remove(cp);
                container.add(BorderLayout.CENTER, new NewFamPage());
                revalidate();
                repaint();
            }
        });

        loginPopup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

    }

    public static void main(String[] args) {
        new MainPageGUI().setVisible(true);
    }
}
