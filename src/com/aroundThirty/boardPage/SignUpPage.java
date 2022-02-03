package com.aroundThirty.boardPage;

import javax.swing.*;

import java.awt.*;

import static com.aroundThirty.Resource.FR.*;

public class SignUpPage extends JFrame {
    public SignUpPage() {
        setSize(480, 720);
        setVisible(true);

        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setVisible(true);
    }
}
