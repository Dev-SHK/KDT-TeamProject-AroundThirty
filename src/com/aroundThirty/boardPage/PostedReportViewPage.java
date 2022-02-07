package com.aroundThirty.boardPage;


import com.aroundThirty.myframe.MyJFrame;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.aroundThirty.Resource.FR.*;


public class PostedReportViewPage extends JFrame {
    JPanel centerPanel = new JPanel(new BorderLayout());
    JPanel northPanel = new JPanel(new BorderLayout());
    JPanel southPanel = new JPanel();
    JPanel nEastPanel = new JPanel();
    public static JPanel nEWestPanel = new JPanel(cardLayout);
    public static JPanel cNTPanel = new JPanel(cardLayout);
    JPanel nEEastPanel = new JPanel();
    JPanel cNorthPanel = new JPanel();
    JPanel cCenterPanel = new JPanel(new BorderLayout());
    JPanel cRNorthPanel = new JPanel(new GridLayout(6,2,0,10));
    JPanel cRNorthPanel_Card = new JPanel(new GridLayout(6,2,0,10));
    JPanel cLNorthPanel = new JPanel();
    JPanel cRCenterPanel = new JPanel();
    JPanel cLCenterPanel = new JPanel();
    JPanel cCCenterPanel = new JPanel(new BorderLayout());
    public static JPanel cCCenterPanel_Card = new JPanel(cardLayout);



    //static JButton modifyBtn = new JButton("수정");
    //static JButton deleteBtn = new JButton("삭제");
    //static JButton postBtn = new JButton("수정 완료");
    JLabel reportDt = new JLabel("제보일자 및 시간 :");
    JLabel reportDt_Card = new JLabel("제보일자 및 시간 :");
    JLabel reportDtVal = new JLabel("2022 / 01 / 01 17:34");    // DB 연결 해야함
    JTextField reportDtTxt = new JTextField("2022 / 01 / 01 17:34");
    JLabel reportPlace = new JLabel("발견 장소 :");
    JLabel reportPlace_Card = new JLabel("발견 장소 :");
    JLabel reportPlaceVal = new JLabel("우리집");  // DB 연결 해야함
    JTextField reportPlaceTxt = new JTextField("우리집");  // DB 연결 해야함
    JLabel reportKind = new JLabel("품종 :");
    JLabel reportKind_Card = new JLabel("품종 :");
    JLabel reportKindVal = new JLabel("코카스파니엘");    // DB 연결 해야함
    JTextField reportKindTxt = new JTextField("코카스파니엘");    // DB 연결 해야함
    JLabel reportNum = new JLabel("전화번호 :");
    JLabel reportNum_Card = new JLabel("전화번호 :");
    JLabel reportNumVal = new JLabel("010-9152-6616");  // DB 연결 해야함
    JTextField reportNumTxt = new JTextField("010-9152-6616");  // DB 연결 해야함
    JLabel postDt = new JLabel("게시일자 및 시간 :");
    JLabel postDt_Card = new JLabel("게시일자 및 시간 :");
    JLabel postDtVal = new JLabel("2022 / 01 / 01 19:17");  // DB 연결 해야함
    JTextField postDtTxt = new JTextField("2022 / 01 / 01 19:17");  // DB 연결 해야함
    JLabel modifyDt = new JLabel("수정일자 및 시간 :");
    JLabel modifyDt_Card = new JLabel("수정일자 및 시간 :");
    JLabel modifyDtVal = new JLabel("2022 / 01 / 02 09:00");    // DB 연결 해야함
    JTextField modifyDtTxt = new JTextField("2022 / 01 / 02 09:00");    // DB 연결 해야함
    JTextArea reportDetail = new JTextArea("reportDetail"); // DB 연결 해야함
    JTextArea reportDetailTxt = new JTextArea("reportDetail"); // DB 연결 해야함

    String imgPath = "src/com/aroundThirty/imgFiles/Sample.jpg";    // 이미지 주소를 받음
    ImageIcon imgIcon = new ImageIcon(imgPath); // 이미지를 담음
    JLabel imgLabel = new JLabel(imageSetSize(imgIcon,250,250));    // 이미지 추가


    JScrollPane scrollPane = new JScrollPane(centerPanel);

    public PostedReportViewPage() {
        setSize(725, 800);

        // Frame에 패널 추가
        setLayout(new BorderLayout());
        add(BorderLayout.NORTH, northPanel);
        add(BorderLayout.CENTER, centerPanel);
        add(BorderLayout.SOUTH, southPanel);
        add(scrollPane);

        // 패널 구성
        northPanel.add(BorderLayout.EAST,nEastPanel);
        nEastPanel.add(nEWestPanel);
        nEastPanel.add(nEEastPanel);
        centerPanel.add(BorderLayout.NORTH, cNorthPanel);
        centerPanel.add(BorderLayout.CENTER, cCenterPanel);
        cNorthPanel.add(BorderLayout.WEST, cLNorthPanel);
        cNorthPanel.add(BorderLayout.EAST, cNTPanel);
        cNTPanel.add(cRNorthPanel);
        cNTPanel.add(cRNorthPanel_Card);
        cCenterPanel.add(BorderLayout.WEST,cLCenterPanel);
        cCenterPanel.add(BorderLayout.EAST,cRCenterPanel);
        cCenterPanel.add(BorderLayout.CENTER,cCCenterPanel);
        cCCenterPanel.add(BorderLayout.NORTH,cCCenterPanel_Card);

        // 패널에 라벨 및 버튼 추가
        nEWestPanel.add("수정", modifyBtn);
        nEEastPanel.add(deleteBtn);
        cLNorthPanel.add(imgLabel);
        cRNorthPanel.add(reportDt);
        cRNorthPanel.add(reportDtVal);
        cRNorthPanel.add(reportPlace);
        cRNorthPanel.add(reportPlaceVal);
        cRNorthPanel.add(reportKind);
        cRNorthPanel.add(reportKindVal);
        cRNorthPanel.add(reportNum);
        cRNorthPanel.add(reportNumVal);
        cRNorthPanel.add(postDt);
        cRNorthPanel.add(postDtVal);
        cRNorthPanel.add(modifyDt);
        cRNorthPanel.add(modifyDtVal);
        cCCenterPanel_Card.add(reportDetail);

        // 패널에 라벨 및 버튼 추가 card 2
        nEWestPanel.add("완료", postBtn);
        cRNorthPanel_Card.add(reportDt_Card);
        cRNorthPanel_Card.add(reportDtTxt);
        cRNorthPanel_Card.add(reportPlace_Card);
        cRNorthPanel_Card.add(reportPlaceTxt);
        cRNorthPanel_Card.add(reportKind_Card);
        cRNorthPanel_Card.add(reportKindTxt);
        cRNorthPanel_Card.add(reportNum_Card);
        cRNorthPanel_Card.add(reportNumTxt);
        cRNorthPanel_Card.add(postDt_Card);
        cRNorthPanel_Card.add(postDtTxt);
        cRNorthPanel_Card.add(modifyDt_Card);
        cRNorthPanel_Card.add(modifyDtTxt);
        cCCenterPanel_Card.add(reportDetailTxt);

        reportDetail.setEditable(false);
        cCCenterPanel_Card.setPreferredSize(new Dimension(250,500));
        cCCenterPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));   // 안쪽 여백 추가
        LineBorder line = new LineBorder(color, 5, true);   // 이미지 테두리선과 곡선에 대한 값 저장
        imgLabel.setBorder(line);   // 저장된 테두리와 곡선 추가

        // 폰트 설정
        reportDetail.setFont(fontNanum);
        reportDetailTxt.setFont(fontNanum);
        reportDt.setFont(fontNanum);
        reportDt_Card.setFont(fontNanum);
        reportDtVal.setFont(fontNanum);
        reportDtTxt.setFont(fontNanum);
        reportPlace.setFont(fontNanum);
        reportPlace_Card.setFont(fontNanum);
        reportPlaceVal.setFont(fontNanum);
        reportPlaceTxt.setFont(fontNanum);
        reportKind.setFont(fontNanum);
        reportKind_Card.setFont(fontNanum);
        reportKindVal.setFont(fontNanum);
        reportKindTxt.setFont(fontNanum);
        reportNum.setFont(fontNanum);
        reportNum_Card.setFont(fontNanum);
        reportNumVal.setFont(fontNanum);
        reportNumTxt.setFont(fontNanum);
        postDt.setFont(fontNanum);
        postDt_Card.setFont(fontNanum);
        postDtVal.setFont(fontNanum);
        postDtTxt.setFont(fontNanum);
        modifyDt.setFont(fontNanum);
        modifyDt_Card.setFont(fontNanum);
        modifyDtVal.setFont(fontNanum);
        modifyDtTxt.setFont(fontNanum);

        // 패널 색상
        nEEastPanel.setBackground(color);
        cRNorthPanel_Card.setBackground(color01);
        reportDetail.setBackground(color);
        northPanel.setBackground(color);
        centerPanel.setBackground(color01);
        southPanel.setBackground(color);
        nEastPanel.setBackground(color);
        cCenterPanel.setBackground(color01);
        cNorthPanel.setBackground(color01);
        cRNorthPanel.setBackground(color01);
        cLNorthPanel.setBackground(color01);
        cCCenterPanel.setBackground(color);
        cRCenterPanel.setBackground(color);
        cLCenterPanel.setBackground(color);
        cCCenterPanel_Card.setBackground(color);

        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setVisible(true);

        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);    // 상하 스크롤에 대한 정책을 설정한다. (스크롤바가 항상 보이도록 설정)
        centerPanel.setPreferredSize(new Dimension(300, 1000)); // centerPanel의 크기 지정
        scrollPane.getVerticalScrollBar().setUnitIncrement(15); // 스크롤 속도 지정
        scrollPane.setViewportView(centerPanel); // 데이터가 화면을 넘어가도 깨지지 않도록 수정 대신 넘어간 데이터가 안보일 수 있음
    }


    static ImageIcon imageSetSize(ImageIcon icon, int i, int j) {
        Image img = icon.getImage();  //ImageIcon을 Image로 변환.
        Image imgScale = img.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imgSize = new ImageIcon(imgScale);
        return imgSize;
    }


    }

}
