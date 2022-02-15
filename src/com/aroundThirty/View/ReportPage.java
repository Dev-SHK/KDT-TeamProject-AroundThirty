package com.aroundThirty.View;

import com.aroundThirty.model.ReportCardDto;
import com.aroundThirty.model.ReportDao;
import com.aroundThirty.model.ReportDto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serial;
import java.util.ArrayList;

import static com.aroundThirty.Resource.FR.*;
import static com.aroundThirty.Resource.BR.*;


public class ReportPage extends JPanel {
    @Serial
    private static final long serialVersionUID = 1L;
    public static ArrayList<JPanel> paneList = new ArrayList<>();
    ReportPagingBtn reportPagingBtn = new ReportPagingBtn();
    JPanel centerPanel = new JPanel(new GridLayout(SIZE_ROW, SIZE_COL));    // SIZE_ROW, SIZE_COL로 행열 지정
    JScrollPane jScrollPane = new JScrollPane(centerPanel);
    static JPanel newPane;

    static {
        setDataListPanel(0, 12 + SIZE_ITEM);
    }

    public ReportPage() {
        reportPagingBtn.setBackground(pastelYellow);
        add(BorderLayout.CENTER, jScrollPane);
        jScrollPane.setPreferredSize(new Dimension(820, 650));
        jScrollPane.setBorder(null);
        jScrollPane.setBackground(pastelYellow);
        centerPanel.setBackground(pastelYellow);
        for (int i = 0; i < paneList.size(); i++) {
            centerPanel.add(paneList.get(i));   // panel에 index를 줘서 변수를 주듯 이름을 매김
        }
        add(BorderLayout.SOUTH, reportPagingBtn);
        setBackground(pastelYellow);
    }

    public static void setDataListPanel(int report_StartIndex, int endIndex) { // 버튼과 라벨을 넣어준다.
        for (int i = 0, dataIdx = report_StartIndex; i < SIZE_ITEM; i++, dataIdx++) {  // startIdx(페이지 별 첫번째 게시물의 no)를 SIZE_ITEM(12번) 반복한다.
            newPane = new JPanel(null); // 버튼과 라벨을 붙일 패널 생성
            if (reportListAll.size() > dataIdx) {   // 데이터의 size가 dataIdx보다 큰 경우에만 통과하는 if문
                postedPageNum = reportListAll.get(i).no;    //
            }
            if (reportListAll.size() > dataIdx) {
                btnList.add(new JButton(imageSetSize(reportCardDtoList.get(dataIdx).getDefaultImg(), 150, 120)));
                lblList.add(new JLabel("[" + postedPageNum + "] " + "작성일 : " + reportListAll.get(dataIdx).post_Create_Date));
            } else if (reportListAll.size() <= dataIdx) {
                btnList.add(new JButton(imageSetSize(defaultImg, 150, 150)));
                lblList.add(new JLabel(""));
            }
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
                        selectBtnNum = reportCardDtoList.get(finali).getNo();   // 현재 페이지에서 선택한 게시물의 번호를 가져옴(12개 중 선택한 버튼의 idx)
                        listIdx = (pageNum * 12) + reportCardDtoList.get(finali).getNo();    // ArrayList에서 데이터를 받아올 수 있도록 선택한 게시물의 인덱스를 만들어 줌
                        int Choose_postedPage_Num = reportListAll.get(listIdx).no;   // 선택한 게시물에 대한 no를 담는 변수
                        reportDto = ReportDao.reportSelectOne(new ReportDto(Choose_postedPage_Num));
                        rp.reportDtVal.setText(reportDto.report_Date);
                        rp.reportDtTxt.setText(reportDto.report_Date);
                        rp.reportPlaceVal.setText(reportDto.report_Place);
                        rp.reportPlaceTxt.setText(reportDto.report_Place);
                        rp.reportKindVal.setText(reportDto.kind_Report);
                        rp.reportKindTxt.setText(reportDto.kind_Report);
                        rp.reportNumVal.setText(reportDto.phone_Num);
                        rp.reportNumTxt.setText(reportDto.phone_Num);
                        rp.postDtVal.setText(reportDto.post_Create_Date);
                        rp.postDtTxt.setText(reportDto.post_Create_Date);
                        rp.modifyDtVal.setText(reportDto.post_Modify_Date);
                        rp.modifyDtTxt.setText(reportDto.post_Modify_Date);
                        rp.reportDetail.setText(reportDto.detail);
                        rp.reportDetailTxt.setText(reportDto.detail);
                        rp.imgPath = reportDto.thumbnail_Img;
                        ImageIcon imgIcon = new ImageIcon(rp.imgPath); // 이미지를 담음
                        rp.imgLabel.setIcon(imageSetSize(imgIcon, 250, 250));
                        if (click) {
                            rp.setVisible(true);
                        }
                        btn.removeActionListener(null);
                    }
                }
            });
        }
    }

    // 최근 입력 게시물이 먼저 조회 되도록 수정 해야함
    // 증감식을 -- 로 바꿔야함

    // 어레이리스트로 이미지와를 받아오는 리스트를 만들고 별개로
    // 넘버만 저장하는 리스트를 만들어서 삭제 및 수정시 리스트의 인덱스를 뽑아온다.

    public static void setDataListPage(int report_StartIndex, int endIndex) {  // 버튼과 라벨에 데이터를 넣어준다.
        for (int i = 0, dataIdx = report_StartIndex; i < SIZE_ITEM; i++, dataIdx++) {
            if (reportListAll.size() > dataIdx) {
                postedPageNum = reportListAll.get(dataIdx).no;  // 게시물에 대한 번호를 반복문을 통해 전달함
                btnList.get(i).setIcon(imageSetSize(reportCardDtoList.get(dataIdx).getDefaultImg(), 150, 120));
                lblList.get(i).setText("[" + postedPageNum + "] " + "작성일 : " + reportListAll.get(dataIdx).post_Create_Date);
            } else if (reportListAll.size() <= dataIdx) {
                btnList.get(i).setIcon(imageSetSize(defaultImg, 150, 120));
                lblList.get(i).setText("");
            }
        }
    }
}