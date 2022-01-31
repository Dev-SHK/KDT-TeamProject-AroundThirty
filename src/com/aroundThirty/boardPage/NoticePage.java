package com.aroundThirty.boardPage;

import javax.swing.*;
import java.awt.*;

public class NoticePage extends JPanel {

    public NoticePage() {
        this.setBackground(Color.CYAN);
        JButton btn = new JButton("공지사항");
        setPreferredSize(new Dimension(300, 1500));
        this.add(btn);
    }
}