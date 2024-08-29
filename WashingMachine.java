package com.xworkz.classes.things2;

public class WashingMachine {

    public  String brand ="IFB";
    public String type="Front load";
    public String capacity="6kg";

    public WashingMachine()
    {
        System.out.println("Created Washing Machine using no-args const...");
    }

    public void rinse()
    {
        System.out.println("Running rinse in WashingMachine");
    }
    public void show()
    {
        System.out.println("Brand :"+this.brand);
        System.out.println("Type :"+this.type);
        System.out.println("Capacity :"+this.capacity);

    }
}
