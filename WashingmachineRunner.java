package com.xworkz.classes.runner;

import com.xworkz.classes.things2.*;

public class WashingmachineRunner
{
    public static void main(String[] args) {

        Megha megha = new Megha();
       megha.wash();

        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        Lakshmi lakshmi = new Lakshmi();
        WashingMachine washingMachine = new WashingMachine();
        lakshmi.done_washing_in(washingMachine);

        System.out.println("______________________________________________");

        Abhishek abhishek = new Abhishek();
        WashingMachine washingMachine1 =new WashingMachine();
        abhishek.washing(washingMachine1);

        System.out.println("***********************************************");

        Bhumika bhumika = new Bhumika();
        bhumika.washed();
        WashingMachine ref = new WashingMachine();
        if(ref!=null)
        {
            washingMachine.rinse();
            washingMachine.show();
        }
        else
        {
            System.out.println("ref is null");
        }


    }
}
