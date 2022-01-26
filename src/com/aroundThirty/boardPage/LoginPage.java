package com.aroundThirty.boardPage;

import javax.swing.*;
import java.awt.*;

import static com.aroundThirty.Resource.Resource.*;

public class LoginPage extends JFrame {

    JPanel centerPan = new JPanel(new GridBagLayout());

    public LoginPage() {
        setSize(640, 480);
        add(BorderLayout.CENTER, centerPan);

        JPanel rowPan01 = new JPanel();
        rowPan01.add(new JLabel("ID"));
        rowPan01.add(new JTextField(20));
        rowPan01.setBackground(color);
        JPanel rowPan02 = new JPanel();
        rowPan02.add(new JLabel("PW"));
        rowPan02.add(new JTextField(20));
        rowPan02.setBackground(color);

        JPanel gridPan = new JPanel(new GridLayout(4, 1));
        gridPan.add(rowPan01);
        gridPan.add(rowPan02);
        gridPan.add(loginPopup);
        gridPan.add(signUp);
        gridPan.setBackground(color);

        centerPan.add(gridPan);
        centerPan.setBackground(color);
        loginPopup.setFont(fontCourier);
        loginPopup.setBorderPainted(false);

        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setVisible(true);
    }

}