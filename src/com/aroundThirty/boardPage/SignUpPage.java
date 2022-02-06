package com.aroundThirty.boardPage;


import javax.swing.*;
import java.lang.String;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import static com.aroundThirty.Resource.FR.*;

import com.aroundThirty.model.UserDao;
import com.aroundThirty.model.UserDto;

public class SignUpPage extends JFrame {

    private JPanel contentPane;
    private JLabel lblJoin;
    private JButton joinCompleteBtn;
    private JButton cancelBtn;
    private JTextField id;
    private JPasswordField password;
    private JTextField name;
    private JTextField email;
    private JTextField phone;

    private boolean SignUpPage = false;

    UserDao dao = new UserDao();

    public SignUpPage() {
        setSize(480, 640);
        setVisible(true);


        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(pastelYellow);

        lblJoin = new JLabel("회원가입");
        Font f1 = new Font("궁서체", Font.BOLD, 20);
        lblJoin.setFont(f1);
        lblJoin.setBounds(159, 41, 101, 20);
        contentPane.add(lblJoin);


        JLabel label = new JLabel("ID");
        label.setBounds(69, 113, 90, 20);
        contentPane.add(label);

        JLabel lblPW = new JLabel("PASSWORD");
        lblPW.setBounds(69, 163, 90, 20);
        contentPane.add(lblPW);

        JLabel lblName = new JLabel("NAME");
        lblName.setBounds(69, 210, 90, 20);
        contentPane.add(lblName);

        JLabel lblEmail = new JLabel("E-mail");
        lblEmail.setBounds(69, 257, 90, 20);
        contentPane.add(lblEmail);

        JLabel lblPhone = new JLabel("PHONE");
        lblPhone.setBounds(69, 304, 90, 20);
        contentPane.add(lblPhone);

        id = new JTextField();
        id.setColumns(10);
        id.setBounds(159, 106, 186, 35);
        contentPane.add(id);

        password = new JPasswordField();
        password.setColumns(10);
        password.setBounds(159, 156, 186, 35);
        contentPane.add(password);

        name = new JTextField();
        name.setColumns(10);
        name.setBounds(159, 203, 186, 35);
        contentPane.add(name);

        email = new JTextField();
        email.setColumns(10);
        email.setBounds(159, 250, 186, 35);
        contentPane.add(email);

        phone = new JTextField();
        phone.setColumns(10);
        phone.setBounds(159, 297, 186, 35);
        contentPane.add(phone);

        joinCompleteBtn = new JButton("회원가입완료");
        joinCompleteBtn.setBounds(158, 363, 115, 29);
        contentPane.add(joinCompleteBtn);
        joinCompleteBtn.setBackground(Color.ORANGE);

        cancelBtn = new JButton("취소");
        cancelBtn.setBounds(285, 363, 60, 29);
        contentPane.add(cancelBtn);
        cancelBtn.setBackground(Color.ORANGE);

        setVisible(true);

        joinCompleteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String label = id.getText();
                String lblPW = new String(password.getText());
                String lblName = name.getText();
                String lblEmail = email.getText();
                String lblPhone = phone.getText();

                String label2 = "asd";
                /*String lblPW2 = new String(password.getText());
                String lblName2 = name.getText();
                String lblEmail2 = email.getText();
                String lblPhone2 = phone.getText();*/



                /* "^[a-zA-Z]*$"    // 영어 정규식
                "^[a-zA-Z0-9]*$"   // 영어&숫자 정규식
                "^[가-힣]*$"        // 한글 정규식
                "^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$"   //이메일 정규식
                "^\\d{3}-\\d{3,4}-\\d{4}$"*/    // 폰번호 정규식


                if (id.getText().trim().length() == 0 || id.getText().trim().equals("아이디")) {
                    JOptionPane.showMessageDialog(null, "아이디를 입력해 주세요.", "아이디 입력", JOptionPane.WARNING_MESSAGE);
                    id.grabFocus();
                    return;
                } else if (label.equals(label2)) {
                    System.out.println("test");

                }

                if (password.getText().trim().length() == 0) {
                    JOptionPane.showMessageDialog(null, "비밀번호를 입력해 주세요.", "비밀번호 입력", JOptionPane.WARNING_MESSAGE);
                    password.grabFocus();
                    return;
                }

                if (name.getText().trim().length() == 0 || name.getText().trim().equals("이름")) {
                    JOptionPane.showMessageDialog(null, "이름을 입력해 주세요.", "이름 입력", JOptionPane.WARNING_MESSAGE);
                    name.grabFocus();
                    return;
                }

                if (email.getText().trim().length() == 0 || email.getText().trim().equals("이름")) {
                    JOptionPane.showMessageDialog(null, "e-mail 을 입력해 주세요.", "e-mail 입력", JOptionPane.WARNING_MESSAGE);
                    email.grabFocus();
                    return;
                }

                if (phone.getText().trim().length() == 0 || phone.getText().trim().equals("이름")) {
                    JOptionPane.showMessageDialog(null, "휴대폰 을 입력해 주세요.", "휴대폰 입력", JOptionPane.WARNING_MESSAGE);
                    phone.grabFocus();
                    return;
                }


                SignUpPage = true;

                JOptionPane.showMessageDialog(null, "회원가입이 완료 되었습니다!", "귀엽개 앙킁하냥", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }

        });


        cancelBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();

        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기

        setResizable(false);

        setVisible(true);
    }
}

