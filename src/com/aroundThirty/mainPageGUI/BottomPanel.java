package com.aroundThirty.mainPageGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.aroundThirty.Resource.FR.*;

public class BottomPanel extends JPanel {

    JPanel groupPan;

    public BottomPanel() {
        setLayout(new BorderLayout());

        groupPan = new JPanel();
        groupPan.add(locationCombo);
        groupPan.setBackground(Color.WHITE);

        groupPan.add(seoulCombo);
//        "서울", "부산", "대구", "인천", "광주", "대전", "울산", "세종", "경기", "강원", "충북", "충남", "전북", "전남", "경북", "경남", "제주"
        locationCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox) e.getSource();
                int index = cb.getSelectedIndex();
                switch (index) {
                    case 0:
                        seoulCombo.removeAllItems();
                        for (int i = 0; i < locationSeoul.length; i++) {
                            seoulCombo.addItem(locationSeoul[i]);
                        }
                        break;
                    case 1:
                        seoulCombo.removeAllItems();
                        for (int i = 0; i < locationBusan.length; i++) {
                            seoulCombo.addItem(locationBusan[i]);
                        }
                        break;
                    case 2:
                        seoulCombo.removeAllItems();
                        for (int i = 0; i < locationDaegu.length; i++) {
                            seoulCombo.addItem(locationDaegu[i]);
                        }
                        break;
                    case 3:
                        seoulCombo.removeAllItems();
                        for (int i = 0; i < locationIncheon.length; i++) {
                            seoulCombo.addItem(locationIncheon[i]);
                        }
                        break;
                    case 4:
                        seoulCombo.removeAllItems();
                        for (int i = 0; i < locationGwangju.length; i++) {
                            seoulCombo.addItem(locationGwangju[i]);
                        }
                        break;
                    case 5:
                        seoulCombo.removeAllItems();
                        for (int i = 0; i < locationDaejeon.length; i++) {
                            seoulCombo.addItem(locationDaejeon[i]);
                        }
                        break;
                    case 6:
                        seoulCombo.removeAllItems();
                        for (int i = 0; i < locationUlsan.length; i++) {
                            seoulCombo.addItem(locationUlsan[i]);
                        }
                        break;
                    case 7:
                        seoulCombo.removeAllItems();
                        for (int i = 0; i < locationSejong.length; i++) {
                            seoulCombo.addItem(locationSejong[i]);
                        }
                        break;
                    case 8:
                        seoulCombo.removeAllItems();
                        for (int i = 0; i < locationGyeonggi.length; i++) {
                            seoulCombo.addItem(locationGyeonggi[i]);
                        }
                        break;
                    case 9:
                        seoulCombo.removeAllItems();
                        for (int i = 0; i < locationGangwon.length; i++) {
                            seoulCombo.addItem(locationGangwon[i]);
                        }
                        break;
                    case 10:
                        seoulCombo.removeAllItems();
                        for (int i = 0; i < locationChungBuk.length; i++) {
                            seoulCombo.addItem(locationChungBuk[i]);
                        }
                        break;
                    case 11:
                        seoulCombo.removeAllItems();
                        for (int i = 0; i < locationChungNam.length; i++) {
                            seoulCombo.addItem(locationChungNam[i]);
                        }
                        break;
                    case 12:
                        seoulCombo.removeAllItems();
                        for (int i = 0; i < locationJeonBuk.length; i++) {
                            seoulCombo.addItem(locationJeonBuk[i]);
                        }
                        break;
                    case 13:
                        seoulCombo.removeAllItems();
                        for (int i = 0; i < locationJeonNam.length; i++) {
                            seoulCombo.addItem(locationJeonNam[i]);
                        }
                        break;
                    case 14:
                        seoulCombo.removeAllItems();
                        for (int i = 0; i < locationGyeongBuk.length; i++) {
                            seoulCombo.addItem(locationGyeongBuk[i]);
                        }
                        break;
                    case 15:
                        seoulCombo.removeAllItems();
                        for (int i = 0; i < locationGyeongNam.length; i++) {
                            seoulCombo.addItem(locationGyeongNam[i]);
                        }
                        break;
                    case 16:
                        seoulCombo.removeAllItems();
                        for (int i = 0; i < locationJeju.length; i++) {
                            seoulCombo.addItem(locationJeju[i]);
                        }
                        break;
                }
            }
        });

        groupPan.add(genderCombo);
        groupPan.add(kindCombo);

        groupPan.add(searchBTN);
        searchBTN.setBorderPainted(false);
        searchBTN.getPreferredSize();

        loginMain.setFont(fontCourier);
        loginMain.getPreferredSize();
        loginMain.setBorderPainted(false);
        groupPan.add(loginMain);

        logoutMain.setFont(fontCourier);
        logoutMain.getPreferredSize();
        logoutMain.setBorderPainted(false);

        catBTN.setBorderPainted(false);
        catBTN.getPreferredSize();
        groupPan.add(catBTN);
        add(groupPan, BorderLayout.EAST);

        dogBTN.setBorderPainted(false);
        dogBTN.getPreferredSize();
        add(dogBTN, BorderLayout.WEST);

        this.setBackground(Color.WHITE);
    }
}