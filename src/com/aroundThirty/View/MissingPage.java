package com.aroundThirty.View;

import javax.swing.*;
import java.awt.*;
import java.io.Serial;
import java.util.ArrayList;

import static com.aroundThirty.Resource.FR.*;


public class MissingPage extends JPanel {
//    @Serial
//    private static final long serialVersionUID = 1L;
//    public static ArrayList<JPanel> paneList = new ArrayList<>();
//    public static ArrayList<JButton> btnList = new ArrayList<>();
//    public static ArrayList<JLabel> lblList = new ArrayList<>();
//    MissingPagingBtn missingPagingBtn = new MissingPagingBtn();
//    JPanel centerPanel = new JPanel(new GridLayout(SIZE_ROW, SIZE_COL));    // SIZE_ROW, SIZE_COL로 행열 지정
//    JScrollPane jScrollPane = new JScrollPane(centerPanel);
//
//    static {
//        setDataListPanel(0, 12 + SIZE_ITEM);
//    }
//
//    public MissingPage() {
//        missingPagingBtn.setBackground(pastelYellow);
//        add(BorderLayout.CENTER, jScrollPane);
//        jScrollPane.setPreferredSize(new Dimension(820, 650));
//        jScrollPane.setBorder(null);
//        jScrollPane.setBackground(pastelYellow);
//        centerPanel.setBackground(pastelYellow);
//        for (int i = 0; i < paneList.size(); i++) {
//            centerPanel.add(paneList.get(i));   // panel에 index를 줘서 변수를 주듯 이름을 매김
//        }
//        add(BorderLayout.SOUTH, missingPagingBtn);
//        setBackground(pastelYellow);
//    }
//
//    public static void setDataListPanel(int startIndex, int endIndex) { // 버튼과 라벨을 넣어준다.
//        for (int i = 0, dataIdx = startIndex; i < SIZE_ITEM; i++, dataIdx++) {
//            JPanel newPane = new JPanel(null);
//            btnList.add(new JButton(reportCardDtoList.get(dataIdx).getImage())); // carddatalist클래스의 이미지를 끌고와서 버튼에 넣어줌 근데 12번째 이미지 부터 넣어줌?
//            lblList.add(new JLabel(reportCardDtoList.get(dataIdx).getTitle()));  // carddatalist클래스의 이미지를 끌고와서 버튼에 넣어줌 근데 12번째 이미지 부터 넣어줌?
//            btnList.get(i).setBounds(60, 0, 150, 120);   // 위치는 따로 지정 해주지 않고 크기만 지정 해줌
//            lblList.get(i).setBounds(60, 120, 150, 20);  // 위치는 따로 지정 해주지 않고 크기만 지정 해줌
//            newPane.add(btnList.get(i));
//            newPane.add(lblList.get(i));
//            newPane.setBackground(pastelYellow);
//            paneList.add(newPane);
//        }
//
//    }
//
//    public static void setDataListPage(int startIndex, int endIndex) {  // 버튼과 라벨에 데이터를 넣어준다.
//        for (int i = 0, dataIdx = startIndex; i < SIZE_ITEM; i++, dataIdx++) {
//            btnList.get(i).setText(reportCardDtoList.get(dataIdx).getImage());
//            lblList.get(i).setText(reportCardDtoList.get(dataIdx).getTitle());
//        }
//    }
}