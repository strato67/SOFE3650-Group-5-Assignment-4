package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DesktopApp extends JFrame{

    static String appName = CommonUtility.getAppName();

    public DesktopApp() {
        super(appName);
        setLayout(new FlowLayout());
        add(new JLabel("Welcome to " + appName));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DesktopApp().setVisible(true));
    }


}
