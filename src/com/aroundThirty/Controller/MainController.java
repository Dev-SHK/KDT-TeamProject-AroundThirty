package com.aroundThirty.Controller;


import com.aroundThirty.View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.aroundThirty.Resource.FR.*;

public class MainController {
    public MainController() {
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
        new MainView().setVisible(true);

    }
}
