package com.aroundThirty.View;

import com.aroundThirty.Resource.SearchData;
import com.aroundThirty.myframe.MyJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.aroundThirty.Resource.FR.*;

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
        rp = new RightPanel();
        bp = new BottomPanel();
        container = getContentPane();

        container.add(BorderLayout.SOUTH, bp);
        container.add(BorderLayout.WEST, lp);
        container.add(BorderLayout.EAST, rp);
        container.setBackground(pastelYellow);
//        newPost.setEnabled(false);
        setBackground(pastelYellow);

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
                        bp.groupPanRight.add(logoutMain, 5);
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
                sd = new SearchData();
            }
        });

        signUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signUpPage = new SignUpPage();
            }
        });

        logoutMain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(null, "로그아웃 하시나요?", title, JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "로그아웃 되었어요.", title, JOptionPane.INFORMATION_MESSAGE);
                    bp.groupPanRight.remove(logoutMain);
                    bp.groupPanRight.add(loginMain, 5);
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
                    cardLayout.next(RightPanel.cNTPanel);
                    cardLayout.next(RightPanel.cCCenterPanel_Card);
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

                    } else if (result == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "수정되었습니다.", title, JOptionPane.INFORMATION_MESSAGE);
                        cardLayout.next(rtp.switchPanel);
                        cardLayout.next(RightPanel.cNTPanel);
                        cardLayout.next(RightPanel.cCCenterPanel_Card);
                    } else if (result == JOptionPane.NO_OPTION) {
                        JOptionPane.showMessageDialog(null, "취소되었습니다.", title, JOptionPane.INFORMATION_MESSAGE);
                        cardLayout.next(rtp.switchPanel);
                        cardLayout.next(RightPanel.cNTPanel);
                        cardLayout.next(RightPanel.cCCenterPanel_Card);
                    }
                }
            }
        });

        modifyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        deleteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "게시글을 삭제 하시겠습니까?", title, JOptionPane.YES_NO_OPTION);
                // 게시글 삭제 여부를 사용자에게 묻는 이벤트
                if (result == JOptionPane.CLOSED_OPTION) {    // 사용자가 Yes 와 No 둘다 선택하지 않고 창을 끄는 경우
                } else if (result == JOptionPane.YES_OPTION) { // 사용자가 게시글 삭제를 한 경우
                    JOptionPane.showMessageDialog(null, "게시글이 삭제되었습니다.", title, JOptionPane.PLAIN_MESSAGE);
                    rp.setVisible(false);
                    click = true;
                    rp.revalidate();
                    rp.repaint();
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

    public static void main(String[] args) {

        new MainView().setVisible(true);
    }
}