package com.aroundThirty.mainPageGUI;

import javax.swing.*;
import java.awt.*;

import static com.aroundThirty.Resource.FR.*;


public class LeftPanel extends JPanel {
    JPanel centerPan = new JPanel();

    public LeftPanel() {
        add(BorderLayout.WEST, centerPan);

        JPanel mainPan = new JPanel();
        mainPan.setBorder(BorderFactory.createEmptyBorder(30, 20, 30, 20));
        mainPan.setBackground(color01);
        mainPan.add(mainMenuBTN);
        mainMenuBTN.setFont(fontNanum);
        mainMenuBTN.setBorderPainted(false);

        JPanel noticePan = new JPanel();
        noticePan.setBorder(BorderFactory.createEmptyBorder(30, 20, 30, 20));
        noticePan.setBackground(color01);
        noticePan.add(noticeBTN);
        noticeBTN.setFont(fontNanum);
        noticeBTN.setBorderPainted(false);

        JPanel reportPan = new JPanel();
        reportPan.setBorder(BorderFactory.createEmptyBorder(30, 20, 30, 20));
        reportPan.setBackground(color01);
        reportPan.add(reportBTN);
        reportBTN.setFont(fontNanum);
        reportBTN.setBorderPainted(false);

        JPanel missingPan = new JPanel();
        missingPan.setBorder(BorderFactory.createEmptyBorder(30, 20, 30, 20));
        missingPan.setBackground(color01);
        missingPan.add(missingBTN);
        missingBTN.setFont(fontNanum);
        missingBTN.setBorderPainted(false);

        JPanel tempPan = new JPanel();
        tempPan.setBorder(BorderFactory.createEmptyBorder(30, 20, 30, 20));
        tempPan.setBackground(color01);
        tempPan.add(tempBTN);
        tempBTN.setFont(fontNanum);
        tempBTN.setBorderPainted(false);

        JPanel adoptPan = new JPanel();
        adoptPan.setBorder(BorderFactory.createEmptyBorder(30, 20, 30, 20));
        adoptPan.setBackground(color01);
        adoptPan.add(adoptBTN);
        adoptBTN.setFont(fontNanum);
        adoptBTN.setBorderPainted(false);

        JPanel gridPan = new JPanel(new GridLayout(6, 1));
        gridPan.add(mainPan);
        gridPan.add(noticePan);
        gridPan.add(reportPan);
        gridPan.add(missingPan);
        gridPan.add(tempPan);
        gridPan.add(adoptPan);
        gridPan.setBackground(color01);

        centerPan.add(gridPan);
        centerPan.setBackground(color01);

        this.setBackground(color01);
//        this.setVisible(true);
    }

//    public static void main(String[] args) {
//        new LeftPanel().setVisible(true);
//    }
}
