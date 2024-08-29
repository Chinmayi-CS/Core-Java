package com.xworkz.classes.things;

public class Police {

    public void arrest(Gun gun)
    {
        System.out.println("Running arrest in Police");
        if(gun!= null) {
            gun.fire();
            gun.display();
        }
        else
        {
            System.out.println("Gun is Null");
        }
    }

}
