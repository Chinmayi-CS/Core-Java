package com.xworkz.inheritance;

public class SmartPhone {
    public String name;
    public String Brand;
    public String size;
    public double price;

    public SmartPhone() {
        System.out.println("Created SmartPhone using no-args const...");
    }

    public void generate()
    {
        System.out.println("Runnning generate in SmartPhone");
    }

    public void operate()
    {
        System.out.println("Running operate in SmartPhone");
    }
}
