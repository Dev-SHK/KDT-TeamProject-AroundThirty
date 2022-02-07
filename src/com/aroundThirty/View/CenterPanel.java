package com.aroundThirty.View;

import com.aroundThirty.Controller.MainController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static com.aroundThirty.Resource.FR.*;


public class CenterPanel extends JPanel {
    JPanel centerPan;
    JPanel mainPanel;
    GridLayout gridLayout;
    JScrollPane scrollPane;

    public CenterPanel() {
        scrollPane = new JScrollPane();
        gridLayout = new GridLayout(2, 3);
        mainPanel = new JPanel(gridLayout);
        centerPan = new JPanel();
        gridLayout.setVgap(30);
        gridLayout.setHgap(30);
        click = true;

        String[] data1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        String[] data2 = {"13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"};
        String[] data3 = {"25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36"};
        String[] data4 = {"37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48"};
        String[] data5 = {"49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"};
        String[] data6 = {"61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72"};
        String[] data7 = {"73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84"};
        String[] data8 = {"85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96"};
        String[] data9 = {"97", "98", "99", "100"};

        int i;
        for (i = 0; i < data1.length; i++) {
            mainPanel.add(rbtn = new JButton("유기동물 사진 - 메인" + i));
            int finalI = i;
            rbtn.setPreferredSize(new Dimension(200, 300));
            rbtn.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    JButton jButton = (JButton) e.getSource();
                    jButton.setText("마우스 오버 테스트");
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    JButton jButton = (JButton) e.getSource();
                    jButton.setText("유기동물 사진 - 메인" + finalI);

                }
            });

            MainController.onClick();

        }
        JPanel buttonPane = new JPanel();
        JButton btn1 = new JButton("1");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                for (int i = 0; i < data1.length; i++) {
                    mainPanel.add(rbtn = new JButton("Page 01 " + i));
                }
                rbtn.setPreferredSize(new Dimension(200, 300));
                MainController.onClick();
                revalidate();
                repaint();
            }
        });
        buttonPane.add(btn1);


        JButton btn2 = new JButton("2");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                for (int i = 0; i < data2.length; i++) {
                    mainPanel.add(rbtn = new JButton("Page 02 " + i));
                }
                rbtn.setPreferredSize(new Dimension(200, 300));
                MainController.onClick();
                revalidate();
                repaint();
            }
        });
        buttonPane.add(btn2);

        JButton btn3 = new JButton("3");
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                for (int i = 0; i < data3.length; i++) {
                    mainPanel.add(rbtn = new JButton("Page 03 " + i));
                }
                rbtn.setPreferredSize(new Dimension(200, 300));
                MainController.onClick();
                revalidate();
                repaint();
            }
        });
        buttonPane.add(btn3);

        JButton btn4 = new JButton("4");
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                for (int i = 0; i < data4.length; i++) {
                    mainPanel.add(rbtn = new JButton("Page 04 " + i));
                }
                rbtn.setPreferredSize(new Dimension(200, 300));
                MainController.onClick();
                revalidate();
                repaint();
            }
        });
        buttonPane.add(btn4);

        JButton btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                for (int i = 0; i < data5.length; i++) {
                    mainPanel.add(rbtn = new JButton("Page 05 " + i));
                }
                rbtn.setPreferredSize(new Dimension(200, 300));
                MainController.onClick();
                revalidate();
                repaint();
            }
        });
        buttonPane.add(btn5);

        JButton btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                for (int i = 0; i < data6.length; i++) {
                    mainPanel.add(rbtn = new JButton("Page 06 " + i));
                }
                rbtn.setPreferredSize(new Dimension(200, 300));
                MainController.onClick();
                revalidate();
                repaint();
            }
        });
        buttonPane.add(btn6);

        JButton btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                for (int i = 0; i < data7.length; i++) {
                    mainPanel.add(rbtn = new JButton("Page 07 " + i));
                }
                rbtn.setPreferredSize(new Dimension(200, 300));
                MainController.onClick();
                revalidate();
                repaint();
            }
        });
        buttonPane.add(btn7);

        JButton btn8 = new JButton("8");
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                for (int i = 0; i < data8.length; i++) {
                    mainPanel.add(rbtn = new JButton("Page 08 " + i));
                }
                rbtn.setPreferredSize(new Dimension(200, 300));
                MainController.onClick();
                revalidate();
                repaint();
            }
        });
        buttonPane.add(btn8);

        JButton btn9 = new JButton("9");
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                for (int i = 0; i < data9.length; i++) {
                    mainPanel.add(rbtn = new JButton("Page 09 " + i));
                }
                rbtn.setPreferredSize(new Dimension(200, 300));
                MainController.onClick();
                revalidate();
                repaint();
            }
        });
        buttonPane.add(btn9);

        buttonPane.setBackground(pastelYellow);

        scrollPane.add(mainPanel);
        scrollPane.setViewportView(mainPanel);
        scrollPane.setBorder(null);
        scrollPane.setOpaque(false);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
//        mainPanel.setPreferredSize(new Dimension(300, 1500));
        mainPanel.getPreferredSize();
        mainPanel.setBackground(pastelYellow);
        scrollPane.getHorizontalScrollBar().setUnitIncrement(20);
        setLayout(new BorderLayout());

        add(scrollPane, BorderLayout.CENTER);
        add(buttonPane, BorderLayout.SOUTH);
    }
}