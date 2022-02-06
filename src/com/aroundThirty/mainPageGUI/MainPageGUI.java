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
        super.setBackground(color);
        super.setResizable(false);
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
        container.setBackground(color);
        writing.setEnabled(false);
        setBackground(color);

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
                        bp.groupPan.remove(loginMain);
                        bp.groupPan.add(logoutMain, 5);
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
                    bp.groupPan.remove(logoutMain);
                    bp.groupPan.add(loginMain, 5);
                    bp.revalidate();
                    bp.repaint();
                } else {
                    JOptionPane.showMessageDialog(null, "취소되었어요.", "로그아웃 취소", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {

        new MainPageGUI().setVisible(true);
    }
}