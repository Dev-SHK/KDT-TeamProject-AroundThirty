package com.aroundThirty.View;



import javax.swing.*;



import java.lang.String;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;

import javax.swing.border.EmptyBorder;

import static com.aroundThirty.Resource.FR.*;
//import static com.aroundThirty.xmlDao.*;
//import static com.aroundThirty.xnlDto.*;
import com.aroundThirty.JdbcUtil;
import com.aroundThirty.model.UserDao;
import com.aroundThirty.model.UserDto;


public class SignUpPage extends JFrame {



     JPanel contentPane;
     JPanel lblJoin;
     JButton joinCompleteBtn;
     JButton cancelBtn;
     JPanel id;
     JButton lblidcfBtn;
     JPanel password;
     JPanel name;
     JPanel email;
     JPanel phone;

    private boolean SignUpPage = false;

    public SignUpPage() {

        setSize(480, 640);
        setVisible(true);

        setLocationRelativeTo(null);

        contentPane = new JPanel() {

            public void paint(Graphics g) {

                g.drawImage(signbgImg.getImage(), 0, 0, null);
                setOpaque(false);
                super.paint(g);
            }
        };
        add(contentPane);

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JPanel lblJoinPan = new JPanel();
        lblJoinPan.add(new JLabel("회원가입"));
        Font f1 = new Font("나눔고딕체", Font.BOLD, 350);
        lblJoinPan.setFont(f1);
        lblJoinPan.setBounds(159, 41, 101, 20);
        lblJoinPan.setOpaque(false);
        contentPane.add(lblJoinPan);


        JPanel labelPan = new JPanel();
        labelPan.add(new JLabel("ID"));
        labelPan.setBounds(45, 116, 90, 20);
        contentPane.add(labelPan);
        JTextField id = new JTextField(20);
        id.setBounds(125, 113, 180, 35);
        contentPane.add(id);
        labelPan.setOpaque(false);

        JPanel lblPWPan = new JPanel();
        lblPWPan.add(new JLabel("PW"));
        lblPWPan.setBounds(45, 163, 90, 20);
        contentPane.add(lblPWPan);
        JPasswordField pw = new JPasswordField(20);
        pw.setBounds(125, 156, 180, 35);
        contentPane.add(pw);
        lblPWPan.setOpaque(false);


        JPanel lblNamePan = new JPanel();
        lblNamePan.add(new JLabel("NAME"));
        lblNamePan.setBounds(45, 210, 90, 20);
        contentPane.add(lblNamePan);
        JTextField name = new JTextField(10);
        name.setBounds(125, 203, 180, 35);
        contentPane.add(name);
        lblNamePan.setOpaque(false);


        JPanel lblEmailPan = new JPanel();
        lblEmailPan.add(new JLabel("E-mail"));
        lblEmailPan.setBounds(45, 257, 90, 20);
        contentPane.add(lblEmailPan);
        JTextField email = new JTextField(20);
        email.setBounds(125, 250, 180, 35);
        contentPane.add(email);
        lblEmailPan.setOpaque(false);

        JPanel lblPhonePan = new JPanel();
        lblPhonePan.add(new JLabel("PHONE"));
        lblPhonePan.setBounds(45, 304, 90, 20);
        contentPane.add(lblPhonePan);
        JTextField phone = new JTextField(15);
        phone.setBounds(125, 297, 180, 35);
        contentPane.add(phone);
        lblPhonePan.setOpaque(false);

        lblidcfBtn = new JButton("ID 확인");
        lblidcfBtn.setBounds(345,113,80,20);
        contentPane.add(lblidcfBtn);
        lblidcfBtn.setBackground(Color.ORANGE);

        joinCompleteBtn = new JButton("회원가입완료");
        joinCompleteBtn.setBounds(124, 363, 110, 29);
        contentPane.add(joinCompleteBtn);
        joinCompleteBtn.setBackground(Color.ORANGE);

        cancelBtn = new JButton("취소");
        cancelBtn.setBounds(235, 363, 65, 29);
        contentPane.add(cancelBtn);
        cancelBtn.setBackground(Color.ORANGE);


        setVisible(true);

        joinCompleteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String label = id.getText();
                String lblPW = new String(pw.getPassword());
                String lblName = name.getText();
                String lblEmail = email.getText();
                String lblPhone = phone.getText();


                if (id.getText().trim().length() == 0 || id.getText().trim().equals("아이디")) {
                    JOptionPane.showMessageDialog(null, "아이디를 입력해 주세요.", "귀엽개 앙큼하냥", JOptionPane.WARNING_MESSAGE);
                    id.grabFocus();
                    return;

                }

                if (pw.getPassword() == null) {
                    JOptionPane.showMessageDialog(null, "비밀번호를 입력해 주세요.", "귀엽개 앙큼하냥", JOptionPane.WARNING_MESSAGE);
                    password.grabFocus();
                    return;
                }

                if (name.getText().trim().length() == 0 || name.getText().trim().equals("이름")) {
                    JOptionPane.showMessageDialog(null, "이름을 입력해 주세요.", "귀엽개 앙큼하냥", JOptionPane.WARNING_MESSAGE);
                    name.grabFocus();
                    return;
                }

                if (email.getText().trim().length() == 0 || email.getText().trim().equals("이메일")) {
                    JOptionPane.showMessageDialog(null, "e-mail 을 입력해 주세요.", "귀엽개 앙큼하냥", JOptionPane.WARNING_MESSAGE);
                    email.grabFocus();
                    return;
                }

                if (phone.getText().trim().length() == 0 || phone.getText().trim().equals("휴대폰")) {
                    JOptionPane.showMessageDialog(null, "휴대폰 을 입력해 주세요.", "귀엽개 앙큼하냥", JOptionPane.WARNING_MESSAGE);
                    phone.grabFocus();
                    return;
                }


                SignUpPage = true;

                JOptionPane.showMessageDialog(null, "회원가입이 완료 되었습니다!", "귀엽개 앙킁하냥", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }


        });

        lblidcfBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserDao dao = new UserDao();
                try {
                    if (dao.userSelectById(new UserDto(id.getText())) != null) {
                        JOptionPane.showMessageDialog(null,"사용 할 수 없는 ID 입니다!",title,JOptionPane.WARNING_MESSAGE);
                        id.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null,"사용 가능 한 ID 입니다!",title,JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (HeadlessException e1) {
                    e1.printStackTrace();
                }
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

