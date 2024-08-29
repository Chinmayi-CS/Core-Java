package com.xworkz.classes.things;

public class Dboss {
    public Gun gun;

    public void jail(Gun gun)
    {
        System.out.println("Running jail in Dboss");

        if(gun!=null)
        {
            gun.fire();
            gun.display();
        }
        else
        {
            System.out.println("Gun is null");
        }
    }

}
