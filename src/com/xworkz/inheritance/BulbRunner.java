package com.xworkz.inheritance;

public class BulbRunner {
    public static void main(String[] args) {
        SmartBulb smartBulb1 = new SmartBulb();
        smartBulb1.brand = "PHILIPS";
        System.out.println("Brand : "+smartBulb1.brand);

        Bulb bulb1 = new SmartBulb();
        bulb1.brand="HAVELLS";
        System.out.println("Brand : "+bulb1.brand);

    }
}
