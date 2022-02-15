package com.aroundThirty.View;

import com.aroundThirty.Resource.SearchData;
import com.aroundThirty.model.ReportCardDto;
import com.aroundThirty.model.ReportDao;
import com.aroundThirty.model.ReportDto;
import com.aroundThirty.myframe.MyJFrame;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.time.LocalDate;

import static com.aroundThirty.Resource.FR.*;
import static com.aroundThirty.Resource.BR.*;
import static com.aroundThirty.model.ReportDao.*;

public class MainView extends MyJFrame {
    public static Container container;

    public MainView() {
        setSize(1440, 900);
        setTitle("MainPage");
        setBackground(pastelYellow);
        setResizable(true);
        displayLayer();

    }

    protected void displayLayer() {
        lp = new LeftPanel();
        rp = new ReportRightPanel();
        mrp = new MainRightPanel();
        bp = new BottomPanel();
        container = getContentPane();
        switchPan = mrp;

        container.add(BorderLayout.SOUTH, bp);
        container.add(BorderLayout.WEST, lp);
        container.add(BorderLayout.EAST, mrp);
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JTabbedPane tabbedPane = (JTabbedPane) e.getSource();
                switch (tabbedPane.getSelectedIndex()) {
                    case 0:
//                        MainView.container.add(BorderLayout.EAST, mrp);
                        container.remove(switchPan);
                        container.add(BorderLayout.EAST, mrp);
                        switchPan = mrp;
                        revalidate();
                        repaint();
                        System.out.println("'메인메뉴' 탭으로 이동함");
                        break;
                    case 1:
//                        MainView.container.add(BorderLayout.EAST, rp);
                        container.remove(switchPan);
                        container.add(BorderLayout.EAST, rp);
                        switchPan = rp;
                        revalidate();
                        repaint();
                        System.out.println("'발견했어요' 탭으로 이동함");
                        break;
                    case 2:
                        System.out.println("'잃어버렸어요' 탭으로 이동함");
                        break;
                    case 3:
                        System.out.println("'보호중이에요' 탭으로 이동함");
                        break;
                    case 4:
                        System.out.println("'새 가족을 찾아요' 탭으로 이동함");
                        break;
                }
            }
        });
        container.setBackground(pastelYellow);
//        newPost.setEnabled(false);
        setBackground(pastelYellow);

        createMenu();

        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
    }

    @Override
    protected void actionEvent() {
        loginMain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginPage = new LoginPage();
            }
        });
        loginPopup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = idTxtFld.getText().trim();
                String pw = pwTxtFld.getText().trim();

                if (id.equals("admin") && pw.equals("0000")) {
                    int confirm = JOptionPane.showConfirmDialog(null, "로그인 할까요?", title, JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "로그인 되었어요 :)", title, JOptionPane.INFORMATION_MESSAGE);
                        loginPage.dispose();
                        bp.groupPanRight.remove(loginMain);
                        bp.groupPanRight.add(logoutMain, 0);
                        bp.revalidate();
                        bp.repaint();
                    } else {
                        JOptionPane.showMessageDialog(null, "취소되었어요", title, JOptionPane.INFORMATION_MESSAGE);
                    }
                } else if (id.length() == 0 || pw.length() == 0) {
                    JOptionPane.showMessageDialog(null, "ID와 비밀번호를 입력 해주세요.", title, JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "ID 또는 비밀번호가 맞지 않아요 ㅠㅠ", title, JOptionPane.ERROR_MESSAGE);
                    idTxtFld.setText("");
                    pwTxtFld.setText("");
                }
            }
        });

        searchBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    sd = new SearchData();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        signUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signUpPage = new SignUpPage();
            }
        });

        writeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        logoutMain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(null, "로그아웃 하시나요?", title, JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "로그아웃 되었어요.", title, JOptionPane.INFORMATION_MESSAGE);
                    bp.groupPanRight.remove(logoutMain);
                    bp.groupPanRight.add(loginMain, 0);
                    bp.revalidate();
                    bp.repaint();
                } else {
                    JOptionPane.showMessageDialog(null, "취소되었어요.", title, JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        modifyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String act = e.getActionCommand();
                if (act.equals("수정")) {
                    cardLayout.next(rtp.switchPanel);
                    cardLayout.next(rp.cNTPanel);
                    cardLayout.next(rp.cCCenterPanel_Card);
                    addFile.setEnabled(true);

                }
            }
        });

        postBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String act = e.getActionCommand();
                if (act.equals("완료")) {
                    int result = JOptionPane.showConfirmDialog(null, "게시글을 수정 하시겠습니까?", title, JOptionPane.YES_NO_OPTION);
                    if (result == JOptionPane.CLOSED_OPTION) {
                        addFile.setEnabled(false);
                    } else if (result == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "수정되었습니다.", title, JOptionPane.INFORMATION_MESSAGE);
                        cardLayout.next(rtp.switchPanel);
                        cardLayout.next(rp.cNTPanel);
                        cardLayout.next(rp.cCCenterPanel_Card);


                        String mReportDt = rp.reportDtTxt.getText();
                        String mReportPlace = rp.reportPlaceTxt.getText();
                        String mKind_Report = rp.reportKindTxt.getText();
                        String mReportNum = rp.reportNumTxt.getText();
                        String mModifyDt = now.toString();
                        String mThumbNail;
                        String mDetail = rp.reportDetailTxt.getText();

                        if (addImgPath == null) {    // 썸네일을 새로 첨부하지 않은 경우에 대한 IF문
                            mThumbNail = reportDto.getThumbnail_Img();
                        } else {
                            mThumbNail = addImgPath;
                        }

                        reportDto.setReport_Date(mReportDt);
                        reportDto.setReport_Place(mReportPlace);
                        reportDto.setKind_Report(mKind_Report);
                        reportDto.setPhone_Num(mReportNum);
                        reportDto.setPost_Modify_Date(mModifyDt);
                        reportDto.setThumbnail_Img(mThumbNail);
                        reportDto.setDetail(mDetail);

                        rp.postDtVal.setText(reportDto.report_Date);
                        rp.postDtTxt.setText(reportDto.report_Date);
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
                        ImageIcon imgIcon = new ImageIcon(mThumbNail); // 이미지를 담음
                        rp.imgLabel.setIcon(imageSetSize(imgIcon, 250, 250));

                        ReportDao.reportModify(new ReportDto(mReportDt, mReportPlace, mKind_Report, mReportNum, mDetail, "2022-02-14", mThumbNail, reportDto.getNo()));

                        if (click) {
                            rp.setVisible(true);
                        }
                        resetModifyData(listIdx); // 데이터 초기화
                        ReportPage.setDataListPage(startIndex, startIndex + 12);
                        addFile.setEnabled(false);

                    } else if (result == JOptionPane.NO_OPTION) {
                        JOptionPane.showMessageDialog(null, "취소되었습니다.", title, JOptionPane.INFORMATION_MESSAGE);
                        cardLayout.next(rtp.switchPanel);
                        cardLayout.next(rp.cNTPanel);
                        cardLayout.next(rp.cCCenterPanel_Card);
                        addFile.setEnabled(false);
                    }
                }
            }
        });

        deleteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String defaultImgPath = "src/com/aroundThirty/imgFiles/그림1.png";
                ImageIcon defaultImg = new ImageIcon(defaultImgPath);
                int result = JOptionPane.showConfirmDialog(null, "게시글을 삭제 하시겠습니까?", title, JOptionPane.YES_NO_OPTION);
                // 게시글 삭제 여부를 사용자에게 묻는 이벤트
                if (result == JOptionPane.CLOSED_OPTION) {    // 사용자가 Yes 와 No 둘다 선택하지 않고 창을 끄는 경우
                } else if (result == JOptionPane.YES_OPTION) { // 사용자가 게시글 삭제를 한 경우
                    JOptionPane.showMessageDialog(null, "게시글이 삭제되었습니다.", title, JOptionPane.PLAIN_MESSAGE);
                    // 삭제 후 게시물 이미지가 디폴트 이미지로 변환 되도록 구현 해야함
//                    btnList.get(selectBtnNum).setIcon(imageSetSize(defaultImg, 150, 120));
//                    lblList.get(selectBtnNum).setText("");
                    ReportDao.reportDelete(new ReportDto(reportDto.getNo()));
                    rp.setVisible(false);
                    resetDeleteData(); // 데이터 초기화
                    ReportPage.setDataListPage(startIndex, startIndex + 12);
//                    tabbedPane.revalidate();
//                    tabbedPane.repaint();

                    click = true;
                    // 삭제 쿼리 돌려야함
                } else { //사용자가 No를 선택한 경우
                }
            }
        });

        addFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afw = new AddFileWindow();
            }
        });
    }

    public void resetModifyData(int Index) {
        for (int i = 0; i < SIZE_ITEM; i++) {
            btnList.get(i).setIcon(imageSetSize(defaultImg, 150, 120));
            lblList.get(i).setText("");
        }
        reportListAll = ReportDao.reportSelectAll();
        for (ReportDto Dto : reportListAll) {
            reportDto = Dto;
        }
        ImageIcon thumbnailImg = new ImageIcon(reportListAll.get(Index).thumbnail_Img);
        if (reportListAll.get(Index).thumbnail_Img.equals("(NULL)")) {
            reportCardDto = new ReportCardDto(defaultImg, Index);
            reportCardDtoList.add(Index, reportCardDto);
        } else {
            reportCardDto = new ReportCardDto(thumbnailImg, Index);
            reportCardDtoList.set(Index, reportCardDto);
        }
    }
    public void resetDeleteData() {
        for (int i = 0; i < SIZE_ITEM; i++) {
            btnList.get(i).setIcon(imageSetSize(defaultImg, 150, 120));
            lblList.get(i).setText("");
        }
        reportListAll = ReportDao.reportSelectAll();
        for (ReportDto Dto : reportListAll) {
            reportDto = Dto;
        }
        for (int i = 0; i < reportListAll.size(); i++) {
            ImageIcon img = new ImageIcon(reportListAll.get(i).thumbnail_Img);
            if (reportListAll.get(i).thumbnail_Img.equals("(NULL)")) {
                reportCardDto = new ReportCardDto(defaultImg, i);
                reportCardDtoList.set(i,reportCardDto);
            } else {
                reportCardDto = new ReportCardDto(img, i);
                reportCardDtoList.set(i,reportCardDto);
            }
        }
    }
}
