package com.aroundThirty.boardPage;

import javax.swing.*;
import java.awt.*;

public class TemporaryPage extends JPanel {

    public TemporaryPage() {
        this.setBackground(Color.lightGray);
        JButton btn = new JButton("보호중이에요");
        this.add(btn);
    }
}