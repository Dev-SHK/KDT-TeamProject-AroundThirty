package com.aroundThirty.mainPageGUI;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class CenterPanel extends JPanel {
    JPanel mainPanel;
    RoundedButton rbtn;
    JScrollPane scrollPane;


    public CenterPanel() {
        mainPanel = new JPanel(new GridLayout(4, 8, 40, 15));
        scrollPane = new JScrollPane(mainPanel);

        int i;
        for (i = 0; i < 16; i++) {
            mainPanel.add(rbtn = new RoundedButton("유기동물 사진 - 메인" + i));
            int finalI = i;
            rbtn.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    RoundedButton roundedButton = (RoundedButton) e.getSource();
                    roundedButton.setText("마우스 오버 테스트");
                }

                @Override
                public void mouseExited(MouseEvent e){
                    RoundedButton roundedButton = (RoundedButton) e.getSource();
                    roundedButton.setText("유기동물 사진 - 메인" + finalI);

                }
            });
        }
        setLayout(new BorderLayout());
        add(scrollPane);
        scrollPane.setViewportView(mainPanel);
        scrollPane.setBorder(null);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        mainPanel.setPreferredSize(new Dimension(300, 1500));
        scrollPane.getVerticalScrollBar().setUnitIncrement(15);
    }

    class RoundedButton extends JButton {

        public RoundedButton() {
            super();
            decorate();
        }

        public RoundedButton(String text) {
            super(text);
            decorate();
        }

        public RoundedButton(Action action) {
            super(action);
            decorate();
        }

        public RoundedButton(Icon icon) {
            super(icon);
            decorate();
        }

        public RoundedButton(String text, Icon icon) {
            super(text, icon);
            decorate();
        }

        protected void decorate() {
            setBorderPainted(true);
            setOpaque(true);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Color c = new Color(255, 247, 242); // 배경색 결정
            Color o = new Color(247, 99, 12); // 글자색 결정
            double width = getWidth();
            double height = getHeight() / 1.5;
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            if (getModel().isArmed()) {
                graphics.setColor(c.darker());
            } else if (getModel().isRollover()) {
                graphics.setColor(c.brighter());
            } else {
                graphics.setColor(c);
            }
            graphics.fillRoundRect(0, 0, (int) width, (int) height, 100, 100);
            FontMetrics fontMetrics = graphics.getFontMetrics();
            Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();
            double textX = (width - stringBounds.width) / 2;
            double textY = (height - stringBounds.height) / 2 + fontMetrics.getAscent();
            graphics.setColor(o);
            graphics.setFont(getFont());
            graphics.drawString(getText(), (int) textX, (int) textY);
            graphics.dispose();
            super.paintComponent(g);
        }
    }
}