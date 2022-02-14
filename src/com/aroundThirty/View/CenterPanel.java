package com.aroundThirty.View;

import com.aroundThirty.model.XmlDao;
import com.aroundThirty.model.XmlDto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serial;
import java.util.ArrayList;

import static com.aroundThirty.Resource.FR.*;
import static com.aroundThirty.Resource.BR.*;


public class CenterPanel extends JPanel {
    @Serial
    private static final long serialVersionUID = 1L;
    public static ArrayList<JPanel> paneList = new ArrayList<>();
    public static ArrayList<JButton> btnList = new ArrayList<>();
    public static ArrayList<JLabel> lblList = new ArrayList<>();
    MainPagingBtn mainPagingBtn = new MainPagingBtn();
    JPanel centerPanel = new JPanel(new GridLayout(SIZE_ROW, SIZE_COL));    // SIZE_ROW, SIZE_COL로 행열 지정
    JScrollPane jScrollPane = new JScrollPane(centerPanel);
    static ImageIcon thumbnailIcon;

    static {
        setDataListPanel(0, 12 + SIZE_ITEM);
    }

    public CenterPanel() {
        mainPagingBtn.setBackground(pastelYellow);
        add(BorderLayout.CENTER, jScrollPane);
        jScrollPane.setPreferredSize(new Dimension(820, 650));
        jScrollPane.setBorder(null);
        jScrollPane.setBackground(pastelYellow);
        centerPanel.setBackground(pastelYellow);
        for (int i = 0; i < paneList.size(); i++) {
            centerPanel.add(paneList.get(i));   // panel에 index를 줘서 변수를 주듯 이름을 매김
        }
        add(BorderLayout.SOUTH, mainPagingBtn);
        setBackground(pastelYellow);
    }

    public static void setDataListPanel(int startIndex, int endIndex) { // 버튼과 라벨을 넣어준다.
        for (int i = 0, dataIdx = startIndex; i < SIZE_ITEM; i++, dataIdx++) {
            JPanel newPane = new JPanel(null);
            Image thumbnailImgIcon = null;
            try {
                URL url = new URL(xmlDtoListAll.get(dataIdx + 1).getFileName());
                thumbnailImgIcon = ImageIO.read(url);
            } catch (IOException e) {
                e.printStackTrace();
            }
            thumbnailIcon = new ImageIcon(thumbnailImgIcon);
            btnList.add(new JButton(imageSetSize(thumbnailIcon, 150, 120)));
            lblList.add(new JLabel("[" + (xmlCardDtoList.get(dataIdx).getNo() + 1) + "] " + "발견일 : " + xmlDtoListAll.get(dataIdx + 1).getHappenDt()));
            btnList.get(i).setBounds(60, 0, 150, 120);   // 위치는 따로 지정 해주지 않고 크기만 지정 해줌
            lblList.get(i).setBounds(60, 120, 150, 20);  // 위치는 따로 지정 해주지 않고 크기만 지정 해줌
            newPane.add(btnList.get(i));
            newPane.add(lblList.get(i));
            newPane.setBackground(pastelYellow);
            paneList.add(newPane);
            int finali = i;
            btnList.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() instanceof JButton) { // e.getsource로 받아온 객체가 JButton의 상속을 받으면 true 반환
                        // instanceof : 객체타입을 확인하는 연산자로 형변환 가능 여부를 확인하며 true, false 로 반환 주로 상속관계에서 부모객체인지 자식객체인지 확인하는데 사용
                        JButton btn = (JButton) e.getSource();   // e.getsource로 받아온 객체의 속성을 btn에 담는다.
                        int postedPageNum = (pageNum * 12) + xmlCardDtoList.get(finali + 1).getNo() + 1;
                        xmlDto = XmlDao.xmlDtoSelectOne(new XmlDto(postedPageNum));
                        mrp.happenDtDetailLabel.setText(xmlDto.getHappenDt());
                        mrp.happenPlaceDetailLabel.setText(xmlDto.getHappenPlace());
                        mrp.happenKindDetailLabel.setText(xmlDto.getKindCd());
                        mrp.phone_NumDetailLabel.setText(xmlDto.getPhone_Num());
                        mrp.specialMarkDetailLabel.setText(xmlDto.getSpecialMark());
                        Image imageDetail = null;
                        try {
                            URL url = new URL(xmlDto.getThumbnail_Img());
                            imageDetail = ImageIO.read(url);
                        } catch (IOException ea) {
                            ea.printStackTrace();
                        }
                        ImageIcon imgIcon = new ImageIcon(imageDetail); // 이미지를 담음
                        mrp.imgLabel.setPreferredSize(new Dimension(450, 450));
                        mrp.imgLabel.setIcon(imgIcon);
                        if (click) {
                            mrp.setVisible(true);
//                            click = false;
                        }
                        btn.removeActionListener(null);
                    }
                }
            });
        }
    }

    // 최근 입력 게시물이 먼저 조회 되도록 수정 해야함
    // 증감식을 -- 로 바꿔야함
    public static void setDataListPage(int startIndex, int endIndex) {  // 버튼과 라벨에 데이터를 넣어준다.
        for (int i = 0, dataIdx = startIndex; i < SIZE_ITEM; i++, dataIdx++) {
            Image thumbnailImgIcon = null;
            try {
                URL url = new URL(xmlDtoListAll.get(dataIdx + 1).getFileName());
                thumbnailImgIcon = ImageIO.read(url);
            } catch (IOException e) {
                e.printStackTrace();
            }
            thumbnailIcon = new ImageIcon(thumbnailImgIcon);
            btnList.get(i).setIcon(imageSetSize(thumbnailIcon, 150, 120));
            lblList.get(i).setText("[" + (xmlCardDtoList.get(dataIdx).getNo() + 1) + "] " + "발견일 : " + xmlDtoListAll.get(dataIdx + 1).getHappenDt());
        }
    }
}