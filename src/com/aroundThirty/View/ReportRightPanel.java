package com.aroundThirty.View;

import com.aroundThirty.Resource.BR;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

import static com.aroundThirty.Resource.FR.*;
import static com.aroundThirty.Resource.BR.*;

public class ReportRightPanel extends JPanel {
    JPanel centerPanel = new JPanel(new BorderLayout());
    JPanel southPanel = new JPanel();
    JPanel nEastPanel = new JPanel();
    JPanel nEWestPanel = new JPanel(cardLayout);
    JPanel cNTPanel = new JPanel(cardLayout);
    JPanel nEEastPanel = new JPanel();
    JPanel cNorthPanel = new JPanel();
    JPanel cCenterPanel = new JPanel(new BorderLayout());
    JPanel cRNorthPanel = new JPanel(new GridLayout(6, 2, 0, 10));
    JPanel cRNorthPanel_Card = new JPanel(new GridLayout(6, 2, 0, 10));
    JPanel cLNorthPanel = new JPanel();
    JPanel cRCenterPanel = new JPanel();
    JPanel cLCenterPanel = new JPanel();
    JPanel cCCenterPanel = new JPanel(new BorderLayout());
    JPanel cCCenterPanel_Card = new JPanel(cardLayout);
    JScrollPane detail_ScrollPane = new JScrollPane(centerPanel);


    JLabel reportDt = new JLabel("제보일자 :");
    JLabel reportDt_Card = new JLabel("제보일자 :");
    JLabel reportDtVal = new JLabel(reportDto.report_Date);    // DB 연결 해야함
    JTextField reportDtTxt = new JTextField(reportDto.report_Date);    // DB 연결 해야함
    JLabel reportPlace = new JLabel("발견 장소 :");
    JLabel reportPlace_Card = new JLabel("발견 장소 :");
    JTextArea reportPlaceVal = new JTextArea(reportDto.report_Place);  // DB 연결 해야함
    JTextArea reportPlaceTxt = new JTextArea(reportDto.report_Place);  // DB 연결 해야함
    JLabel reportKind = new JLabel("품종 :");
    JLabel reportKind_Card = new JLabel("품종 :");
    JLabel reportKindVal = new JLabel(reportDto.kind_Report);    // DB 연결 해야함
    JTextField reportKindTxt = new JTextField(reportDto.kind_Report);    // DB 연결 해야함
    JLabel reportNum = new JLabel("전화번호 :");
    JLabel reportNum_Card = new JLabel("전화번호 :");
    JLabel reportNumVal = new JLabel(reportDto.phone_Num);  // DB 연결 해야함
    JTextField reportNumTxt = new JTextField(reportDto.phone_Num);  // DB 연결 해야함
    JLabel postDt = new JLabel("게시일자 :");
    JLabel postDt_Card = new JLabel("게시일자 :");
    JLabel postDtVal = new JLabel(reportDto.post_Create_Date);  // DB 연결 해야함
    JTextArea postDtTxt = new JTextArea(reportDto.post_Create_Date);  // DB 연결 해야함
    JLabel modifyDt = new JLabel("수정일자 :");
    JLabel modifyDt_Card = new JLabel("수정일자 :");
    JLabel modifyDtVal = new JLabel(reportDto.post_Modify_Date);    // DB 연결 해야함
    JTextArea modifyDtTxt = new JTextArea(reportDto.post_Modify_Date);    // DB 연결 해야함
    JTextArea reportDetail = new JTextArea(reportDto.detail); // DB 연결 해야함
    JTextArea reportDetailTxt = new JTextArea(reportDto.detail); // DB 연결 해야함

    String imgPath = reportDto.thumbnail_Img;    // 이미지 주소를 받음
    ImageIcon imgIcon = new ImageIcon(imgPath); // 이미지를 담음
    JLabel imgLabel = new JLabel(imageSetSize(imgIcon, 150, 150));    // 이미지 추가


    public ReportRightPanel() {
        rtp = new RightTopPanel();
        setPreferredSize(new Dimension(550, 0));

        // Frame에 패널 추가
        setLayout(new BorderLayout());
        add(BorderLayout.NORTH, rtp);
        add(BorderLayout.CENTER, centerPanel);
        add(BorderLayout.SOUTH, southPanel);
        add(detail_ScrollPane);

        // 패널 구성
//        northPanel.add(BorderLayout.EAST, nEastPanel);
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
        reportDt.setPreferredSize(new Dimension(80,40));
        reportPlace.setPreferredSize(new Dimension(80,40));
        reportKind.setPreferredSize(new Dimension(80,40));
        reportNum.setPreferredSize(new Dimension(80,40));
        postDt.setPreferredSize(new Dimension(80,40));
        modifyDt.setPreferredSize(new Dimension(80,40));
        reportDetail.setEditable(false);
        reportPlaceVal.setEditable(false);
        postDtTxt.setEditable(false);
        modifyDtTxt.setEditable(false);
        reportPlaceVal.setLineWrap(true);
        reportPlaceTxt.setLineWrap(true);
        reportDetail.setLineWrap(true);
        reportPlaceTxt.setPreferredSize(new Dimension(100, 20));
        cCCenterPanel_Card.setPreferredSize(new Dimension(250, 500));
        cCCenterPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));   // 안쪽 여백 추가
        LineBorder line = new LineBorder(pastelPink, 5, true);   // 이미지 테두리선과 곡선에 대한 값 저장
        imgLabel.setBorder(line);   // 저장된 테두리와 곡선 추가

        // 폰트 설정
        reportDetail.setFont(new Font("나눔고딕", Font.BOLD, 20));
        reportDetailTxt.setFont(fontNanum);
        reportDt.setFont(fontNanumBold);
        reportDt_Card.setFont(fontNanum);
        reportDtVal.setFont(fontNanum);
        reportDtTxt.setFont(fontNanum);
        reportPlace.setFont(fontNanumBold);
        reportPlace_Card.setFont(fontNanum);
        reportPlaceVal.setFont(fontNanum);
        reportPlaceTxt.setFont(fontNanum);
        reportKind.setFont(fontNanumBold);
        reportKind_Card.setFont(fontNanum);
        reportKindVal.setFont(fontNanum);
        reportKindTxt.setFont(fontNanum);
        reportNum.setFont(fontNanumBold);
        reportNum_Card.setFont(fontNanum);
        reportNumVal.setFont(fontNanum);
        reportNumTxt.setFont(fontNanum);
        postDt.setFont(fontNanumBold);
        postDt_Card.setFont(fontNanum);
        postDtVal.setFont(fontNanum);
        postDtTxt.setFont(fontNanum);
        modifyDt.setFont(fontNanumBold);
        modifyDt_Card.setFont(fontNanum);
        modifyDtVal.setFont(fontNanum);
        modifyDtTxt.setFont(fontNanum);

        // 패널 색상
        cRNorthPanel_Card.setBackground(pastelYellow);
        reportDetail.setBackground(pastelPink);
        reportDtVal.setBackground(pastelYellow);
        reportPlaceVal.setBackground(pastelYellow);
        reportKindVal.setBackground(pastelYellow);
        reportNumVal.setBackground(pastelYellow);
        postDtVal.setBackground(pastelYellow);
        modifyDtVal.setBackground(pastelYellow);
        centerPanel.setBackground(pastelYellow);
        southPanel.setBackground(pastelYellow);
        nEastPanel.setBackground(pastelPink);
        cCenterPanel.setBackground(pastelYellow);
        cNorthPanel.setBackground(pastelYellow);
        cRNorthPanel.setBackground(pastelYellow);
        cLNorthPanel.setBackground(pastelYellow);
        cCCenterPanel.setBackground(pastelPink);
        cRCenterPanel.setBackground(pastelPink);
        cLCenterPanel.setBackground(pastelPink);
        cCCenterPanel_Card.setBackground(pastelPink);

        detail_ScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);    // 상하 스크롤에 대한 정책을 설정한다. (스크롤바가 항상 보이도록 설정)
        centerPanel.setPreferredSize(new Dimension(300, 800)); // centerPanel의 크기 지정
        detail_ScrollPane.getVerticalScrollBar().setUnitIncrement(15); // 스크롤 속도 지정
        detail_ScrollPane.setViewportView(centerPanel); // 데이터가 화면을 넘어가도 깨지지 않도록 수정 대신 넘어간 데이터가 안보일 수 있음
    }
}
