package com.cashregister;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CashRegister{

    public List<Observer> observers = new ArrayList<>();

    private String currentUPC;
    private ProductDB db ;
//

    // constructor for CashRegister
    public CashRegister() {
        currentUPC = "";
        db = new ProductDB();
    }

    // keyboard and scanner use this method to pass UPC code to cash register
    public void setCurrentProductUPCCode(String UPCCode){
        this.currentUPC = UPCCode;
    }

    //attach method to add keyboard and display to observer
    public void attach(Observer observer){
        observers.add(observer);
    }
    // Update all observers
    public void updateDisplay() {
        for (Observer observer: observers){
            String output = db.GetProductInfo(this.currentUPC);
            observer.updateDisplay(output);
        }
    }
}