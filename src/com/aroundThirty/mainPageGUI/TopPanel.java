package com.aroundThirty.mainPageGUI;

import javax.swing.*;
import java.awt.*;

import static com.aroundThirty.Resource.FR.*;

public class TopPanel extends JPanel {
    JPanel centerPan = new JPanel();

    public TopPanel() {
        JPanel gridPan = new JPanel(new GridBagLayout());
        gridPan.setBackground(color);


        searchBTN.setBorderPainted(false);
        searchBTN.getPreferredSize();
        gridPan.add(searchBTN);

        loginMain.setFont(fontCourier);
        loginMain.getPreferredSize();
        loginMain.setBorderPainted(false);
        gridPan.add(loginMain);

        switchPet.setBorderPainted(false);
        switchPet.getPreferredSize();
        gridPan.add(switchPet);

        centerPan.add(gridPan);
        centerPan.setBackground(color);

        this.setBackground(color);
        this.add(centerPan);
    }

    public static void main(String[] args) {
        new TopPanel().setVisible(true);
    }
}
