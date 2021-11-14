package com.cashregister;

public class ProductDB {

    public String GetProductInfo(String upcCode){

        if ("1".equals(upcCode)) {
            return "Basic car wash 9.99";
        } else if ("2".equals(upcCode)) {
            return "Deluxe car wash 12.99";
        } else if ("3".equals(upcCode)) {
            return "Supreme car wash 14.99";
        } else {
            return "Not an option";
        }

    }

}