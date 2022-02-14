package com.aroundThirty.View;

import com.aroundThirty.Resource.BR;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.text.html.ImageView;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static com.aroundThirty.Resource.FR.*;
import static com.aroundThirty.Resource.BR.*;

public class MainRightPanel extends JPanel {
    JPanel northPan;
    JPanel southPan;
    Image imageDetail;
    ImageIcon imageDetailIcon;
    JLabel imgLabel;
    JLabel happenDtLabel;
    JLabel happenDtDetailLabel;
    JPanel happenDtPan;
    JLabel happenPlaceLabel;
    JLabel happenPlaceDetailLabel;
    JPanel happenPlacePan;
    JLabel happenKindLabel;
    JLabel happenKindDetailLabel;
    JPanel happenKindPan;
    JLabel phone_NumLabel;
    JLabel phone_NumDetailLabel;
    JPanel phone_NumPan;
    JLabel specialMarkLabel;
    JLabel specialMarkDetailLabel;
    JPanel specialMarkPan;

    MainRightPanel() {
        imageDetail = null;
        try {
            URL url = new URL(xmlDto.getThumbnail_Img());
            imageDetail = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }

        imageDetailIcon = new ImageIcon(imageDetail);
        imgLabel = new JLabel(imageSetSize(imageDetailIcon, 350, 350));

        northPan = new JPanel();
        northPan.add(imgLabel);
        northPan.setBackground(pastelGreen);

        southPan = new JPanel(new GridLayout(5, 1));

        happenDtLabel = new JLabel("제보 일자 : ");
        happenDtLabel.setPreferredSize(new Dimension(120, 35));
        happenDtDetailLabel = new JLabel(xmlDto.getHappenDt());
        happenDtDetailLabel.setPreferredSize(new Dimension(350, 35));
        happenDtPan = new JPanel();
        happenDtPan.add(happenDtLabel);
        happenDtPan.add(happenDtDetailLabel);
        happenDtPan.setBackground(pastelGreen);

        happenPlaceLabel = new JLabel("제보 장소 : ");
        happenPlaceLabel.setPreferredSize(new Dimension(120, 35));
        happenPlaceDetailLabel = new JLabel(xmlDto.getHappenPlace());
        happenPlaceDetailLabel.setPreferredSize(new Dimension(350, 35));
        happenPlacePan = new JPanel();
        happenPlacePan.add(happenPlaceLabel);
        happenPlacePan.add(happenPlaceDetailLabel);
        happenPlacePan.setBackground(pastelGreen);

        happenKindLabel = new JLabel("품종 : ");
        happenKindLabel.setPreferredSize(new Dimension(120, 35));
        happenKindDetailLabel = new JLabel(xmlDto.getKindCd());
        happenKindDetailLabel.setPreferredSize(new Dimension(350, 35));
        happenKindPan = new JPanel();
        happenKindPan.add(happenKindLabel);
        happenKindPan.add(happenKindDetailLabel);
        happenKindPan.setBackground(pastelGreen);

        phone_NumLabel = new JLabel("임시보호자 전화번호 : ");
        phone_NumLabel.setPreferredSize(new Dimension(120, 35));
        phone_NumDetailLabel = new JLabel(xmlDto.getPhone_Num());
        phone_NumDetailLabel.setPreferredSize(new Dimension(350, 35));
        phone_NumPan = new JPanel();
        phone_NumPan.add(phone_NumLabel);
        phone_NumPan.add(phone_NumDetailLabel);
        phone_NumPan.setBackground(pastelGreen);

        specialMarkLabel = new JLabel("특이사항 : ");
        specialMarkLabel.setPreferredSize(new Dimension(120, 35));
        specialMarkDetailLabel = new JLabel(xmlDto.getSpecialMark());
        specialMarkDetailLabel.setPreferredSize(new Dimension(350, 35));
        specialMarkPan = new JPanel();
        specialMarkPan.add(specialMarkLabel);
        specialMarkPan.add(specialMarkDetailLabel);
        specialMarkPan.setBackground(pastelGreen);

        southPan.add(happenDtPan);
        southPan.add(happenPlacePan);
        southPan.add(happenKindPan);
        southPan.add(phone_NumPan);
        southPan.add(specialMarkPan);

        add(BorderLayout.CENTER, northPan);
        add(BorderLayout.SOUTH, southPan);
        setPreferredSize(new Dimension(550, 0));
        setBackground(pastelGreen);
    }
}
