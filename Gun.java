package com.xworkz.classes.things;

public class Gun {

    public String name ="FN Minimi";
    public String countryMade = "Belgium";
    public String type ="Short version Nato";

    public Gun()
    {
        System.out.println("Created Gun using no-args const....");
    }

    public void fire()
    {
        System.out.println("Running fire in Gun");
    }

    public void display()
    {
        System.out.println("Name :"+this.name);
        System.out.println("Country made :"+this.countryMade);
        System.out.println("Type :"+this.type);

    }
}
