package com.aroundThirty.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import static com.aroundThirty.Resource.FR.*;

public class AddFileWindow extends JFrame {
    JTextField jTextField;
    JButton fileSearch;

    public AddFileWindow() {
        jTextField = new JTextField(30);
        fileSearch = new JButton("찾기");

        setLayout(new FlowLayout());
        add(jTextField);
        add(fileSearch);

        setSize(450, 200);
        setVisible(true);


        fileSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == fileSearch) {
                    JFileChooser jFileChooser = new JFileChooser();
                    int ret = jFileChooser.showOpenDialog(fileSearch);
//            if() 취소버튼을 눌렀을 경우 쇼 다열로그 창 뜨기
                    if (ret != JFileChooser.APPROVE_OPTION) { // 사용자가  창을 강제로 닫았거나 취소 버튼을 누른 경우
                        JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다", title,
                                JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    if (ret == jFileChooser.APPROVE_OPTION) {
                        File file = jFileChooser.getSelectedFile(); // 선택된 파일 가져오기
                        jTextField.setText(file.getPath());
                        fileSave(file, "/Users/shk/Downloads/FileDownloadTest", file.getName());
                    }
                }
            }
        });
    }

    private void fileSave(File file, String path, String name) {

        try {
            File file_01 = new File(path); // 디렉토리 정보
            if (!file_01.exists()) {
                file_01.mkdir();
            }

            // 파일 복사
            String filePath = path + "/" + name;
            System.out.println(filePath);

            // 파일 읽기
            FileInputStream fis = new FileInputStream(file);

            // 파일 쓰기
            FileOutputStream fos = new FileOutputStream(filePath);


            int i = 0;
            byte[] buffer = new byte[1024];

            while ((i = fis.read(buffer, 0, 1024)) != -1) { // -1 이라면 End of File
                fos.write(buffer, 0, i);
            }
            fis.close();
            fos.close();

        } catch (Exception ex) {
        }

    }
}