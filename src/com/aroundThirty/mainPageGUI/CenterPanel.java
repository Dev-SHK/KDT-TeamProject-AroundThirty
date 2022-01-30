package com.aroundThirty.mainPageGUI;

import java.awt.*;

import javax.swing.*;

import static com.aroundThirty.Resource.FR.*;

public class CenterPanel extends JPanel {
    JPanel centerPan;
    JScrollPane scroll;

    public CenterPanel() {
        centerPan = new JPanel(new GridLayout(2, 8, 40, 15));
        setLayout(centerPan.getLayout());

        for (int i = 0; i < 8; i++) {
            add(new RoundedButton("유기동물 사진" + i));
        }
//        add(scroll.getVerticalScrollBar());
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
