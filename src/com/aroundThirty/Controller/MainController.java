package com.aroundThirty.Controller;


import com.aroundThirty.View.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.aroundThirty.Resource.FR.*;

public class MainController {

    public MainController() {
    }


    public static void main(String[] args) {
        new MainView().setVisible(true);

    }
}
