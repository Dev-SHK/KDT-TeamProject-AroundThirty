package com.aroundThirty.mainPageGUI;

import com.aroundThirty.boardPage.*;
import com.aroundThirty.myframe.MyJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.aroundThirty.Resource.FR.*;

public class MainPageGUI extends MyJFrame {
    public static Container container;

    public MainPageGUI() {
        super("MainPage", 1440, 900);
        super.setTitle("MainPage");
        super.setBackground(pastelYellow);
        super.setResizable(true);
    }

    @Override
    protected void displayLayer() {
        lp = new LeftPanel();
        rp = new RightPanel();
        container = getContentPane();
        bp = new BottomPanel();

        container.add(BorderLayout.SOUTH, bp);
        container.add(BorderLayout.WEST, lp);
        container.add(BorderLayout.EAST, rp);
        container.setBackground(pastelYellow);
        writing.setEnabled(false);
        setBackground(pastelYellow);

        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
    }

    // controller로 이동할 이벤트
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
                    int confirm = JOptionPane.showConfirmDialog(null, "로그인 할까요?", "로그인", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "로그인 되었어요 :)", "로그인 성공!!", JOptionPane.INFORMATION_MESSAGE);
                        loginPage.dispose();
                        bp.groupPanRight.remove(loginMain);
                        bp.groupPanRight.add(logoutMain, 5);
                        bp.revalidate();
                        bp.repaint();
                    } else {
                        JOptionPane.showMessageDialog(null, "취소되었어요", "로그인 취소", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else if (id.length() == 0 || pw.length() == 0) {
                    JOptionPane.showMessageDialog(null, "ID와 비밀번호를 입력 해주세요.", "로그인 오류", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "ID 또는 비밀번호가 맞지 않아요 ㅠㅠ", "로그인 실패", JOptionPane.ERROR_MESSAGE);
                    idTxtFld.setText("");
                    pwTxtFld.setText("");
                }
            }
        });

        searchBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                int confirm = JOptionPane.showConfirmDialog(null, "로그아웃 하시나요?", "로그아웃 확인", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "로그아웃 되었어요.", "로그아웃 완료!!", JOptionPane.INFORMATION_MESSAGE);
                    bp.groupPanRight.remove(logoutMain);
                    bp.groupPanRight.add(loginMain, 5);
                    bp.revalidate();
                    bp.repaint();
                } else {
                    JOptionPane.showMessageDialog(null, "취소되었어요.", "로그아웃 취소", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
//        rbtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("눌림?");
//                rp.add(RightPanel.detail_ScrollPane);
//                rp.revalidate();
//                rp.repaint();
//            }
//        });
        modifyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String act = e.getActionCommand();

                if (act.equals("수정")){
                    cardLayout.next(RightPanel.nEWestPanel);
                    cardLayout.next(RightPanel.cNTPanel);
                    cardLayout.next(RightPanel.cCCenterPanel_Card);
                }
            }
        });

        postBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String act = e.getActionCommand();
                if (act.equals("완료")){
                    int result = JOptionPane.showConfirmDialog(null, "게시글을 수정 하시겠습니까?","게시글 수정", JOptionPane.YES_NO_OPTION);
                    if (result == JOptionPane.CLOSED_OPTION){

                    } else if (result == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null,"수정되었습니다.","알림",JOptionPane.PLAIN_MESSAGE);
                        cardLayout.next(RightPanel.nEWestPanel);
                        cardLayout.next(RightPanel.cNTPanel);
                        cardLayout.next(RightPanel.cCCenterPanel_Card);
                    } else if (result == JOptionPane.NO_OPTION){

                    }
                }
            }
        });

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
                    rp.setVisible(false);
                    
                    click = true;
                    rp.revalidate();
                    rp.repaint();
                    // 삭제 쿼리 돌려야함
                }else { //사용자가 No를 선택한 경우

                }
            }
        });

    }
    public static void onClick() {
        rp = new RightPanel();
        rbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click) {
                    rp.setVisible(true);
                    click = false;
                } else {
                    rp.setVisible(false);
                    click = true;
                }


            }
        });
    }

    public static void main(String[] args) {

        new MainPageGUI().setVisible(true);
    }
}