package com.aroundThirty.View;

import javax.swing.*;

import static com.aroundThirty.Resource.FR.title;

public class OpenPage implements Runnable {
    JFrame f;

    public OpenPage() {
        String gifPath = "/Volumes/SHK-USB-64G/KDT-SW개발자과정/Project/src/com/aroundThirty/imgFiles/DogLisa_Loading.gif";
        Icon icon = new ImageIcon(gifPath);
        JLabel label = new JLabel(icon);

        f = new JFrame(title);
        f.setUndecorated(true);
        f.getContentPane().add(label);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setResizable(false);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(8000);
            f.dispose();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
