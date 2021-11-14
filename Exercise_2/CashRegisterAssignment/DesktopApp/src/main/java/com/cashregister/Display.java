package com.cashregister;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel implements Observer{

    JTextArea textArea = new JTextArea("Please enter upc code");


    public Display(){
        init();
    }

    private void init(){
        setLayout(new GridLayout(1,2));
        textArea.setEditable(false);
        add(textArea);
    }

    @Override
    public void updateDisplay(String text) {
        textArea.setText(text);
    }
}
