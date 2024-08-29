package com.xworkz.classes.things;

public class Soldier {

    public void gun()
    {
        System.out.println("Running gun in Soldier");
        Gun gun = new Gun();
        gun.fire();
        gun.display();
    }

}
