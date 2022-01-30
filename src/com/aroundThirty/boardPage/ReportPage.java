package com.aroundThirty.boardPage;

import java.awt.Color;
import javax.swing.*;

public class ReportPage extends JPanel {

    public ReportPage() {
        this.setBackground(Color.ORANGE);
        JButton btn = new JButton("발견했어요");
        this.add(btn);
    }
}
