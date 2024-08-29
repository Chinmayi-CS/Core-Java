package com.xworkz.classes.things2;

public class Lakshmi {

    public void done_washing_in(WashingMachine washingMachine)
    {
        System.out.println("Running done_washing_in in Lakshmi");
        if(washingMachine!=null) {
            washingMachine.rinse();
            washingMachine.show();
        }
        else
        {
            System.out.println("Washing Machine is null");
        }
    }

}
