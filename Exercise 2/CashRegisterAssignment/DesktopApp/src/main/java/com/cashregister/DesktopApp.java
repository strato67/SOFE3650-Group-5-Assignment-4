package com.cashregister;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DesktopApp extends JFrame{

    Display ds = new Display();
    CashRegister cr = new CashRegister();
    CashScanner cs = new CashScanner(cr);

    static String appName = CommonUtility.getAppName();



    public DesktopApp() {
        super(appName);
        setLayout(new GridLayout(2,2));
        //add(new JLabel("Welcome to " + appName));
        // objects
        Display ds = new Display();
        CashRegister cr = new CashRegister();
        cr.attach(ds);
        CashScanner cs = new CashScanner(cr);

        // add Jpanels for Jframe
        add(ds);
        add(cs);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DesktopApp().setVisible(true));
    }


}
