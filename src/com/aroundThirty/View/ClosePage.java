package com.aroundThirty.View;

import javax.swing.*;

import static com.aroundThirty.Resource.FR.title;

public class ClosePage implements Runnable {

    public ClosePage() {
        String gifPath = "/Volumes/SHK-USB-64G/KDT-SW개발자과정/Project/src/com/aroundThirty/imgFiles/퇴사짤.gif";
        Icon icon = new ImageIcon(gifPath);
        JLabel label = new JLabel(icon);

        JFrame f = new JFrame(title);
        f.getContentPane().add(label);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setResizable(false);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            JOptionPane.showMessageDialog(null, "다음에 또 만나요~~", title, JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
