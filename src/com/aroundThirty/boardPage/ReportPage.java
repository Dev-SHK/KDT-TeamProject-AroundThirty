package com.aroundThirty.boardPage;

import com.aroundThirty.model.ReportDao;
import com.aroundThirty.model.ReportDto;
import com.aroundThirty.model.XmlDto;

import java.awt.*;
import java.util.List;
import javax.swing.*;


public class ReportPage extends JPanel {
    JPanel centerPan;
    JScrollPane scroll;
    ReportDto data;


    public ReportPage() {
        List<ReportDto> list = ReportDao.reportSelectAll();
        for(ReportDto reportDto : list) {
            data = reportDto;
        }
        int row = list.size() / 4;
        centerPan = new JPanel(new GridLayout(row, 4, 40, 0));  // container의 center에 ReportPage를 넣고 center패널을 하나더 만듦?
        setPreferredSize(new Dimension(300,1500));  // 컨텐츠(?)의 크기 지정
        setLayout(centerPan.getLayout()); // centerPan의 레이아웃을 가져옴
        for (int i = 0; i < list.size(); i++) {
            add(new RoundedButton("제보 사진" + i + "\n" + new Label(data.report_Place))); // 레이아웃에 맞게 버튼 정렬
        }
//        scroll = new JScrollPane(this);   // scroll(JScrollPane)안에 centerPan 구현
//        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);    // 상하 스크롤에 대한 정책을 설정한다. (스크롤바가 항상 보이도록 설정)
//        scroll.setViewportView(centerPan); //
//        centerPan.add(scroll);


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
