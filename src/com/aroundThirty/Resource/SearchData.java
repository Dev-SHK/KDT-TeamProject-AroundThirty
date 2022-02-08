package com.aroundThirty.Resource;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.aroundThirty.Resource.FR.*;

public class SearchData {

    public SearchData() {
        // "서울", "부산", "대구", "인천", "광주", "대전", "울산", "세종", "경기", "강원", "충북", "충남", "전북", "전남", "경북", "경남", "제주"
        String getLocation = locationCombo.getSelectedItem().toString();
        String getLocationDetail = seoulCombo.getSelectedItem().toString();
        String getGender = genderCombo.getSelectedItem().toString();
        String getKind = kindCombo.getSelectedItem().toString();

        if (getLocation.equals("경기") && getLocationDetail.equals("광명시") && getGender.equals("암컷") && getKind.equals("강아지")) {
            JOptionPane.showMessageDialog(null, "일치하는 데이터를 찾았어요!", title, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "일치하는 데이터가 없어요 ㅠㅠ", title, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
