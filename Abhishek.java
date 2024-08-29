package com.xworkz.classes.things2;

public class Abhishek {

    WashingMachine washingMachine;

    public void washing(WashingMachine washingMachine)
    {
        System.out.println("Running washing in Abhishek");
        if(washingMachine!=null)
        {
           washingMachine.rinse();
           washingMachine.show();
        }
        else
        {
            System.out.println("Washing Machine is null");
        }
    }

}
