package com.aroundThirty.myframe;

import com.aroundThirty.View.IntroducePage;
import com.aroundThirty.View.SourcePage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.aroundThirty.Resource.FR.*;

public abstract class MyJFrame extends JFrame {
    public MyJFrame() {
        this("My JFrame", 200, 200);
    }

    public MyJFrame(String title, int w, int h) {
        // 닫기 버튼을 눌렀을 때 강제 종료 이벤트 처리
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // 타이틀 지정
        setTitle("첫번째 스윙 실습");
        // 크기 설정
        setSize(w, h);

        displayLayer();
        actionEvent();
    }

    public void createMenu() {
        JMenuBar mb = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu saveMenu = new JMenu("Save");
        JMenu openMenu = new JMenu("Open");
        JMenu settingMenu = new JMenu("Setting");
        JMenu helpMenu = new JMenu("Help");
        JMenuItem exitMenu = new JMenuItem("Exit");
        JMenuItem aboutMenu = new JMenuItem("About");
        JMenuItem sourceMenu = new JMenuItem("Source");
        aboutMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ip = new IntroducePage();
            }
        });
        sourceMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sp = new SourcePage();
            }
        });
        exitMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
        fileMenu.add(exitMenu);
        helpMenu.add(sourceMenu);
        helpMenu.add(aboutMenu);
        mb.add(fileMenu);
        mb.add(saveMenu);
        mb.add(openMenu);
        mb.add(settingMenu);
        mb.add(helpMenu);
        this.setJMenuBar(mb);
        mb.setBorderPainted(false);
        mb.setBackground(pastelGreen);
    }

    protected abstract void displayLayer();

    protected abstract void actionEvent();
}