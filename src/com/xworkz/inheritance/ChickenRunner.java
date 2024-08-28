package com.xworkz.inheritance;

public class ChickenRunner {
    public static void main(String[] args)
    {
        Chicken chicken = new Hen();
        chicken.name="Vencobb";
        chicken.age= "8 months";
        chicken.price=250;
        chicken.quantity=1;
        chicken.quality="good";
        chicken.colour_of_hen="white";
        chicken.shopName="chicken stall";
        chicken.owner="Muslim";
        chicken.type="Boiler";
        chicken.dish="Kebab";
        chicken.chicken();
        chicken.nonveg();
        chicken.generate();
        chicken.operate();
        chicken.run();
        System.out.println("Name :"+chicken.name);
        System.out.println("Age :"+chicken.age);
        System.out.println("Price :"+chicken.price);
        System.out.println("Quantity :"+chicken.quantity);
        System.out.println("Quality :"+chicken.quality);
        System.out.println("Colour :"+chicken.colour_of_hen);
        System.out.println("Shop name :"+chicken.shopName);
        System.out.println("Owner :"+chicken.owner);
        System.out.println("Type :"+chicken.type);
        System.out.println("Dish :"+chicken.dish);

    }
}
