package com.aroundThirty.mainPageGUI;

import javax.swing.*;

import java.awt.*;

import static com.aroundThirty.Resource.FR.*;

public class RightPanel extends JPanel {
    JPanel cenPan;
    JPanel groupPan;
    JLabel jLabel;
    JTextArea jTextArea;
    JPanel mainPan;

    public RightPanel() {

        cenPan = new JPanel();
        jTextArea = new JTextArea(45, 40);
        jTextArea.setText("이곳은 새 글을 작성하거나,\n버튼을 누르면 상세 정보를 표시해 주는 곳입니다.");
        jLabel = new JLabel("test");
        cenPan.add(jLabel);
        cenPan.add(jTextArea);
        rtp = new RightTopPanel();

        groupPan = new JPanel(new BorderLayout());
        groupPan.add(BorderLayout.SOUTH, rtp);
        groupPan.add(BorderLayout.CENTER, cenPan);
        groupPan.setBackground(pastelYellow);

        mainPan = new JPanel();
        mainPan.add(groupPan);
        mainPan.setBackground(pastelYellow);

        add(mainPan, BorderLayout.CENTER);
        setBackground(pastelYellow);
        setVisible(false);


    }
}
