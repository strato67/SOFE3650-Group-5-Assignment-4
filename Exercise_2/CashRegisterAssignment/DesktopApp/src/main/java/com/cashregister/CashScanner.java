package com.cashregister;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CashScanner extends JPanel implements ActionListener {

    JTextField input = new JFormattedTextField();
    static JButton button = new JButton("submit");
    private final CashRegister cash;

    public CashScanner(CashRegister cash) {
        this.cash = cash;
        init();
    }

    private void init(){
        setLayout(new GridLayout(2,1));
        button.addActionListener(this);
        add(input);
        add(button);

    }

    public void scannedUPCCode(String UPCCode){
        cash.setCurrentProductUPCCode(UPCCode);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String b = input.getText();
        cash.setCurrentProductUPCCode(b);
        cash.updateDisplay();
        }
}
