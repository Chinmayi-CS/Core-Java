package com.xworkz.inheritance;

public class BullRunner {
    public static void main(String[] args) {

        Cow cow1 = new Cow();
        cow1.colour = "Black";
        cow1.name = "Lakshmi";
        cow1.price=40000;
        cow1.no_0f_bulls=2;
        cow1.village="H Kalapanahalli";
        cow1.generate();
        cow1.operate();
        System.out.println("Colour :"+cow1.colour);
        System.out.println("Name :"+cow1.name);
        System.out.println("Price :"+cow1.price);
        System.out.println("Number of Bulls :"+cow1.no_0f_bulls);
        System.out.println("Village :"+cow1.village);

        Bull bull1 = new Bull();
        bull1.colour="White";
        bull1.name = "Shraddha";
        bull1.price=35000;
        bull1.village="Honnur";
        bull1.no_0f_bulls=1;
        bull1.generate();
        bull1.operate();
        System.out.println("Colour :"+bull1.colour);
        System.out.println("Name :"+bull1.name);
        System.out.println("Price :"+bull1.price);
        System.out.println("Village :"+bull1.village);
        System.out.println("Number of bulls :"+bull1.no_0f_bulls);

    }
}
