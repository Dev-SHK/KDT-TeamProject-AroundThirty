package com.aroundThirty.mainPageGUI;

import javax.swing.*;
import java.awt.*;

import static com.aroundThirty.Resource.Resource.*;
import static com.aroundThirty.mainPageGUI.MainPageGUI.layout;


public class LeftPanel extends JPanel {
    JPanel centerPan = new JPanel();

    public LeftPanel() {
        add(BorderLayout.WEST, centerPan);

        JPanel mainPan = new JPanel();
        mainPan.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        mainPan.setBackground(color01);
        mainPan.add(mainMenuBTN);
        mainMenuBTN.setFont(fontNanum);
        mainMenuBTN.setBorderPainted(false);
        mainPan.add(mainMenuBTN);

        JPanel noticePan = new JPanel();
        noticePan.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        noticePan.setBackground(color01);
        noticePan.add(noticeBTN);
        noticeBTN.setFont(fontNanum);
        noticeBTN.setBorderPainted(false);
        noticePan.add(noticeBTN);

        JPanel discoveryPan = new JPanel();
        discoveryPan.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        discoveryPan.setBackground(color01);
        discoveryPan.add(discoverBTN);
        discoverBTN.setFont(fontNanum);
        discoverBTN.setBorderPainted(false);
        discoveryPan.add(discoverBTN);

        JPanel missingPan = new JPanel();
        missingPan.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        missingPan.setBackground(color01);
        missingPan.add(missBTN);
        missBTN.setFont(fontNanum);
        missBTN.setBorderPainted(false);
        missingPan.add(missBTN);

        JPanel protectPan = new JPanel();
        protectPan.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        protectPan.setBackground(color01);
        protectPan.add(protectBTN);
        protectBTN.setFont(fontNanum);
        protectBTN.setBorderPainted(false);
        protectPan.add(protectBTN);

        JPanel findPan = new JPanel();
        findPan.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        findPan.setBackground(color01);
        findPan.add(newFamBTN);
        newFamBTN.setFont(fontNanum);
        newFamBTN.setBorderPainted(false);
        findPan.add(newFamBTN);

        JPanel gridPan = new JPanel(new GridLayout(6, 1));
        gridPan.add(mainPan);
        gridPan.add(noticePan);
        gridPan.add(discoveryPan);
        gridPan.add(missingPan);
        gridPan.add(protectPan);
        gridPan.add(findPan);
        gridPan.setBackground(color01);

        centerPan.add(gridPan);
        centerPan.setBackground(color01);

        this.setBackground(color01);
    }

    public static void main(String[] args) {
        new LeftPanel().setVisible(true);
    }
}
