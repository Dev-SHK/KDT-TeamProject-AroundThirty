package com.aroundThirty.mainPageGUI;

import javax.swing.*;
import java.awt.*;

import static com.aroundThirty.Resource.FR.*;

public class BottomPanel extends JPanel {

    public BottomPanel() {
        setBackground(color);
        setLayout(new BorderLayout());
        writing.setBorderPainted(false);
        add(writing, BorderLayout.EAST);

    }
}