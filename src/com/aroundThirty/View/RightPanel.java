package com.aroundThirty.View;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

import static com.aroundThirty.Resource.FR.*;

public class RightPanel extends JPanel {
    static JPanel centerPanel = new JPanel(new BorderLayout());
    JPanel northPanel = new JPanel(new BorderLayout());
    JPanel southPanel = new JPanel();
    JPanel nEastPanel = new JPanel();
    public static JPanel nEWestPanel = new JPanel(cardLayout);
    public static JPanel cNTPanel = new JPanel(cardLayout);
    JPanel nEEastPanel = new JPanel();
    JPanel cNorthPanel = new JPanel();
    JPanel cCenterPanel = new JPanel(new BorderLayout());
    JPanel cRNorthPanel = new JPanel(new GridLayout(6, 2, 0, 10));
    JPanel cRNorthPanel_Card = new JPanel(new GridLayout(6, 2, 0, 10));
    JPanel cLNorthPanel = new JPanel();
    JPanel cRCenterPanel = new JPanel();
    JPanel cLCenterPanel = new JPanel();
    JPanel cCCenterPanel = new JPanel(new BorderLayout());
    public static JPanel cCCenterPanel_Card = new JPanel(cardLayout);
    JScrollPane detail_ScrollPane = new JScrollPane(centerPanel);


    JLabel reportDt = new JLabel("제보일자 및 시간 :");
    JLabel reportDt_Card = new JLabel("제보일자 및 시간 :");
    JLabel reportDtVal = new JLabel("2022 / 01 / 01 17:34");    // DB 연결 해야함
    JTextField reportDtTxt = new JTextField("2022 / 01 / 01 17:34");    // DB 연결 해야함
    JLabel reportPlace = new JLabel("발견 장소 :");
    JLabel reportPlace_Card = new JLabel("발견 장소 :");
    JTextArea reportPlaceVal = new JTextArea("싱하형 굴다리 밑");  // DB 연결 해야함
    JTextArea reportPlaceTxt = new JTextArea("우리집");  // DB 연결 해야함
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
    JTextArea postDtTxt = new JTextArea("2022 / 01 / 01 19:17");  // DB 연결 해야함
    JLabel modifyDt = new JLabel("수정일자 및 시간 :");
    JLabel modifyDt_Card = new JLabel("수정일자 및 시간 :");
    JLabel modifyDtVal = new JLabel("2022 / 01 / 02 09:00");    // DB 연결 해야함
    JTextArea modifyDtTxt = new JTextArea("2022 / 01 / 02 09:00");    // DB 연결 해야함
    JTextArea reportDetail = new JTextArea("reportDetail"); // DB 연결 해야함
    JTextArea reportDetailTxt = new JTextArea("reportDetail"); // DB 연결 해야함

    String imgPath = "src/com/aroundThirty/imgFiles/Sample.jpg";    // 이미지 주소를 받음
    ImageIcon imgIcon = new ImageIcon(imgPath); // 이미지를 담음
    JLabel imgLabel = new JLabel(imageSetSize(imgIcon, 150, 150));    // 이미지 추가


    public RightPanel() {
        setPreferredSize(new Dimension(500, 0));

        // Frame에 패널 추가
        setLayout(new BorderLayout());
        add(BorderLayout.NORTH, northPanel);
        add(BorderLayout.CENTER, centerPanel);
        add(BorderLayout.SOUTH, southPanel);
        add(detail_ScrollPane);

        // 패널 구성
        northPanel.add(BorderLayout.EAST, nEastPanel);
        nEastPanel.add(nEWestPanel);
        nEastPanel.add(nEEastPanel);
        centerPanel.add(BorderLayout.NORTH, cNorthPanel);
        centerPanel.add(BorderLayout.CENTER, cCenterPanel);
        cNorthPanel.add(BorderLayout.WEST, cLNorthPanel);
        cNorthPanel.add(BorderLayout.EAST, cNTPanel);
        cNTPanel.add(cRNorthPanel);
        cNTPanel.add(cRNorthPanel_Card);
        cCenterPanel.add(BorderLayout.WEST, cLCenterPanel);
        cCenterPanel.add(BorderLayout.EAST, cRCenterPanel);
        cCenterPanel.add(BorderLayout.CENTER, cCCenterPanel);
        cCCenterPanel.add(BorderLayout.NORTH, cCCenterPanel_Card);

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

        // 라벨, 버튼 등 속성
        reportDetail.setEditable(false);
//        reportDtVal.setEditable(false);
        reportPlaceVal.setEditable(false);
//        reportKindVal.setEditable(false);
//        reportNumVal.setEditable(false);
//        postDtVal.setEditable(false);
//        modifyDtVal.setEditable(false);
        postDtTxt.setEditable(false);
        modifyDtTxt.setEditable(false);
        reportPlaceVal.setLineWrap(true);
        cCCenterPanel_Card.setPreferredSize(new Dimension(250, 500));
        cCCenterPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));   // 안쪽 여백 추가
        LineBorder line = new LineBorder(pastelPink, 5, true);   // 이미지 테두리선과 곡선에 대한 값 저장
        imgLabel.setBorder(line);   // 저장된 테두리와 곡선 추가

        // 폰트 설정
        reportDetail.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        reportDetailTxt.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        reportDt.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        reportDt_Card.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        reportDtVal.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        reportDtTxt.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        reportPlace.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        reportPlace_Card.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        reportPlaceVal.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        reportPlaceTxt.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        reportKind.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        reportKind_Card.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        reportKindVal.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        reportKindTxt.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        reportNum.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        reportNum_Card.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        reportNumVal.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        reportNumTxt.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        postDt.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        postDt_Card.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        postDtVal.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        postDtTxt.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        modifyDt.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        modifyDt_Card.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        modifyDtVal.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        modifyDtTxt.setFont(new Font("나눔고딕", Font.PLAIN, 15));

        // 패널 색상
        nEEastPanel.setBackground(pastelPink);
        cRNorthPanel_Card.setBackground(pastelYellow);
        reportDetail.setBackground(pastelPink);
        reportDtVal.setBackground(pastelYellow);
        reportPlaceVal.setBackground(pastelYellow);
        reportKindVal.setBackground(pastelYellow);
        reportNumVal.setBackground(pastelYellow);
        postDtVal.setBackground(pastelYellow);
        modifyDtVal.setBackground(pastelYellow);
        northPanel.setBackground(pastelPink);
        centerPanel.setBackground(pastelYellow);
        southPanel.setBackground(pastelPink);
        nEastPanel.setBackground(pastelPink);
        cCenterPanel.setBackground(pastelYellow);
        cNorthPanel.setBackground(pastelYellow);
        cRNorthPanel.setBackground(pastelYellow);
        cLNorthPanel.setBackground(pastelYellow);
        cCCenterPanel.setBackground(pastelPink);
        cRCenterPanel.setBackground(pastelPink);
        cLCenterPanel.setBackground(pastelPink);
        cCCenterPanel_Card.setBackground(pastelPink);

        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setVisible(true);

        detail_ScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);    // 상하 스크롤에 대한 정책을 설정한다. (스크롤바가 항상 보이도록 설정)
        centerPanel.setPreferredSize(new Dimension(300, 1000)); // centerPanel의 크기 지정
        detail_ScrollPane.getVerticalScrollBar().setUnitIncrement(15); // 스크롤 속도 지정
        detail_ScrollPane.setViewportView(centerPanel); // 데이터가 화면을 넘어가도 깨지지 않도록 수정 대신 넘어간 데이터가 안보일 수 있음
    }


    static ImageIcon imageSetSize(ImageIcon icon, int i, int j) {
        Image img = icon.getImage();  //ImageIcon을 Image로 변환.
        Image imgScale = img.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imgSize = new ImageIcon(imgScale);
        return imgSize;
    }
}
