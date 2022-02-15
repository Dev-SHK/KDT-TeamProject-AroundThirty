package com.aroundThirty.Resource;

import com.aroundThirty.JdbcUtil;
import com.aroundThirty.model.XmlDao;
import com.aroundThirty.model.XmlDto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.StringTokenizer;

import static com.aroundThirty.Resource.FR.*;
import static com.aroundThirty.Resource.BR.*;
import static com.aroundThirty.model.XmlDto.*;
import static com.aroundThirty.model.XmlDao.*;

public class SearchData {
    String searchKind;
    ArrayList<String> kindArr;

    String searchGender;
    ArrayList<String> genderArr;

    StringTokenizer tokenizerGetGender;
    String divideGenderWord;

    String searchLocation;
    ArrayList<String> locationArr;

    int count;

    ArrayList<String> totalArr;

    public SearchData() throws SQLException {
        // "서울", "부산", "대구", "인천", "광주", "대전", "울산", "세종", "경기", "강원", "충북", "충남", "전북", "전남", "경북", "경남", "제주"
        String getLocation = locationCombo.getSelectedItem().toString();
        String getLocationDetail = seoulCombo.getSelectedItem().toString();
        String getKind = kindCombo.getSelectedItem().toString();
        String getGender = genderCombo.getSelectedItem().toString();
        tokenizerGetGender = new StringTokenizer(getGender, "()");
        while (tokenizerGetGender.hasMoreTokens()) {
            String temp = tokenizerGetGender.nextToken();
            divideGenderWord = tokenizerGetGender.nextToken(); // ComboBox에 있는 Gender를 M 또는 F로 분리
        }
        xmlDtoListAll = XmlDao.xmlSelectAll();

        kindArr = new ArrayList<>();
        for (int i = 0; i < xmlDtoListAll.size(); i++) {
            searchKind = xmlDtoListAll.get(i).kindCd;
            kindArr.add(searchKind);
        }

        genderArr = new ArrayList<>();
        for (int i = 0; i < xmlDtoListAll.size(); i++) {
            searchGender = xmlDtoListAll.get(i).sexCd; // DB에 있는 Gender
            genderArr.add(searchGender);
        }

        locationArr = new ArrayList<>();
        for (int i = 0; i < xmlDtoListAll.size(); i++) {
            searchLocation = xmlDtoListAll.get(i).orgNm;
            locationArr.add(searchLocation);
        }

        count = 0;
        totalArr = new ArrayList<>();
        for (int i = 0; i < xmlDtoListAll.size(); i++) {
            if ((locationArr.get(i)).contains(getLocation) && (locationArr.get(i)).contains(getLocationDetail) && (genderArr.get(i)).contains(divideGenderWord) && (kindArr.get(i)).contains(getKind)) {
                totalArr.add(locationArr.get(xmlDtoListAll.get(i).no - 1));
                count++;
            }
        } // for문 끝
        if (count > 0) {
            JOptionPane.showMessageDialog(null, String.format("검색 결과 %d개를 찾았습니다.", count), title, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "검색결과가 없습니다.", title, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
