package com.xworkz.inheritance;

public class Chicken {
    public String name;
    public String age;
    public double price;
    public int quantity;
    public String quality;
    public String colour_of_hen;
    public String type;
    public String shopName;
    public String owner;
    public String dish;

    public Chicken()
    {
        System.out.println("Created Chicken using no-args const....");
    }

    public void generate()
    {
        System.out.println("Running generate in Chicken");
    }

    public void operate()
    {
        System.out.println("Running operate in chicken");
    }

    public void chicken()
    {
        System.out.println("Running chicken in Chicken");
    }

    public void run()
    {
        System.out.println("Running run in Chicken");
    }

    public void nonveg()
    {
        System.out.println("Running nonveg in Chicken");
    }
}

