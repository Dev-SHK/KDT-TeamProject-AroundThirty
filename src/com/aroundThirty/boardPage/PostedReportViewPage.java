package com.aroundThirty.boardPage;


import com.aroundThirty.myframe.MyJFrame;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.aroundThirty.Resource.FR.*;


public class PostedReportViewPage extends MyJFrame {
    JPanel centerPanel = new JPanel(new BorderLayout());
    JPanel northPanel = new JPanel(new BorderLayout());
    JPanel southPanel = new JPanel();
    JPanel nEastPanel = new JPanel();
    JPanel cNorthPanel = new JPanel();
    JPanel cCenterPanel = new JPanel(new BorderLayout());
    JPanel cRNorthPanel = new JPanel(new GridLayout(6,2,0,10));
    JPanel cLNorthPanel = new JPanel();
    JPanel cRCenterPanel = new JPanel();
    JPanel cLCenterPanel = new JPanel();
    JPanel cCCenterPanel = new JPanel(new BorderLayout());


    static JButton modifyBtn = new JButton("수정");
    static JButton deleteBtn = new JButton("삭제");
    //        JButton postBtn = new JButton("수정 완료"); // 수정 완료 페이지는 따로 만들어야할듯함
    JLabel reportDt = new JLabel("제보일자 및 시간 :");
    JLabel reportDtVal = new JLabel("2022 / 01 / 01 17:34");    // DB 연결 해야함
    JLabel reportPlace = new JLabel("발견 장소 :");
    JLabel reportPlaceVal = new JLabel("우리집");  // DB 연결 해야함
    JLabel reportKind = new JLabel("품종 :");
    JLabel reportKindVal = new JLabel("코카스파니엘");    // DB 연결 해야함
    JLabel reportNum = new JLabel("전화번호 :");
    JLabel reportNumVal = new JLabel("010-9152-6616");  // DB 연결 해야함
    JLabel postDt = new JLabel("게시일자 및 시간 :");
    JLabel postDtVal = new JLabel("2022 / 01 / 01 19:17");  // DB 연결 해야함
    JLabel modifyDt = new JLabel("수정일자 및 시간 :");
    JLabel modifyDtVal = new JLabel("2022 / 01 / 02 09:00");    // DB 연결 해야함
    JLabel reportDetail = new JLabel("reportDetail"); // DB 연결 해야함

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
        northPanel.add(BorderLayout.EAST, nEastPanel);
        centerPanel.add(BorderLayout.NORTH, cNorthPanel);
        centerPanel.add(BorderLayout.CENTER, cCenterPanel);
        cNorthPanel.add(BorderLayout.WEST, cLNorthPanel);
        cNorthPanel.add(BorderLayout.EAST, cRNorthPanel);
        cCenterPanel.add(BorderLayout.WEST,cLCenterPanel);
        cCenterPanel.add(BorderLayout.EAST,cRCenterPanel);
        cCenterPanel.add(BorderLayout.CENTER,cCCenterPanel);
        cCCenterPanel.add(BorderLayout.NORTH,reportDetail);

        // 패널에 라벨 및 버튼 추가
        nEastPanel.add(modifyBtn);
        nEastPanel.add(deleteBtn);
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

        cCCenterPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));   // 안쪽 여백 추가
        LineBorder line = new LineBorder(color, 5, true);   // 이미지 테두리선과 곡선에 대한 값 저장
        imgLabel.setBorder(line);   // 저장된 테두리와 곡선 추가

        // 폰트 설정
        reportDetail.setFont(fontNanum);
        reportDt.setFont(fontNanum);
        reportDtVal.setFont(fontNanum);
        reportPlace.setFont(fontNanum);
        reportPlaceVal.setFont(fontNanum);
        reportKind.setFont(fontNanum);
        reportKindVal.setFont(fontNanum);
        reportNum.setFont(fontNanum);
        reportNumVal.setFont(fontNanum);
        postDt.setFont(fontNanum);
        postDtVal.setFont(fontNanum);
        modifyDt.setFont(fontNanum);
        modifyDtVal.setFont(fontNanum);

        // 패널 색상
        reportDetail.setBackground(color01);
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

        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setVisible(true);

        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);    // 상하 스크롤에 대한 정책을 설정한다. (스크롤바가 항상 보이도록 설정)
        centerPanel.setPreferredSize(new Dimension(300, 1500)); // centerPanel의 크기 지정
        scrollPane.getVerticalScrollBar().setUnitIncrement(15); // 스크롤 속도 지정
        scrollPane.setViewportView(centerPanel); // 데이터가 화면을 넘어가도 깨지지 않도록 수정 대신 넘어간 데이터가 안보일 수 있음
    }

    static ImageIcon imageSetSize(ImageIcon icon, int i, int j) {
        Image img = icon.getImage();  //ImageIcon을 Image로 변환.
        Image imgScale = img.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imgSize = new ImageIcon(imgScale);
        return imgSize;
    }

    @Override
    protected void displayLayer() {

    }

    @Override
    protected void actionEvent() {
        modifyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("모디파이");
            }
        });

        deleteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "게시글을 삭제 하시겠습니까?","게시글 삭제", JOptionPane.YES_NO_OPTION);
                // 게시글 삭제 여부를 사용자에게 묻는 이벤트
                if(result == JOptionPane.CLOSED_OPTION){    // 사용자가 Yes 와 No 둘다 선택하지 않고 창을 끄는 경우

                }else if(result == JOptionPane.YES_OPTION){ // 사용자가 게시글 삭제를 한 경우
                    JOptionPane.showMessageDialog(null,"게시글이 삭제되었습니다.","알림",JOptionPane.PLAIN_MESSAGE);
                    dispose();
                    deleteBtn.removeActionListener(this);   // actionPerformed를 종료 한다.
                    // 삭제 쿼리 돌려야함
                }else { //사용자가 No를 선택한 경우
                    dispose();
                    deleteBtn.removeActionListener(this);   // actionPerformed를 종료 한다.
                }
            }
        });
    }

}
