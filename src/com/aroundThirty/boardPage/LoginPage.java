package com.aroundThirty.boardPage;

import javax.swing.*;
import java.awt.*;

import static com.aroundThirty.Resource.FR.*;

public class LoginPage extends JFrame {

    JPanel centerPan = new JPanel(new GridBagLayout());
    JPanel findPan;
    JPanel idPwPan;

    public LoginPage() {
        findPan = new JPanel(new BorderLayout());
        idPwPan = new JPanel();
        setSize(640, 480);
        add(BorderLayout.CENTER, centerPan);
        add(BorderLayout.SOUTH, findPan);
        findPan.add(BorderLayout.EAST, idPwPan);
        findPan.setBackground(color);


        JPanel rowPan01 = new JPanel(); // ID, PW 라벨과 텍스트필드를 그룹으로 묶어서 관리!
        rowPan01.add(new JLabel("I\tD"));
        rowPan01.add(idTxtFld);
        rowPan01.setBackground(color);
        JPanel rowPan02 = new JPanel();
        rowPan02.add(new JLabel("PW"));
        rowPan02.add(pwTxtFld);
        rowPan02.setBackground(color);

        JButton findIdPwBTN = new JButton("ID/PW 찾기");
        findIdPwBTN.setFont(fontAppGothic);
        findIdPwBTN.setForeground(Color.GRAY);
        idPwPan.add(findIdPwBTN);
        idPwPan.setBackground(color);
        findIdPwBTN.setBorderPainted(false);

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
        setResizable(false);
        setVisible(true);
    }

}